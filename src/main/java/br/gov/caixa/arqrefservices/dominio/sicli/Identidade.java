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
@XmlRootElement(name="IDENTIDADE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Identidade  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7069930560707898365L;

	private String ocorrencia;
	
	private String descricaoOrgaoEmissor;
	
	private String siglaOrgaoEmissor;
	
	private Documento documento;
	
	private String flagDocumentoIdentificacaoPrincipal;
	
	private String dataFimValidade;
	
	private String tipoDocumento;
	
	private String subTipoDocumento;

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name="DESC_ORG_EMISSOR")
	public String getDescricaoOrgaoEmissor() {
		return descricaoOrgaoEmissor;
	}

	public void setDescricaoOrgaoEmissor(String descricaoOrgaoEmissor) {
		this.descricaoOrgaoEmissor = descricaoOrgaoEmissor;
	}

	@XmlElement(name="SIGLA_ORG_EMISSOR")
	public String getSiglaOrgaoEmissor() {
		return siglaOrgaoEmissor;
	}

	public void setSiglaOrgaoEmissor(String siglaOrgaoEmissor) {
		this.siglaOrgaoEmissor = siglaOrgaoEmissor;
	}

	@XmlElement(name="DOC")
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
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

	@XmlElement(name="DT_FIM_VALIDADE")
	public String getDataFimValidade() {
		return dataFimValidade;
	}

	public void setDataFimValidade(String dataFimValidade) {
		this.dataFimValidade = dataFimValidade;
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
				+ ", descricaoOrgaoEmissor=" + descricaoOrgaoEmissor
				+ ", siglaOrgaoEmissor=" + siglaOrgaoEmissor + ", documento="
				+ documento + ", flagDocumentoIdentificacaoPrincipal="
				+ flagDocumentoIdentificacaoPrincipal + ", dataFimValidade="
				+ dataFimValidade + ", tipoDocumento=" + tipoDocumento
				+ ", subTipoDocumento=" + subTipoDocumento + "]";
	}
	
	
	
	
	
	
	
	

}
