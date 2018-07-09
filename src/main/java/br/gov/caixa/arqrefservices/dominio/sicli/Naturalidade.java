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
@XmlRootElement(name="NATURALIDADE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Naturalidade  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7451467641388572488L;

	private String municipio;
	
	private String uf;

	@XmlElement(name="MUNICIPIO")
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@XmlElement(name="UF")
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Naturalidade [municipio=" + municipio + ", uf=" + uf + "]";
	}
	
	

	
	
	
	
	

}
