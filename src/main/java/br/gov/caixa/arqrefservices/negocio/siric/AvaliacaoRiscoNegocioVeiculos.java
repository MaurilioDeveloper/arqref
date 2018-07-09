package br.gov.caixa.arqrefservices.negocio.siric;

import java.util.Hashtable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.commons.lang3.StringUtils;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefcore.util.Dater;
import br.gov.caixa.arqrefservices.dao.barramento.FilasMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.AvaliacaoComAtualizacaoViaSicli;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.DadosEnvioSolicitacaoAvaliacaoRisco;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.MensagemSolicitacaoAvaliacaoRiscoEntrada;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.QuadroValores;
import br.gov.caixa.arqrefservices.qualificador.Siemp;

@Named
public class AvaliacaoRiscoNegocioVeiculos {


	protected static final String PROCESSO_OK = "00";
	protected static final String ERRO_PROCESSO = "99";
	protected static final String PROCESSO_AVALIACAO_EM_ERRO = "03";
	protected static final String PROCESSO_PESQUISA_CONTINGENCIADA = "04";
	protected static final String SITUACAO_AVALIACAO_ENVIADO_SIBAR = "01";
	protected static final String SITUACAO_AVALIACAO_ERRO_SIBAR = "02";
	protected static final String SITUACAO_AVALIACAO_AGUARDANDO_SIRIC = "03";
	protected static final String SITUACAO_AVALIACAO_ERRO_SIRIC = "04";
	protected static final String SITUACAO_AVALIACAO_APROVADA = "05";
	protected static final String SITUACAO_AVALIACAO_REPROVADA = "06";
	protected static final String SITUACAO_AVALIACAO_REJEITADA = "07";
	protected static final String SITUACAO_AVALIACAO_BLOQUEADO = "08";
	protected static final String SITUACAO_AVALIACAO_ERRO_RETORNO_SIRIC = "09";
	protected static final String SITUACAO_AVALIACAO_CANCELADA = "10";
	protected static final String CODIGO_REAVALIACAO_QUADRO_VALORES = "0000000645";
	
	
	@Inject
	@Siemp
	private DAOBarramento siempDAO;
	
	@Inject
	protected Dater dater;

	public void executaSolicitaAvaliacaoRiscoSIRIC() throws Exception {
		
		MensagemSolicitacaoAvaliacaoRiscoEntrada msgEntrada = new MensagemSolicitacaoAvaliacaoRiscoEntrada();
		DadosEnvioSolicitacaoAvaliacaoRisco dadosBarramento = new DadosEnvioSolicitacaoAvaliacaoRisco();
		//FIXME SKMT
		dadosBarramento.setOperacaoSIRIC(null);
			
		dadosBarramento.setAtualizacaoSicli(recuperaDadosViaSicli("29330763812"));
		
		//FIXME SKMT
		if(false){
			QuadroValores quadroValores = new QuadroValores();
			quadroValores.setCodigoQuadroValores(CODIGO_REAVALIACAO_QUADRO_VALORES);
			dadosBarramento.setQuadroValores(quadroValores);
		}
			
		msgEntrada.setDados(dadosBarramento);
			
		// Efetua o PUT na fila solicitacao Avaliacao
//		logger.warning("CORRELATION: " + correlation.getId());
		Correlation correlation = enviarDadosBarramentoSolicitacaoAvaliacaoRisco(msgEntrada, "c891336", 1L, "FEC0100");
	}
	
	private AvaliacaoComAtualizacaoViaSicli recuperaDadosViaSicli(String numeroCPF) {
		
		AvaliacaoComAtualizacaoViaSicli atualizacaoViaSicli = new AvaliacaoComAtualizacaoViaSicli();
		
		atualizacaoViaSicli.setNumeroCPF(StringUtils.leftPad(numeroCPF, 11, '0'));		
		
		atualizacaoViaSicli.setTipoPessoa("1");
		
		return atualizacaoViaSicli;
	}
	
	public Correlation enviarDadosBarramentoSolicitacaoAvaliacaoRisco(MensagemSolicitacaoAvaliacaoRiscoEntrada msg,
			final String usuario, Long numeroUnidadeLogado, String codigoPerfilAplicacao) {
		
		String correlationId = null;
		
		try {
			preencheDadosHedearBarramentoSolicitacaoAvaliacao(msg, usuario, numeroUnidadeLogado);
			String mensagem = ConverterXML.convertToXml(msg);

//			logger.info("MENSAGEM ENVIO AVALIACAO RISCO enviarDadosBarramentoSolicitacaoAvaliacaoRisco");
//			logger.info(mensagem);
						
			correlationId = siempDAO.put(mensagem, FilasMQ.SIRIC_REQ_AVALIACAO_RISCO.toString());
			
//			logger.info("CORRELATIONID FILA SIRIC");
//			logger.info(correlationId);
			//SIEMP
//			executaAtualizaSituacaoAvaliacaoSIRIC(usuario, 
//												  correlationId, msg.getDados().getOperacaoSIRIC().getProposta(), 
//												  SITUACAO_AVALIACAO_ENVIADO_SIBAR,
//											  	  PROCESSO_OK, "", codigoPerfilAplicacao);
			
		} catch (SystemException e) {
			
//			logger.info("ERRO enviarDadosBarramentoSolicitacaoAvaliacaoRisco");
//			logger.info(e.getMessage());
			//SIEMP
//			executaAtualizaSituacaoAvaliacaoSIRIC(usuario,
//												  correlationId, msg.getDados().getOperacaoSIRIC().getProposta(), 
//												  SITUACAO_AVALIACAO_ERRO_SIBAR,
//												  ERRO_PROCESSO, "", codigoPerfilAplicacao);
		}
		
		return new Correlation(correlationId);
	}
	
	
	protected void preencheDadosHedearBarramentoSolicitacaoAvaliacao(final MensagemSolicitacaoAvaliacaoRiscoEntrada msg,
			final String usuario, Long numeroUnidadeLogado) {
		final SibarHeader header = msg.getSibarHeader();
		header.setVersao("1.0");
		header.setUsuarioServico("SFECEMPD");
		header.setUsuario(usuario);
		header.setOperacao("AVALIACAORISCOCREDITO");
		header.setSistemaOrigem("SIEMP");
		header.setUnidade(
				numeroUnidadeLogado == null ? "0000" : String.valueOf(numeroUnidadeLogado));
//		header.setDataHora(dater.withToday().asString("yyyyMMdd"));
		header.setDataHora("20171121");

		header.setIdProcesso("SOLICITA_AVALIACAO");
		msg.setSibarHeader(header);

	}
	
	
}
