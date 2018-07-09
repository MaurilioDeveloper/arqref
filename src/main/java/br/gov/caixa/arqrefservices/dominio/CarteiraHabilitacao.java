package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI CNH
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class CarteiraHabilitacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3098598799924785137L;
	
private String ocorrencia;
	
	private OrgaoEmissor orgaoEmissor = new OrgaoEmissor();
	
	private String numero;
	
	private UF uf = new UF();
	
	private String dataPrimeiraHabilitacao;
	
	private String dataEmissao;
	
	private String dataValidade;	
	
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
	
	@XmlElement(name = "DESC_TIPO_ORGAO_EMISS")
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

//	@XmlElement(name = "UF")
//	private String getUfCodigo() {
//		return this.uf.getCodigo();
//	}
//
//	private void setUfCodigo(String uf) {
//		this.uf.setCodigo(uf);
//	}
	
	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	@XmlElement(name = "DT_PRIM_HABILIT")
	public String getDataPrimeiraHabilitacao() {
		return dataPrimeiraHabilitacao;
	}
	public void setDataPrimeiraHabilitacao(String dataPrimeiraHabilitacao) {
		this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
	}

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

	@XmlElement(name = "FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoPrincipal() {
		return flagDocumentoPrincipal;
	}

	public void setFlagDocumentoPrincipal(String flagDocumentoPrincipal) {
		this.flagDocumentoPrincipal = flagDocumentoPrincipal;
	}
	
	

}
