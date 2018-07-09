/**
 * ParametroSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"svcDescricao","tamMinMatriculaServidor","tamMaxMatriculaServidor","qtdMaxParcelas","exigeCpfMatriculaPesquisa","validaCpfPesquisa","exigeTac","exigeCadMensVinc","exigeCadVlrLiberado",
		"exigeIof","validaDataNascReserva","exigeInfoBancaria","validaInfoBancaria","alteraAutMargemNegativa","exigeSenhaServReservarRenegociar","exigeSenhaServConsMargem",
		"exigeSenhaServAltContrato","permiteAltContrato","permiteRenegociarContrato","qtdMinPrdPgsParaRenegociarAut","visualizaMargem","visualizaMargemNegativa","diaCorte",
		"periodoAtual","permiteCompraContrato","diasInfoSaldoDevedor","diasAprovSaldoDevedor","diasInfoPgSaldoDevedor","diasLiquidacaoAdeCompra"})
public class ParametroSet  implements java.io.Serializable {
		
	private static final long serialVersionUID = 2163701437232186657L;

	private String svcDescricao;

    private Integer tamMinMatriculaServidor;

    private Integer tamMaxMatriculaServidor;

    private Integer qtdMaxParcelas;

    private Boolean exigeCpfMatriculaPesquisa;

    private Boolean validaCpfPesquisa;

    private Boolean exigeTac;

    private Boolean exigeCadMensVinc;

    private Boolean exigeCadVlrLiberado;

    private Boolean exigeIof;

    private Boolean validaDataNascReserva;

    private Boolean exigeInfoBancaria;

    private Boolean validaInfoBancaria;

    private Boolean alteraAutMargemNegativa;

    private Boolean exigeSenhaServReservarRenegociar;

    private Boolean exigeSenhaServConsMargem;

    private Boolean exigeSenhaServAltContrato;

    private Boolean permiteAltContrato;

    private Boolean permiteRenegociarContrato;

    private Integer qtdMinPrdPgsParaRenegociarAut;

    private Boolean visualizaMargem;

    private Boolean visualizaMargemNegativa;

    private Integer diaCorte;

    private Date periodoAtual;

    private Boolean permiteCompraContrato;

    private Integer diasInfoSaldoDevedor;

    private Integer diasAprovSaldoDevedor;

    private Integer diasInfoPgSaldoDevedor;

    private Integer diasLiquidacaoAdeCompra;

    public ParametroSet() {
    	
    }

    @XmlElement(name="ns10:svcDescricao")
	public String getSvcDescricao() {
		return svcDescricao;
	}

    @XmlElement(name="ns10:tamMinMatriculaServidor")
	public Integer getTamMinMatriculaServidor() {
		return tamMinMatriculaServidor;
	}

    @XmlElement(name="ns10:tamMaxMatriculaServidor")
	public Integer getTamMaxMatriculaServidor() {
		return tamMaxMatriculaServidor;
	}

    @XmlElement(name="ns10:qtdMaxParcelas")
	public Integer getQtdMaxParcelas() {
		return qtdMaxParcelas;
	}

    @XmlElement(name="ns10:exigeCpfMatriculaPesquisa")
	public Boolean getExigeCpfMatriculaPesquisa() {
		return exigeCpfMatriculaPesquisa;
	}

    @XmlElement(name="ns10:validaCpfPesquisa")
	public Boolean getValidaCpfPesquisa() {
		return validaCpfPesquisa;
	}

    @XmlElement(name="ns10:exigeTac")
	public Boolean getExigeTac() {
		return exigeTac;
	}

    @XmlElement(name="ns10:exigeCadMensVinc")
	public boolean isExigeCadMensVinc() {
		return exigeCadMensVinc;
	}

    @XmlElement(name="ns10:exigeCadVlrLiberado")
	public boolean isExigeCadVlrLiberado() {
		return exigeCadVlrLiberado;
	}

    @XmlElement(name="ns10:exigeIof")
	public Boolean getExigeIof() {
		return exigeIof;
	}

    @XmlElement(name="ns10:validaDataNascReserva")
	public boolean isValidaDataNascReserva() {
		return validaDataNascReserva;
	}

    @XmlElement(name="ns10:exigeInfoBancaria")
	public boolean isExigeInfoBancaria() {
		return exigeInfoBancaria;
	}

    @XmlElement(name="ns10:validaInfoBancaria")
	public Boolean getValidaInfoBancaria() {
		return validaInfoBancaria;
	}

    @XmlElement(name="ns10:alteraAutMargemNegativa")
	public Boolean getAlteraAutMargemNegativa() {
		return alteraAutMargemNegativa;
	}

    @XmlElement(name="ns10:exigeSenhaServReservarRenegociar")
	public Boolean getExigeSenhaServReservarRenegociar() {
		return exigeSenhaServReservarRenegociar;
	}

    @XmlElement(name="ns10:exigeSenhaServConsMargem")
	public Boolean getExigeSenhaServConsMargem() {
		return exigeSenhaServConsMargem;
	}

    @XmlElement(name="ns10:exigeSenhaServAltContrato")
	public Boolean getExigeSenhaServAltContrato() {
		return exigeSenhaServAltContrato;
	}

    @XmlElement(name="ns10:permiteAltContrato")
	public Boolean getPermiteAltContrato() {
		return permiteAltContrato;
	}

    @XmlElement(name="ns10:permiteRenegociarContrato")
	public Boolean getPermiteRenegociarContrato() {
		return permiteRenegociarContrato;
	}

    @XmlElement(name="ns10:qtdMinPrdPgsParaRenegociarAut")
	public Integer getQtdMinPrdPgsParaRenegociarAut() {
		return qtdMinPrdPgsParaRenegociarAut;
	}

    @XmlElement(name="ns10:visualizaMargem")
	public Boolean getVisualizaMargem() {
		return visualizaMargem;
	}

    @XmlElement(name="ns10:visualizaMargemNegativa")
	public Boolean getVisualizaMargemNegativa() {
		return visualizaMargemNegativa;
	}

    @XmlElement(name="ns10:diaCorte")
	public Integer getDiaCorte() {
		return diaCorte;
	}

    @XmlSchemaType(name="date")
    @XmlElement(name="ns10:periodoAtual")
	public Date getPeriodoAtual() {
		return periodoAtual;
	}

    @XmlElement(name="ns10:permiteCompraContrato")
	public Boolean getPermiteCompraContrato() {
		return permiteCompraContrato;
	}

    @XmlElement(name="ns10:diasInfoSaldoDevedor")
	public Integer getDiasInfoSaldoDevedor() {
		return diasInfoSaldoDevedor;
	}

    @XmlElement(name="ns10:diasAprovSaldoDevedor")
	public Integer getDiasAprovSaldoDevedor() {
		return diasAprovSaldoDevedor;
	}

    @XmlElement(name="ns10:diasInfoPgSaldoDevedor")
	public Integer getDiasInfoPgSaldoDevedor() {
		return diasInfoPgSaldoDevedor;
	}

    @XmlElement(name="ns10:diasLiquidacaoAdeCompra")
	public Integer getDiasLiquidacaoAdeCompra() {
		return diasLiquidacaoAdeCompra;
	}

    
	public void setSvcDescricao(String svcDescricao) {
		this.svcDescricao = svcDescricao;
	}

	public void setTamMinMatriculaServidor(Integer tamMinMatriculaServidor) {
		this.tamMinMatriculaServidor = tamMinMatriculaServidor;
	}

	public void setTamMaxMatriculaServidor(Integer tamMaxMatriculaServidor) {
		this.tamMaxMatriculaServidor = tamMaxMatriculaServidor;
	}

	public void setQtdMaxParcelas(Integer qtdMaxParcelas) {
		this.qtdMaxParcelas = qtdMaxParcelas;
	}

	public void setExigeCpfMatriculaPesquisa(Boolean exigeCpfMatriculaPesquisa) {
		this.exigeCpfMatriculaPesquisa = exigeCpfMatriculaPesquisa;
	}

	public void setValidaCpfPesquisa(Boolean validaCpfPesquisa) {
		this.validaCpfPesquisa = validaCpfPesquisa;
	}

	public void setExigeTac(Boolean exigeTac) {
		this.exigeTac = exigeTac;
	}

	public void setExigeCadMensVinc(boolean exigeCadMensVinc) {
		this.exigeCadMensVinc = exigeCadMensVinc;
	}

	public void setExigeCadVlrLiberado(boolean exigeCadVlrLiberado) {
		this.exigeCadVlrLiberado = exigeCadVlrLiberado;
	}

	public void setExigeIof(Boolean exigeIof) {
		this.exigeIof = exigeIof;
	}

	public void setValidaDataNascReserva(boolean validaDataNascReserva) {
		this.validaDataNascReserva = validaDataNascReserva;
	}

	public void setExigeInfoBancaria(boolean exigeInfoBancaria) {
		this.exigeInfoBancaria = exigeInfoBancaria;
	}

	public void setValidaInfoBancaria(Boolean validaInfoBancaria) {
		this.validaInfoBancaria = validaInfoBancaria;
	}

	public void setAlteraAutMargemNegativa(Boolean alteraAutMargemNegativa) {
		this.alteraAutMargemNegativa = alteraAutMargemNegativa;
	}

	public void setExigeSenhaServReservarRenegociar(
			Boolean exigeSenhaServReservarRenegociar) {
		this.exigeSenhaServReservarRenegociar = exigeSenhaServReservarRenegociar;
	}

	public void setExigeSenhaServConsMargem(Boolean exigeSenhaServConsMargem) {
		this.exigeSenhaServConsMargem = exigeSenhaServConsMargem;
	}

	public void setExigeSenhaServAltContrato(Boolean exigeSenhaServAltContrato) {
		this.exigeSenhaServAltContrato = exigeSenhaServAltContrato;
	}

	public void setPermiteAltContrato(Boolean permiteAltContrato) {
		this.permiteAltContrato = permiteAltContrato;
	}

	public void setPermiteRenegociarContrato(Boolean permiteRenegociarContrato) {
		this.permiteRenegociarContrato = permiteRenegociarContrato;
	}

	public void setQtdMinPrdPgsParaRenegociarAut(
			Integer qtdMinPrdPgsParaRenegociarAut) {
		this.qtdMinPrdPgsParaRenegociarAut = qtdMinPrdPgsParaRenegociarAut;
	}

	public void setVisualizaMargem(Boolean visualizaMargem) {
		this.visualizaMargem = visualizaMargem;
	}

	public void setVisualizaMargemNegativa(Boolean visualizaMargemNegativa) {
		this.visualizaMargemNegativa = visualizaMargemNegativa;
	}

	public void setDiaCorte(Integer diaCorte) {
		this.diaCorte = diaCorte;
	}

	public void setPeriodoAtual(Date periodoAtual) {
		this.periodoAtual = periodoAtual;
	}

	public void setPermiteCompraContrato(Boolean permiteCompraContrato) {
		this.permiteCompraContrato = permiteCompraContrato;
	}

	public void setDiasInfoSaldoDevedor(Integer diasInfoSaldoDevedor) {
		this.diasInfoSaldoDevedor = diasInfoSaldoDevedor;
	}

	public void setDiasAprovSaldoDevedor(Integer diasAprovSaldoDevedor) {
		this.diasAprovSaldoDevedor = diasAprovSaldoDevedor;
	}

	public void setDiasInfoPgSaldoDevedor(Integer diasInfoPgSaldoDevedor) {
		this.diasInfoPgSaldoDevedor = diasInfoPgSaldoDevedor;
	}

	public void setDiasLiquidacaoAdeCompra(Integer diasLiquidacaoAdeCompra) {
		this.diasLiquidacaoAdeCompra = diasLiquidacaoAdeCompra;
	}


    
    
    
        
}
