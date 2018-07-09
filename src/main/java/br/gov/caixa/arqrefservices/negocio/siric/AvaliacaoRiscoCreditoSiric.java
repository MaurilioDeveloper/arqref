package br.gov.caixa.arqrefservices.negocio.siric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
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
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefcore.util.Dater;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemAvaliacaoRiscoSIRIC;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemConsultaAvaliacaoRiscoSIRIC;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SIRICMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.EFilasMQ;
import br.gov.caixa.arqrefservices.dominio.enumerador.EMensagensArqrefServiceErro;
import br.gov.caixa.arqrefservices.dominio.enumerador.EtipoOperacaoBarramento;
import br.gov.caixa.arqrefservices.dominio.sicli.CPF;
import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;
import br.gov.caixa.arqrefservices.dominio.sicli.EnderecoNacionalComplemento;
import br.gov.caixa.arqrefservices.dominio.sicli.MeioComunicacao;
import br.gov.caixa.arqrefservices.dominio.sicli.Renda;
import br.gov.caixa.arqrefservices.dominio.siric.AvaliacaoValiada;
import br.gov.caixa.arqrefservices.dominio.siric.Dados;
import br.gov.caixa.arqrefservices.dominio.siric.DadosOperacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Avaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.AvaliacaoComAtualizacaoViaSicli;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Contatos;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Endereco;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.ErrosValidacaoAvaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Filiacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Identidade;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.MargemConsignavel;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.MensagemSolicitacaoAvaliacaoRiscoSaida;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.PerguntaSiric;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Rendas;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Telefone;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.TomadorSiric;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial.DadosEnvioSolicitacaoAvaliacaoRiscoComercial;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial.MensagemAvaliacaoRiscoComercialEntrada;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial.QuadroValoresAvaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial.Relacionamentos;
import br.gov.caixa.arqrefservices.negocio.ClienteNegocio;
import br.gov.caixa.arqrefservices.util.MensagemArqrefService;


/**
 * Classe que implemeta {@link IAvaliacaoRiscoCreditoSiric}
 * 
 * @author c110503
 * 
 * @version 1.0.0.1
 *
 */
public class AvaliacaoRiscoCreditoSiric implements IAvaliacaoRiscoCreditoSiric{

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
	
	protected static final String SITUACAO_AVALIACAO_ERRO_SIRIC = "04";

	
	
	public AvaliacaoRiscoCreditoSiric(){
		if(log == null){
			log = Logger.getLogger(getClass().getName());
		}
	}

	/**
	 * @see IAvaliacaoRiscoCreditoSiric#solicitaAvaliacaoRisco(Dados, Empregado)
	 * 
	 * @TODO Verificar validacoes!
	 */
//	public Correlation solicitaAvaliacaoRiscoCliente(CamposRetornados dadosSicli, Empregado empregado, Renda renda)
//			throws BusinessException, SystemException {
//		log.info("INICIO solicitaAvaliacaoRisco");
//		
//		
//		//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
//		MensagemAvaliacaoRiscoSIRIC msgAvRisco = new MensagemAvaliacaoRiscoSIRIC();		
//		
//		
//		TomadorSiric tomador = this.converterSICLItoSIRIC(dadosSicli);
//		Dados dados= new Dados();
//		dados.setTomador(tomador);
//		
//		msgAvRisco.setDados(dados);
//		
//		//cria o cabecalho para pesquisa
//		SibarHeader sibar = new SibarHeader();
//		sibar.criarSibarHeader(empregado.getMatriculaUsuario(), empregado.getNumeroUnidade().toString(),EtipoOperacaoBarramento.AVALIACAORISCOCREDITO.getDescricao());
//		
//		msgAvRisco.setSibarHeader(sibar);
//		
//		//Converte o objeto para xml
//		String mensagem = ConverterXML.convertToXml(msgAvRisco);
//		log.fine("XML RETORNO");
//		log.info(mensagem);
//		//Recebe a string com o correlation id
//		String id = conexaoMQ.put(mensagem, EFilasMQ.SIRIC_SOLICITA_AVALIACAO_RISCO.toString());
//
//		Correlation correlation = verificaCorrelation(id);		
//		log.info("FIM solicitaAvaliacaoRisco");
//		return correlation;
//	}

	

	/**
	 * @see IAvaliacaoRiscoCreditoSiric#solicitaAvaliacaoRisco(Dados, Empregado)
	 * 
	 * @TODO Verificar validacoes!
	 */
	public Correlation solicitaAvaliacaoRiscoCliente(CamposRetornados dadosSicli, Empregado empregado, Renda renda, String sigla)
			throws BusinessException, SystemException {
		log.info("INICIO solicitaAvaliacaoRisco");
		
		
		//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
		MensagemAvaliacaoRiscoComercialEntrada msgAvRisco = new MensagemAvaliacaoRiscoComercialEntrada();		
		DadosEnvioSolicitacaoAvaliacaoRiscoComercial dados= new DadosEnvioSolicitacaoAvaliacaoRiscoComercial();
		
		/**
		 *************************************************
		 * 	 AVALIAÇÃO COM ATUALIZA VIA SICLI COMERCIAL
		 *************************************************
		 */
		AvaliacaoComAtualizacaoViaSicli avaliacaoComAtualizacaoViaSicli = new AvaliacaoComAtualizacaoViaSicli();
		avaliacaoComAtualizacaoViaSicli.setModeloAvaliacao("0");
		avaliacaoComAtualizacaoViaSicli.setModeloValidacao("0");
		avaliacaoComAtualizacaoViaSicli.setNumeroCPF(dadosSicli.getCpf().getDocumento().getNumero() + dadosSicli.getCpf().getDocumento().getDigitoVerificador());
		avaliacaoComAtualizacaoViaSicli.setTipoPessoa(dadosSicli.getTipoPessoa().getTipoPessoa());
		dados.setAtualizacaoSicli(avaliacaoComAtualizacaoViaSicli);
		/**
		 *************************************************
		 * FIM AVALIAÇÃO COM ATUALIZA VIA SICLI COMERCIAL
		 *************************************************
		 */
		

		/**
		 *************************************************
		 * 	 QUADRO DE VALORES DA AVALIAÇÃO COMERCIAL
		 *************************************************
		 */
		QuadroValoresAvaliacao quadroValores = new QuadroValoresAvaliacao();
		MargemConsignavel margemConsignavel = new MargemConsignavel();
		//TODO pegar valor da Margem
		margemConsignavel.setValorMargem(1000.00);
		quadroValores.setMargemConsignavel(margemConsignavel);
		dados.setQuadroValores(quadroValores);
		/**
		 ************************************************
		 *  FIM	QUADRO DE VALOR DA AVALIAÇÃO COMERCIAL
		 ************************************************
		 */
		
		/**
		 ***********************************************
		 *	RELACIONAMENTOS DA AVALIAÇÃO COMERCIAL
		 ***********************************************
		 */
		Relacionamentos relacionamentos = new Relacionamentos();
		PerguntaSiric perguntaSiric = new PerguntaSiric();
		//TODO ajustar data Inicio (pegar data de hoje, e formatar)
		perguntaSiric.setDataInicio("2018-05-16");
		relacionamentos.setPerguntaSiric(perguntaSiric);
		dados.setRelacionamentos(relacionamentos);
		/**
		 ***********************************************
		 *	FIM RELACIONAMENTOS DA AVALIAÇÃO COMERCIAL
		 ***********************************************
		 */
		
		//Seta dados Avaliação Comercial
		msgAvRisco.setDados(dados);
		
		//cria o cabecalho para pesquisa
		SibarHeader sibar = new SibarHeader();
		sibar.criarSibarHeaderAvaliacao(empregado.getMatriculaUsuario(), empregado.getNumeroUnidade().toString(),EtipoOperacaoBarramento.AVALIACAORISCOCREDITO.getDescricao(), sigla);
		
		msgAvRisco.setSibarHeader(sibar);
		
		//Converte o objeto para xml
		String mensagem = ConverterXML.convertToXml(msgAvRisco);
		
		//Teste 
		mensagem = "";
		BufferedReader br = null;
		try { 
			String arquivo = "mock-siric.xml";
			String linhaAtual;
			InputStream in = AvaliacaoRiscoCreditoSiric.class.getResourceAsStream(arquivo);
			Reader fr = new InputStreamReader(in, "utf-8");
			br = new BufferedReader(fr);
			 
			while ((linhaAtual = br.readLine()) != null) {
				mensagem  = mensagem  + linhaAtual;
			} 		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
			
		log.fine("XML RETORNO");
		log.info(mensagem);
		//Recebe a string com o correlation id
		String id = conexaoMQ.put(mensagem, EFilasMQ.SIRIC_SOLICITA_AVALIACAO_RISCO.toString());

		Correlation correlation = verificaCorrelation(id);		
		log.info("FIM solicitaAvaliacaoRisco");
		return correlation;
	}
	
	
	private Correlation verificaCorrelation(String id) throws BusinessException {
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
		return correlation;
	}

	
	
	private TomadorSiric converterSICLItoSIRIC(CamposRetornados dadosSicli) {
		TomadorSiric tomador = new TomadorSiric();

		if (dadosSicli.getTipoPessoa() != null) {
			tomador.setTipoPessoa(dadosSicli
					.getTipoPessoa().getTipoPessoa());
		}

		tomador.setNumeroCPF(dadosSicli.getCpf().getDocumento().getNumero());

		tomador.setNomeTomador(dadosSicli
					.getNomeCliente().getNome());

		// CONVERSAO SICLI --> SIRIC DDMMAAAA
		String[] data = null;
		if (dadosSicli.getDataNascimento() != null
				&& dadosSicli
						.getDataNascimento().getData() != null) {
			data = dadosSicli
					.getDataNascimento().getData().split("-");
			tomador.setDataNascimento(data[2] + data[1] + data[0]);
		}

		// DE PARA SICLI --> SIRIC
		if (dadosSicli.getSexo() != null
				&& dadosSicli.getSexo()
						.getSexo() != null) {
			if (dadosSicli.getSexo().getSexo()
					.equalsIgnoreCase("M")) {
				tomador.setIndicativoSexo("1");
			} else {
				tomador.setIndicativoSexo("2");
			}
		}

		// DE PARA SICLI --> SIRIC
		// 1 VERIFICA SE EH BRASILEIRO NATURALIZADO
		if (dadosSicli.getPaisOrigem() != null
				&& dadosSicli.getPaisOrigem()
						.getCodigoPais() != null
				&& "10".equalsIgnoreCase(dadosSicli.getPaisOrigem()
						.getCodigoPais())
				&& dadosSicli.getPaisOrigem()
						.getTipoNacionalidade() != null
				&& "S".equalsIgnoreCase(dadosSicli.getPaisOrigem()
						.getCodigoPais())) {

			tomador.setNumeroNacionalidade("2");
		} else if (dadosSicli.getPaisOrigem() != null
				&& "10".equalsIgnoreCase(dadosSicli.getPaisOrigem()
						.getCodigoPais())) {
			tomador.setNumeroNacionalidade("1");
		} else {
			tomador.setNumeroNacionalidade("3");
		}

		if (dadosSicli.getNaturalidade() != null) {
			// NATURALIDADE NAO DEVE CONTER O DV
			if (dadosSicli.getNaturalidade()
					.getMunicipio().length() > 6) {
				tomador.setNumeroNaturalidade(dadosSicli.getNaturalidade()
						.getMunicipio().substring(0, 6));
			} else {
				tomador.setNumeroNaturalidade(dadosSicli.getNaturalidade()
						.getMunicipio());
			}
		}

		Filiacao filiacao = new Filiacao();

		// DE PARA SICLI --> SIRIC
		// NOME ACEITA NO MAXIMO 40 CARACTERES
		if (dadosSicli.getNomeMae() != null
				&& dadosSicli.getNomeMae()
						.getNome() != null) {
			if (dadosSicli.getNomeMae().getNome()
					.length() > 40) {
				filiacao.setNomeMae(dadosSicli.getNomeMae().getNome().substring(0, 39));
			} else {
				filiacao.setNomeMae(dadosSicli.getNomeMae().getNome());
			}
		}

		// DE PARA SICLI --> SIRIC
		// NOME ACEITA NO MAXIMO 40 CARACTERES
		if (dadosSicli.getNomePai()!= null
				&& dadosSicli.getNomePai()
						.getNome() != null) {
			if (dadosSicli.getNomePai().getNome()
					.length() > 40) {
				filiacao.setNomePai(dadosSicli
						.getNomePai().getNome().substring(0, 39));
			} else {
				filiacao.setNomePai(dadosSicli
						.getNomePai().getNome());
			}
		}

		tomador.setFiliacao(filiacao);

		if (dadosSicli.getIdentidade() != null) {
				
			Identidade identidade = new Identidade();

			
				identidade.setNumeroIdentidade(dadosSicli.getIdentidade()
						.getDocumento().getNumero());
				identidade.setUfEmissor(dadosSicli.getIdentidade().getDocumento()
						.getUf());
				// CONVERSAO SICLI --> SIRIC DDMMAAAA
				data = null;
				if (dadosSicli
						.getDataNascimento().getData() != null
						&& dadosSicli
								.getDataNascimento().getData().contains("-")) {
					data = dadosSicli.getIdentidade().getDocumento().getDataEmissao()
							.split("-");
					identidade.setDataEmissao(data[2] + data[1] + data[0]);
				}
				identidade.setOrgaoEmissor(dadosSicli.getIdentidade()
						.getSiglaOrgaoEmissor());

				tomador.setIdentidade(identidade);
		}
		

		// DE PARA ESTADO CIVIL SICLI --> SIRIC
		// VERIFICAR CAMPOS 2 (GERAR ERRO)/8
		if (dadosSicli.getEstadoCivil() != null) {
			if (dadosSicli.getEstadoCivil()
					.getEstadoCivil() != null) {
				if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("0")) {
					tomador.setNumeroEstadoCivil("8");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("1")) {
					tomador.setNumeroEstadoCivil("1");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("2")) {
					tomador.setNumeroEstadoCivil("3");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("3")) {
					tomador.setNumeroEstadoCivil("5");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("4")) {
					tomador.setNumeroEstadoCivil("6");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("5")) {
					tomador.setNumeroEstadoCivil("7");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("6")) {
					tomador.setNumeroEstadoCivil("8");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("7")) {
					tomador.setNumeroEstadoCivil("2");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("8")) {
					tomador.setNumeroEstadoCivil("4");
				} else if (dadosSicli
						.getEstadoCivil().getEstadoCivil().equals("9")) {
					tomador.setNumeroEstadoCivil("3");
				}
			}
		}

		// DE PARA GRAU INSTRUCAO SICLI --> SIRIC
		// VERIFICAR CAMPOS 0 (GERAR ERRO)
		if (dadosSicli.getGrauInstrucao() != null) {
			if (dadosSicli.getGrauInstrucao()
					.getGrauInstrucao() != null) {
				if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("0")) {
					tomador.setNumeroGrauInstrucao("4");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("1")) {
					tomador.setNumeroGrauInstrucao("0");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("2")) {
					tomador.setNumeroGrauInstrucao("1");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("3")) {
					tomador.setNumeroGrauInstrucao("1");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("4")) {
					tomador.setNumeroGrauInstrucao("1");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("5")) {
					tomador.setNumeroGrauInstrucao("2");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("6")) {
					tomador.setNumeroGrauInstrucao("3");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("7")) {
					tomador.setNumeroGrauInstrucao("4");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("8")) {
					tomador.setNumeroGrauInstrucao("5");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("9")) {
					tomador.setNumeroGrauInstrucao("6");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("10")) {
					tomador.setNumeroGrauInstrucao("7");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("11")) {
					tomador.setNumeroGrauInstrucao("8");
				} else if (dadosSicli
						.getGrauInstrucao().getGrauInstrucao().equals("12")) {
					tomador.setNumeroGrauInstrucao("9");
				}
			}
		}

		if (dadosSicli.getCarteiraGRC() != null) {
			tomador.setCodigoCarteira(dadosSicli.getCarteiraGRC().get(0).getCarteria());
		}

		br.gov.caixa.arqrefservices.dominio.sicli.EnderecoNacional endNacional = new br.gov.caixa.arqrefservices.dominio.sicli.EnderecoNacional();
		Endereco endereco = new Endereco();

		if (dadosSicli.getEnderecoNacional() != null) {
			for (br.gov.caixa.arqrefservices.dominio.sicli.EnderecoNacional end : dadosSicli.getEnderecoNacional()) {
				// VERIFICA SE O ENDERECO É O GENERICO G
				for (EnderecoNacionalComplemento endComplemento : dadosSicli.getEnderecoNacionalComplemento()) {
					if (end.getOcorencia().equals(
							endComplemento.getOcorrencia())
							&& endComplemento.getTipoEndereco().equals("G")) {
						endNacional = end;
						break;
					}
				}
			}
			endereco.setNumeroCEP(endNacional.getCep());
			endereco.setNomeLogradouro(endNacional.getLogradouro());
			endereco.setNumeroLogradouro(endNacional.getLogradouro() != null ? endNacional.getLogradouro() : "");
			endereco.setNomeComplementoLogradouro(endNacional
					.getComplemento());
			endereco.setNomeBairro(endNacional.getBairro());
			endereco.setNumeroMunicipio(endNacional.getMunicipio());
			endereco.setSiglaUF(endNacional.getUf());
		}


		Contatos contatos = new Contatos();
		Telefone tel = new Telefone();

		if (dadosSicli.getMeioComunicacao() != null) {
			for (MeioComunicacao meio : dadosSicli.getMeioComunicacao()) {
				if (meio.getFinalidade() != null
						&& "11".equals(meio.getCodigoComunicacao())) {
					tel.setNumeroDDD(meio.getPrefixoDiscagem());
					// VERIFICA TELEFONE + RAMAL
					if (meio.getCodigoComunicacao().length() > 8) {
						tel.setNumeroTelefone(meio.getCodigoComunicacao()
								.substring(0, 9));
					} else {
						tel.setNumeroTelefone(meio.getCodigoComunicacao());
					}
					break;
				}
			}
			contatos.setTelefoneResidencial(tel);
		}

		contatos.setEmail("");

		endereco.setContatos(contatos);
		tomador.setEndereco(endereco);

		Rendas rendas = new Rendas();


		tomador.setRendas(rendas);


		return tomador;
	}




	/**
	 * @see IAvaliacaoRiscoCreditoSiric#recebeListaConsultaAvaliacaoRisco(Correlation, Empregado)
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
			msgArqrefService.setOrigemErro(AvaliacaoRiscoCreditoSiric.class.getName());			
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
	 * @see IAvaliacaoRiscoCreditoSiric#cancelaAvaliacaoRisco(String, Empregado)
	 * 
	 *@TODO
	 *		VALIDADE PARAMETROS
	 * 
	 */
	
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
	


	public Correlation solicitaAvaliacaoRiscoCredito(DadosOperacao dadosOperacao,
			CamposRetornados dadosSicli, Empregado empregado, Renda renda) throws BusinessException, SystemException {
		//Inicio da construcao da Mensagem enviada para o Barramento SIRIC
		MensagemAvaliacaoRiscoSIRIC msgAvRisco = new MensagemAvaliacaoRiscoSIRIC();		
				
				
		TomadorSiric tomador = this.converterSICLItoSIRIC(dadosSicli);
		Dados dados= new Dados();
		
		dados.setTomador(tomador);
		
		dados.setDadosOperacao(dadosOperacao);
		
		msgAvRisco.setDados(dados);
				
		//cria o cabecalho para pesquisa
		SibarHeader sibar = new SibarHeader();
		sibar.criarSibarHeader(empregado, EtipoOperacaoBarramento.AVALIACAORISCOCREDITO.getDescricao());
				
		msgAvRisco.setSibarHeader(sibar);
				
		//Converte o objeto para xml
		String mensagem = ConverterXML.convertToXml(msgAvRisco);
		log.fine("XML RETORNO");
		log.info(mensagem);
		
		//Teste 
		mensagem = "";
		BufferedReader br = null;
		try { 
			String arquivo = "mock-siric-operacao.xml";
			String linhaAtual;
	//		Thread.currentThread().getContextClassLoader()
			InputStream in = AvaliacaoRiscoCreditoSiric.class.getResourceAsStream(arquivo);
			Reader fr = new InputStreamReader(in, "utf-8");
			br = new BufferedReader(fr);
			
	//		br = new BufferedReader(new FileReader("WS_CONSULTA_MARGEM_RETORNO.xml")); 
			while ((linhaAtual = br.readLine()) != null) {
				mensagem  = mensagem  + linhaAtual;
			} 		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		
		
		
		
		//Recebe a string com o correlation id
		String id = conexaoMQ.put(mensagem, EFilasMQ.SIRIC_SOLICITA_AVALIACAO_RISCO.toString());

		Correlation correlation = verificaCorrelation(id);		
		log.info("FIM solicitaAvaliacaoRisco");
		return correlation;
	}

	
	public Avaliacao retornoDadosAvaliacaoRisco(String correlationId) throws BusinessException {
		MensagemSolicitacaoAvaliacaoRiscoSaida msgRetorno = null;
		String retornoSiric = null;
		
		if (StringUtils.isNotBlank(correlationId)) {
			
			retornoSiric = conexaoMQ.get(correlationId,
					EFilasMQ.SIRIC_CONSULTA_PROTOCOLO_AVALIACAO_RISCO.toString());
			
			log.info("Retorno do PROTOCOLO da Avaliacao de Risco");
			log.info(retornoSiric);
			
			if (!StringUtils.isEmpty(retornoSiric)) {

				msgRetorno = ConverterXML.convertFromXml(retornoSiric,
						MensagemSolicitacaoAvaliacaoRiscoSaida.class);

				if (msgRetorno.getCodigoRetorno() != null) {
					String codigoRetorno = msgRetorno.getCodigoRetorno();
					
					if(msgRetorno.getDados().getAvaliacao() == null){
						msgRetorno.getDados().setAvaliacao(new Avaliacao());
					}
					msgRetorno.getDados().getAvaliacao().setCodigoRetornoMensagem(codigoRetorno);

					if ("X5".equalsIgnoreCase(codigoRetorno)) {
						//Lanca excecao pela string esta com algum problema
						MensagemArqrefService msgArqrefService = new MensagemArqrefService();
						msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES.getDescricao());
						msgArqrefService.setCodigoErro(Integer.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));			
						//Lista de Mensagens erro
						msgArqrefService.setMensagemErro(new ArrayList<String>());			
						msgArqrefService.getMensagemErro().add(msgRetorno.getMensagemRetorno());
						//Checa nulidade do retorno dos dados(esta gerando NullPointerException)
						if(msgRetorno.getDados() != null
								&& msgRetorno.getDados().getExcecao() != null){
							msgArqrefService.setInformacoesAdicionais(msgRetorno.getDados().getExcecao());
						}else{
							msgArqrefService.setInformacoesAdicionais("");
						}
						msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());			
						msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO.getValor());
						msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO.getDescricao());
						msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
						msgArqrefService.setSistema(msgRetorno.getOrigemRetorno());
						log.info(msgArqrefService.toString());
						log.severe(msgArqrefService.toString());

						throw new SystemException(msgArqrefService);
//						Aprovacao rejeitada = new Aprovacao();
//						rejeitada.setCodigoMensagem(SITUACAO_AVALIACAO_ERRO_SIRIC);
//						Avaliacao avaliacaoRejeitada = new Avaliacao();
//						avaliacaoRejeitada.setCodigoPerfil("");
//						avaliacaoRejeitada.setRejeitada(rejeitada);
//						avaliacaoRejeitada.setCodigoRetornoMensagem(codigoRetorno);
//						msgRetorno.getDados().setAvaliacao(avaliacaoRejeitada);
					}
				}

				if (msgRetorno.getDados().getListaErrosValidacao() != null) {
					List<ErrosValidacaoAvaliacao> listaErrosValidacao = msgRetorno
							.getDados().getListaErrosValidacao();

					StringBuilder builder = new StringBuilder();

					MessageDefault msg = new MessageDefault();
					msg.setSeveridade(3);
					msg.setCategoriaErro("4");
					msg.setCodigoErro(msgRetorno.getCodigoRetorno());
					msg.setOrigemErro(msgRetorno.getMensagemRetorno());
					msg.setParagrafoErro(msgRetorno.getSibarHeader()
							.getOperacao());
					msg.setOrigemErro(msgRetorno.getSibarHeader()
							.getSistemaOrigem());
					msg.setInformacoesAdicionais("");

					for (ErrosValidacaoAvaliacao errosValidacao : listaErrosValidacao) {
						if (errosValidacao.getDescricaoErro() != null) {
							builder.append(errosValidacao.getDescricaoErro().trim()+ "; ");

							msg.getMensagemNegocial().add(
									errosValidacao.getDescricaoErro());
						}
					}

					msgRetorno.setMensagemRetorno(builder.toString());
				}

				if (msgRetorno.getMensagemRetorno() != null) {
					msgRetorno.getDados().getAvaliacao()
							.setDescricaoRetornoMensagem(
									msgRetorno.getMensagemRetorno());
				}

				return msgRetorno.getDados().getAvaliacao();
			}
		}

		return null;
	}



	

}
