package br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ns1:incluirContratoV1Response")
public class IncluirContratoV1DadosRET implements Serializable {
	
	private String retorno;

	@XmlElement(name="return")
	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}