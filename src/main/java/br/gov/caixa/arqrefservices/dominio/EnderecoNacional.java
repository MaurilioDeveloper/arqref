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
@XmlRootElement(name="ENDERECO_NACIONAL")
public class EnderecoNacional implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3077747564994372029L;

	private String ocorrencia;
	
	private Produto produto = new Produto();
	
	private Contrato contrato = new Contrato();
	
	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private String numero;
	
	private Municipio municipio = new Municipio();
	
	private String cep;
	
	private UF uf = new UF();
	
	private String filler;
	
	private String finalidade;
	
	private String correspondencia;
	
	private String complemento;
	
	private String bairro;
	
	private String propaganda;
	
	@XmlElement(name="TIPO")
	private String tipo;

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

	private void setProdutoCodigo(String codigo) {
		this.produto.setCodigo(codigo);
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

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	@XmlElement(name = "LOGRADOURO")
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@XmlElement(name = "NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
//	@XmlElement(name = "MUNICIPIO")
//	private String getMunicipioCodigo() {
//		return this.municipio.getCodigoIBGE();
//	}
//
//	private void setMunicipioCodigo(String descricao) {
//		this.municipio.setCodigoIBGE(descricao);
//	}
//	@XmlElement(name = "NOME_MUNICIPIO")
//	private String getMunicipioDescricao() {
//		return this.municipio.getDescricao();
//	}
//
//	private void setMunicipioDescricao(String descricao) {
//		this.municipio.setDescricao(descricao);
//	}
	

	@XmlElement(name = "CEP")
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
//	@XmlElement(name = "UF")
//	private String getUfCodigo() {
//		return this.uf.getCodigo();
//	}
//
//	private void setUfCodigo(String codigo) {
//		this.uf.setCodigo(codigo);
//	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@XmlElement(name = "FLAG_FINALIDADE")
	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	@XmlElement(name = "FLAG_CORRESPONDENCIA")
	public String getCorrespondencia() {
		return correspondencia;
	}

	public void setCorrespondencia(String correspondencia) {
		this.correspondencia = correspondencia;
	}

	@XmlElement(name = "COMPLEMENTO")
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@XmlElement(name = "BAIRRO")
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@XmlElement(name = "FLAG_PROPAGANDA")
	public String getPropaganda() {
		return propaganda;
	}

	public void setPropaganda(String propaganda) {
		this.propaganda = propaganda;
	}
	
	
}
