/**
 * SituacaoContrato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.arqrefservices.dominio.econsig;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"solicitado","aguardandoConfirmacao","aguardandoDeferimento","indeferida","deferida","emAndamento","suspensa","cancelada","liquidada","concluido","suspensaPeloConsignante",
"aguardandoLiquidacao","estoque","estoqueNaoLiberado","emCarencia","aguardandoLiquidacaoCompra","estoqueMensal"})
public class SituacaoContrato  implements java.io.Serializable {
	
	private static final long serialVersionUID = -2693000903336895387L;

	private Boolean aguardandoConfirmacao;

    private Boolean aguardandoDeferimento;

    private Boolean aguardandoLiquidacao;

    private Boolean aguardandoLiquidacaoCompra;

    private Boolean cancelada;

    private Boolean concluido;

    private Boolean deferida;

    private Boolean emAndamento;

    private Boolean emCarencia;

    private Boolean estoque;

    private Boolean estoqueMensal;

    private Boolean estoqueNaoLiberado;

    private Boolean indeferida;

    private Boolean liquidada;

    private Boolean solicitado;

    private Boolean suspensa;

    private Boolean suspensaPeloConsignante;

    public SituacaoContrato() {
    	
    }

    @XmlElement(name="ns12:aguardandoConfirmacao")
	public Boolean getAguardandoConfirmacao() {
		return aguardandoConfirmacao;
	}

    @XmlElement(name="ns12:aguardandoDeferimento")
	public Boolean getAguardandoDeferimento() {
		return aguardandoDeferimento;
	}

    @XmlElement(name="ns12:aguardandoLiquidacao")
	public Boolean getAguardandoLiquidacao() {
		return aguardandoLiquidacao;
	}

    @XmlElement(name="ns12:aguardandoLiquidacaoCompra")
	public Boolean getAguardandoLiquidacaoCompra() {
		return aguardandoLiquidacaoCompra;
	}

    @XmlElement(name="ns12:cancelada")
	public Boolean getCancelada() {
		return cancelada;
	}

    @XmlElement(name="ns12:concluido")
	public Boolean getConcluido() {
		return concluido;
	}

    @XmlElement(name="ns12:deferida")
	public Boolean getDeferida() {
		return deferida;
	}

    @XmlElement(name="ns12:emAndamento")
	public Boolean getEmAndamento() {
		return emAndamento;
	}

    @XmlElement(name="ns12:emCarencia")
	public Boolean getEmCarencia() {
		return emCarencia;
	}

    @XmlElement(name="ns12:estoque")
	public Boolean getEstoque() {
		return estoque;
	}

    @XmlElement(name="ns12:estoqueMensal")
	public Boolean getEstoqueMensal() {
		return estoqueMensal;
	}

    @XmlElement(name="ns12:estoqueNaoLiberado")
	public Boolean getEstoqueNaoLiberado() {
		return estoqueNaoLiberado;
	}

    @XmlElement(name="ns12:indeferida")
	public Boolean getIndeferida() {
		return indeferida;
	}

    @XmlElement(name="ns12:liquidada")
	public Boolean getLiquidada() {
		return liquidada;
	}
    
    @XmlElement(name="ns12:solicitado")
	public Boolean getSolicitado() {
		return solicitado;
	}

    @XmlElement(name="ns12:suspensa")
	public Boolean getSuspensa() {
		return suspensa;
	}

    @XmlElement(name="ns12:suspensaPeloConsignante")
	public Boolean getSuspensaPeloConsignante() {
		return suspensaPeloConsignante;
	}

	public void setAguardandoConfirmacao(Boolean aguardandoConfirmacao) {
		this.aguardandoConfirmacao = aguardandoConfirmacao;
	}

	public void setAguardandoDeferimento(Boolean aguardandoDeferimento) {
		this.aguardandoDeferimento = aguardandoDeferimento;
	}

	public void setAguardandoLiquidacao(Boolean aguardandoLiquidacao) {
		this.aguardandoLiquidacao = aguardandoLiquidacao;
	}

	public void setAguardandoLiquidacaoCompra(Boolean aguardandoLiquidacaoCompra) {
		this.aguardandoLiquidacaoCompra = aguardandoLiquidacaoCompra;
	}

	public void setCancelada(Boolean cancelada) {
		this.cancelada = cancelada;
	}

	public void setConcluido(Boolean concluido) {
		this.concluido = concluido;
	}

	public void setDeferida(Boolean deferida) {
		this.deferida = deferida;
	}

	public void setEmAndamento(Boolean emAndamento) {
		this.emAndamento = emAndamento;
	}

	public void setEmCarencia(Boolean emCarencia) {
		this.emCarencia = emCarencia;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}

	public void setEstoqueMensal(Boolean estoqueMensal) {
		this.estoqueMensal = estoqueMensal;
	}

	public void setEstoqueNaoLiberado(Boolean estoqueNaoLiberado) {
		this.estoqueNaoLiberado = estoqueNaoLiberado;
	}

	public void setIndeferida(Boolean indeferida) {
		this.indeferida = indeferida;
	}

	public void setLiquidada(Boolean liquidada) {
		this.liquidada = liquidada;
	}

	public void setSolicitado(Boolean solicitado) {
		this.solicitado = solicitado;
	}

	public void setSuspensa(Boolean suspensa) {
		this.suspensa = suspensa;
	}

	public void setSuspensaPeloConsignante(Boolean suspensaPeloConsignante) {
		this.suspensaPeloConsignante = suspensaPeloConsignante;
	}

    

}
