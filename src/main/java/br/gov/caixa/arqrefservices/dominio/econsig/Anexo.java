/**
 * Anexo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"nomeArquivo","arquivo"})
public class Anexo  implements java.io.Serializable {
	
	private static final long serialVersionUID = 3633513036397967021L;

	private String arquivo;

    private String nomeArquivo;

    public Anexo() {

    }

	@XmlElement(name="anex:arquivo")	
	public String getArquivo() {
		return arquivo;
	}

	@XmlElement(name="anex:nomeArquivo")
	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

}
