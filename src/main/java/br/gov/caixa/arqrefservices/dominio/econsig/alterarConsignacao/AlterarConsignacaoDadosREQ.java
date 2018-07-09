package br.gov.caixa.arqrefservices.dominio.econsig.alterarConsignacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:alterarConsignacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","novoAdeIdentificador","valorParcela","valorLiberado","valorTac","valorIof","valorMensVin","prazo","senhaServidor","loginServidor","tokenAutServidor","indice","carencia","taxaJuros"})
public class AlterarConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
		
	private String adeIdentificador;
	
	private Long adeNumero;
	
	private Integer carencia;
	
	private String cliente;
	
	private String convenio; 
	
	private String indice; 
	
	private String loginServidor;
	
	private String novoAdeIdentificador;
	
	private Integer prazo; 
	
	private String senha;  
	
	private String senhaServidor;  
	
	private Double taxaJuros; 
	
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
	
	@XmlElement(name="hos:carencia")	
	public Integer getCarencia() {
		return carencia;
	}
	
	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}
	
	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
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
	
	@XmlElement(name="hos:taxaJuros")		
	public Double getTaxaJuros() {
		return taxaJuros;
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

	public void setCarencia(Integer carencia) {
		this.carencia = carencia;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
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

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSenhaServidor(String senhaServidor) {
		this.senhaServidor = senhaServidor;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
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
	

}