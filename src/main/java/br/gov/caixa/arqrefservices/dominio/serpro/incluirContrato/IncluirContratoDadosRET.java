package br.gov.caixa.arqrefservices.dominio.serpro.incluirContrato;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ns1:incluirContratoResponse")
public class IncluirContratoDadosRET implements Serializable {
	
	private String retorno;

	@XmlElement(name="return")
	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}