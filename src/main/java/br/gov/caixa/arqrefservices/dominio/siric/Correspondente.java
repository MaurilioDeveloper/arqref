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
@XmlRootElement(name="CORRESPONDENTE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Correspondente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8128509519255683208L;
	
	private String codigo;

	@XmlElement(name="CODIGO")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Correspondente [codigo=" + codigo + "]";
	}
	
	

}
