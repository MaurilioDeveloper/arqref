package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="ENDERECO")
@XmlSeeAlso({ Contatos.class })
@XmlType(propOrder={"numeroCEP", "nomeLogradouro", "numeroLogradouro", "nomeComplementoLogradouro", 
		"nomeBairro", "numeroMunicipio", "siglaUF", "numeroSituacaoResidencia", "nomeMunicipio", "numeroCEP2", "contatos"})
public class Endereco implements Serializable {

	private static final long serialVersionUID = -2173113517989206422L;
	
	@Tamanho(tamanho = 8)
	private String numeroCEP;
	
	@Tamanho(tamanho = 50)
	private String nomeLogradouro;
	
	@Tamanho(tamanho = 4)
	private String numeroLogradouro;
	
	@Tamanho(tamanho = 20)
	private String nomeComplementoLogradouro;
	
	@Tamanho(tamanho = 20)
	private String nomeBairro;
	
	@Tamanho(tamanho = 6)
	private String numeroMunicipio;
	
	@Tamanho(tamanho = 2)
	private String siglaUF;
	
	@Tamanho(tamanho = 2)
	private String numeroSituacaoResidencia;
	
	@Tamanho(tamanho = 35)
	private String nomeMunicipio;
	
	@Tamanho(tamanho = 9)
	private String numeroCEP2;
	
	private Contatos contatos;
	
	
	@XmlElement(name="CEP")
	public String getNumeroCEP() {
		if(numeroCEP!=null)
			return numeroCEP.trim();
		return numeroCEP;
	}
	public void setNumeroCEP(String numeroCEP) {
		this.numeroCEP = numeroCEP;
	}
	@XmlElement(name="LOGRADOURO")
	public String getNomeLogradouro() {
		if(nomeLogradouro!=null)
			return nomeLogradouro.trim();
		return nomeLogradouro;
	}
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	@XmlElement(name="NUMERO")
	public String getNumeroLogradouro() {
		if(numeroLogradouro!=null)
			return numeroLogradouro.trim();
		return numeroLogradouro;
	}
	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}
	@XmlElement(name="COMPLEMENTO")
	public String getNomeComplementoLogradouro() {
		if(nomeComplementoLogradouro!=null)
			return nomeComplementoLogradouro.trim();
		return nomeComplementoLogradouro;
	}
	public void setNomeComplementoLogradouro(String nomeComplementoLogradouro) {
		this.nomeComplementoLogradouro = nomeComplementoLogradouro;
	}
	@XmlElement(name="BAIRRO")
	public String getNomeBairro() {
		if(nomeBairro!=null)
			return nomeBairro.trim();
		return nomeBairro;
	}
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	@XmlElement(name="MUNICIPIO")
	public String getNumeroMunicipio() {
		if(numeroMunicipio!=null)
			return numeroMunicipio.trim();
		return numeroMunicipio;
	}
	public void setNumeroMunicipio(String numeroMunicipio) {
		this.numeroMunicipio = numeroMunicipio;
	}
	@XmlElement(name="UF")
	public String getSiglaUF() {
		if(siglaUF!=null)
			return siglaUF.trim();
		return siglaUF;
	}
	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}
	@XmlElement(name="SITUACAO_RESIDENCIA")
	public String getNumeroSituacaoResidencia() {
		if(numeroSituacaoResidencia!=null)
			return numeroSituacaoResidencia.trim();
		return numeroSituacaoResidencia;
	}
	public void setNumeroSituacaoResidencia(String numeroSituacaoResidencia) {
		this.numeroSituacaoResidencia = numeroSituacaoResidencia;
	}
	@XmlElement(name="CONTATOS")
	public Contatos getContatos() {
		return contatos;
	}
	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}
	public String getNumeroCEP2() {
		return numeroCEP2;
	}
	public void setNumeroCEP2(String numeroCEP2) {
		this.numeroCEP2 = numeroCEP2;
	}
	
}
