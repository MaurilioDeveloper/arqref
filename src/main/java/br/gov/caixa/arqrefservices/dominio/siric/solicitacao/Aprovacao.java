package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="APROVADA")
public class Aprovacao implements Serializable {


	private static final long serialVersionUID = 182960345605397629L;
	
	private String proposta;
	
	private String codigoAvaliacao;
	
	//private ClienteMQ cliente;
	
	private String produto;
	
	private String modalidade;
	
	private String dataInicioVigencia;
	
	private String dataFimVigencia;
	
	private String prazo;
	
	private String valorLimiteGlobal;
	
	private String valorComposicaoMonetaria;
	
	private String valorFinanciamento;
	
	private String rating;
	
	private String flagBloqueioAlcada;
	
	private String codigoMensagem;
	
	private String acaoVenda;
	
	private String prazoPossivel;
	
	private String motivo;
	
	private String valorFinanciamentoPossivel;
	
	private String valorPrestacaoPossivel;
	

	@XmlElement(name="PROPOSTA")
	public String getProposta() {
		return this.proposta;
	}

	@XmlElement(name="CODIGO_AVALIACAO")
	public String getCodigoAvaliacao() {
		return this.codigoAvaliacao;
	}

	/*@XmlElement(name="CLIENTE")
	public ClienteMQ getCliente() {
		return this.cliente;
	}*/

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return this.produto;
	}

	@XmlElement(name="MODALIDADE")
	public String getModalidade() {
		return this.modalidade;
	}

	@XmlElement(name="DT_INICIO_VIGENCIA")
	public String getDataInicioVigencia() {
		return this.dataInicioVigencia;
	}

	@XmlElement(name="DT_FIM_VIGENCIA")
	public String getDataFimVigencia() {
		return this.dataFimVigencia;
	}

	@XmlElement(name="PRAZO")
	public String getPrazo() {
		return this.prazo;
	}

	@XmlElement(name="VR_LIMITE_GLOBAL")
	public String getValorLimiteGlobal() {
		return this.valorLimiteGlobal;
	}

	@XmlElement(name="VR_CPM")
	public String getValorComposicaoMonetaria() {
		return this.valorComposicaoMonetaria;
	}

	@XmlElement(name="VR_FINANCIAMENTO")
	public String getValorFinanciamento() {
		return this.valorFinanciamento;
	}

	@XmlElement(name="RATING")
	public String getRating() {
		return this.rating;
	}

	@XmlElement(name="FLAG_BLOQ_ALCADA")
	public String getFlagBloqueioAlcada() {
		return this.flagBloqueioAlcada;
	}

	@XmlElement(name="ACAO_VENDA")
	public String getAcaoVenda() {
		return this.acaoVenda;
	}

	@XmlElement(name="PRAZO_POSSIVEL")
	public String getPrazoPossivel() {
		return this.prazoPossivel;
	}
	@XmlElement(name="MOTIVO")
	public String getMotivo() {
		return this.motivo;
	}
	@XmlElement(name="VR_FINANCIAMENTO_POSSIVEL")
	public String getValorFinanciamentoPossivel() {
		return this.valorFinanciamentoPossivel;
	}
	@XmlElement(name="VR_PRESTACAO_POSSIVEL")
	public String getValorPrestacaoPossivel() {
		return this.valorPrestacaoPossivel;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	/*public void setCliente(ClienteMQ cliente) {
		this.cliente = cliente;
	}*/

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public void setDataFimVigencia(String dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public void setValorLimiteGlobal(String valorLimiteGlobal) {
		this.valorLimiteGlobal = valorLimiteGlobal;
	}

	public void setValorComposicaoMonetaria(String valorComposicaoMonetaria) {
		this.valorComposicaoMonetaria = valorComposicaoMonetaria;
	}

	public void setValorFinanciamento(String valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setFlagBloqueioAlcada(String flagBloqueioAlcada) {
		this.flagBloqueioAlcada = flagBloqueioAlcada;
	}

	public void setAcaoVenda(String acaoVenda) {
		this.acaoVenda = acaoVenda;
	}

	public void setPrazoPossivel(String prazoPossivel) {
		this.prazoPossivel = prazoPossivel;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public void setValorFinanciamentoPossivel(String valorFinanciamentoPossivel) {
		this.valorFinanciamentoPossivel = valorFinanciamentoPossivel;
	}

	public void setValorPrestacaoPossivel(String valorPrestacaoPossivel) {
		this.valorPrestacaoPossivel = valorPrestacaoPossivel;
	}

	@XmlElement(name="IDENTIFICADOR_MENSAGEM")
	public String getCodigoMensagem() {
		return codigoMensagem;
	}

	public void setCodigoMensagem(String codigoMensagem) {
		this.codigoMensagem = codigoMensagem;
	}


	
	
	
}
