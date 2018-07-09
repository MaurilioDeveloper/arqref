package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RetornoDadosDesbloqueioAvaliacaoRisco implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "CONTROLE_NEGOCIAL")
	private ControleNegocial controleNegocial;

	@XmlElement(name = "EXCECAO")
	private String excecao;

	public RetornoDadosDesbloqueioAvaliacaoRisco() {

	}

	public RetornoDadosDesbloqueioAvaliacaoRisco(final ControleNegocial controleNegocial) {
		this.controleNegocial = controleNegocial;
	}

	public ControleNegocial getControleNegocial() {
		return controleNegocial;
	}

	public String getExcecao() {
		return excecao;
	}

}
