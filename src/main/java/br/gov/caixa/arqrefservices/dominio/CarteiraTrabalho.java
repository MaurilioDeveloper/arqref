package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class CarteiraTrabalho implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6111630746904241521L;
	
	private String ocorrencia;
	
	private OrgaoEmissor orgaoEmissor = new OrgaoEmissor();
	
	private Documento documento = new Documento();
	
	private String flagDocumentoIdentificacaoPrincipal;
	
	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	@XmlElement(name = "FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoIdentificacaoPrincipal() {
		return flagDocumentoIdentificacaoPrincipal;
	}
	public void setFlagDocumentoIdentificacaoPrincipal(
			String flagDocumentoIdentificacaoPrincipal) {
		this.flagDocumentoIdentificacaoPrincipal = flagDocumentoIdentificacaoPrincipal;
	}
	
	public OrgaoEmissor getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(OrgaoEmissor orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	
	@XmlElement(name = "TIPO_ORGAO_EMISSOR")
	private String getOrgaoEmissorCodigo() {
		return this.orgaoEmissor.getCodOrgaoEmissor();
	}

	private void setOrgaoEmissorCodigo(String codigo) {
		this.orgaoEmissor.setCodOrgaoEmissor(codigo);
	}
	
	@XmlElement(name = "DOC")
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}	

}
