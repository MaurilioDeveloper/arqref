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
@XmlRootElement(name="ALUGUEL")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Aluguel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1935307468942852444L;
	
	private String flagComprovacao;

	@XmlElement(name="FLAG_COMPROVACAO")
	public String getFlagComprovacao() {
		return flagComprovacao;
	}

	public void setFlagComprovacao(String flagComprovacao) {
		this.flagComprovacao = flagComprovacao;
	}

	@Override
	public String toString() {
		return "Aluguel [flagComprovacao=" + flagComprovacao + "]";
	}
	
	
	

}
