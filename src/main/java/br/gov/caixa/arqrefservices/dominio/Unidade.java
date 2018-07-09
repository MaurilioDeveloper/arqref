package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 *          Unidade da Caixa Economica Federal objeto de dominio. Usado com
 *          objeto de transicao para consulta FECVW002_UNIDADE
 * 
 */

public class Unidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8956861123902519968L;

	private Integer numeroUnidade;

	private Integer numeroNatural;

	private Integer digitoUnidade;

	private String nomeUnidade;

	private String siglaUnidade;

	private BigDecimal cnpj;

	private Integer digitoCnpj;

	private String indicativoMovimentacao;

	private String indicativoCNPJ;

	private String indicativoDisponibilidade;

	private String indicativoPioneira;

	private String indiUltimaSituacao;

	private String dataInicio;

	private String dataFim;

	private Integer numeroTipoUnidade;

	private Integer numeroLocalidade;

	private String siglaUF;

	private String siglaLocalizacao;

	private Integer numeroUFIBGE;

	private Integer numeroMunicipioIBGE;

	private Integer digitoIBGE;

	private String codigoSGMO;

	private String codigoInscricaoMunicipal;

	private UF uf;

	private Unidade superintendenciaRegional;
	
	private Municipio municipio;
	
	private TipoUnidade tipoUnidade;

	public Integer getNumeroUnidade() {
		return numeroUnidade;
	}

	public void setNumeroUnidade(Integer numeroUnidade) {
		this.numeroUnidade = numeroUnidade;
	}

	public Integer getNumeroNatural() {
		return numeroNatural;
	}

	public void setNumeroNatural(Integer numeroNatural) {
		this.numeroNatural = numeroNatural;
	}

	public Integer getDigitoUnidade() {
		return digitoUnidade;
	}

	public void setDigitoUnidade(Integer digitoUnidade) {
		this.digitoUnidade = digitoUnidade;
	}

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	public String getSiglaUnidade() {
		return siglaUnidade;
	}

	public void setSiglaUnidade(String siglaUnidade) {
		this.siglaUnidade = siglaUnidade;
	}

	public BigDecimal getCnpj() {
		return cnpj;
	}

	public void setCnpj(BigDecimal cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getDigitoCnpj() {
		return digitoCnpj;
	}

	public void setDigitoCnpj(Integer digitoCnpj) {
		this.digitoCnpj = digitoCnpj;
	}

	public String getIndicativoMovimentacao() {
		return indicativoMovimentacao;
	}

	public void setIndicativoMovimentacao(String indicativoMovimentacao) {
		this.indicativoMovimentacao = indicativoMovimentacao;
	}

	public String getIndicativoCNPJ() {
		return indicativoCNPJ;
	}

	public void setIndicativoCNPJ(String indicativoCNPJ) {
		this.indicativoCNPJ = indicativoCNPJ;
	}

	public String getIndicativoDisponibilidade() {
		return indicativoDisponibilidade;
	}

	public void setIndicativoDisponibilidade(String indicativoDisponibilidade) {
		this.indicativoDisponibilidade = indicativoDisponibilidade;
	}

	public String getIndicativoPioneira() {
		return indicativoPioneira;
	}

	public void setIndicativoPioneira(String indicativoPioneira) {
		this.indicativoPioneira = indicativoPioneira;
	}

	public String getIndiUltimaSituacao() {
		return indiUltimaSituacao;
	}

	public void setIndiUltimaSituacao(String indiUltimaSituacao) {
		this.indiUltimaSituacao = indiUltimaSituacao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public Integer getNumeroTipoUnidade() {
		return numeroTipoUnidade;
	}

	public void setNumeroTipoUnidade(Integer numeroTipoUnidade) {
		this.numeroTipoUnidade = numeroTipoUnidade;
	}

	public Integer getNumeroLocalidade() {
		return numeroLocalidade;
	}

	public void setNumeroLocalidade(Integer numeroLocalidade) {
		this.numeroLocalidade = numeroLocalidade;
	}

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	public String getSiglaLocalizacao() {
		return siglaLocalizacao;
	}

	public void setSiglaLocalizacao(String siglaLocalizacao) {
		this.siglaLocalizacao = siglaLocalizacao;
	}

	public Integer getNumeroUFIBGE() {
		return numeroUFIBGE;
	}

	public void setNumeroUFIBGE(Integer numeroUFIBGE) {
		this.numeroUFIBGE = numeroUFIBGE;
	}

	public Integer getNumeroMunicipioIBGE() {
		return numeroMunicipioIBGE;
	}

	public void setNumeroMunicipioIBGE(Integer numeroMunicipioIBGE) {
		this.numeroMunicipioIBGE = numeroMunicipioIBGE;
	}

	public Integer getDigitoIBGE() {
		return digitoIBGE;
	}

	public void setDigitoIBGE(Integer digitoIBGE) {
		this.digitoIBGE = digitoIBGE;
	}

	public String getCodigoSGMO() {
		return codigoSGMO;
	}

	public void setCodigoSGMO(String codigoSGMO) {
		this.codigoSGMO = codigoSGMO;
	}

	public String getCodigoInscricaoMunicipal() {
		return codigoInscricaoMunicipal;
	}

	public void setCodigoInscricaoMunicipal(String codigoInscricaoMunicipal) {
		this.codigoInscricaoMunicipal = codigoInscricaoMunicipal;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public Unidade getSuperintendenciaRegional() {
		return superintendenciaRegional;
	}

	public void setSuperintendenciaRegional(Unidade superintendenciaRegional) {
		this.superintendenciaRegional = superintendenciaRegional;
	}
	
	
	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}
	
	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return "Unidade [numeroUnidade=" + numeroUnidade + ", numeroNatural="
				+ numeroNatural + ", digitoUnidade=" + digitoUnidade
				+ ", nomeUnidade=" + nomeUnidade + ", siglaUnidade="
				+ siglaUnidade + ", cnpj=" + cnpj + ", digitoCnpj="
				+ digitoCnpj + ", indicativoMovimentacao="
				+ indicativoMovimentacao + ", indicativoCNPJ=" + indicativoCNPJ
				+ ", indicativoDisponibilidade=" + indicativoDisponibilidade
				+ ", indicativoPioneira=" + indicativoPioneira
				+ ", indiUltimaSituacao=" + indiUltimaSituacao
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", numeroTipoUnidade=" + numeroTipoUnidade
				+ ", numeroLocalidade=" + numeroLocalidade + ", siglaUF="
				+ siglaUF + ", siglaLocalizacao=" + siglaLocalizacao
				+ ", numeroUFIBGE=" + numeroUFIBGE + ", numeroMunicipioIBGE="
				+ numeroMunicipioIBGE + ", digitoIBGE=" + digitoIBGE
				+ ", codigoSGMO=" + codigoSGMO + ", codigoInscricaoMunicipal="
				+ codigoInscricaoMunicipal + ", uf=" + uf
				+ ", superintendenciaRegional=" + superintendenciaRegional
				+ ", municipio=" + municipio + ", tipoUnidade=" + tipoUnidade
				+ "]";
	}

}
