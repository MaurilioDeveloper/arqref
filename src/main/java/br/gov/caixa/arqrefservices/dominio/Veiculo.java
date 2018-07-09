package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * Essa classe eh usado para o produto 7044
 * 
 * @author c110503
 * @version 1.0.0.1
 * 
 */
@XmlRootElement(name = "VEICULO")
public class Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7665108888901607190L;
	
	private String ano;

	@XmlElement(name = "ANO")
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	

}
