/**
 * Historico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"data","responsavel","tipo","descricao"})
public class Historico  implements java.io.Serializable {
	
	private static final long serialVersionUID = 2973201999341549632L;

	private Date data;

    private String responsavel;

    private String tipo;

    private String descricao;

    public Historico() {
    	
    }

    @XmlSchemaType(name="dateTime")
    @XmlElement(name="ns4:data")
	public Date getData() {
		return data;
	}

    @XmlElement(name="ns4:responsavel")
	public java.lang.String getResponsavel() {
		return responsavel;
	}

    @XmlElement(name="ns4:tipo")
	public java.lang.String getTipo() {
		return tipo;
	}

    @XmlElement(name="ns4:descricao")
	public java.lang.String getDescricao() {
		return descricao;
	}
    
	public void setData(Date data) {
		this.data = data;
	}

	public void setResponsavel(java.lang.String responsavel) {
		this.responsavel = responsavel;
	}

	public void setTipo(java.lang.String tipo) {
		this.tipo = tipo;
	}

	public void setDescricao(java.lang.String descricao) {
		this.descricao = descricao;
	}
   
}
