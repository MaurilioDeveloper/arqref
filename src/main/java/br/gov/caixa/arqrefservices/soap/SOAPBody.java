package br.gov.caixa.arqrefservices.soap;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAnyElement;

public class SOAPBody<T> implements Serializable {

	private static final long serialVersionUID = 938984211890100468L;
	
	private T dados;

	@XmlAnyElement(lax=true)
	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}
}
