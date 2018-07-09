package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada pela avaliacao de risco SIRIC
 * 
 * @author c110503
 * @version 1.0.0.1
 * 
 */
@XmlRootElement(name = "RELACIONAMENTOS")
@XmlType(propOrder = {"tipoPessoa","cpf","cnpj"})
public class PessoaReciproca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6334317502835698882L;

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
		return "PessoaReciproca [tipoPessoa=" + tipoPessoa + ", cpf=" + cpf
				+ ", cnpj=" + cnpj + "]";
	}
	
	

}
