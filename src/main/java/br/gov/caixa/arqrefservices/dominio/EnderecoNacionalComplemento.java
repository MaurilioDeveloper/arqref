package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class EnderecoNacionalComplemento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4448330349699431196L;

	
	private String ocorrencia;
	
	private Produto produto;
	
	private Contrato contrato;
	
	private String comprovacao;
	
	private String postagem;
	
	private String tipoEndereco;
	
	private String simplificado;
	
	private String devolvido;
	
	private String devolucao;
	
	private String unico;
	
	private String sequencial;
	
	private String mesReferencia;
	
	private String anoReferencia;
	
	private String dataApuracao;
	
	private String filler;
	
	private TipoImovel tipoImovel = new TipoImovel();

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public String getComprovacao() {
		return comprovacao;
	}

	public void setComprovacao(String comprovacao) {
		this.comprovacao = comprovacao;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public String getSimplificado() {
		return simplificado;
	}

	public void setSimplificado(String simplificado) {
		this.simplificado = simplificado;
	}

	public String getDevolvido() {
		return devolvido;
	}

	public void setDevolvido(String devolvido) {
		this.devolvido = devolvido;
	}

	public String getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}

	public String getUnico() {
		return unico;
	}

	public void setUnico(String unico) {
		this.unico = unico;
	}

	public String getSequencial() {
		return sequencial;
	}

	public void setSequencial(String sequencial) {
		this.sequencial = sequencial;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public String getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	
	@XmlElement(name = "TP_IMOVEL")
	private String getTipoImovelCodigo() {
		return this.tipoImovel.getCodigo();
	}

	private void setTipoImovelCodigo(String codigo) {
		this.tipoImovel.setCodigo(codigo);
	}
	
	
}
