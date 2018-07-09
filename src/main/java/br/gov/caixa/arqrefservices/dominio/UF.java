package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

/**
 * Clase representa objeto de dominio Unidade da Federacao com os dados IBGE
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
public class UF implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3560805318540217296L;

	private String siglaUF;

	private Integer numeroUFIBGE;

	private Integer digitoIBGE;

	private Municipio municipio;

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	public Integer getNumeroUFIBGE() {
		return numeroUFIBGE;
	}

	public void setNumeroUFIBGE(Integer numeroUFIBGE) {
		this.numeroUFIBGE = numeroUFIBGE;
	}

	public Integer getDigitoIBGE() {
		return digitoIBGE;
	}

	public void setDigitoIBGE(Integer digitoIBGE) {
		this.digitoIBGE = digitoIBGE;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return "UF [siglaUF=" + siglaUF + ", numeroUFIBGE=" + numeroUFIBGE
				+ ", digitoIBGE=" + digitoIBGE + ", municipio=" + municipio
				+ "]";
	}

}
