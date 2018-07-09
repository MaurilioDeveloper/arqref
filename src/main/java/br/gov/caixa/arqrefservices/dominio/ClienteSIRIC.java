package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela avaliacao de risco SIRIC
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "CLIENTE")
public class ClienteSIRIC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6984517711217638360L;
	
	private String tipoPessoa;
	
	private String cpf;

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
	
	

}
