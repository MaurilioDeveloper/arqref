package br.gov.caixa.arqrefservices.dominio.econsig.alongarConsignacao;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:alongarConsignacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","novoAdeIdentificador","dataNascimento","valorParcela","valorLiberado",
		"codVerba","servicoCodigo","prazo","carencia","senhaServidor","loginServidor","tokenAutServidor","correspondenteCodigo","valorTac","indice","valorIof",
		"valorMensVin","matricula","cpf","orgaoCodigo","estabelecimentoCodigo","banco","agencia","conta"})
public class AlongarConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
		
	private String adeIdentificador;
	
	private Long adeNumero;
	
	private String agencia;
	
	private String banco;
	
	private Integer carencia; 
	
	private String cliente; 
	
	private String codVerba;
	
	private String conta;
	
	private String convenio; 
	
	private String correspondenteCodigo;  
	
	private String cpf;  
	
	private Date dataNascimento; 
	
	private String estabelecimentoCodigo;
  
	private String indice;
	
	private String loginServidor; 
	
	private String novoAdeIdentificador; 
	
	private String matricula; 
	
	private String orgaoCodigo;  
	
	private Integer prazo; 
	
	private String senha; 
	
	private String senhaServidor;
	
	private String servicoCodigo;
	
	private String tokenAutServidor;
	
	private String usuario;
	
	private Double valorIof;
	
	private Double valorLiberado;
	
	private Double valorMensVin;
	
	private Double valorParcela;
	
	private Double valorTac;
			
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
	
	@XmlElement(name="hos:banco")	
	public String getBanco() {
		return banco;
	}
	
	@XmlElement(name="hos:carencia")	
	public Integer getCarencia() {
		return carencia;
	}

	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}
	
	@XmlElement(name="hos:codVerba")
	public String getCodVerba() {
		return codVerba;
	}
	
	@XmlElement(name="hos:conta")
	public String getConta() {
		return conta;
	}
	
	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
	}
	
	@XmlElement(name="hos:correspondenteCodigo")
	public String getCorrespondenteCodigo() {
		return correspondenteCodigo;
	}
	
	@XmlElement(name="hos:cpf")
	public String getCpf() {
		return cpf;
	}
	
	@XmlSchemaType(name="date")
	@XmlElement(name="hos:dataNascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}
		
	@XmlElement(name="hos:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}
	
	@XmlElement(name="hos:indice")	
	public String getIndice() {
		return indice;
	}
	
	@XmlElement(name="hos:loginServidor")
	public String getLoginServidor() {
		return loginServidor;
	}
	
	@XmlElement(name="hos:novoAdeIdentificador")	
	public String getNovoAdeIdentificador() {
		return novoAdeIdentificador;
	}

	@XmlElement(name="hos:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}

	@XmlElement(name="hos:prazo")	
	public Integer getPrazo() {
		return prazo;
	}

	@XmlElement(name="hos:senha")
	public String getSenha() {
		return senha;
	}

	@XmlElement(name="hos:senhaServidor")
	public String getSenhaServidor() {
		return senhaServidor;
	}

	@XmlElement(name="hos:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

	@XmlElement(name="hos:tokenAutServidor")
	public String getTokenAutServidor() {
		return tokenAutServidor;
	}

	@XmlElement(name="hos:usuario")
	public String getUsuario() {
		return usuario;
	}

	@XmlElement(name="hos:valorIof")	
	public Double getValorIof() {
		return valorIof;
	}

	@XmlElement(name="hos:valorLiberado")		
	public Double getValorLiberado() {
		return valorLiberado;
	}

	@XmlElement(name="hos:valorMensVin")	
	public Double getValorMensVin() {
		return valorMensVin;
	}

	@XmlElement(name="hos:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}

	@XmlElement(name="hos:valorTac")
	public Double getValorTac() {
		return valorTac;
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

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setCarencia(Integer carencia) {
		this.carencia = carencia;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setCorrespondenteCodigo(String correspondenteCodigo) {
		this.correspondenteCodigo = correspondenteCodigo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public void setLoginServidor(String loginServidor) {
		this.loginServidor = loginServidor;
	}

	public void setNovoAdeIdentificador(String novoAdeIdentificador) {
		this.novoAdeIdentificador = novoAdeIdentificador;
	}

	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setTokenAutServidor(String tokenAutServidor) {
		this.tokenAutServidor = tokenAutServidor;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setValorIof(Double valorIof) {
		this.valorIof = valorIof;
	}

	public void setValorLiberado(Double valorLiberado) {
		this.valorLiberado = valorLiberado;
	}

	public void setValorMensVin(Double valorMensVin) {
		this.valorMensVin = valorMensVin;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setValorTac(Double valorTac) {
		this.valorTac = valorTac;
	}

	@XmlElement(name="hos:matricula")
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

}