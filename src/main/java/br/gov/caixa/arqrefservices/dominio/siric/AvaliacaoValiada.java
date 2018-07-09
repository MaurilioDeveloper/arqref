package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada pela avaliacao de risco consulta e resultado da
 * consulta da avaliacao de risco.
 * @author c110503
 * @version 2.0.0.1
 *
 */
@XmlRootElement(name = "AVALIACOES_VALIDAS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "proposta", "codigoAvaliacao", "tipoPessoa", "cpf",
		"cnpj","produto", "modalidade", "dataInicioValidade", "dataFimValidade", "prazo",
		"valorLimiteGlobal", "valorLimiteCPM", "valorFinanciamento",
		"flagBloquadaAlcada", "acaoVenda", "rating", "situacao", "bloqueioTomador" })
public class AvaliacaoValiada implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8237484681677159362L;
	
	private String proposta;
	
	private String codigoAvaliacao;
	
	private String tipoPessoa;
	
	private String cpf;
	
	private String cnpj;
	
	private String produto;
	
	private String modalidade;
	
	private String dataInicioValidade;
	
	private String dataFimValidade;
	
	private String prazo;
	
	private String valorLimiteGlobal;
	
	private String valorLimiteCPM;
	
	private String valorFinanciamento;
	
	private String flagBloquadaAlcada;
	
	private String acaoVenda;
	
	private String rating;
	
	private String bloqueioTomador;
	
	
	
	//campo utilizado pelo SIAPX
	private String situacao;
	
	@XmlElement(name="PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}
	
	@XmlElement(name="CODIGO_AVALIACAO")
	public String getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@XmlElement(name="CNPJ")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
	
	@XmlElement(name="CNPJ")
	public String getModalidade() {
		return modalidade;
	}
	
	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	@XmlElement(name="DT_INICIO_VALIDADE")
	public String getDataInicioValidade() {
		return dataInicioValidade;
	}

	public void setDataInicioValidade(String dataInicioValidade) {
		this.dataInicioValidade = dataInicioValidade;
	}

	@XmlElement(name="DT_FIM_VALIDADE")
	public String getDataFimValidade() {
		return dataFimValidade;
	}

	public void setDataFimValidade(String dataFimValidade) {
		this.dataFimValidade = dataFimValidade;
	}

	@XmlElement(name="PRAZO")
	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	@XmlElement(name="VR_LIMITE_GLOBAL")
	public String getValorLimiteGlobal() {
		return valorLimiteGlobal;
	}

	public void setValorLimiteGlobal(String valorLimiteGlobal) {
		this.valorLimiteGlobal = valorLimiteGlobal;
	}

	@XmlElement(name="VR_LIMITE_CPM")
	public String getValorLimiteCPM() {
		return valorLimiteCPM;
	}

	public void setValorLimiteCPM(String valorLimiteCPM) {
		this.valorLimiteCPM = valorLimiteCPM;
	}

	@XmlElement(name="VR_FINANCIAMENTO")
	public String getValorFinanciamento() {
		return valorFinanciamento;
	}

	public void setValorFinanciamento(String valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}

	@XmlElement(name="FLAG_BLOQ_ALCADA")
	public String getFlagBloquadaAlcada() {
		return flagBloquadaAlcada;
	}

	public void setFlagBloquadaAlcada(String flagBloquadaAlcada) {
		this.flagBloquadaAlcada = flagBloquadaAlcada;
	}

	@XmlElement(name="ACAO_VENDA")
	public String getAcaoVenda() {
		return acaoVenda;
	}

	public void setAcaoVenda(String acaoVenda) {
		this.acaoVenda = acaoVenda;
	}

	@XmlElement(name="RATING")
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@XmlElement(name="SITUACAO")
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	
	@XmlElement(name="AVALIACAO_BLOQUEADA_TOMADOR")
	public String getBloqueioTomador() {
		return bloqueioTomador;
	}

	public void setBloqueioTomador(String bloqueioTomador) {
		this.bloqueioTomador = bloqueioTomador;
	}

	@Override
	public String toString() {
		return "AvaliacaoValiada [proposta=" + proposta + ", codigoAvaliacao="
				+ codigoAvaliacao + ", tipoPessoa=" + tipoPessoa + ", cpf="
				+ cpf + ", cnpj=" + cnpj + ", produto=" + produto
				+ ", modalidade=" + modalidade + ", dataInicioValidade="
				+ dataInicioValidade + ", dataFimValidade=" + dataFimValidade
				+ ", prazo=" + prazo + ", valorLimiteGlobal="
				+ valorLimiteGlobal + ", valorLimiteCPM=" + valorLimiteCPM
				+ ", valorFinanciamento=" + valorFinanciamento
				+ ", flagBloquadaAlcada=" + flagBloquadaAlcada + ", acaoVenda="
				+ acaoVenda + ", rating=" + rating + ", situacao=" + situacao
				+ "]";
	}
	
	
	
	
	
	

}
