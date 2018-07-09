package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="IDENTIDADE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"ocorrencia", "documento", "flagDocumentoIdentificacaoPrincipal", "dataValidade", "tipoDocumento", "subTipoDocumento"})
public class Identidade  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7069930560707898365L;

	
	private String ocorrencia;
	
	private DocumentoIdentidade documento;
	
	private String flagDocumentoIdentificacaoPrincipal;

	private String dataValidade;

	private String tipoDocumento;
	
	private String subTipoDocumento;
	
	

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}



	@XmlElement(name="DOC")
	public DocumentoIdentidade getDocumento() {
		return documento;
	}

	public void setDocumento(DocumentoIdentidade documento) {
		this.documento = documento;
	}

	@XmlElement(name="FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoIdentificacaoPrincipal() {
		return flagDocumentoIdentificacaoPrincipal;
	}

	public void setFlagDocumentoIdentificacaoPrincipal(
			String flagDocumentoIdentificacaoPrincipal) {
		this.flagDocumentoIdentificacaoPrincipal = flagDocumentoIdentificacaoPrincipal;
	}

	@XmlElement(name="DT_VALIDADE")
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@XmlElement(name="TP_DOCUMENTO")
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@XmlElement(name="SUBTIPO_DOCUMENTO")
	public String getSubTipoDocumento() {
		return subTipoDocumento;
	}

	public void setSubTipoDocumento(String subTipoDocumento) {
		this.subTipoDocumento = subTipoDocumento;
	}

	@Override
	public String toString() {
		return "Identidade [ocorrencia=" + ocorrencia
				+ ", descricaoOrgaoEmissor=" + ", documento="
				+ documento + ", flagDocumentoIdentificacaoPrincipal="
				+ flagDocumentoIdentificacaoPrincipal + ",  + "+ ", tipoDocumento=" + tipoDocumento
				+ ", subTipoDocumento=" + subTipoDocumento + "]";
	}
	
	
	
	
	
	
	
	

}
