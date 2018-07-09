/**
 * Servidor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"servidor","cpf","matricula","estabelecimentoCodigo","estabelecimento","orgaoCodigo","orgao"})
public class Servidor  implements java.io.Serializable {
	    
	private static final long serialVersionUID = -125889235542954846L;

	private String servidor;

    private String cpf;

    private String matricula;

    private String estabelecimentoCodigo;

    private String estabelecimento;

    private String orgaoCodigo;

    private String orgao;

    public Servidor() {
    	
    }

    @XmlElement(name="ns3:servidor")
	public String getServidor() {
		return servidor;
	}

    @XmlElement(name="ns3:cpf")
	public String getCpf() {
		return cpf;
	}

    @XmlElement(name="ns3:matricula")
	public String getMatricula() {
		return matricula;
	}

    @XmlElement(name="ns3:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}

    @XmlElement(name="ns3:estabelecimento")
	public String getEstabelecimento() {
		return estabelecimento;
	}

    @XmlElement(name="ns3:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}

    @XmlElement(name="ns3:orgao")
	public String getOrgao() {
		return orgao;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}


       
}
