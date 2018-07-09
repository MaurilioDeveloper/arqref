package br.gov.caixa.arqrefservices.dominio.econsig.commom;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"cliente","convenio","usuario","senha","matricula","cpf","orgaoCodigo","estabelecimentoCodigo","valorParcela","senhaServidor","tokenAutServidor","loginServidor","codVerba","servicoCodigo","matriculaMultipla"})
public class EconsigDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
		
	private String cliente;
	
	private String convenio;
	
	private String usuario;
	
	private String senha;
	
	private String matricula;
	
	private String cpf;
	
	private String orgaoCodigo;
	
	private String estabelecimentoCodigo;
	
	private Double valorParcela;
	
	private String senhaServidor;
	
	private String tokenAutServidor;
	
	private String loginServidor;
	
	private String codVerba;
	
	private String servicoCodigo;
	
	private Boolean matriculaMultipla;
	
	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}
	
	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
	}
	
	@XmlElement(name="hos:usuario")
	public String getUsuario() {
		return usuario;
	}
	
	@XmlElement(name="hos:senha")
	public String getSenha() {
		return senha;
	}
	
	@XmlElement(name="hos:matricula")
	public String getMatricula() {
		return matricula;
	
	}
	
	@XmlElement(name="hos:cpf")
	public String getCpf() {
		return cpf;
	}
	
	@XmlElement(name="hos:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}
	
	@XmlElement(name="hos:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}
	
	@XmlElement(name="hos:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}
		
	@XmlElement(name="hos:senhaServidor")
	public String getSenhaServidor() {
		return senhaServidor;
	}
	
	@XmlElement(name="hos:tokenAutServidor")
	public String getTokenAutServidor() {
		return tokenAutServidor;
	}
	
	@XmlElement(name="hos:loginServidor")
	public String getLoginServidor() {
		return loginServidor;
	}
	
	@XmlElement(name="hos:codVerba")
	public String getCodVerba() {
		return codVerba;
	}
	
	@XmlElement(name="hos:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}
	
	@XmlElement(name="hos:matriculaMultipla")
	public Boolean getMatriculaMultipla() {
		return matriculaMultipla;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}
	
	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}
	
	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}
	
	public void setTokenAutServidor(String tokenAutServidor) {
		this.tokenAutServidor = tokenAutServidor;
	}
	
	public void setLoginServidor(String loginServidor) {
		this.loginServidor = loginServidor;
	}
	
	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}
	
	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}
	
	public void setMatriculaMultipla(Boolean matriculaMultipla) {
		this.matriculaMultipla = matriculaMultipla;
	}

}