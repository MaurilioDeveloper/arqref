package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="NOME_MAE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class NomeMae implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7446915796574183531L;
	private String nome;

	@XmlElement(name="NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "NomePai [nome=" + nome + "]";
	}
	
	
}
