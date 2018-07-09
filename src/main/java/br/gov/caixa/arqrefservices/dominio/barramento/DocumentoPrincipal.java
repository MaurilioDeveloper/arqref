package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="DOCUMENTO_IDENTIFICACAO")
@XmlType(propOrder={"quantidade","tipo"})
public class DocumentoPrincipal {
	
	private String quantidade;
	private String tipo;
	
	public DocumentoPrincipal() {
		
	}
	
	public DocumentoPrincipal(String quantidade, String tipo) {
		this.quantidade = quantidade;
		this.tipo = tipo;
	}
	
	@XmlElement(name="QUANTIDADE")
	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	@XmlElement(name="TIPO")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
