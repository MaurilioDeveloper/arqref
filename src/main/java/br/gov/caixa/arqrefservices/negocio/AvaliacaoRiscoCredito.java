package br.gov.caixa.arqrefservices.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
import br.gov.caixa.arqrefcore.enumeradores.EBooleano;
import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.excecao.enumerador.ECategoriaErro;
import br.gov.caixa.arqrefcore.excecao.enumerador.ESeveridadeErro;
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefcore.util.Dater;
import br.gov.caixa.arqrefservices.dominio.AvaliacaoRisco;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemAvaliacaoRiscoSIRIC;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemCancelarAvaliacaoRiscoSIRIC;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemConsultaAvaliacaoRiscoSIRIC;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SIRICMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.EFilasMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.ESiglas;
import br.gov.caixa.arqrefservices.dominio.enumerador.EMensagensArqrefServiceErro;
import br.gov.caixa.arqrefservices.dominio.enumerador.EtipoOperacaoBarramento;
import br.gov.caixa.arqrefservices.dominio.enumerador.EtipoPessoa;
import br.gov.caixa.arqrefservices.dominio.siric.Avaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.AvaliacaoValiada;
import br.gov.caixa.arqrefservices.dominio.siric.Dados;
import br.gov.caixa.arqrefservices.dominio.siric.DadosOperacao;
import br.gov.caixa.arqrefservices.dominio.siric.Protocolo;
import br.gov.caixa.arqrefservices.dominio.siric.transicao.DadosSIRICTO;
import br.gov.caixa.arqrefservices.dominio.siric.transicao.MensagemRetornoSIRICTO;
import br.gov.caixa.arqrefservices.stub.StubSIRIC;
import br.gov.caixa.arqrefservices.util.MensagemArqrefService;


/**
 * Classe que implemeta {@link IAvaliacaoRiscoCredito}
 * 
 * @author c110503
 * 
 * @version 1.0.0.1
 *
 */
public class AvaliacaoRiscoCredito implements IAvaliacaoRiscoCredito{

	private static final String CODIGO_PRODUTO_AVALIACAO_TOMADOR = "200000110";
	
	// objeto utilizada para escrever informacoes no log do servidor
	@Inject
	private Logger log;

	// objeto utilizada para manipulacao de data
	@Inject
	protected Dater dater;

	// objeto utilizado para fazer requisicoes nas filas do SICLI
	@Inject
	@SIRICMQ
	public DAOBarramento conexaoMQ;
	
	public AvaliacaoRiscoCredito(){
		if(log == null){
			log = Logger.getLogger(getClass().getName());
		}
	}

	/**
	 * @see IAvaliacaoRiscoCredito#solicitaAvaliacaoRisco(Dados, Empregado)
	 * 
	 * @TODO Verificar validacoes!
	 */
	public Correlation solicitaAvaliacaoRisco(DadosSIRICTO dadosSIRICTO)
			throws BusinessException, SystemException {
		log.info("INICIO solicitaAvaliacaoRisco");
		
		
		//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
		MensagemAvaliacaoRiscoSIRIC msgAvRisco = new MensagemAvaliacaoRiscoSIRIC();		
		
		
//		//Por utilizar so cpf deve ser criado o objeto e setado o tipo de pessoa
//		AvaliacaoRiscoSICLI avRiscoSICLI = new AvaliacaoRiscoSICLI();
//		avRiscoSICLI.setCpf(cpf);
//		avRiscoSICLI.setCodigoTipoPessoa(Integer.toString(EtipoPessoa.CPF.getValor()));		
//		
//		dadosSIRIC.setAvaliacaoRiscoSICLI(avRiscoSICLI);
		
		msgAvRisco.setDados(dadosSIRICTO.getDados());
		
		//cria o cabecalho para pesquisa
		SibarHeader sibar = new SibarHeader();
		sibar.criarSibarHeader(dadosSIRICTO.getEmpregado(), EtipoOperacaoBarramento.AVALIACAORISCOCREDITO.getDescricao());
		
		msgAvRisco.setSibarHeader(sibar);
		
		//Converte o objeto para xml
		String mensagem = ConverterXML.convertToXml(msgAvRisco);
		log.fine("XML RETORNO");
		log.info(mensagem);
		//Recebe a string com o correlation id
		String id = conexaoMQ.put(mensagem, EFilasMQ.SIRIC_SOLICITA_AVALIACAO_RISCO.toString());

		Correlation correlation;
		//verifica o id e trata possivel erro
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
			log.fine("Correlation");
			log.fine(correlation.getId());
		} else {
			//Lanca excecao pela string esta com algum problema
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setMensagemErro(new ArrayList<String>());
			//Lista de Mensagens negocial
			List<String> listaMensagemNegocial = new ArrayList<String>();
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
		log.info("FIM solicitaAvaliacaoRisco");
		return correlation;
	}

	
	
	/**
	 * @see IAvaliacaoRiscoCredito#consultaProtocoloAvaliacaoRisco(Correlation, Empregado)
	 * 
	 * 
	 */
	public Protocolo consultaProtocoloAvaliacaoRisco(Correlation correlation) throws BusinessException, SystemException{
		log.info("INICIO consultaProtocoloAvaliacaoRisco");
		log.fine("Correlation");
		log.fine(correlation.getId());
		//verifica o correlationID
		if(correlation == null || correlation.getId().isEmpty()){
			//Lanca excecao
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));			
			//Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(EMensagensArqrefServiceErro.MN_003.getDescricao());			
			msgArqrefService.setInformacoesAdicionais("");			
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCredito.class.getName());			
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());			
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}else{
			//busca o retorno na fila pelo correlation id
			String saida = conexaoMQ.get(correlation.getId(),
					EFilasMQ.SIRIC_CONSULTA_PROTOCOLO_AVALIACAO_RISCO.toString());
			log.info("XML RETORNO");
			log.info(saida);
			//verifica se o retorno eh nulo
			if(saida == null){
				//significa que nao houve retorno do barramento
				return null;
			}
			//SIRIC nao esta informando a cabecalho
			saida = this.adicionarCabecalho(saida);
			//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
			MensagemAvaliacaoRiscoSIRIC msgAvRisco = ConverterXML.convertFromXml(saida, MensagemAvaliacaoRiscoSIRIC.class);
			//verifica o retorno
			if(msgAvRisco.getCodigoRetorno() != null && msgAvRisco.getCodigoRetorno().equals("X5")){
				//Lanca excecao pela string esta com algum problema
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
				msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));			
				//Lista de Mensagens erro
				msgArqrefService.setMensagemErro(new ArrayList<String>());						
				msgArqrefService.getMensagemErro().add(msgAvRisco.getDados().getExcecao());
				msgArqrefService.setInformacoesAdicionais("");			
				msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());			
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
				msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				msgArqrefService.setSistema(msgAvRisco.getOrigemRetorno());
				log.info(msgArqrefService.toString());
				log.severe(msgArqrefService.toString());

				throw new SystemException(msgArqrefService);
				
			}
			return msgAvRisco.getDados().getProtocolo();
			
		}		
	}

	/**
	 * @see IAvaliacaoRiscoCredito#recebeAvaliacaoRisco(Correlation, Empregado)
	 * 
	 * @TODO
	 * 		Passar a trava de tempo para o lado do Cliente (ClientSide/JavaScript)
	 * 
	 */
	public Avaliacao recebeAvaliacaoRisco(Correlation correlation, String sigla) throws BusinessException, SystemException {
		log.info("INICIO recebeAvaliacaoRisco");
		log.fine("Correlation");
		log.fine(correlation.getId());
		//verifica o correlationID
		if(correlation == null || correlation.getId().isEmpty()){
			//Lanca excecao
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));			
			//Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(EMensagensArqrefServiceErro.MN_003.getDescricao());			
			msgArqrefService.setInformacoesAdicionais("");			
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCredito.class.getName());			
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());			
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}else{
			
			String saida = "";

			if(sigla.equalsIgnoreCase(ESiglas.SIAPX.toString())) {
				saida = conexaoMQ.get(correlation.getId(),
						EFilasMQ.SIRIC_SIAPX_CONSULTA_DADOS_AVALIACAO_RISCO.toString());
			} else {
				try {
					saida = conexaoMQ.get(correlation.getId(),
							EFilasMQ.SIRIC_SICCR_AVALIACAO_RISCO_CREDITO.toString());
				} catch (Exception e) {
					log.info("Erro ao chama fila SICCR");
				}

			}
			
			
					
			log.info("XML RETORNO recebeAvaliacaoRisco");
			log.info(saida);
			
			//verifica se o retorno eh nulo
			if(saida == null){
				//Lanca excecao pela string esta com algum problema
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
				msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));			
				//Lista de Mensagens erro
				msgArqrefService.setMensagemErro(new ArrayList<String>());					
				msgArqrefService.getMensagemErro().add("Avaliação em processamento. Tente novamente em instantes.");
				msgArqrefService.setInformacoesAdicionais("");			
				msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());			
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
				msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				msgArqrefService.setSistema("0");
				log.info(msgArqrefService.toString());
				log.severe(msgArqrefService.toString());

				throw new SystemException(msgArqrefService);
				//significa que nao houve retorno do barramento
//				return null;
			}

			//SIRIC nao esta informando a cabecalho
			saida = this.adicionarCabecalho(saida);

			MensagemAvaliacaoRiscoSIRIC msgSaida = ConverterXML.convertFromXml(
					saida, MensagemAvaliacaoRiscoSIRIC.class);			
			
			// VERIFICA O COD_RETORNO E LANCHA A EXCECAO DO TIPO SYSTEMEXCEPTION 
			if (msgSaida.getCodigoRetorno().equalsIgnoreCase("X5")) {					
				//Lanca excecao pela string esta com algum problema
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
				msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));			
				//Lista de Mensagens erro
				msgArqrefService.setMensagemErro(new ArrayList<String>());					
				msgArqrefService.getMensagemErro().add(msgSaida.getDados().getExcecao());
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
			
			
			if(msgSaida.getDados().getErrosValidacao() != null) {
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
				msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));			
				//Lista de Mensagens erro
				msgArqrefService.setMensagemErro(new ArrayList<String>());					
				msgArqrefService.getMensagemErro().add(msgSaida.getDados().getErrosValidacao().get(0).getErro());
				msgArqrefService.setInformacoesAdicionais("");			
				msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());			
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
				msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				msgArqrefService.setSistema("SIRIC");
				log.info(msgArqrefService.toString());
				log.severe(msgArqrefService.toString());
			}
			
			// CAMPOS DE RETORNO
			if (msgSaida.getDados().getAvaliacao() != null) {
				//seta a lista de erro no objeto 
				msgSaida.getDados().getAvaliacao().setErrosValidacao(msgSaida.getDados().getErrosValidacao());				
				return msgSaida.getDados().getAvaliacao();
			}

			log.info("FIM recebeAvaliacaoRisco");
			return null;
		}		
	}

	/**
	 * @see IAvaliacaoRiscoCredito#consultaListaAvaliacaoRisco(String, Empregado)
	 *  
	 * 
	 */
	public Correlation consultaListaAvaliacaoRisco(DadosSIRICTO dadosSIRICTO) throws BusinessException, SystemException {
		log.info("INICIO consultaListaAvaliacaoRisco");
		//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
		MensagemConsultaAvaliacaoRiscoSIRIC msgAvRisco = new MensagemConsultaAvaliacaoRiscoSIRIC();

		Dados dados = new Dados();
		
		DadosOperacao dadosOperacao = new DadosOperacao();
		
		//Por utilizar so cpf deve ser criado o objeto e setado o tipo de pessoa
		AvaliacaoValiada avValiada = new AvaliacaoValiada();
		avValiada.setCpf(dadosSIRICTO.getCpf());
		avValiada.setTipoPessoa(Integer.toString(EtipoPessoa.CPF.getValor()));
		//objeto de retorno lista
		List<AvaliacaoValiada> listaAvaliacaoValiada = new ArrayList<AvaliacaoValiada>();
		listaAvaliacaoValiada.add(avValiada);
		dadosOperacao.setAvaliacoesValidas(listaAvaliacaoValiada);
		
		
		dados.setDadosOperacaoConsulta(dadosOperacao);
		
		msgAvRisco.setDados(dados);
		
		//cria o cabecalho para pesquisa
		SibarHeader sibar = new SibarHeader();
		sibar.criarSibarHeader(dadosSIRICTO.getEmpregado(),
				EtipoOperacaoBarramento.CONSULTARISCOCREDITO.getDescricao());
		
		msgAvRisco.setSibarHeader(sibar);
		
		//Converte o objeto para xml
		String mensagem = ConverterXML.convertToXml(msgAvRisco);
		log.info(mensagem);
		//Recebe a string com o correlation id
		String id = conexaoMQ.put(mensagem, EFilasMQ.SIRIC_CONSULTA_AVALIACAO_RISCO.toString());

		Correlation correlation;
		//verifica o id e trata possivel erro
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
		} else {
			//Lanca excecao pela string esta com algum problema
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setMensagemErro(new ArrayList<String>());
			//Lista de Mensagens erro
			msgArqrefService.getMensagemErro().add(EMensagensArqrefServiceErro.MN_004.getDescricao());
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());			
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());	
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());
			throw new SystemException(msgArqrefService);	
			
		}		
		log.info("FIM consultaListaAvaliacaoRisco");
		return correlation;
	}

	/**
	 * @see IAvaliacaoRiscoCredito#recebeListaConsultaAvaliacaoRisco(Correlation, Empregado)
	 * 
	 * 
	 */
	public List<AvaliacaoValiada> recebeListaConsultaAvaliacaoRisco(Correlation correlation) throws BusinessException, SystemException {
		log.info("INICIO recebeListaConsultaAvaliacaoRisco");
		//verifica o correlationID
		if(correlation == null || correlation.getId().isEmpty()){
			//Lanca excecao
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL.getDescricao());
			msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));			
			//Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(EMensagensArqrefServiceErro.MN_003.getDescricao());			
			msgArqrefService.setInformacoesAdicionais("");			
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCredito.class.getName());			
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());			
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}else{
			String saida = conexaoMQ.get(correlation.getId(),
					EFilasMQ.SIRIC_RECEBE_CONSULTA_AVALIACAO_RISCO.toString());
			
			log.info("XML RETORNO recebeListaConsultaAvaliacaoRisco");
			log.info(saida);
			
			//verifica se o retorno eh nulo
			if(saida == null){
				//significa que nao houve retorno do barramento
				return null;
			}

			//stub
//			saida = StubSIRIC.consultaAvaliacaoRiscoXML();

			MensagemConsultaAvaliacaoRiscoSIRIC msgSaida = ConverterXML.convertFromXml(
					saida, MensagemConsultaAvaliacaoRiscoSIRIC.class);


			
			// VERIFICA O COD_RETORNO E LANCHA A EXCECAO DO TIPO SYSTEMEXCEPTION 
			if (msgSaida.getCodigoRetorno().equalsIgnoreCase("X5")) {					
				//Lanca excecao pela string esta com algum problema
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
				msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));			
				//Lista de Mensagens erro
				msgArqrefService.setMensagemErro(new ArrayList<String>());			
				msgArqrefService.getMensagemErro().add(msgSaida.getMensagemRetorno());
				//Checa nulidade do retorno dos dados(esta gerando NullPointerException)
				if(msgSaida.getDados() != null
						&& msgSaida.getDados().getExcecao() != null){
					msgArqrefService.setInformacoesAdicionais(msgSaida.getDados().getExcecao());
				}else{
					msgArqrefService.setInformacoesAdicionais("");
				}
				msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());			
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
				msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
				log.info(msgArqrefService.toString());
				log.severe(msgArqrefService.toString());

				throw new SystemException(msgArqrefService);
			}else if(msgSaida.getCodigoRetorno().equalsIgnoreCase("00") && msgSaida.getDados() == null){
				return new ArrayList<AvaliacaoValiada>(); 
			}else if(msgSaida.getCodigoRetorno().equalsIgnoreCase("14") && msgSaida.getDados() == null){
				return new ArrayList<AvaliacaoValiada>(); 
			}
			// CAMPOS DE RETORNO
			if (msgSaida.getDados().getDadosOperacaoConsulta() != null &&
					msgSaida.getDados().getDadosOperacaoConsulta().getAvaliacoesValidas() != null) {
				return msgSaida.getDados().getDadosOperacaoConsulta().getAvaliacoesValidas();
			}

			log.info("FIM recebeListaConsultaAvaliacaoRisco");
			return null;
		}	
	}

	/**
	 * @see IAvaliacaoRiscoCredito#cancelaAvaliacaoRisco(String, Empregado)
	 * 
	 *@TODO
	 *		VALIDADE PARAMETROS
	 * 
	 */
	public Correlation  solicitarCancelarAvaliacaoRiscoCredito(String cpfCliente,
			String matriculaUsuario, String codigoAvaliacao, String numeroUnidade)  throws BusinessException, SystemException {
		log.info("INICIO - solicitarCancelarAvaliacaoRiscoCredito");
		log.fine("cpfCliente :" + cpfCliente);
		log.fine("matriculaUsuario :" + matriculaUsuario);
		log.fine("codigoAvaliacao :" + codigoAvaliacao);
		log.fine("numeroUnidade :" + numeroUnidade);
		//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
		MensagemCancelarAvaliacaoRiscoSIRIC msgAvRisco = new MensagemCancelarAvaliacaoRiscoSIRIC();

		Dados dadosSIRIC = new Dados();

		dadosSIRIC.setCpfCliente(cpfCliente);
		dadosSIRIC.setCodigoAvaliacao(codigoAvaliacao);
		dadosSIRIC.setMatriculaUsuario(matriculaUsuario);

		Empregado empregado = new Empregado();
		empregado.setNumeroMatricula(new Integer(matriculaUsuario));
		empregado.setNumeroUnidade(new Integer(numeroUnidade));

		

		msgAvRisco.setDados(dadosSIRIC);

		// cria o cabecalho para pesquisa
		SibarHeader sibar = new SibarHeader();
		sibar.criarSibarHeader(empregado,
				EtipoOperacaoBarramento.CANCELARISCOCREDITO.getDescricao());

		msgAvRisco.setSibarHeader(sibar);

		// Converte o objeto para xml
		String mensagem = ConverterXML.convertToXml(msgAvRisco);
		log.fine("XML ENVIO");
		log.fine(mensagem);
		// Recebe a string com o correlation id
		String id = conexaoMQ.put(mensagem,
				EFilasMQ.SIRIC_SOLICITA_CANCELAMENTO_AVALIACAO_RISCO.toString());

		Correlation correlation;
		// verifica o id e trata possivel erro
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
			log.fine("correlation");
			log.fine(id);
		} else {
			// Lanca excecao pela string esta com algum problema
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES
					.getDescricao());
			msgArqrefService.setCodigoErro(Integer
					.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setMensagemErro(new ArrayList<String>());
			// Lista de Mensagens erro
			msgArqrefService.getMensagemErro().add(
					EMensagensArqrefServiceErro.MN_004.getDescricao());
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO
					.getValor());
			msgArqrefService
					.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO
							.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());
			throw new SystemException(msgArqrefService);

		}
		log.info("FIM solicitarCancelarAvaliacaoRiscoCredito");
		return correlation;
	}

	/**
	 * @see IAvaliacaoRiscoCredito#recebeCancelaAvaliacaoRisco(Correlation, Empregado)
	 * 
	 * 
	 */
	public MensagemRetornoSIRICTO receberCancelarAvaliacaoRiscoCredito(Correlation correlation) throws BusinessException, SystemException {
		log.info("INICIO - receberCancelarAvaliacaoRiscoCredito");
		
		// verifica o correlationID
		if (correlation == null || correlation.getId().isEmpty()) {
			// Lanca excecao
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_NEGOCIAL
					.getDescricao());
			msgArqrefService.setCodigoErro(Integer
					.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(
					EMensagensArqrefServiceErro.MN_003.getDescricao());
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCredito.class
					.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO
					.getValor());
			msgArqrefService
					.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO
							.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		} else {
			log.fine("correlation");
			log.fine(correlation.getId());
			String saida = conexaoMQ.get(correlation.getId(),
					EFilasMQ.SIRIC_CONSULTA_RESP_CANCELAMENTO_AVALIACAO_RISCO.toString());

			// verifica se o retorno eh nulo
			if (saida == null) {
				// significa que nao houve retorno do barramento
				return null;
			}

			log.fine("XML RETORNO receberCancelarAvaliacaoRiscoCredito");
			log.fine(saida);

			MensagemCancelarAvaliacaoRiscoSIRIC msgSaida = ConverterXML
					.convertFromXml(saida,
							MensagemCancelarAvaliacaoRiscoSIRIC.class);

			// VERIFICA O COD_RETORNO E LANCHA A EXCECAO DO TIPO SYSTEMEXCEPTION
			if (msgSaida.getCodigoRetorno().equalsIgnoreCase("X5")) {
				// Lanca excecao pela string esta com algum problema
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES
						.getDescricao());
				msgArqrefService.setCodigoErro(Integer
						.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
				// Lista de Mensagens erro
				msgArqrefService.setMensagemErro(new ArrayList<String>());
				msgArqrefService.getMensagemErro().add(msgSaida.getMensagemRetorno());
				//Checa nulidade do retorno dos dados(esta gerando NullPointerException)
				if(msgSaida.getDados() != null
						&& msgSaida.getDados().getExcecao() != null){
					msgArqrefService.setInformacoesAdicionais(msgSaida.getDados().getExcecao());
				}else{
					msgArqrefService.setInformacoesAdicionais("");
				}
				msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO
						.getValor());
				msgArqrefService
						.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO
								.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
				
				log.severe(msgArqrefService.toString());

				throw new SystemException(msgArqrefService);
			}
			// CAMPOS DE RETORNO
			MensagemRetornoSIRICTO msgRetornoTO = new MensagemRetornoSIRICTO();
			msgRetornoTO.setCodigoRetorno(msgSaida.getCodigoRetorno());
			msgRetornoTO.setMensagemRetorno(msgSaida.getMensagemRetorno());
			msgRetornoTO.setOrigemRetorno(msgSaida.getOrigemRetorno());

			log.fine(msgRetornoTO.toString());
			
			log.info("FIM receberCancelarAvaliacaoRiscoCredito");
			return msgRetornoTO;
		}
	}
	
	/**
	 * Funcao interna para verificar e adicionar o cabecalho 
	 * da mensagem de retorno.
	 */
	private String adicionarCabecalho(String xmlRetornoSIRIC){
		if(!xmlRetornoSIRIC.contains("?xml version")){
			xmlRetornoSIRIC = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + xmlRetornoSIRIC;
		}
		return xmlRetornoSIRIC;
	}
	
	

}
