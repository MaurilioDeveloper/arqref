/**
 * Simulacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"consignatariaCodigo","consignataria","valorLiberado","valorParcela","ranking","taxaJuros","servico","servicoCodigo"})
public class Simulacao  implements java.io.Serializable {
		
	private static final long serialVersionUID = -5569688784592500606L;

	private String consignatariaCodigo;

    private String consignataria;

    private Double valorLiberado;

    private Double valorParcela;

    private Integer ranking;

    private Double taxaJuros;

    private String servico;

    private String servicoCodigo;

    public Simulacao() {
    	
    }

	@XmlElement(name="ns7:consignatariaCodigo")
	public String getConsignatariaCodigo() {
		return consignatariaCodigo;
	}

	@XmlElement(name="ns7:consignataria")
	public String getConsignataria() {
		return consignataria;
	}

	@XmlElement(name="ns7:valorLiberado")
	public Double getValorLiberado() {
		return valorLiberado;
	}

	@XmlElement(name="ns7:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}

	@XmlElement(name="ns7:ranking")
	public Integer getRanking() {
		return ranking;
	}

	@XmlElement(name="ns7:taxaJuros")
	public Double getTaxaJuros() {
		return taxaJuros;
	}

	@XmlElement(name="ns7:servico")
	public String getServico() {
		return servico;
	}

	@XmlElement(name="ns7:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

	public void setConsignatariaCodigo(String consignatariaCodigo) {
		this.consignatariaCodigo = consignatariaCodigo;
	}

	public void setConsignataria(String consignataria) {
		this.consignataria = consignataria;
	}

	public void setValorLiberado(Double valorLiberado) {
		this.valorLiberado = valorLiberado;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

}
