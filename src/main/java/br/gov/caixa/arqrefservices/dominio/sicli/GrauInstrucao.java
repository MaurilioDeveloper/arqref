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
@XmlRootElement(name="GRAU_INSTRUCAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class GrauInstrucao  implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6922022380387551303L;
	private String grauInstrucao;

	@XmlElement(name="GRAU_INSTRUCAO")
	public String getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}
	
	
	
	
}
