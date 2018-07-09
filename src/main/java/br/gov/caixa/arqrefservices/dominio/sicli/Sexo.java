package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="SEXO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Sexo  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 612556054365087199L;
	
	private String sexo;

	@XmlElement(name="SEXO")
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Sexo [sexo=" + sexo + "]";
	}
	
	
	
	
	
	

}
