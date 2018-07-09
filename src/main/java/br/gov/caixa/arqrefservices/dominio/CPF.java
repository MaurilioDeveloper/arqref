package br.gov.caixa.arqrefservices.dominio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "CPF")
public class CPF {
	
	private String ocorrencia;

	private String cpf;

	private String flagTitular;

	private String flagRegularidade;

	private String flagConsistencia;

	private DocumentoSICLI documentoSICLI;

	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}
	
	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@XmlElement(name = "FLAG_TITULAR")
	public String getFlagTitular() {
		return flagTitular;
	}

	public void setFlagTitular(String flagTitular) {
		this.flagTitular = flagTitular;
	}

	@XmlElement(name = "FLAG_REGULARIDADE")
	public String getFlagRegularidade() {
		return flagRegularidade;
	}

	public void setFlagRegularidade(String flagRegularidade) {
		this.flagRegularidade = flagRegularidade;
	}

	@XmlElement(name = "FLAG_CONSISTENCIA")
	public String getFlagConsistencia() {
		return flagConsistencia;
	}

	public void setFlagConsistencia(String flagConsistencia) {
		this.flagConsistencia = flagConsistencia;
	}

	@XmlElement(name = "DOC")
	public DocumentoSICLI getDocumentoSICLI() {
		return documentoSICLI;
	}

	public void setDocumentoSICLI(DocumentoSICLI documentoSICLI) {
		this.documentoSICLI = documentoSICLI;
	}

	@Override
	public String toString() {
		return "CPF [cpf=" + cpf + ", flagTitular=" + flagTitular
				+ ", flagRegularidade=" + flagRegularidade
				+ ", flagConsistencia=" + flagConsistencia
				+ ", documentoSICLI=" + documentoSICLI + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CPF other = (CPF) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
