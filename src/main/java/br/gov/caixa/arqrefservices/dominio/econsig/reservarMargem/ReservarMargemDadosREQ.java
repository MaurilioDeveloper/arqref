package br.gov.caixa.arqrefservices.dominio.econsig.reservarMargem;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:reservarMargem")
@XmlType(propOrder = { "cliente", "convenio", "usuario", "senha", "matricula",
		"cpf", "orgaoCodigo", "estabelecimentoCodigo", "senhaServidor",
		"loginServidor", "tokenAutServidor", "servicoCodigo", "dataNascimento",
		"valorParcela", "prazo", "valorLiberado", "codVerba",
		"correspondenteCodigo", "carencia", "valorTac", "indice", "valorIof",
		"valorMensVin", "adeIdentificador", "banco", "agencia", "conta",
		"taxaJuros" })
public class ReservarMargemDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cliente;
	
	private String convenio;
	
	private String usuario;
	
	private String senha;
		
	private String matricula;
	
	private String cpf;
	
	private String orgaoCodigo;
	
	private String estabelecimentoCodigo;
	
	private String senhaServidor;
	
	private String loginServidor;
	
	private String tokenAutServidor;
	
	private String servicoCodigo;
		
	private Date dataNascimento;
		
	private Double valorParcela;
		
	private Integer prazo;
		
	private Double valorLiberado;
		
	private String codVerba;
		
	private String correspondenteCodigo;
	
	private Integer carencia;
	
	private Double valorTac;
	
	private String indice;
	
	private Double valorIof;
	
	private Double valorMensVin;
	
	private String adeIdentificador;
	
	private String banco;
	
	private String agencia;
	
	private String conta;
	
	private Double taxaJuros;
	
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

	@XmlElement(name="hos:senhaServidor")
	public String getSenhaServidor() {
		return senhaServidor;
	}

	@XmlElement(name="hos:loginServidor")
	public String getLoginServidor() {
		return loginServidor;
	}

	@XmlElement(name="hos:tokenAutServidor")
	public String getTokenAutServidor() {
		return tokenAutServidor;
	}

	@XmlElement(name="hos:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

	@XmlSchemaType(name="date")
	@XmlElement(name="hos:dataNascimento")
	public Date getDataNascimento() {
		return dataNascimento;
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

	@XmlElement(name="hos:correspondenteCodigo")
	public String getCorrespondenteCodigo() {
		return correspondenteCodigo;
	}

	@XmlElement(name="hos:carencia")
	public Integer getCarencia() {
		return carencia;
	}

	@XmlElement(name="hos:valorTac")
	public Double getValorTac() {
		return valorTac;
	}

	@XmlElement(name="hos:indice")
	public String getIndice() {
		return indice;
	}

	@XmlElement(name="hos:valorIof")
	public Double getValorIof() {
		return valorIof;
	}

	@XmlElement(name="hos:valorMensVin")
	public Double getValorMensVin() {
		return valorMensVin;
	}

	@XmlElement(name="hos:adeIdentificador")
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:banco")
	public String getBanco() {
		return banco;
	}

	@XmlElement(name="hos:agencia")
	public String getAgencia() {
		return agencia;
	}

	@XmlElement(name="hos:conta")
	public String getConta() {
		return conta;
	}

	@XmlElement(name="hos:taxaJuros")
	public Double getTaxaJuros() {
		return taxaJuros;
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

	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}

	public void setLoginServidor(String loginServidor) {
		this.loginServidor = loginServidor;
	}

	public void setTokenAutServidor(String tokenAutServidor) {
		this.tokenAutServidor = tokenAutServidor;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public void setCorrespondenteCodigo(String correspondenteCodigo) {
		this.correspondenteCodigo = correspondenteCodigo;
	}

	public void setCarencia(Integer carencia) {
		this.carencia = carencia;
	}

	public void setValorTac(Double valorTac) {
		this.valorTac = valorTac;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public void setValorIof(Double valorIof) {
		this.valorIof = valorIof;
	}

	public void setValorMensVin(Double valorMensVin) {
		this.valorMensVin = valorMensVin;
	}

	public void setAdeIdentificador(String adeIdentificador) {
		this.adeIdentificador = adeIdentificador;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	
	
	
		
}