package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "SOCIO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "tpPessoa", "cpfCnpj", "nome","dataNascContsEmpresa" })
public class Socio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1773407103354588594L;

	private String tpPessoa;

	private String cpfCnpj;

	private String nome;

	private String dataNascContsEmpresa;

	/**
	 * @return the tpPessoa
	 */

	@XmlElement(name = "TP_PESSOA")
	public String getTpPessoa() {
		return tpPessoa;
	}

	/**
	 * @param tpPessoa
	 *            the tpPessoa to set
	 */
	public void setTpPessoa(String tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

	/**
	 * @return the cpfCnpj
	 */

	@XmlElement(name = "CPF_CNPJ")
	public String getCpfCnpj() {
		return cpfCnpj;
	}

	/**
	 * @param cpfCnpj
	 *            the cpfCnpj to set
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	/**
	 * @return the nome
	 */
	
	@XmlElement(name = "NOME")
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the dataNascContsEmpresa
	 */
	@XmlElement(name = "DT_NASC_CONST_EMPRESA")
	public String getDataNascContsEmpresa() {
		return dataNascContsEmpresa;
	}

	/**
	 * @param dataNascContsEmpresa the dataNascContsEmpresa to set
	 */
	public void setDataNascContsEmpresa(String dataNascContsEmpresa) {
		this.dataNascContsEmpresa = dataNascContsEmpresa;
	}

	

}
