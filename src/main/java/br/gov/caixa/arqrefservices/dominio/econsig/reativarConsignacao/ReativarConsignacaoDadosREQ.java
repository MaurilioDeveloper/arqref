package br.gov.caixa.arqrefservices.dominio.econsig.reativarConsignacao;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="hos:reativarConsignacao")
@XmlType(propOrder = { "cliente", "convenio", "usuario", "senha", "adeNumero",
		"adeIdentificador", "codigoMotivoOperacao", "obsMotivoOperacao"})
public class ReativarConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cliente;
	
	private String convenio;
	
	private String usuario;
	
	private String senha;
	
	private Long adeNumero;
	
	private String adeIdentificador;
	
	private String codigoMotivoOperacao;
		
	private String obsMotivoOperacao;
	
	
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

	@XmlElement(name="hos:adeNumero")
	public Long getAdeNumero() {
		return adeNumero;
	}

	@XmlElement(name="hos:adeIdentificador")
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:codigoMotivoOperacao")
	public String getCodigoMotivoOperacao() {
		return codigoMotivoOperacao;
	}

	@XmlElement(name="hos:obsMotivoOperacao")
	public String getObsMotivoOperacao() {
		return obsMotivoOperacao;
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

	public void setCodigoMotivoOperacao(String codigoMotivoOperacao) {
		this.codigoMotivoOperacao = codigoMotivoOperacao;
	}

	public void setObsMotivoOperacao(String obsMotivoOperacao) {
		this.obsMotivoOperacao = obsMotivoOperacao;
	}

			
}