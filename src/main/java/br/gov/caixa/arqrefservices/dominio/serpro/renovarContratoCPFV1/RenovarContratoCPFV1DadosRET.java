package br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ns1:renovarContratoCPFV1Response")
public class RenovarContratoCPFV1DadosRET implements Serializable {
	
	private static final long serialVersionUID = -8521195784638922943L;
	
	private String retorno;

	@XmlElement(name="return")
	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}