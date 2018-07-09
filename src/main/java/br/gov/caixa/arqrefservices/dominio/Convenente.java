package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela avaliacao de risco SIRIC
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "CONVENENTE")
public class Convenente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8726973530129759711L;

	
	private String cnpj;


	@XmlElement(name="CNPJ")
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public String toString() {
		return "Convenente [cnpj=" + cnpj + "]";
	}
	
	
	

}
