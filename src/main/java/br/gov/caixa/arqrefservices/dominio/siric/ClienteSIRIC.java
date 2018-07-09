package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="CLIENTE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ClienteSIRIC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4516065040933843350L;

	private String tipoPessoa;
	
	private String cpf;
	
	private String cnpj;
	




	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@XmlElement(name="CNPJ")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	@Override
	public String toString() {
		return "ClienteSIRIC [tipoPessoa=" + tipoPessoa + ", cpf=" + cpf
				+ ", cnpj=" + cnpj + "]";
	}
	
	

}
