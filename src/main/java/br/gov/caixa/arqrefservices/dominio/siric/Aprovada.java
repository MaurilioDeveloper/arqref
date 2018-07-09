package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */

@XmlRootElement(name="APROVADA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Aprovada implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4350370652150966853L;

	
	private String proposta;
	
	private String codigoAvaliacao;
	
	private ClienteSIRIC cliente;
	
	private String produto;
	
	private String modalidade;
	
	private String dataInicioVigencia;
	
	private String dataFimVigencia;
	
	private String prazo;	
	
	private String valorLimiteGlobal;
	
	private String valorCPM;
	
	private String valorFinanciamento;
	
	private String rating;
	
	private String flagBloqueoAlcada;
	
	private String acaoVenda;
	
	private String bloqueioTomador;

	

	@XmlElement(name="VR_LIMITE_GLOBAL")
	public String getValorLimiteGlobal() {
		return valorLimiteGlobal;
	}

	public void setValorLimiteGlobal(String valorLimiteGlobal) {
		this.valorLimiteGlobal = valorLimiteGlobal;
	}

	@XmlElement(name="VR_CPM")
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
	public String getFlagBloqueoAlcada() {
		return flagBloqueoAlcada;
	}

	public void setFlagBloqueoAlcada(String flagBloqueoAlcada) {
		this.flagBloqueoAlcada = flagBloqueoAlcada;
	}
	
	@XmlElement(name="ACAO_VENDA")
	public String getAcaoVenda() {
		return acaoVenda;
	}	

	public void setAcaoVenda(String acaoVenda) {
		this.acaoVenda = acaoVenda;
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

	@XmlElement(name="CLIENTE")
	public ClienteSIRIC getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSIRIC cliente) {
		this.cliente = cliente;
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

	@XmlElement(name="DT_INICIO_VIGENCIA")
	public String getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	@XmlElement(name="DT_FIM_VIGENCIA")
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
	
	@XmlElement(name="RATING")
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
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
		return "Aprovada [proposta=" + proposta + ", codigoAvaliacao="
				+ codigoAvaliacao + ", cliente=" + cliente + ", produto="
				+ produto + ", modalidade=" + modalidade
				+ ", dataInicioVigencia=" + dataInicioVigencia
				+ ", dataFimVigencia=" + dataFimVigencia + ", prazo=" + prazo
				+ ", valorLimiteGlobal=" + valorLimiteGlobal + ", valorCPM="
				+ valorCPM + ", valorFinanciamento=" + valorFinanciamento
				+ ", rating=" + rating + ", flagBloqueoAlcada="
				+ flagBloqueoAlcada + ", acaoVenda=" + acaoVenda + "]";
	}
	
	
	
	

}
