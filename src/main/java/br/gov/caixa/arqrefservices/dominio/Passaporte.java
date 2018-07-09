package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Passaporte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4826636909257460613L;
	
	private String ocorrencia;
	
	private OrgaoEmissor orgaoEmissor = new OrgaoEmissor();
	
	private String numero;
	
	private UF uf = new UF();
	
	private String dataEmissao;
	
	private String dataValidade;
	
	private Pais pais = new Pais();
	
	private String flagDocumentoPrincipal;

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
	
	@XmlElement(name = "DESC_TP_ORGAO_EMISSOR")
	private String getOrgaoEmissorDescricao() {
		return this.orgaoEmissor.getDescOrgaoEmissor();
	}

	private void setOrgaoEmissorDescricao(String descricao) {
		this.orgaoEmissor.setDescOrgaoEmissor(descricao);
	}
	
	@XmlElement(name = "TP_ORGAO_EMISSOR")
	private String getOrgaoEmissorCodigo() {
		return this.orgaoEmissor.getCodOrgaoEmissor();
	}

	private void setOrgaoEmissorCodigo(String codigo) {
		this.orgaoEmissor.setCodOrgaoEmissor(codigo);
	}

	@XmlElement(name = "NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
//	@XmlElement(name = "UF_EMISSAO")
//	private String getUfCodigo() {
//		return this.uf.getCodigo();
//	}
//
//	private void setUfCodigo(String uf) {
//		this.uf.setCodigo(uf);
//	}

	@XmlElement(name = "DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@XmlElement(name = "DT_VALIDADE")
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	@XmlElement(name = "PAIS_ORIGEM")
	private String getPaisCodigo() {
		return this.pais.getCodigo();
	}

	private void setPaisCodigo(String paisCodigo) {
		this.pais.setCodigo(paisCodigo);
	}
	

	@XmlElement(name = "FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoPrincipal() {
		return flagDocumentoPrincipal;
	}

	public void setFlagDocumentoPrincipal(String flagDocumentoPrincipal) {
		this.flagDocumentoPrincipal = flagDocumentoPrincipal;
	}
	
	

}
