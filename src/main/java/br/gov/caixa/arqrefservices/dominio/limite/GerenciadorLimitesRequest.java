package br.gov.caixa.arqrefservices.dominio.limite;

public class GerenciadorLimitesRequest {

	private EnumTipoPessoa tipoPessoa ;
	private String cpfCnpj;
	private EnumOperacao operacao;
	private String usuario;
	private String vlCPM;
	private String descProduto;
	private String urlServidor;

	
	public EnumOperacao getOperacao() {
		return operacao;
	}
	public void setOperacao(EnumOperacao operacao) {
		this.operacao = operacao;
	}
	public String getUrlServidor() {
		return urlServidor;
	}
	public void setUrlServidor(String urlServidor) {
		this.urlServidor = urlServidor;
	}
	public EnumTipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getVlCPM() {
		return vlCPM;
	}
	public void setVlCPM(String vlCPM) {
		this.vlCPM = vlCPM;
	}
	public String getDescProduto() {
		return descProduto;
	}
	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}
	
	
}
