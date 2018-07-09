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
@XmlRootElement(name="DT_NASCIMENTO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class DataNascimento implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4008971721897080151L;
	private String data;

	@XmlElement(name="DATA")
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataNascimento [data=" + data + "]";
	}
	
	

}
