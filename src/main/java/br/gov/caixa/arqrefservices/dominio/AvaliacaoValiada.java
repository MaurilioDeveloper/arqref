package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela avaliacao de risco consulta e resultado da
 * consulta da avaliacao de risco.
 * @author c110503
 * @version 2.0.0.1
 *
 */
@XmlRootElement(name = "AVALIACOES_VALIDAS")
public class AvaliacaoValiada implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8237484681677159362L;
	
	private String codigoTipoPessoa;
	
	private String cpf;
	
	private String proposta;
	
	private String codigoAvaliacao;
	
	private String produto;
	
	private String modalidade;
	
	private String dataInicioVigencia;
	
	private String dataFimVigencia;
	
	private String prazo;
	
	private String valorLimiteGlobal;
	
	private String valorCPM;
	
	private String valorFinanciamento;
	
	private String flagBloquadaAlcada;
	
	private String acaoVenda;

	private String rating;
	
	//campo utilizado pelo SIAPX
	private String situacao;
	
	@XmlElement(name="TP_PESSOA")
	public String getCodigoTipoPessoa() {
		return codigoTipoPessoa;
	}

	public void setCodigoTipoPessoa(String codigoTipoPessoa) {
		this.codigoTipoPessoa = codigoTipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

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

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name="MODALIDADE")
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	@XmlElement(name="DT_INICIO_VALIDADE")
	public String getDataInicioVigencia() {
		return dataInicioVigencia;
	}
	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	@XmlElement(name="DT_FIM_VALIDADE")
	public String getDataFimVigencia() {
		return dataFimVigencia;
	}
	public void setDataFimVigencia(String dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
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
	public String getValorCPM() {
		return valorCPM;
	}
	public void setValorCPM(String valorCPM) {
		this.valorCPM = valorCPM;
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

	@Override
	public String toString() {
		return "AvaliacaoValiada [codigoTipoPessoa=" + codigoTipoPessoa
				+ ", cpf=" + cpf + ", proposta=" + proposta
				+ ", codigoAvaliacao=" + codigoAvaliacao + ", produto="
				+ produto + ", modalidade=" + modalidade
				+ ", dataInicioVigencia=" + dataInicioVigencia
				+ ", dataFimVigencia=" + dataFimVigencia + ", prazo=" + prazo
				+ ", valorLimiteGlobal=" + valorLimiteGlobal + ", valorCPM="
				+ valorCPM + ", valorFinanciamento=" + valorFinanciamento
				+ ", flagBloquadaAlcada=" + flagBloquadaAlcada + ", acaoVenda="
				+ acaoVenda + ", rating=" + rating + ", situacao=" + situacao
				+ "]";
	}
	
	
	
	
	
	

}
