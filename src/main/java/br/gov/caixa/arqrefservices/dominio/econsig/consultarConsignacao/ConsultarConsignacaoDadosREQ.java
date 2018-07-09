package br.gov.caixa.arqrefservices.dominio.econsig.consultarConsignacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:consultarConsignacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","matricula","cpf","orgaoCodigo","estabelecimentoCodigo"})
public class ConsultarConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cliente;
	
	private String convenio;
	
	private String usuario;
	
	private String senha;
	
	private Long adeNumero;
	
	private String adeIdentificador;
	
	private String matricula;
	
	private String cpf;
	
	private String orgaoCodigo;
	
	private String estabelecimentoCodigo;
	
	
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
	
	@XmlElement(name="hos:adeIdentificador")	
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:adeNumero")	
	public Long getAdeNumero() {
		return adeNumero;
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

	public void setAdeNumero(Long adeNumero) {
		this.adeNumero = adeNumero;
	}

	public void setAdeIdentificador(String adeIdentificador) {
		this.adeIdentificador = adeIdentificador;
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
	
	
	
}