package br.gov.caixa.arqrefservices.negocio.siric;

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
import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;
import br.gov.caixa.arqrefservices.dominio.sicli.EnderecoNacionalComplemento;
import br.gov.caixa.arqrefservices.dominio.sicli.MeioComunicacao;
import br.gov.caixa.arqrefservices.dominio.sicli.Renda;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Usuario;
import br.gov.caixa.arqrefservices.dominio.siric.AvaliacaoValiada;
import br.gov.caixa.arqrefservices.dominio.siric.Dados;
import br.gov.caixa.arqrefservices.dominio.siric.DadosOperacao;
import br.gov.caixa.arqrefservices.dominio.siric.DesbloquearAvaliacaoRiscoRequest;
import br.gov.caixa.arqrefservices.dominio.siric.DesbloquearAvaliacaoRiscoResponse;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Aprovacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Avaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Contatos;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Endereco;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.ErrosValidacaoAvaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Filiacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Identidade;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.MensagemSolicitacaoAvaliacaoRiscoSaida;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Rendas;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Telefone;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.TomadorSiric;
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
public class DesbloqueioAlcadaSiric implements IDesbloqueioAlcadaSiric{

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
	
	
	@Override
	public DesbloquearAvaliacaoRiscoResponse desbloquear(final DesbloquearAvaliacaoRiscoRequest request) {

		final String correlationId = conexaoMQ.put(ConverterXML.convertToXml(request),
				EFilasMQ.SIRIC_REQ_DESBLOQUEIO_ALCADA.toString());
		final String responseString = conexaoMQ.getWithTimeout(correlationId, EFilasMQ.SIRIC_RSP_DESBLOQUEIO_ALCADA.toString(),
				10000L);

		DesbloquearAvaliacaoRiscoResponse msgSaida = ConverterXML.convertFromXml(
				responseString, DesbloquearAvaliacaoRiscoResponse.class);
		return msgSaida;

	}

}
