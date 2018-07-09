package br.gov.caixa.arqrefservices.dominio.econsig.cancelarRenegociacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:cancelarRenegociacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","codigoMotivoOperacao","obsMotivoOperacao","loginExternoServidor","senhaServidor"})
public class CancelarRenegociacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
		
	private String adeIdentificador;
	
	private Long adeNumero;
	
	private String cliente; 
	
	private String codigoMotivoOperacao; 
	
	private String convenio; 
	
	private String loginExternoServidor;
	
	private String obsMotivoOperacao;
	
	private String senha;
	
	private String senhaServidor;
	
	private String usuario;
				
	@XmlElement(name="hos:adeIdentificador")	
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:adeNumero")	
	public Long getAdeNumero() {
		return adeNumero;
	}
	
	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}
	
	@XmlElement(name="hos:codigoMotivoOperacao")
	public String getCodigoMotivoOperacao() {
		return codigoMotivoOperacao;
	}
	
	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
	}
	
	@XmlElement(name="hos:loginExternoServidor")
	public String getLoginExternoServidor() {
		return loginExternoServidor;
	}

	@XmlElement(name="hos:obsMotivoOperacao")
	public String getObsMotivoOperacao() {
		return obsMotivoOperacao;
	}

	@XmlElement(name="hos:senha")
	public String getSenha() {
		return senha;
	}

	@XmlElement(name="hos:senhaServidor")
	public String getSenhaServidor() {
		return senhaServidor;
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

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setCodigoMotivoOperacao(String codigoMotivoOperacao) {
		this.codigoMotivoOperacao = codigoMotivoOperacao;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setLoginExternoServidor(String loginExternoServidor) {
		this.loginExternoServidor = loginExternoServidor;
	}

	public void setObsMotivoOperacao(String obsMotivoOperacao) {
		this.obsMotivoOperacao = obsMotivoOperacao;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	

}