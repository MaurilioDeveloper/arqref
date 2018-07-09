package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ENDERECO_NACIONAL")
@XmlSeeAlso({ EnderecoNacionalComplemento.class })
@XmlType(propOrder={"ocorrencia","produto","contrato" ,"tipoLogradouro", "nomeLogradouro", "numeroLogradouro", 
		"nomeComplementoLogradouro", "nomeBairro", "numeroMunicipio", "nomeMunicipio", "numeroCEP", 
		"siglaUF", "indicadorFinalidade", "indicadorCorrespondencia", "indicadorPropaganda", "enderecoNacionalComplemento","tipo"})
public class EnderecoNacional implements Serializable {

	private static final long serialVersionUID = -2173113517989206422L;
	
	private String ocorrencia;
	
	private String produto;
	
	private String contrato;
	
	private String tipoLogradouro;
	
	private String nomeLogradouro;
	
	private Integer numeroLogradouro;
	
	private String nomeComplementoLogradouro;
	
	private String nomeBairro;
	
	private String numeroMunicipio;
	
	private String nomeMunicipio;
	
	private String numeroCEP;
	
	private String siglaUF;

	private Integer indicadorFinalidade;
	
	private String indicadorCorrespondencia;

	private String indicadorPropaganda;
	
	private EnderecoNacionalComplemento enderecoNacionalComplemento;
	
	
	private String tipo = "G";	//Sempre pesguisa pelo tipo GENERICO
	
	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}
	@XmlElement(name="CONTRATO")
	public String getContrato() {
		return contrato;
	}

	@XmlElement(name="TP_LOGRADOURO")
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	@XmlElement(name="LOGRADOURO")
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	@XmlElement(name="NUMERO")
	public Integer getNumeroLogradouro() {
		return numeroLogradouro;
	}
	
	@XmlElement(name="COMPLEMENTO")
	public String getNomeComplementoLogradouro() {
		return nomeComplementoLogradouro;
	}
	
	@XmlElement(name="BAIRRO")
	public String getNomeBairro() {
		return nomeBairro;
	}
	
	@XmlElement(name="MUNICIPIO")
	public String getNumeroMunicipio() {
		return numeroMunicipio;
	}
	
	@XmlElement(name="NOME_MUNICIPIO")
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	@XmlElement(name="CEP")
	public String getNumeroCEP() {
		return numeroCEP;
	}
	
	@XmlElement(name="UF")
	public String getSiglaUF() {
		return siglaUF;
	}
	
	@XmlElement(name="FLAG_FINALIDADE")
	public Integer getIndicadorFinalidade() {
		return indicadorFinalidade;
	}
	
	@XmlElement(name="FLAG_CORRESPONDENCIA")
	public String getIndicadorCorrespondencia() {
		return indicadorCorrespondencia;
	}
	
	@XmlElement(name="FLAG_PROPAGANDA")
	public String getIndicadorPropaganda() {
		return indicadorPropaganda;
	}

	@XmlElement(name="ENDERECO_NACIONAL_COMP")
	public EnderecoNacionalComplemento getEnderecoNacionalComplemento() {
		return enderecoNacionalComplemento;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public void setNumeroLogradouro(Integer numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public void setNomeComplementoLogradouro(String nomeComplementoLogradouro) {
		this.nomeComplementoLogradouro = nomeComplementoLogradouro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public void setNumeroMunicipio(String numeroMunicipio) {
		this.numeroMunicipio = numeroMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public void setNumeroCEP(String numeroCEP) {
		this.numeroCEP = numeroCEP;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	public void setIndicadorFinalidade(Integer indicadorFinalidade) {
		this.indicadorFinalidade = indicadorFinalidade;
	}

	public void setIndicadorCorrespondencia(String indicadorCorrespondencia) {
		this.indicadorCorrespondencia = indicadorCorrespondencia;
	}

	public void setIndicadorPropaganda(String indicadorPropaganda) {
		this.indicadorPropaganda = indicadorPropaganda;
	}

	public void setEnderecoNacionalComplemento(EnderecoNacionalComplemento enderecoNacionalComplemento) {
		this.enderecoNacionalComplemento = enderecoNacionalComplemento;
	}

	@XmlElement(name="TIPO")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
