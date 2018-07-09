package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * 
 */
@XmlRootElement(name = "DT_CONST_EMPRESA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class DataConstituicao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4008971721897080151L;
	private String data;

	@XmlElement(name = "DT_CONST_EMPRESA")
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataConstituicao [data=" + data + "]";
	}

}
