package br.gov.caixa.arqrefservices.dominio.econsig.simularConsignacao;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:simularConsignacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","matricula","cpf","orgaoCodigo","estabelecimentoCodigo","servicoCodigo","valorParcela","prazo","valorLiberado","codVerba"})
public class SimularConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cliente;
	
	private String convenio;
	
	private String usuario;
	
	private String senha;
		
	private String matricula;
	
	private String cpf;
	
	private String orgaoCodigo;
	
	private String estabelecimentoCodigo;
	
	private String servicoCodigo;
	
	private Double valorParcela;
	
	private Integer prazo;
	
	private Double valorLiberado;
	
	private String codVerba;
	
	
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

	@XmlElement(name="hos:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

	@XmlElement(name="hos:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}

	@XmlElement(name="hos:prazo")
	public Integer getPrazo() {
		return prazo;
	}

	@XmlElement(name="hos:valorLiberado")
	public Double getValorLiberado() {
		return valorLiberado;
	}

	@XmlElement(name="hos:codVerba")
	public String getCodVerba() {
		return codVerba;
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

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public void setValorLiberado(Double valorLiberado) {
		this.valorLiberado = valorLiberado;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}


	
	
		
}