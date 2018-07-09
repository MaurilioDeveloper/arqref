/**
 * Servico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"servico","servicoCodigo"})
public class Servico  implements java.io.Serializable {
	
	private static final long serialVersionUID = 6058739066031231323L;

	private String servico;

    private String servicoCodigo;

    public Servico() {
    
    }

    @XmlElement(name="ns2:servico")
	public String getServico() {
		return servico;
	}

    @XmlElement(name="ns2:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

    
}
