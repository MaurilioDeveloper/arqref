package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * Clase representa objeto de dominio Municipio com os dados IBGE
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8849990850668164107L;

	private Integer numeroMunicipioIBGE;

	private Integer numeroDVIBGE;

	private Integer numeroLocalidade;

	private String siglaLocalidade;
	
	private String descricaoMunicipio;

	public Integer getNumeroMunicipioIBGE() {
		return numeroMunicipioIBGE;
	}

	public void setNumeroMunicipioIBGE(Integer numeroMunicipioIBGE) {
		this.numeroMunicipioIBGE = numeroMunicipioIBGE;
	}

	public Integer getNumeroDVIBGE() {
		return numeroDVIBGE;
	}

	public void setNumeroDVIBGE(Integer numeroDVIBGE) {
		this.numeroDVIBGE = numeroDVIBGE;
	}

	public Integer getNumeroLocalidade() {
		return numeroLocalidade;
	}

	public void setNumeroLocalidade(Integer numeroLocalidade) {
		this.numeroLocalidade = numeroLocalidade;
	}

	public String getSiglaLocalidade() {
		return siglaLocalidade;
	}

	public void setSiglaLocalidade(String siglaLocalidade) {
		this.siglaLocalidade = siglaLocalidade;
	}
	
	public String getDescricaoMunicipio() {
		return descricaoMunicipio;
	}

	public void setDescricaoMunicipio(String descricaoMunicipio) {
		this.descricaoMunicipio = descricaoMunicipio;
	}

	@Override
	public String toString() {
		return "Municipio [numeroMunicipioIBGE=" + numeroMunicipioIBGE
				+ ", numeroDVIBGE=" + numeroDVIBGE + ", numeroLocalidade="
				+ numeroLocalidade + ", siglaLocalidade=" + siglaLocalidade
				+ ", descricaoMunicipio=" + descricaoMunicipio + "]";
	}

}
