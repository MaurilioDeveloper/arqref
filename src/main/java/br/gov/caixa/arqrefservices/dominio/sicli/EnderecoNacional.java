package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "ENDERECO_NACIONAL")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlSeeAlso({ EnderecoNacionalComplemento.class })
@XmlType(propOrder = { "ocorencia", "produto", "contrato", "tipoLogradouro", "logradouro", "numero", "complemento",
		"bairro", "municipio", "nomeMunicipio", "cep", "uf", "flagFinalidade", "flagCorrepondencia", "flagPropaganda",
		"enderecoNacionalComplemento"})
public class EnderecoNacional implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4205907339598025484L;

	private String ocorencia;

	private String produto;

	private String contrato;

	private String tipoLogradouro;

	private String logradouro;

	private String numero;

	private String complemento;

	private String bairro;

	private String municipio;

	private String nomeMunicipio;

	private String cep;

	private String uf;

	private String flagFinalidade;

	private String flagCorrepondencia;

	private String flagPropaganda;

	private List<EnderecoNacionalComplemento> enderecoNacionalComplemento;

	@XmlElement(name = "OCORRENCIA")
	public String getOcorencia() {
		return ocorencia;
	}

	public void setOcorencia(String ocorencia) {
		this.ocorencia = ocorencia;
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

	@XmlElement(name = "TP_LOGRADOURO")
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
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

	@XmlElement(name = "MUNICIPIO")
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@XmlElement(name = "NOME_MUNICIPIO")
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	@XmlElement(name = "CEP")
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@XmlElement(name = "UF")
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@XmlElement(name = "FLAG_FINALIDADE")
	public String getFlagFinalidade() {
		return flagFinalidade;
	}

	public void setFlagFinalidade(String flagFinalidade) {
		this.flagFinalidade = flagFinalidade;
	}

	@XmlElement(name = "FLAG_CORRESPONDENCIA")
	public String getFlagCorrepondencia() {
		return flagCorrepondencia;
	}

	public void setFlagCorrepondencia(String flagCorrepondencia) {
		this.flagCorrepondencia = flagCorrepondencia;
	}

	@XmlElement(name = "FLAG_PROPAGANDA")
	public String getFlagPropaganda() {
		return flagPropaganda;
	}

	public void setFlagPropaganda(String flagPropaganda) {
		this.flagPropaganda = flagPropaganda;
	}

	@XmlElement(name = "ENDERECO_NACIONAL_COMP")
	public List<EnderecoNacionalComplemento> getEnderecoNacionalComplemento() {
		return enderecoNacionalComplemento;
	}

	public void setEnderecoNacionalComplemento(List<EnderecoNacionalComplemento> enderecoNacionalComplemento) {
		this.enderecoNacionalComplemento = enderecoNacionalComplemento;
	}

	@Override
	public String toString() {
		return "EnderecoNacional [ocorencia=" + ocorencia + ", produto=" + produto + ", tipoLogradouro="
				+ tipoLogradouro + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", municipio=" + municipio + ", nomeMunicipio=" + nomeMunicipio + ", cep="
				+ cep + ", uf=" + uf + ", flagFinalidade=" + flagFinalidade + ", flagCorrepondencia="
				+ flagCorrepondencia + ", flagPropaganda=" + flagPropaganda + "]";
	}

}
