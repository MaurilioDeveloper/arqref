package br.gov.caixa.arqrefservices.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.excecao.enumerador.ECategoriaErro;
import br.gov.caixa.arqrefcore.excecao.enumerador.ESeveridadeErro;
import br.gov.caixa.arqrefcore.excecao.mensagem.MessageDefault;
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemRecuperarDadosMinutaEntrada;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemRecuperarDadosMinutaSaida;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SIFECMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.EFilasMQ;
import br.gov.caixa.arqrefservices.dominio.enumerador.EMensagensArqrefServiceErro;
import br.gov.caixa.arqrefservices.util.MensagemArqrefService;

/**
 * Classe que implemeta {@link IServicosNegocio}
 * 
 */
public class ServicosNegocio implements IServicoNegocio {

	// objeto utilizada para escrever informacoes no log do servidor
	@Inject
	private Logger log;

	// objeto utilizado para fazer requisicoes nas filas do SIFEC
	@Inject
	@SIFECMQ
	public DAOBarramento conexaoMQ;

	/**
	 * @see ServicosNegocio#solicitaDadosParaMinuta(MensagemRecuperarDadosMinutaEntrada entrada)
	 * 
	 */
	public Correlation solicitaDadosParaMinuta(MensagemRecuperarDadosMinutaEntrada entrada) throws BusinessException,SystemException{
		log.info("ServicoNegocio - solicitaDadosParaMinuta");
		
		String mensagemXML = ConverterXML.convertToXml(entrada);
		log.info(mensagemXML);
		String id = conexaoMQ.put(mensagemXML,
				EFilasMQ.SIFEC_REQ_RECUPERA_DADOS_MINUTA.toString());
		
		Correlation correlation;
		if (id != null && !id.isEmpty()) {
			correlation = new Correlation(id);
		} else {
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(ECategoriaErro.ERRO_MQ_SERIES
					.getDescricao());
			msgArqrefService.setCodigoErro(Integer
					.toString(ECategoriaErro.ERRO_MQ_SERIES.getValor()));
			msgArqrefService.setInformacoesAdicionais("SIFEC_REQ_RECUPERA_DADOS_MINUTA - Sem resposta.");
			// Lista de Mensagens negocial
			List<String> listaMensagemNegocial = new ArrayList<String>();
			listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_004
					.getDescricao());
			msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO
					.getValor());
			msgArqrefService
					.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO
							.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);
		}		

		log.info("FIM solicitaDadosParaMinuta");
		return correlation;
	}

	/**
	 * @see ServicoNegocio#recebeDadosParaMinuta(Correlation)
	 */
	public MensagemRecuperarDadosMinutaSaida recebeDadosParaMinuta(Correlation correlation) throws BusinessException, SystemException{
		log.info("INICIO recebeDadosParaMinuta");
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
		}
		
		String saida = conexaoMQ.get(correlation.getId(),
				EFilasMQ.SIFEC_RSP_RECUPERA_DADOS_MINUTA.toString());
		
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

		log.info("XML RETORNO recebeDadosParaMinuta");
		log.info(saida);

		MensagemRecuperarDadosMinutaSaida msgSaida = ConverterXML
				.converterXmlSemSanitizacao(saida,
						MensagemRecuperarDadosMinutaSaida.class);

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
			msgArqrefService.getMensagemErro().add(
					msgSaida.getMensagemRetorno());
			// Lista de Mensagens erro
			msgArqrefService.setMensagemNegocial(new ArrayList<String>());
			msgArqrefService.getMensagemNegocial().add(
					msgSaida.getDados().getExcecao());
			msgArqrefService.setInformacoesAdicionais(msgSaida.getDados()
					.getExcecao() + " - " + msgSaida.getMensagemRetorno());
			msgArqrefService.setOrigemErro(ClienteNegocio.class.getName());
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_ERRO
					.getValor());
			msgArqrefService
					.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_ERRO
							.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
			msgArqrefService.setSistema(msgSaida.getOrigemRetorno());
			log.info(msgArqrefService.toString());
			log.severe(msgArqrefService.toString());

			throw new SystemException(msgArqrefService);
		}
			if (msgSaida.getDados() == null) {
				MessageDefault msg = new MessageDefault();
				msg.setCodigoErro("0");
				msg.setInformacoesAdicionais("Não houve retorno nos dados da Minuta." + msgSaida.getDados()
						.getExcecao() + " - " + msgSaida.getMensagemRetorno());
				msg.setOrigemErro("MQ");
				msg.setCategoriaErro("4");
				msg.setSeveridade(2);
				msg.setSistema("SIFEC");
				throw new BusinessException(msg);
			}

			log.info("FIM recebeDadosParaMinuta");
			return msgSaida;
		}
	
	
	/**
	 * @see ServicoNegocio#recebeDadosParaMinuta(Correlation)
	 */
	public String recebeDadosParaMinutaXML(Correlation correlation) throws BusinessException, SystemException{
		log.info("INICIO recebeDadosParaMinutaXML");
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
		}
		
		String saida = conexaoMQ.get(correlation.getId(),
				EFilasMQ.SIFEC_RSP_RECUPERA_DADOS_MINUTA.toString());
		
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
		
		log.info("XML RETORNO recebeDadosParaMinutaXML");
		log.info(saida);
		
		return saida;
	}
}
