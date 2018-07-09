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
@XmlRootElement(name="TP_PESSOA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class TipoPessoa  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2003846593086523766L;
	
	private String tipoPessoa;

	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Override
	public String toString() {
		return "TipoPessoa [tipoPessoa=" + tipoPessoa + "]";
	}
	
	

	
	
	
	
	
	
	

}
