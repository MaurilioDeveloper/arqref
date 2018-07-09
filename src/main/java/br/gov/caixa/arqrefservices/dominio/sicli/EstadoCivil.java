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
@XmlRootElement(name="ESTADO_CIVIL")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class EstadoCivil  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8386405850539729449L;
	private String estadoCivil;
	
	
	@XmlElement(name="ESTADO_CIVIL")
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "EstadoCivil [estadoCivil=" + estadoCivil + "]";
	}

	
	
	
	
	
	
	

}
