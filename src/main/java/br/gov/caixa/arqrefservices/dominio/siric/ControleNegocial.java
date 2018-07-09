package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ControleNegocial implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ORIGEM_RETORNO")
	private String origemRetorno;

	@XmlElement(name = "COD_RETORNO")
	private String codigoRetorno;

	@XmlElement(name = "MSG_RETORNO")
	private String mensagem;

	public ControleNegocial() {

	}

	public ControleNegocial(final String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getOrigemRetorno() {
		return origemRetorno;
	}

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public String getMensagem() {
		return mensagem;
	}

}
