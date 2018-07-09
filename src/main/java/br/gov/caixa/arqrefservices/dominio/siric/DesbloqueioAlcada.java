package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DesbloqueioAlcada implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "CPF")
	private String cpf;
	@XmlElement(name = "CNPJ")
	private String cnpj;
	@XmlElement(name = "CODIGO_AVALIACAO")
	private String codigoAvaliacao;
	@XmlElement(name = "USUARIO")
	private String usuario;
	
	//ALCADA
	//CONFORMIDADE
	//TOMADOR
	@XmlElement(name = "TIPO_DESBLOQUEIO")
	private String tipoDesbloqueio;

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(final String usuario) {
		this.usuario = usuario;
	}

	public String getTipoDesbloqueio() {
		return tipoDesbloqueio;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public void setTipoDesbloqueio(String tipoDesbloqueio) {
		this.tipoDesbloqueio = tipoDesbloqueio;
	}
	
	

}
