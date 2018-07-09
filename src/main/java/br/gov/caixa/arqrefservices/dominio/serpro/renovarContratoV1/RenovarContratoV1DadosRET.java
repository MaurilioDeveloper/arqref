package br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoV1;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ns1:renovarContratoV1Response")
public class RenovarContratoV1DadosRET implements Serializable {

	private static final long serialVersionUID = -8578647434400300408L;
	
	private String retorno;

	@XmlElement(name="return")
	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}