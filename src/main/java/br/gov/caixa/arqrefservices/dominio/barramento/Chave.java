package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe para montar o tipo de pesquisa que sera 
 * realizada no SICLI
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="CHAVE")
public class Chave implements Serializable {
	
	private static final long serialVersionUID = 4804253103438607619L;
	
	private String cpf;
	
	private String cocli;
	
	private String cnpj;
	
	private String cnpjSIISO;

	@XmlElement(name="CPF")
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@XmlElement(name="COCLI")
	public String getCocli() {
		return this.cocli;
	}
	
	public void setCocli(String cocli) {
		this.cocli = cocli;
	}
	
	@XmlElement(name="CNPJ")
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@XmlElement(name = "CNPJ_SIISO")
	public String getCnpjSIISO() {
		return cnpjSIISO;
	}
	public void setCnpjSIISO(String cnpjSIISO) {
		this.cnpjSIISO = cnpjSIISO;
	}
}
