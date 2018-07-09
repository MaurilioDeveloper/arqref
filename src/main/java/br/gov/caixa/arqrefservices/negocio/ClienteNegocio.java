package br.gov.caixa.arqrefservices.negocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.excecao.enumerador.ECategoriaErro;
import br.gov.caixa.arqrefcore.excecao.enumerador.ESeveridadeErro;
import br.gov.caixa.arqrefcore.excecao.mensagem.MessageDefault;
import br.gov.caixa.arqrefcore.excecao.mensagem.Messages;
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefcore.util.Dater;
import br.gov.caixa.arqrefcore.util.Stringer;
import br.gov.caixa.arqrefcore.util.UtilString;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.ErroSICLI;
import br.gov.caixa.arqrefservices.dominio.barramento.Chave;
import br.gov.caixa.arqrefservices.dominio.barramento.DadosConsultaSicli;
import br.gov.caixa.arqrefservices.dominio.barramento.Filtros;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemConsultaDadosSicliSaida;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemConsultaSICLI;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SICLIMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.EFilasMQ;
import br.gov.caixa.arqrefservices.dominio.enumerador.EMensagensArqrefServiceErro;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPequisaDocumentoIdentidade;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaConta;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaEnderecoNacional;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaSistema;
import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;
import br.gov.caixa.arqrefservices.dominio.sicli.Renda;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.CNH;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.CamposSicli;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.CarteiraTrabalho;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.DocumentoCarteiraTrabalho;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.DocumentoIdentidade;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.EnderecoNacional;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.EnderecoNacionalComplemento;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.EnvioDadosAlteracaoSicli;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Identidade;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MantemDadosCliente;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.ManutencaoErro;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MeioComunicacao;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MensagemDadosAlteracaoSicliEntrada;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MensagemSicliRetorno;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MensagemSiemp;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Passaporte;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.RendaCliente;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Usuario;
import br.gov.caixa.arqrefservices.dominio.sicli.transicao.DadosSICLITO;
import br.gov.caixa.arqrefservices.util.MensagemArqrefService;

/**
 * Classe que implemeta {@link IClienteNegocio}
 *
 * @author c110503
 *
 * @version 1.0.0.1
 *
 */
public class ClienteNegocio implements IClienteNegocio {

	// objeto utilizada para escrever informacoes no log do servidor
	@Inject
	private Logger log;

	@Inject
	public Stringer stringer;

	@Inject
	protected Dater dater;

	// objeto utilizado para fazer requisicoes nas filas do SICLI
	@Inject
	@SICLIMQ
	public DAOBarramento conexaoMQ;

	public ClienteNegocio() {
		if (log == null) {
			log = Logger.getLogger(getClass().getName());
		}
	}

	/**
	 * @see IClienteNegocio#solicitaDadosClientePF(String, String, Empregado)
	 *
	 * @TODO Verificar validacoes!
	 */
	public Correlation solicitaDadosClientePF(String cpf, final String tipoPesquisa, final Empregado empregado)
			throws BusinessException, SystemException {
		log.info("ClienteBean - solicitaDadosClientePF");

		// Verifica de qual tipo é a pesquisa
		// e formata o atributo para ser envido (Retira a mascara e preenche com
		// 0 a equerda)
		// seta o atributo da pesquisa
		if (tipoPesquisa.equalsIgnoreCase("CPF")) {
			cpf = UtilString.retiraMascara(cpf);
			// ERRADO formatNumber NÂO ESTA FUNCIOANDO
			// 0000000000000635065800
			// atributo = UtilString.formatNumber(atributo, 11);
			// VALIDAR CPF
		} else if (tipoPesquisa.equalsIgnoreCase("CNPJ") || tipoPesquisa.equalsIgnoreCase("CNPJ_SIISO")) {
			cpf = UtilString.retiraMascara(cpf);
			cpf = UtilString.formatNumber(cpf, 14);
		} else if (tipoPesquisa.equalsIgnoreCase("COCLI")) {
			cpf = UtilString.retiraMascara(cpf);
			cpf = UtilString.formatNumber(cpf, 14);
		}

		// Inicio da construcao da Mensagem enviada para o Barramento SICLI
		final MensagemConsultaSICLI msgConsultaSICLI = new MensagemConsultaSICLI();

		final DadosConsultaSicli dados = new DadosConsultaSicli();

		final Chave chave = new Chave();
		chave.setCpf(cpf);
		dados.setChave(chave);

		final Filtros filtros = new Filtros();
		filtros.setTodasInformacoesBasica();
		// Criando filtro para pesquisa de Endereco Generico
		filtros.setTipoPesquisaEnderecoNacional(ETipoPesquisaEnderecoNacional.GENERICO);
		// Criando filtro para pesquisa de Contas do Tipo 01 e 04 do SIDEC
		filtros.setTipoPesquisaProdutoCaixa(ETipoPesquisaConta.CONTA_CORRENTE_PESSOA_FISICA,
				ETipoPesquisaSistema.SIDEC);
		filtros.setTipoPesquisaProdutoCaixa(ETipoPesquisaConta.DEP_JUD_JUSTICA_COMUM, ETipoPesquisaSistema.SIDEC);
		filtros.setTipoPesquisaProdutoCaixa(ETipoPesquisaConta.POUPANCA_CAIXA, ETipoPesquisaSistema.SIDEC);
		// Criando filtro para pesquisar o Documento de Identificacao Principal
		// e Unico
		filtros.setTipoPesquisaDocumentoIdentidade(ETipoPequisaDocumentoIdentidade.PRINCIPAL,
				ETipoPequisaDocumentoIdentidade.UNICO);
		dados.setFiltros(filtros);

		msgConsultaSICLI.setDados(dados);

		final SibarHeader header = new SibarHeader();

		header.criarSibarHeader(empregado, tipoPesquisa);

		msgConsultaSICLI.setSibarHeader(header);

		final String mensagem = ConverterXML.convertToXml(msgConsultaSICLI);
		log.info(mensagem);
		String id;
		if (isTesteMockRetornoSICLI_PF()) {
			log.info("ClienteNegocio - MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK");
			id = "10";
		} else {
			id = conexaoMQ.put(mensagem, EFilasMQ.SICLI_REQ_CONSULTA_CLIENTE.toString());
		}
		Correlation correlation;
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
		} else {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("");
			// Lista de Mensagens negocial
			final List<String> listaMensagemNegocial = new ArrayList<String>();
			listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_004.getDescricao());
			msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);

		}

		log.info("FIM consultaDadosClienteSicli");
		return correlation;
	}

	/**
	 * @see IClienteNegocio#solicitaDadosClientePF(String, String, Empregado)
	 *
	 * @TODO Verificar validacoes!
	 */
	public Correlation solicitaDadosClientePF(final DadosSICLITO dadosSICLITO)
			throws BusinessException, SystemException {
		log.info("ClienteBean - solicitaDadosClientePF");

		String cpf = null;
		// Verifica de qual tipo é a pesquisa
		// e formata o atributo para ser envido (Retira a mascara e preenche com
		// 0 a equerda)
		// seta o atributo da pesquisa
		if (dadosSICLITO.getTipoPesquisa().equalsIgnoreCase("CPF")) {
			cpf = UtilString.retiraMascara(dadosSICLITO.getCpf());
			// ERRADO formatNumber NÂO ESTA FUNCIOANDO
			// 0000000000000635065800
			// atributo = UtilString.formatNumber(atributo, 11);
			// VALIDAR CPF
		} else if (dadosSICLITO.getTipoPesquisa().equalsIgnoreCase("CNPJ")
				|| dadosSICLITO.getTipoPesquisa().equalsIgnoreCase("CNPJ_SIISO")) {
			cpf = UtilString.retiraMascara(dadosSICLITO.getCpf());
			cpf = UtilString.formatNumber(dadosSICLITO.getCpf(), 14);
		} else if (dadosSICLITO.getTipoPesquisa().equalsIgnoreCase("COCLI")) {
			cpf = UtilString.retiraMascara(dadosSICLITO.getCpf());
			cpf = UtilString.formatNumber(dadosSICLITO.getCpf(), 14);
		}

		// Inicio da construcao da Mensagem enviada para o Barramento SICLI
		final MensagemConsultaSICLI msgConsultaSICLI = new MensagemConsultaSICLI();

		final DadosConsultaSicli dados = new DadosConsultaSicli();

		final Chave chave = new Chave();
		chave.setCpf(cpf);
		dados.setChave(chave);
		Filtros filtros = null;
		// caso nao seja informado os filtros da pesquisa
		if (dadosSICLITO.getFiltros() == null) {
			filtros = new Filtros();
			filtros.setTodasInformacoesBasica();

		} else {
			filtros = dadosSICLITO.getFiltros();
		}
		// Criando filtro para pesquisa de Endereco Generico
		filtros.setTipoPesquisaEnderecoNacional(ETipoPesquisaEnderecoNacional.GENERICO);
		// Criando filtro para pesquisa de Contas do Tipo 01 e 04 do SIDEC
		filtros.setTipoPesquisaProdutoCaixa(ETipoPesquisaConta.CONTA_CORRENTE_PESSOA_FISICA,
				ETipoPesquisaSistema.SIDEC);
		filtros.setTipoPesquisaProdutoCaixa(ETipoPesquisaConta.DEP_JUD_JUSTICA_COMUM, ETipoPesquisaSistema.SIDEC);
		filtros.setTipoPesquisaProdutoCaixa(ETipoPesquisaConta.POUPANCA_CAIXA, ETipoPesquisaSistema.SIDEC);
		// Criando filtro para pesquisar o Documento de Identificacao Principal
		// e Unico
		filtros.setTipoPesquisaDocumentoIdentidade(ETipoPequisaDocumentoIdentidade.PRINCIPAL,
				ETipoPequisaDocumentoIdentidade.UNICO);
		dados.setFiltros(filtros);

		msgConsultaSICLI.setDados(dados);

		final SibarHeader header = new SibarHeader();

		header.criarSibarHeader(dadosSICLITO.getEmpregado(), dadosSICLITO.getTipoPesquisa());

		msgConsultaSICLI.setSibarHeader(header);

		final String mensagem = ConverterXML.convertToXml(msgConsultaSICLI);
		log.info(mensagem);
		String id;
		if (isTesteMockRetornoSICLI_PF()) {
			log.info("ClienteNegocio - MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK");
			id = "10";
		} else {
			id = conexaoMQ.put(mensagem, EFilasMQ.SICLI_REQ_CONSULTA_CLIENTE.toString());
		}
		Correlation correlation;
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
		} else {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("");
			// Lista de Mensagens negocial
			final List<String> listaMensagemNegocial = new ArrayList<String>();
			listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_004.getDescricao());
			msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);

		}

		log.info("FIM consultaDadosClienteSicli");
		return correlation;
	}

	/**
	 * @see IClienteNegocio#recebeDadosClientePF(Correlation, Empregado)
	 *
	 * @TODO Tratar erro do parametro invalido ou null
	 */
	public CamposRetornados recebeDadosClientePF(final Correlation correlation)
			throws BusinessException, SystemException {
		log.info("INICIO recebeDadosClientePF");
		// verifica o correlationID
		if (correlation == null || correlation.getId().isEmpty()) {
			// Lanca excecao
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(EMensagensArqrefServiceErro.MN_003.getDescricao());
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCredito.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}
		// TESTE RETORNO MOCK CONSULTA AVALIACAO APROVADA
		if (isTesteMockRetornoSICLI_PF()) {
			log.info("ClienteNegocio - MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK");
			MensagemConsultaDadosSicliSaida msgSaida = null;
			msgSaida = ConverterXML.converterXmlSemSanitizacao(getTesteRetornoSicliPF(),
					MensagemConsultaDadosSicliSaida.class);
			return msgSaida.getDados().getRetronoClienteDetalhado().getCamposRetornados();
		}

		String saida = conexaoMQ.getWithTimeout(correlation.getId(), EFilasMQ.SICLI_RSP_CONSULTA_CLIENTE.toString(),
				10000L);

		// verifica se o retorno eh nulo
		if (saida == null) {
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemErro(new ArrayList<String>());
//			msgArqrefService.getMensagemErro().add("Não houve retorno do barramento. Tente novamente");
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add("Não houve retorno do barramento. Tente novamente");
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			msgArqrefService.setSistema("0");
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());

			throw new SystemException(msgArqrefService);

			// significa que nao houve retorno do barramento
//			return null;
		}
		// VERIFICA O SE O ENCONDING ESTA SETADO
		// encoding=\"ISO-8859-1\"
		if (saida != null && !saida.contains("encoding")) {
			saida = saida.replace("?>", " encoding=\"ISO-8859-1\"?>");
		}

		log.info("XML RETORNO consultaDadosClienteSicli");
		log.info(saida);

		final MensagemConsultaDadosSicliSaida msgSaida = ConverterXML.converterXmlSemSanitizacao(saida,
				MensagemConsultaDadosSicliSaida.class);

		// VERIFICA O COD_RETORNO E LANCHA A EXCECAO DO TIPO SYSTEMEXCEPTION
		if (msgSaida.getCodigoRetorno().equalsIgnoreCase("X5")) {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemErro(new ArrayList<String>());
			msgArqrefService.getMensagemErro().add(msgSaida.getMensagemRetorno());
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(msgSaida.getDados().getExcecao());
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());

			throw new SystemException(msgArqrefService);
		}
		if (msgSaida.getCodigoRetorno().equalsIgnoreCase("03")) {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			// verifica se houve retorno do barramento do erro
			if (msgSaida.getDados().getRetornoConsultaErro().getListaErroSICLI() != null) {
				final StringBuilder sbMsgmInformacoesAdicionais = new StringBuilder();
				// itera para gera a lista de mensagem de erro
				for (final ErroSICLI erroSicli : msgSaida.getDados().getRetornoConsultaErro().getListaErroSICLI()) {
					msgArqrefService.getMensagemNegocial().add(erroSicli.getMensagemErro());
					sbMsgmInformacoesAdicionais.append("Erro: \n -Código Erro: ");
					sbMsgmInformacoesAdicionais.append(erroSicli.getCodigoErro());
					sbMsgmInformacoesAdicionais.append("\n -IPS Erro: ");
					sbMsgmInformacoesAdicionais.append(erroSicli.getIPSErro());
					sbMsgmInformacoesAdicionais.append("\n -SQL Erro: ");
					sbMsgmInformacoesAdicionais.append(erroSicli.getSqlErro());
					sbMsgmInformacoesAdicionais.append("\n Retorno XML: ");
					sbMsgmInformacoesAdicionais.append(saida);
					msgArqrefService.setInformacoesAdicionais(sbMsgmInformacoesAdicionais.toString());
					sbMsgmInformacoesAdicionais.setLength(0);
				}
			}
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());

			throw new BusinessException(msgArqrefService);
		}

		if (msgSaida.getDados().getRetronoClienteDetalhado() == null) {
			final MessageDefault msg = new MessageDefault();
			msg.setCodigoErro("0");
			msg.setInformacoesAdicionais("Não houve retorno para consulta do Cliente."
					+ msgSaida.getDados().getExcecao() + " - " + msgSaida.getMensagemRetorno());
			msg.setOrigemErro("MQ");
			msg.setCategoriaErro("4");
			msg.setSeveridade(2);
			msg.setSistema("SICLI");
			throw new BusinessException(msg);
		}

		// CAMPOS DE RETORNO
		if (msgSaida.getDados().getRetronoClienteDetalhado().getCamposRetornados() != null) {
			return msgSaida.getDados().getRetronoClienteDetalhado().getCamposRetornados();
		}

		log.info("FIM recebeDadosClientePF");
		return null;
	}

	/**
	 * @see IClienteNegocio#solicitaDadosCliente(DadosSICLITO dadosSICLITO)
	 */
	public Correlation solicitaDadosCliente(final DadosSICLITO dadosSICLITO) throws BusinessException, SystemException {
		log.info("ClienteBean - solicitaDadosCliente");
		final DadosConsultaSicli dados = new DadosConsultaSicli();

		Filtros filtros = new Filtros();
		if (dadosSICLITO.getFiltros() == null) {
			filtros = new Filtros();
			filtros.setTodasInformacoesBasica();

		} else {
			filtros = dadosSICLITO.getFiltros();
		}

		final SibarHeader header = new SibarHeader();

		final Chave chaveEntrada = new Chave();
		if (dadosSICLITO.getCpf() != null) {
			chaveEntrada.setCpf(UtilString.retiraMascara(dadosSICLITO.getCpf()));
			header.criarSibarHeader(dadosSICLITO.getCodigoUsuario(), dadosSICLITO.getNumeroUnidade(), "CPF");

		} else if (dadosSICLITO.getCnpj() != null) {
			chaveEntrada.setCnpj(UtilString.retiraMascara(dadosSICLITO.getCnpj()));
			header.criarSibarHeader(dadosSICLITO.getCodigoUsuario(), dadosSICLITO.getNumeroUnidade(), "CNPJ");
			filtros.setConsultaCNPJ();

		} else if (dadosSICLITO.getCocli() != null) {
			chaveEntrada.setCocli(dadosSICLITO.getCocli());
			header.criarSibarHeader(dadosSICLITO.getCodigoUsuario(), dadosSICLITO.getNumeroUnidade(), "COCLI");
			filtros.setConsultaCNPJ();

		} else if (dadosSICLITO.getCnpjSIISO() != null) {
			chaveEntrada.setCnpjSIISO(UtilString.retiraMascara(dadosSICLITO.getCnpjSIISO()));
			header.criarSibarHeader(dadosSICLITO.getCodigoUsuario(), dadosSICLITO.getNumeroUnidade(), "CNPJ");
			filtros.setConsultaCNPJ();
		}
		dados.setChave(chaveEntrada);

		// Inicio da construcao da Mensagem enviada para o Barramento SICLI
		final MensagemConsultaSICLI msgConsultaSICLI = new MensagemConsultaSICLI();

		// Criando filtro para pesquisa de Endereco Generico
		filtros.setTipoPesquisaEnderecoNacional(ETipoPesquisaEnderecoNacional.GENERICO);
		// Criando filtro para pesquisa de Contas do SIDEC
		filtros.setTipoPesquisaProdutoTodasContasSIDEC();
		// Criando filtro para pesquisar o Documento de Identificacao Principal
		// e Unico
		filtros.setTipoPesquisaDocumentoIdentidade(ETipoPequisaDocumentoIdentidade.PRINCIPAL,
				ETipoPequisaDocumentoIdentidade.UNICO);
		dados.setFiltros(filtros);

		msgConsultaSICLI.setDados(dados);

		msgConsultaSICLI.setSibarHeader(header);

		final String mensagem = ConverterXML.convertToXml(msgConsultaSICLI);

		log.info(mensagem);
		String id;
		if (isTesteMockRetornoSICLI_PF()) {
			log.info("ClienteNegocio - MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK");
			id = "10";
		} else {
			try {
				id = conexaoMQ.put(mensagem, EFilasMQ.SICLI_REQ_CONSULTA_CLIENTE.toString());
			} catch (Exception e) {
				final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
				msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
				msgArqrefService.setInformacoesAdicionais("");
				// Lista de Mensagens negocial
				final List<String> listaMensagemNegocial = new ArrayList<String>();
				listaMensagemNegocial.add(e.getMessage());
				msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
				msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
				msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				log.info(msgArqrefService.toString());
				log.severe(msgArqrefService.toString());
				throw new BusinessException(msgArqrefService);
			}
		}
		Correlation correlation;
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
		} else {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("");
			// Lista de Mensagens negocial
			final List<String> listaMensagemNegocial = new ArrayList<String>();
			listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_004.getDescricao());
			msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}

		log.info("FIM consultaDadosClienteSicli");
		return correlation;
	}

	/**
	 * @see IClienteNegocio#recebeDadosCliente(Correlation)
	 */
	public CamposRetornados recebeDadosCliente(final Correlation correlation)
			throws BusinessException, SystemException {
		log.info("INICIO recebeDadosCliente");
		// verifica o correlationID
		if (correlation == null || correlation.getId().isEmpty()) {
			// Lanca excecao
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(EMensagensArqrefServiceErro.MN_003.getDescricao());
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCredito.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}
		// TESTE RETORNO MOCK CONSULTA AVALIACAO APROVADA
		if (isTesteMockRetornoSICLI_PJ()) {
			log.info("ClienteNegocio - MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK MOCK");
			MensagemConsultaDadosSicliSaida msgSaida = null;
			msgSaida = ConverterXML.converterXmlSemSanitizacao(getTesteRetornoSicliPJ(),
					MensagemConsultaDadosSicliSaida.class);
			return msgSaida.getDados().getRetronoClienteDetalhado().getCamposRetornados();
		}

		String saida = conexaoMQ.getWithTimeout(correlation.getId(), EFilasMQ.SICLI_RSP_CONSULTA_CLIENTE.toString(),
				10000L);

		// verifica se o retorno eh nulo
		if (saida == null) {
			// significa que nao houve retorno do barramento
			return null;
		}
		// VERIFICA O SE O ENCONDING ESTA SETADO
		// encoding=\"ISO-8859-1\"
		if (saida != null && !saida.contains("encoding")) {
			saida = saida.replace("?>", " encoding=\"ISO-8859-1\"?>");
		}

		log.info("XML RETORNO consultaDadosClienteSicli");
		log.info(saida);

		final MensagemConsultaDadosSicliSaida msgSaida = ConverterXML.converterXmlSemSanitizacao(saida,
				MensagemConsultaDadosSicliSaida.class);

		// VERIFICA O COD_RETORNO E LANCHA A EXCECAO DO TIPO SYSTEMEXCEPTION
		if (msgSaida.getCodigoRetorno().equalsIgnoreCase("X5")) {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemErro(new ArrayList<String>());
			msgArqrefService.getMensagemErro().add(msgSaida.getMensagemRetorno());
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(msgSaida.getDados().getExcecao());
			msgArqrefService
					.setInformacoesAdicionais(msgSaida.getDados().getExcecao() + " - " + msgSaida.getMensagemRetorno());
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());

			throw new SystemException(msgArqrefService);
		}
		if (msgSaida.getCodigoRetorno().equalsIgnoreCase("03")) {
			// Lanca excecao pela string esta com algum problema
			final MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			// verifica se houve retorno do barramento do erro
			if (msgSaida.getDados().getRetornoConsultaErro().getListaErroSICLI() != null) {
				final StringBuilder sbMsgmInformacoesAdicionais = new StringBuilder();
				// itera para gera a lista de mensagem de erro
				for (final ErroSICLI erroSicli : msgSaida.getDados().getRetornoConsultaErro().getListaErroSICLI()) {
					msgArqrefService.getMensagemNegocial().add(erroSicli.getMensagemErro());
					sbMsgmInformacoesAdicionais.append("Erro: \n -Código Erro: ");
					sbMsgmInformacoesAdicionais.append(erroSicli.getCodigoErro());
					sbMsgmInformacoesAdicionais.append("\n -IPS Erro: ");
					sbMsgmInformacoesAdicionais.append(erroSicli.getIPSErro());
					sbMsgmInformacoesAdicionais.append("\n -SQL Erro: ");
					sbMsgmInformacoesAdicionais.append(erroSicli.getSqlErro());
					sbMsgmInformacoesAdicionais.append("\n Retorno XML: ");
					sbMsgmInformacoesAdicionais.append(saida);
					msgArqrefService.setInformacoesAdicionais(sbMsgmInformacoesAdicionais.toString());
					sbMsgmInformacoesAdicionais.setLength(0);
				}
			}
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());

			throw new BusinessException(msgArqrefService);
		}

		if (msgSaida.getDados().getRetronoClienteDetalhado() == null) {
			final MessageDefault msg = new MessageDefault();
			msg.setCodigoErro("0");
			msg.setInformacoesAdicionais("Não houve retorno para consulta do Cliente."
					+ msgSaida.getDados().getExcecao() + " - " + msgSaida.getMensagemRetorno());
			msg.setOrigemErro("MQ");
			msg.setCategoriaErro("4");
			msg.setSeveridade(2);
			msg.setSistema("SICLI");
			throw new BusinessException(msg);
		}

		// CAMPOS DE RETORNO
		if (msgSaida.getDados().getRetronoClienteDetalhado().getCamposRetornados() != null) {
			return msgSaida.getDados().getRetronoClienteDetalhado().getCamposRetornados();
		}

		log.info("FIM recebeDadosCliente");
		return null;
	}

	public MantemDadosCliente atualizaDadosClienteSicli(final CamposRetornados camposRetornados, final Usuario usuario)
			throws BusinessException {

		final MantemDadosCliente entradaSaida = geraDadosAlteracao(camposRetornados);

		// Prepara mensagem para o Barramento
		final MensagemDadosAlteracaoSicliEntrada msgEnvio = new MensagemDadosAlteracaoSicliEntrada();
		final EnvioDadosAlteracaoSicli dadosBarramento = new EnvioDadosAlteracaoSicli();

		dadosBarramento.setNumeroCocli(camposRetornados.getCocliAtivo().getCocliAtivo());
		dadosBarramento.setCamposSicli(entradaSaida.getCamposSicli());

		if (entradaSaida.getCamposSicli().getMeioComunicacao() != null
				&& !entradaSaida.getCamposSicli().getMeioComunicacao().isEmpty()) {
			dadosBarramento.getCamposSicli().setMeioComunicacao(entradaSaida.getCamposSicli().getMeioComunicacao());
		}

		if (entradaSaida.getCamposSicli().getIdentidade() != null) {
			dadosBarramento.getCamposSicli().setIdentidade(entradaSaida.getCamposSicli().getIdentidade());
		}

		if (entradaSaida.getCamposSicli().getEnderecoNacional() != null
				&& entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional() != null
				&& entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0) != null) {
			
			dadosBarramento.getCamposSicli().setEnderecoNacional(entradaSaida.getCamposSicli().getEnderecoNacional());
			if (dadosBarramento.getCamposSicli().getEnderecoNacional().getNomeComplementoLogradouro() == null) {
				dadosBarramento.getCamposSicli().getEnderecoNacional().setNomeComplementoLogradouro("");
			}
			dadosBarramento.getCamposSicli().getEnderecoNacional().setNumeroMunicipio(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getMunicipio());
			dadosBarramento.getCamposSicli().getEnderecoNacional().setNomeMunicipio(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getNomeMunicipio());
			dadosBarramento.getCamposSicli().getEnderecoNacional().setProduto(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getProduto());
			dadosBarramento.getCamposSicli().getEnderecoNacional().setOcorrencia(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getOcorencia());
			if(!entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getFlagFinalidade().isEmpty()){
				dadosBarramento.getCamposSicli().getEnderecoNacional().setIndicadorFinalidade(Integer.parseInt(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getFlagFinalidade()));
			}
			
			dadosBarramento.getCamposSicli().getEnderecoNacional().setTipo(null);
			// dadosBarramento.getCamposSicli().getEnderecoNacional().setEnderecoNacionalComplemento(entradaSaida.getCamposRetornadosSICLI().getComplemento().get(0));
			if (dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento() != null) {
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento()
						.setAnoReferencia(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento()
						.setMesReferencia(Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1));
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento()
						.setNumeroProduto(null);
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento()
						.setContrato(null);
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setFiller(null);
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento()
						.setFlagUnico(null);
				dadosBarramento.getCamposSicli().getEnderecoNacional().setIndicadorPropaganda(null);
				dadosBarramento.getCamposSicli().getEnderecoNacional().setIndicadorCorrespondencia(null);
				dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setSequencial("1");
				/*if(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento() != null  && !entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().isEmpty()){
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setOcorrencia(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getOcorrencia());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setNumeroProduto(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getProduto());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setIndicadorComprovacao(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getFlagComprovacao());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setIndicadorPostagem(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getFlagPostagem());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setIndicadorDevolvido(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getFlagDevolvido());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setTipoDevolucao(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getTipoDevolucao());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setSequencial(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getSequencial());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setDataApuracao(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getDataApuracao());
					dadosBarramento.getCamposSicli().getEnderecoNacional().getEnderecoNacionalComplemento().setTipoImovel(entradaSaida.getCamposRetornadosSICLI().getEnderecoNacional().get(0).getEnderecoNacionalComplemento().get(0).getTipoImovel());
				}*/
			}
		}

		if (entradaSaida.getCamposSicli().getRendaCliente() != null) {
			dadosBarramento.getCamposSicli().setRendaCliente(entradaSaida.getCamposSicli().getRendaCliente());
			for (int i = 0; i < dadosBarramento.getCamposSicli().getRendaCliente().size(); i++) {
				dadosBarramento.getCamposSicli().getRendaCliente().get(i).setDescricaoCodigoOcupacao(null);
				dadosBarramento.getCamposSicli().getRendaCliente().get(i).setDataApuracao(null);
				if (dadosBarramento.getCamposSicli().getRendaCliente().get(i).getCocliFP() == null
						|| dadosBarramento.getCamposSicli().getRendaCliente().get(i).getCocliFP().equals("")
						|| dadosBarramento.getCamposSicli().getRendaCliente().get(i).getCocliFP().equals("0")) {
					dadosBarramento.getCamposSicli().getRendaCliente().get(i).setCocliFP(null);
					dadosBarramento.getCamposSicli().getRendaCliente().get(i).setCpfCnpjFP(null);
					dadosBarramento.getCamposSicli().getRendaCliente().get(i).setTipoFP(null);
				}
				if (dadosBarramento.getCamposSicli().getRendaCliente().get(i).getCpfCnpjFP() != null) {
					dadosBarramento.getCamposSicli().getRendaCliente().get(i).setCpfCnpjFP(StringUtils.rightPad(
							dadosBarramento.getCamposSicli().getRendaCliente().get(i).getCpfCnpjFP(), 14, '0'));
				}

			}
		}

		msgEnvio.setDados(dadosBarramento);

		// Efetua o PUT na fila MQ

		final String tipoConsulta = "ALTERACAO_PF";
		final Correlation correlation = enviarDadosBarramentoAlteracaoClienteSicli(msgEnvio, usuario, tipoConsulta);

		// Consultar fila com timeout
		final MensagemSicliRetorno msgRetorno = retornoDadosClienteSicli(correlation.getId());

		// VERIFICA SE O RETORNO É NULL
		if (msgRetorno == null) {
			final MessageDefault msg = new MessageDefault();
			msg.setCategoriaErro("3");
			msg.setCodigoErro("0");
			msg.setInformacoesAdicionais(
					"Não houve retorno para consulta do Cliente: " + entradaSaida.getNumeroCocli());
			msg.setOrigemErro("MQ");
			msg.setSeveridade(1);
			msg.setSistema("SICLI");
			msg.setParagrafoErro("VeiculosBean.consultaDadosClienteSicli");
			throw new BusinessException(msg);
		}

		// VERIFICA O COD_RETORNO E LANCHA A EXCECAO
		if (msgRetorno.getCodigoRetorno().equalsIgnoreCase("MANUTENCAO_ERRO")) {
			final Messages listaMessages = new Messages();
			for (final ManutencaoErro erro : msgRetorno.getDados().getManutencaoErroList()) {
				final MessageDefault msg = new MessageDefault();
				msg.setCategoriaErro("4");
				msg.setCodigoErro(erro.getCodigoErro());
				msg.setInformacoesAdicionais(erro.getMensagemErro());
				msg.setOrigemErro(erro.getCampoIPS());
				msg.setSeveridade(1);
				msg.setSistema(msgRetorno.getOrigemRetorno());
				listaMessages.add(msg);
			}
			throw new BusinessException(listaMessages);
		} else if (msgRetorno.getCodigoRetorno().equalsIgnoreCase("X5")) {
			final MessageDefault msg = new MessageDefault();
			msg.setCategoriaErro("3");
			msg.setCodigoErro(msgRetorno.getCodigoRetorno());
			if (msgRetorno.getDados() != null) {
				msg.setInformacoesAdicionais(msgRetorno.getDados().getExcecao());
			}
			msg.setOrigemErro(msgRetorno.getMensagemRetorno());
			msg.setSeveridade(1);
			msg.setSistema(msgRetorno.getOrigemRetorno());
			throw new SystemException(msg);
		}

		// Mensagem negocial retornada pelo SICLI
		if (msgRetorno.getDados().getControleNegocial() != null) {
			final MensagemSiemp msg1 = new MensagemSiemp();
			msg1.setNumeroMensagemErro(
					Integer.parseInt(msgRetorno.getDados().getControleNegocial().getCodigoRetorno()));
			msg1.setDescricaoMensagemErro(msgRetorno.getDados().getControleNegocial().getCodigoRetorno() + " - "
					+ msgRetorno.getDados().getControleNegocial().getOrigemRetorno() + " - "
					+ msgRetorno.getDados().getControleNegocial().getMensagem());
			msg1.setNumeroTipoMensagem(2);
			entradaSaida.setMensagem(msg1);
		}

		// ALTERACAO REALIZADA COM SUCESSO
		if (msgRetorno.getCodigoRetorno().equalsIgnoreCase("MANUTENCAO_INTEGRAL")) {
			entradaSaida.setMensagem(new MensagemSiemp());
			entradaSaida.getMensagem().setNumeroMensagemErro(1064);
			entradaSaida.getMensagem().setDescricaoMensagemErro("Operação Realizada com Sucesso.");
			entradaSaida.getMensagem().setNumeroTipoMensagem(4);
		}

		return entradaSaida;
	}

	private MantemDadosCliente geraDadosAlteracao(final CamposRetornados camposRetornados) {
		final MantemDadosCliente entradaSaida = new MantemDadosCliente();
		entradaSaida.setCamposRetornadosSICLI(camposRetornados);
		final CamposSicli camposSicli = new CamposSicli();
		if (camposRetornados.getMeioComunicacao() != null && !camposRetornados.getMeioComunicacao().isEmpty()) {
			final List<MeioComunicacao> meioComunicacaoList = new ArrayList<MeioComunicacao>();
			for (final br.gov.caixa.arqrefservices.dominio.sicli.MeioComunicacao meiocomunicaoRequest : camposRetornados
					.getMeioComunicacao()) {
				final MeioComunicacao meioComunicacao = new MeioComunicacao();
				meioComunicacao.setCodigoComunicacao(meiocomunicaoRequest.getCodigoComunicacao());
				meioComunicacao.setFinalidadeTelefone(meiocomunicaoRequest.getFinalidade());
				meioComunicacao.setMeioComunicacao(meiocomunicaoRequest.getMeioComunicao());
				meioComunicacao.setNomeContato(meiocomunicaoRequest.getNomeContato());
				meioComunicacao.setOcorrencia(meiocomunicaoRequest.getOcorrencia());
				meioComunicacao.setPrefixoDiscagem(meiocomunicaoRequest.getPrefixoDiscagem());
				meioComunicacaoList.add(meioComunicacao);
			}
			camposSicli.setMeioComunicacao(meioComunicacaoList);

		}

		if (camposRetornados.getIdentidade() != null) {
			final Identidade identidade = new Identidade();
			identidade.setFlagDocumentoIdentificacaoPrincipal(
					camposRetornados.getIdentidade().getFlagDocumentoIdentificacaoPrincipal());
			identidade.setOcorrencia(camposRetornados.getIdentidade().getOcorrencia());
			identidade.setSubTipoDocumento(camposRetornados.getIdentidade().getSubTipoDocumento());
			identidade.setTipoDocumento(camposRetornados.getIdentidade().getTipoDocumento());
			if (camposRetornados.getIdentidade().getDocumento() != null) {
				final DocumentoIdentidade doc = new DocumentoIdentidade();
				doc.setDataEmissao(camposRetornados.getIdentidade().getDocumento().getDataEmissao());
				doc.setNumero(camposRetornados.getIdentidade().getDocumento().getNumero());
				doc.setOrgaoEmissor(camposRetornados.getIdentidade().getDocumento().getOrgaoEmissor());
				doc.setUf(camposRetornados.getIdentidade().getDocumento().getUf());
				identidade.setDocumento(doc);
			}
			camposSicli.setIdentidade(identidade);
		}

		if (camposRetornados.getCarteiraTrabalho() != null) {
			final CarteiraTrabalho carteiraTrabalho = new CarteiraTrabalho();
			carteiraTrabalho.setOcorrencia(camposRetornados.getCarteiraTrabalho().getOcorencia());
			carteiraTrabalho.setFlagDocumentoIdentificacaoPrincipal(
					camposRetornados.getCarteiraTrabalho().getFlagDocumentoIdentificacaoPrincipal());
			carteiraTrabalho.setTipoOrgaoEmissor(camposRetornados.getCarteiraTrabalho().getTipoOrgaoEmissor());
			if (camposRetornados.getCarteiraTrabalho().getDocumento() != null) {
				final DocumentoCarteiraTrabalho doc = new DocumentoCarteiraTrabalho();
				doc.setNumero(camposRetornados.getCarteiraTrabalho().getDocumento().getNumero());
				doc.setSerie(camposRetornados.getCarteiraTrabalho().getDocumento().getSerie());
				doc.setUf(camposRetornados.getCarteiraTrabalho().getDocumento().getUf());
				doc.setDataEmissao(camposRetornados.getCarteiraTrabalho().getDocumento().getDataEmissao());
				carteiraTrabalho.setDocumento(doc);
			}
			camposSicli.setCarteiraTrabalho(carteiraTrabalho);
		}

		if (camposRetornados.getPassaporte() != null) {
			final Passaporte passaporte = new Passaporte();
			passaporte.setDataEmissao(camposRetornados.getPassaporte().getDataEmissao());
			passaporte.setDataValidade(camposRetornados.getPassaporte().getDataValidade());
			passaporte.setNumero(camposRetornados.getPassaporte().getNumero());
			passaporte.setOcorrencia(camposRetornados.getPassaporte().getOcorrencia());
			passaporte.setPaisOrigem(camposRetornados.getPassaporte().getPaisOrigem());
			passaporte.setTipoOrgaoEmissor(camposRetornados.getPassaporte().getTipoOrgaoEmissor());
			passaporte.setUfEmissor(camposRetornados.getPassaporte().getUfEmissor());
			camposSicli.setPassaporte(passaporte);
		}

		if (camposRetornados.getCnh() != null) {
			final CNH cnh = new CNH();
			cnh.setDataPrimeiraHabilitacao(camposRetornados.getCnh().getDataPrimeiraHabilitacao());
			cnh.setDataEmissao(camposRetornados.getCnh().getDataEmissao());
			cnh.setFlagDocumentoIdendificacaoPrincipal(
					camposRetornados.getCnh().getFlagDocumentoIdendificacaoPrincipal());
			cnh.setNumero(camposRetornados.getCnh().getNumero());
			cnh.setOcorrencia(camposRetornados.getCnh().getOcorrencia());
			cnh.setTipoOrgaoEmissor(camposRetornados.getCnh().getTipoOrgaoEmissor());
			cnh.setUf(camposRetornados.getCnh().getUf());
			camposSicli.setCnh(cnh);
		}

		final EnderecoNacional endereco = new EnderecoNacional();
		endereco.setTipoLogradouro(camposRetornados.getEnderecoNacional().get(0).getTipoLogradouro());
		endereco.setNomeLogradouro(camposRetornados.getEnderecoNacional().get(0).getLogradouro());
		if( !camposRetornados.getEnderecoNacional().get(0).getNumero().isEmpty()){
			endereco.setNumeroLogradouro(
				Integer.parseInt(camposRetornados.getEnderecoNacional().get(0).getNumero().trim()));
		}
		endereco.setNomeComplementoLogradouro(camposRetornados.getEnderecoNacional().get(0).getComplemento());
		endereco.setNumeroCEP(camposRetornados.getEnderecoNacional().get(0).getCep());
		endereco.setSiglaUF(camposRetornados.getEnderecoNacional().get(0).getUf());
		endereco.setNomeMunicipio(camposRetornados.getEnderecoNacional().get(0).getNomeMunicipio());
		endereco.setNomeBairro(camposRetornados.getEnderecoNacional().get(0).getBairro());
		if( !camposRetornados.getEnderecoNacional().get(0).getFlagFinalidade().isEmpty()){
		endereco.setIndicadorFinalidade(
				Integer.parseInt(camposRetornados.getEnderecoNacional().get(0).getFlagFinalidade().trim()));
		}
		final EnderecoNacionalComplemento complemento = new EnderecoNacionalComplemento();
		complemento.setTipoEndereco(camposRetornados.getEnderecoNacionalComplemento().get(0).getTipoEndereco());
		complemento.setIndicadorSimplificado(
				camposRetornados.getEnderecoNacionalComplemento().get(0).getFlagSimplificado());
		complemento.setMesReferencia(camposRetornados.getEnderecoNacionalComplemento().get(0).getMesReferencia());
		complemento.setAnoReferencia(camposRetornados.getEnderecoNacionalComplemento().get(0).getAnoReferencia());
		endereco.setEnderecoNacionalComplemento(complemento);

		camposSicli.setEnderecoNacional(endereco);
		
		/**
		 * Rendas
		 */
		if (camposRetornados.getRenda() != null && !camposRetornados.getRenda().isEmpty()) {
			final List<RendaCliente> rendaList = new ArrayList<RendaCliente>();
			for (final Renda rendaRequest : camposRetornados.getRenda()) {
				if(rendaRequest != null) {
					final RendaCliente renda = new RendaCliente();
					renda.setCaraterRenda(rendaRequest.getCaracteristicaRenda());
					renda.setTipoRenda(rendaRequest.getTipoRenda());
					renda.setCocliFP(rendaRequest.getCocliFontePagadora());
					renda.setCpfCnpjFP(rendaRequest.getCpfCnpjFontePagadora());
					renda.setTipoFP(rendaRequest.getTipoFontePagadora());
					renda.setDescricaoCodigoOcupacao(null);
					renda.setFiller(rendaRequest.getFiller());
					renda.setDataAdmissao(rendaRequest.getDataAdimissao());
					renda.setCodigoComprovanteComprobatorioRendaFormal(rendaRequest.getCodigoComprobatorioRenda());
					renda.setCodigoOcupacao(rendaRequest.getCodigoOcupacao());
					renda.setOcorrencia(rendaRequest.getOcorrencia());
					renda.setMesReferencia(rendaRequest.getMesReferencia());
					renda.setAnoReferencia(rendaRequest.getAnoReferencia());
					renda.setValorRendaLiquida(rendaRequest.getValorRendaLiquida());
					if(rendaRequest.getTipoRenda().equals("F")){
						renda.setValorRendaBruta(rendaRequest.getValorRendaBruta());
					}
					rendaList.add(renda);
				}
			}
			camposSicli.setRendaCliente(rendaList);

		}
		
		
		entradaSaida.setCamposSicli(camposSicli);
		return entradaSaida;
	}

	public Correlation enviarDadosBarramentoAlteracaoClienteSicli(final MensagemDadosAlteracaoSicliEntrada msg,
			final Usuario usuario, final String tipoConsulta) {
		String correlationId = null;
		try {
			preencheDadosHedearBarramentoAlteraDadosCliente(msg, usuario, tipoConsulta);
			final String mensagem = ConverterXML.convertToXml(msg);
			log.info(mensagem);
			correlationId = conexaoMQ.put(mensagem, EFilasMQ.SICLI_REQ_MANUTENCAO_CLIENTE.toString());
		} catch (final SystemException e) {
			log.severe(e.getMessage());
		}
		return new Correlation(correlationId);
	}

	public MensagemSicliRetorno retornoDadosClienteSicli(final String correlationId) {
		MensagemSicliRetorno msgRetorno = null;
		String retorno = null;
		if (!stringer.with(correlationId).isEmpty()) {
			retorno = conexaoMQ.getWithTimeout(correlationId, EFilasMQ.SICLI_RSP_MANUTENCAO_CLIENTE.toString(), 10000L);

			if (!stringer.with(retorno).isEmpty()) {
				log.warning(retorno);
				msgRetorno = ConverterXML.convertFromXml(retorno, MensagemSicliRetorno.class);
			} else {
				retorno = conexaoMQ.getWithTimeout(correlationId, EFilasMQ.SICLI_RSP_MANUTENCAO_CLIENTE.toString(),
						10000L);
			}
		}

		return msgRetorno;
	}

	protected void preencheDadosHedearBarramentoAlteraDadosCliente(final MensagemDadosAlteracaoSicliEntrada msg,
			final Usuario usuario, final String tipoConsulta) {

		// String operacaoProcesso = "ALTERACAO_PF";
		// if(msg.getTipoPessoa() == 2)
		// operacaoProcesso ="ALTERACAO_PF";
		final SibarHeader header = new SibarHeader();
		header.setVersao("1.0");
		header.setUsuarioServico("SFECEMPD");
		header.setUsuario(usuario.getCodigoUsuario());
		header.setOperacao(tipoConsulta);
		header.setSistemaOrigem("SIEMP");
		header.setUnidade(String.valueOf(usuario.getNumeroUnidadeLogado()));
		header.setDataHora(dater.withToday().asString("yyyy-MM-dd"));
		header.setIdProcesso(tipoConsulta);

		msg.setSibarHeader(header);
	}

	private boolean isTesteMockRetornoSICLI_PF() {
		final String testeMockAvaliacao = System.getProperty("TESTE_MOCK_RETORNO_SICLI_PF");
		return testeMockAvaliacao != null && testeMockAvaliacao.equals("true");
	}

	private boolean isTesteMockRetornoSICLI_PJ() {
		final String testeMockAvaliacao = System.getProperty("TESTE_MOCK_RETORNO_SICLI_PJ");
		return testeMockAvaliacao != null && testeMockAvaliacao.equals("true");
	}

	public String getTesteRetornoSicliPF() {
		final ResourceLoader loader = new ResourceLoader();
		// return
		// loader.with(getClass()).load("retorno_Consulta_Sicli_PF.xml").asText();
		return loader.with(getClass()).load("retorno_Consulta_Sicli_PF_Maria.xml").asText();
	}

	public String getTesteRetornoSicliPJ() {
		final ResourceLoader loader = new ResourceLoader();
		return loader.with(getClass()).load("retorno_Consulta_Sicli_PJ.xml").asText();
	}

}
