package br.gov.caixa.arqrefservices.dominio.consignet;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"nome","valor"})
public class AtributoConsignet implements Serializable {

	private static final long serialVersionUID = -9006335561385802210L;
	
	private String nome;
	
	private String valor;

	public AtributoConsignet() {
	
	}
	
	public AtributoConsignet(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;		
	}
	
	@XmlElement(name="nome")
	public String getNome() {
		return nome;
	}

	@XmlElement(name="valor")
	public String getValor() {
		return valor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
