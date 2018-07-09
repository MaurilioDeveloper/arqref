package br.gov.caixa.arqrefservices.dominio.econsig.confirmarSolicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:confirmarSolicitacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","novoAdeIdentificador","senhaServidor",
					"loginServidor","tokenAutServidor","codigoAutorizacao","coeficiente","alteraValorLiberado","banco","agencia","conta"})

public class ConfirmarSolicitacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
		
	private String adeIdentificador;
	
	private Long adeNumero;
	
	private String agencia;
	
	private Boolean alteraValorLiberado;
	
	private String banco; 
	
	private String cliente;
	
	private String codigoAutorizacao;
	
	private Double coeficiente;
	
	private String conta;
	
	private String convenio;
	
	private String loginServidor; 
	
	private String novoAdeIdentificador; 
	
	private String senha;
	
	private String senhaServidor;
	
	private String tokenAutServidor;
	
	private String usuario;
				
	@XmlElement(name="hos:adeIdentificador")	
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:adeNumero")	
	public Long getAdeNumero() {
		return adeNumero;
	}
	
	@XmlElement(name="hos:agencia")	
	public String getAgencia() {
		return agencia;
	}
	
	@XmlElement(name="hos:alteraValorLiberado")
	public Boolean getAlteraValorLiberado() {
		return alteraValorLiberado;
	}
	
	@XmlElement(name="hos:banco")
	public String getBanco() {
		return banco;
	}
	
	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}

	@XmlElement(name="hos:codigoAutorizacao")
	public String getCodigoAutorizacao() {
		return codigoAutorizacao;
	}

	@XmlElement(name="hos:coeficiente")
	public Double getCoeficiente() {
		return coeficiente;
	}

	@XmlElement(name="hos:conta")
	public String getConta() {
		return conta;
	}

	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
	}

	@XmlElement(name="hos:loginServidor")
	public String getLoginServidor() {
		return loginServidor;
	}

	@XmlElement(name="hos:novoAdeIdentificador")
	public String getNovoAdeIdentificador() {
		return novoAdeIdentificador;
	}

	@XmlElement(name="hos:senha")
	public String getSenha() {
		return senha;
	}

	@XmlElement(name="hos:senhaServidor")
	public String getSenhaServidor() {
		return senhaServidor;
	}

	@XmlElement(name="hos:tokenAutServidor")
	public String getTokenAutServidor() {
		return tokenAutServidor;
	}

	@XmlElement(name="hos:usuario")
	public String getUsuario() {
		return usuario;
	}

	public void setAdeIdentificador(String adeIdentificador) {
		this.adeIdentificador = adeIdentificador;
	}

	public void setAdeNumero(Long adeNumero) {
		this.adeNumero = adeNumero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setAlteraValorLiberado(Boolean alteraValorLiberado) {
		this.alteraValorLiberado = alteraValorLiberado;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setCodigoAutorizacao(String codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}

	public void setCoeficiente(Double coeficiente) {
		this.coeficiente = coeficiente;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setLoginServidor(String loginServidor) {
		this.loginServidor = loginServidor;
	}

	public void setNovoAdeIdentificador(String novoAdeIdentificador) {
		this.novoAdeIdentificador = novoAdeIdentificador;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}

	public void setTokenAutServidor(String tokenAutServidor) {
		this.tokenAutServidor = tokenAutServidor;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	

}