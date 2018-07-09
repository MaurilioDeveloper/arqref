/**
 * Servidor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"ativo","bloqueado","excluido"})
public class SituacaoServidor  implements java.io.Serializable {
	    
	private static final long serialVersionUID = -125889235542954846L;

	private String ativo;

    private String bloqueado;

    private String excluido;

    public SituacaoServidor() {
    	
    }

    @XmlElement(name="sit1:ativo")
	public String getAtivo() {
		return ativo;
	}

    @XmlElement(name="sit1:bloqueado")
	public String getBloqueado() {
		return bloqueado;
	}

    @XmlElement(name="sit1:excluido")
	public String getExcluido() {
		return excluido;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public void setBloqueado(String bloqueado) {
		this.bloqueado = bloqueado;
	}

	public void setExcluido(String excluido) {
		this.excluido = excluido;
	}

}
