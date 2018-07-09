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
@XmlRootElement(name="VEICULO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class VeiculoSIRIC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7147826833636881515L;
	
	private String ano;

	@XmlElement(name="ANO")
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "VeiculoSIRIC [ano=" + ano + "]";
	}
	
	

}
