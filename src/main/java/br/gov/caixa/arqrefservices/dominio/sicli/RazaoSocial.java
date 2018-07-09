package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RAZAO_SOCIAL")
public class RazaoSocial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String razaoSocial;

	@XmlElement(name="RAZAO_SOCIAL")
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	

}
