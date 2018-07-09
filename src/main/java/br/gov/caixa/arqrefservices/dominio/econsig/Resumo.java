/**
 * Resumo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"adeNumero","adeIdentificador","indice","responsavel","servico","codVerba","dataReserva","valorParcela","prazo","pagas","situacao","servicoCodigo","statusCodigo","consignataria","consignatariaCodigo"})
public class Resumo  implements java.io.Serializable {
		
	private static final long serialVersionUID = -4868449754208230482L;

	private BigInteger adeNumero;

    private String adeIdentificador;

    private String indice;

    private String responsavel;

    private String servico;

    private String codVerba;

    private Date dataReserva;

    private Double valorParcela;

    private Integer prazo;

    private Integer pagas;

    private String situacao;

    private String servicoCodigo;

    private String statusCodigo;

    private String consignataria;

    private String consignatariaCodigo;

    public Resumo() {
    	
    }

    @XmlElement(name="ns5:adeNumero")
	public BigInteger getAdeNumero() {
		return adeNumero;
	}

    @XmlElement(name="ns5:adeIdentificador")
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

    @XmlElement(name="ns5:indice")
	public String getIndice() {
		return indice;
	}

    @XmlElement(name="ns5:responsavel")
	public String getResponsavel() {
		return responsavel;
	}

    @XmlElement(name="ns5:servico")
	public String getServico() {
		return servico;
	}

    @XmlElement(name="ns5:codVerba")
	public String getCodVerba() {
		return codVerba;
	}

    @XmlSchemaType(name="dateTime")
    @XmlElement(name="ns5:dataReserva")
	public Date getDataReserva() {
		return dataReserva;
	}

    @XmlElement(name="ns5:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}

    @XmlElement(name="ns5:prazo")
	public Integer getPrazo() {
		return prazo;
	}

    @XmlElement(name="ns5:pagas")
	public Integer getPagas() {
		return pagas;
	}

    @XmlElement(name="ns5:situacao")
	public String getSituacao() {
		return situacao;
	}

    @XmlElement(name="ns5:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

    @XmlElement(name="ns5:statusCodigo")
	public String getStatusCodigo() {
		return statusCodigo;
	}

    @XmlElement(name="ns5:consignataria")
	public String getConsignataria() {
		return consignataria;
	}

    @XmlElement(name="ns5:consignatariaCodigo")
	public String getConsignatariaCodigo() {
		return consignatariaCodigo;
	}

	public void setAdeNumero(BigInteger adeNumero) {
		this.adeNumero = adeNumero;
	}

	public void setAdeIdentificador(String adeIdentificador) {
		this.adeIdentificador = adeIdentificador;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public void setPagas(Integer pagas) {
		this.pagas = pagas;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setStatusCodigo(String statusCodigo) {
		this.statusCodigo = statusCodigo;
	}

	public void setConsignataria(String consignataria) {
		this.consignataria = consignataria;
	}

	public void setConsignatariaCodigo(String consignatariaCodigo) {
		this.consignatariaCodigo = consignatariaCodigo;
	}
	
}
