package br.gov.caixa.arqrefservices.dominio.econsig.inserirSolicitacao;


import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:inserirSolicitacao")
@XmlType(propOrder = {"cliente","convenio","usuario","senha","matricula","cpf","orgaoCodigo","estabelecimentoCodigo","senhaServidor","loginServidor","tokenAutServidor",
		"servicoCodigo","dataNascimento","valorParcela","prazo","valorLiberado","codVerba","endereco","bairro","cidade","uf","cep","telefone"})
public class InserirSolicitacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String bairro;
	
	private String cep;
	
	private String cidade;
	
	private String cliente;
	
	private String codVerba;
	
	private String convenio;
		
	private String cpf;
	
	private Date dataNascimento;
	
	private String endereco;
	
	private String estabelecimentoCodigo;
	
	private String loginServidor;
	
	private String matricula;
	
	private String orgaoCodigo;
	
	private Integer prazo;
	
	private String senha;
	
	private String senhaServidor;
	
	private String servicoCodigo;
	
	private String telefone;
	
	private String tokenAutServidor;
	
	private String uf;
	
	private String usuario;
	
	private String valorLiberado;
	
	private Double valorParcela;
	
	
	@XmlElement(name="hos:bairro")
	public String getBairro() {
		return bairro;
	}

	@XmlElement(name="hos:cep")
	public String getCep() {
		return cep;
	}

	@XmlElement(name="hos:cidade")
	public String getCidade() {
		return cidade;
	}

	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}

	@XmlElement(name="hos:codVerba")
	public String getCodVerba() {
		return codVerba;
	}

	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
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

	@XmlElement(name="hos:endereco")
	public String getEndereco() {
		return endereco;
	}

	@XmlElement(name="hos:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}

	@XmlElement(name="hos:loginServidor")
	public String getLoginServidor() {
		return loginServidor;
	}

	@XmlElement(name="hos:matricula")
	public String getMatricula() {
		return matricula;
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

	@XmlElement(name="hos:telefone")
	public String getTelefone() {
		return telefone;
	}

	@XmlElement(name="hos:tokenAutServidor")
	public String getTokenAutServidor() {
		return tokenAutServidor;
	}

	@XmlElement(name="hos:uf")
	public String getUf() {
		return uf;
	}

	@XmlElement(name="hos:usuario")
	public String getUsuario() {
		return usuario;
	}

	@XmlElement(name="hos:valorLiberado")
	public String getValorLiberado() {
		return valorLiberado;
	}

	@XmlElement(name="hos:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setLoginServidor(String loginServidor) {
		this.loginServidor = loginServidor;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setTokenAutServidor(String tokenAutServidor) {
		this.tokenAutServidor = tokenAutServidor;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setValorLiberado(String valorLiberado) {
		this.valorLiberado = valorLiberado;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

			
}