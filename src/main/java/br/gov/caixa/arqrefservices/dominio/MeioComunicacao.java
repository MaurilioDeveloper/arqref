package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "MEIO_COMUNICACAO")
public class MeioComunicacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5607008786777939680L;

	private String ocorrencia;
	
	private Produto produto = new Produto();
	
	private Contrato contrato = new Contrato();
	
	private TipoMeioComunicacao tipoMeioComunicacao = new TipoMeioComunicacao();
	
	private String prefixo;
	
	private String telefone;
	
	private String nomeContato;
	
	private String finalidade;
	
	private String flagComunicacao;
	
	private String flagPropaganda;
	
	private String flagComprovada;
	
	private String dataApuracao;

	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@XmlElement(name = "PRODUTO")
	private String getProdutoCodigo() {
		return this.produto.getCodigo();
	}

	private void setProdutoCodigo(String produto) {
		this.produto.setCodigo(produto);
	}

	
	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	@XmlElement(name = "CONTRATO")
	private String getContratoCodigo() {
		return this.contrato.getCodigo().toString();
	}

	private void setContratoCodigo(String contrato) {
		this.contrato.setCodigo(new BigInteger(contrato));
	}
	

	
	public TipoMeioComunicacao getTipoMeioComunicacao() {
		return tipoMeioComunicacao;
	}

	public void setTipoMeioComunicacao(TipoMeioComunicacao tipoMeioComunicacao) {
		this.tipoMeioComunicacao = tipoMeioComunicacao;
	}
	
	@XmlElement(name = "MEIO_COMUNICACAO")
	private String getTipoMeioComunicacaoCodigo() {
		return this.tipoMeioComunicacao.getCodigo();
	}

	private void setTipoMeioComunicacaoCodigo(String tipoMeioComunicacao) {
		this.tipoMeioComunicacao.setCodigo(tipoMeioComunicacao);
	}
	
	

	@XmlElement(name = "PREFIXO_DISCAGEM")
	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	@XmlElement(name = "COD_COMUNICACAO")
	public String getTelefone() {
		return telefone;
	}	

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	@XmlElement(name = "FLAG_COMUNICACAO")
	public String getFlagComunicacao() {
		return flagComunicacao;
	}

	public void setFlagComunicacao(String flagComunicacao) {
		this.flagComunicacao = flagComunicacao;
	}

	@XmlElement(name = "FLAG_PROPAGANDA")
	public String getFlagPropaganda() {
		return flagPropaganda;
	}

	public void setFlagPropaganda(String flagPropaganda) {
		this.flagPropaganda = flagPropaganda;
	}

	@XmlElement(name = "FLAG_COMPROVACAO")
	public String getFlagComprovada() {
		return flagComprovada;
	}
	
	public void setFlagComprovada(String flagComprovada) {
		this.flagComprovada = flagComprovada;
	}
	
	@XmlElement(name = "DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}
	
	
}
