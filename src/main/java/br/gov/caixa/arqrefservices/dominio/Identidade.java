package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Identidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1298363341840649093L;

	private String ocorrencia;
	
	private OrgaoEmissor orgaoEmissor = new OrgaoEmissor();
		
	private String dataFimValidade;
	
	private String flagDocumentoIdentificacaoPrincipal;
	
	private TipoDocumento tipoDocumento = new TipoDocumento();
	
	private Documento documento = new Documento();

	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public OrgaoEmissor getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(OrgaoEmissor orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	
	@XmlElement(name = "DESC_ORG_EMISSOR")
	private String getOrgaoEmissorDescricao() {
		return this.orgaoEmissor.getDescOrgaoEmissor();
	}

	private void setOrgaoEmissorDescricao(String descricao) {
		this.orgaoEmissor.setDescOrgaoEmissor(descricao);
	}
	
	@XmlElement(name = "SIGLA_ORG_EMISSOR")
	private String getOrgaoEmissorSigla() {
		return this.orgaoEmissor.getSgOrgaoEmissor();
	}

	private void setOrgaoEmissorSigla(String sigla) {
		this.orgaoEmissor.setSgOrgaoEmissor(sigla);
	}	
	
	@XmlElement(name = "DT_FIM_VALIDADE")
	public String getDataFimValidade() {
		return dataFimValidade;
	}

	public void setDataFimValidade(String dataFimValidade) {
		this.dataFimValidade = dataFimValidade;
	}

	@XmlElement(name = "FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoIdentificacaoPrincipal() {
		return flagDocumentoIdentificacaoPrincipal;
	}
	public void setFlagDocumentoIdentificacaoPrincipal(
			String flagDocumentoIdentificacaoPrincipal) {
		this.flagDocumentoIdentificacaoPrincipal = flagDocumentoIdentificacaoPrincipal;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	@XmlElement(name = "TP_DOCUMENTO")
	private String getTipoDocumentoCodigo() {
		return this.tipoDocumento.getCodigo();
	}

	private void setTipoDocumentoCodigo(String codigo) {
		this.tipoDocumento.setCodigo(codigo);
	}	
	@XmlElement(name = "SUBTIPO_DOCUMENTO")
	private String getTipoDocumentoSubTipo() {
		return this.tipoDocumento.getSubTipoDocumento();
	}

	private void setTipoDocumentoSubTipo(String subTipoDocumento) {
		this.tipoDocumento.setSubTipoDocumento(subTipoDocumento);
	}	
	
	@XmlElement(name = "DOC")
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}	
	
}
