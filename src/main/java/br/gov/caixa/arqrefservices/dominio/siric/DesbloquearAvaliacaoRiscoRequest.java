package br.gov.caixa.arqrefservices.dominio.siric;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.commons.lang3.StringUtils;

import br.gov.caixa.arqrefservices.dominio.barramento.MensagemBarramento;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Usuario;

@XmlRootElement(name = "desbloqueioalcada:SERVICO_ENTRADA")
@XmlAccessorType(XmlAccessType.FIELD)
public class DesbloquearAvaliacaoRiscoRequest extends MensagemBarramento {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@XmlTransient
	private final DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");

	@XmlAttribute(name = "xmlns:desbloqueioalcada")
	private final String xmlnsDesbloqueioalcada;

	@XmlAttribute(name = "xmlns:sibar_base")
	private final String xmlnsSibarBase;

	@XmlAttribute(name = "xmlns:xsi")
	private final String xmlnsXsi;

	@XmlElement(name = "DADOS")
	private DadosDesbloqueioAvaliacaoRiscoSIRIC dados;

	public DesbloquearAvaliacaoRiscoRequest() {
		xmlnsDesbloqueioalcada = "http://caixa.gov.br/sibar/desbloqueio_alcada";
		xmlnsSibarBase = "http://caixa.gov.br/sibar";
		xmlnsXsi = "http://www.w3.org/2001/XMLSchema-instance";
	}

	public DesbloquearAvaliacaoRiscoRequest(final DesbloqueioAlcada desbloqueioAlcada, final Usuario usuario) {
		this();
		dados = new DadosDesbloqueioAvaliacaoRiscoSIRIC(desbloqueioAlcada);
		sibarHeader = new SibarHeader();
		sibarHeader.setVersao("1.1");
		sibarHeader.setSistemaOrigem("SICCR");
		sibarHeader.setUsuarioServico("SFECEMPD");
		sibarHeader.setUsuario(usuario.getCodigoUsuario());
		sibarHeader.setOperacao("DESBLOQUEIO_ALCADA");
		sibarHeader.setUnidade(StringUtils.leftPad(String.valueOf(usuario.getNumeroUnidadeLogado()), 4, '0'));
		sibarHeader.setDataHora(dateFormat.format(new Date()));
	}

	public DadosDesbloqueioAvaliacaoRiscoSIRIC getDados() {
		return dados;
	}

}
