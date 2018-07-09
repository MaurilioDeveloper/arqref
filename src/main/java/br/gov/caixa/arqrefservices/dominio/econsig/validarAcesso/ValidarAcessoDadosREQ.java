package br.gov.caixa.arqrefservices.dominio.econsig.validarAcesso;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:validarAcesso")
@XmlType(propOrder={"cliente","convenio","matricula","cpf","orgaoCodigo","estabelecimentoCodigo","senhaServidor","loginServidor","tokenAutServidor"})
public class ValidarAcessoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cliente;
	
	private String convenio;
	
	private String matricula;
	
	private String cpf;
	
	private String orgaoCodigo;
	
	private String estabelecimentoCodigo;

	private String senhaServidor;
	
	private String loginServidor;
	
	private String tokenAutServidor;

	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}
	
	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
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

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
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

	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}

	public void setLoginServidor(String loginServidor) {
		this.loginServidor = loginServidor;
	}

	public void setTokenAutServidor(String tokenAutServidor) {
		this.tokenAutServidor = tokenAutServidor;
	}
	
}