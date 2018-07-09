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
@XmlRootElement(name="CPF")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CPF implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8201007276945745346L;

	private String ocorrencia;
	
	private Documento documento;
	
	private String flagTitular;
	
	private String flagRegurar;
	
	private String flagConsistencia;

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name="DOC")
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	@XmlElement(name="FLAG_TITULAR")
	public String getFlagTitular() {
		return flagTitular;
	}

	public void setFlagTitular(String flagTitular) {
		this.flagTitular = flagTitular;
	}

	@XmlElement(name="FLAG_REGULARIDADE")
	public String getFlagRegurar() {
		return flagRegurar;
	}

	public void setFlagRegurar(String flagRegurar) {
		this.flagRegurar = flagRegurar;
	}

	@XmlElement(name="FLAG_CONSISTENCIA")
	public String getFlagConsistencia() {
		return flagConsistencia;
	}

	public void setFlagConsistencia(String flagConsistencia) {
		this.flagConsistencia = flagConsistencia;
	}

	@Override
	public String toString() {
		return "CPF [ocorrencia=" + ocorrencia + ", flagTitular=" + flagTitular
				+ ", flagRegurar=" + flagRegurar + ", flagConsistencia="
				+ flagConsistencia + "]";
	}
	
	
}
