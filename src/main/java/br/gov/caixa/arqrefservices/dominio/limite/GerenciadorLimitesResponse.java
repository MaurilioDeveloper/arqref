package br.gov.caixa.arqrefservices.dominio.limite;

import java.math.BigDecimal;

public class GerenciadorLimitesResponse {

	private String tipoPessoa ;
	private String cpfCnpj;
	private String operacao;
	private BigDecimal vlCPM;
	private String nuAvaliacao;
	private String dataAvaliacao;
	private String dataValidadeAvaliacao;
	private String conceito;
	private String situacaoCliente;
	private String codRetorno;
	private String descMensagem;
	
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public BigDecimal getVlCPM() {
		return vlCPM;
	}
	public void setVlCPM(BigDecimal vlCPM) {
		this.vlCPM = vlCPM;
	}
	public String getCodRetorno() {
		return codRetorno;
	}
	public void setCodRetorno(String codRetorno) {
		this.codRetorno = codRetorno;
	}
	public String getDescMensagem() {
		return descMensagem;
	}
	public void setDescMensagem(String descMensagem) {
		this.descMensagem = descMensagem;
	}
	public String getNuAvaliacao() {
		return nuAvaliacao;
	}
	public void setNuAvaliacao(String nuAvaliacao) {
		this.nuAvaliacao = nuAvaliacao;
	}
	public String getDataAvaliacao() {
		return dataAvaliacao;
	}
	public void setDataAvaliacao(String dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	public String getDataValidadeAvaliacao() {
		return dataValidadeAvaliacao;
	}
	public void setDataValidadeAvaliacao(String dataValidadeAvaliacao) {
		this.dataValidadeAvaliacao = dataValidadeAvaliacao;
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public String getSituacaoCliente() {
		return situacaoCliente;
	}
	public void setSituacaoCliente(String situacaoCliente) {
		this.situacaoCliente = situacaoCliente;
	}
	
		
	
}
