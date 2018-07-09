package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DadosDesbloqueioAvaliacaoRiscoSIRIC implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "DESBLOQUEIO_ALCADA")
	private DesbloqueioAlcada desbloqueioAlcada;

	public DadosDesbloqueioAvaliacaoRiscoSIRIC() {
	}

	public DadosDesbloqueioAvaliacaoRiscoSIRIC(final DesbloqueioAlcada desbloqueioAlcada) {
		this.desbloqueioAlcada = desbloqueioAlcada;
	}

	public DesbloqueioAlcada getDesbloqueioAlcada() {
		return desbloqueioAlcada;
	}

}
