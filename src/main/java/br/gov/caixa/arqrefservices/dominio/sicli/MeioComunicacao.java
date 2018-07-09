package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "MEIO_COMUNICACAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "ocorrencia", "produto", "contrato", "meioComunicao", "prefixoDiscagem", "codigoComunicacao",
		"nomeContato", "finalidade", "brancos", "flagComunicacao", "flagPropagando", "flagComprovacao",
		"dataApuracao" })
public class MeioComunicacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7800792923497852841L;

	private String ocorrencia;

	private String produto;

	private String contrato;

	private String meioComunicao;

	private String prefixoDiscagem;

	private String codigoComunicacao;

	private String nomeContato;

	private String finalidade;

	private String brancos;

	private String flagComunicacao;

	private String flagPropagando;

	private String flagComprovacao;

	private String dataApuracao;

	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name = "PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name = "CONTRATO")
	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@XmlElement(name = "MEIO_COMUNICACAO")
	public String getMeioComunicao() {
		return meioComunicao;
	}

	public void setMeioComunicao(String meioComunicao) {
		this.meioComunicao = meioComunicao;
	}

	@XmlElement(name = "PREFIXO_DISCAGEM")
	public String getPrefixoDiscagem() {
		return prefixoDiscagem;
	}

	public void setPrefixoDiscagem(String prefixoDiscagem) {
		this.prefixoDiscagem = prefixoDiscagem;
	}

	@XmlElement(name = "COD_COMUNICACAO")
	public String getCodigoComunicacao() {
		return codigoComunicacao;
	}

	public void setCodigoComunicacao(String codigoComunicacao) {
		this.codigoComunicacao = codigoComunicacao;
	}

	@XmlElement(name = "NOME_CONTATO")
	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	@XmlElement(name = "FINALIDADE")
	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	@XmlElement(name = "BRANCOS")
	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	@XmlElement(name = "FLAG_COMUNICACAO")
	public String getFlagComunicacao() {
		return flagComunicacao;
	}

	public void setFlagComunicacao(String flagComunicacao) {
		this.flagComunicacao = flagComunicacao;
	}

	@XmlElement(name = "FLAG_PROPAGANDA")
	public String getFlagPropagando() {
		return flagPropagando;
	}

	public void setFlagPropagando(String flagPropagando) {
		this.flagPropagando = flagPropagando;
	}

	@XmlElement(name = "FLAG_COMPROVACAO")
	public String getFlagComprovacao() {
		return flagComprovacao;
	}

	public void setFlagComprovacao(String flagComprovacao) {
		this.flagComprovacao = flagComprovacao;
	}

	@XmlElement(name = "DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	@Override
	public String toString() {
		return "MeioComunicacao [ocorrencia=" + ocorrencia + ", produto=" + produto + ", contrato=" + contrato
				+ ", meioComunicao=" + meioComunicao + ", prefixoDiscagem=" + prefixoDiscagem + ", codigoComunicacao="
				+ codigoComunicacao + ", nomeContato=" + nomeContato + ", finalidade=" + finalidade + ",brancos="
				+ brancos + ", flagComunicacao=" + flagComunicacao + ", flagPropagando=" + flagPropagando
				+ ", flagComprovacao=" + flagComprovacao + ", dataApuracao=" + dataApuracao + "]";
	}

}
