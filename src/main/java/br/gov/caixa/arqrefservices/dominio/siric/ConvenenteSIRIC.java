package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "CONVENENTE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ConvenenteSIRIC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4635350913454261937L;

	private String cnpj;

	@XmlElement(name = "CNPJ")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "ConvenenteSIRIC []";
	}

}
