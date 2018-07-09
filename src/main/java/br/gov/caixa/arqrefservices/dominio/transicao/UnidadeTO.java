package br.gov.caixa.arqrefservices.dominio.transicao;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.gov.caixa.arqrefservices.dominio.Municipio;
import br.gov.caixa.arqrefservices.dominio.TipoUnidade;
import br.gov.caixa.arqrefservices.dominio.UF;
import br.gov.caixa.arqrefservices.dominio.Unidade;
/**
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 * USA A VIEW FECVW002_UNIDADE   
 *
 */
@Entity
@Table(name="FECVW002_UNIDADE")
public class UnidadeTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8956861123902519968L;

	@Id
	@Column(name="NU_UNIDADE")
	private Integer numeroUnidade;
	
	@Column(name="NU_NATURAL")
	private Integer numeroNatural;
	
	@Column(name="NU_DV_NU_UNIDADE")
	private Integer digitoUnidade;
	
	@Column(name="NO_UNIDADE")
	private String nomeUnidade;
	
	@Column(name="SG_UNIDADE")
	private String siglaUnidade;
	
	@Column(name="NU_CGC_UNIDADE")
	private BigDecimal cnpj;
	
	@Column(name="NU_DV_CGC")
	private Integer digitoCnpj;
	
	@Column(name="IC_MOVIMENTACAO")
	private String indicativoMovimentacao;
	
	@Column(name="IC_CGC_PROPRIO")
	private String indicativoCNPJ;
	
	@Column(name="IC_DISPONIBILIDADE")
	private String indicativoDisponibilidade;
	
	@Column(name="IC_PIONEIRA_PV")
	private String indicativoPioneira;
	
	@Column(name="IC_ULTIMA_SITUACAO")
	private String indiUltimaSituacao;

	@Column(name="DT_INICIO")
	private String dataInicio;
	
	@Column(name="DT_FIM")
	private String dataFim;
	
	@Column(name="NU_TP_UNIDADE_U21")
	private Integer numeroTipoUnidade;
	
	@Column(name="NU_LOCALIDADE_L10")
	private Integer numeroLocalidade;
	
	@Column(name="SG_UF_L22")
	private String siglaUF;
	
	@Column(name="SG_LOCALIZACAO")
	private String siglaLocalizacao;
	
	@Column(name="NU_UF_IBGE_L98")
	private Integer numeroUFIBGE;
	
	@Column(name="NU_MNCPO_IBGE_L98")
	private Integer numeroMunicipioIBGE;

	@Column(name="NU_DV_IBGE_L98")
	private Integer digitoIBGE;	
	
	@Column(name="CO_SGMNO_ATVDE_U40")
	private String codigoSGMO;
	
	@Column(name="CO_INSCO_MNCPL")
	private String codigoInscricaoMunicipal;	
	
//	@Column(name="NO_MUNICIPIO")
//	private String descricaoMunicipio;

	
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


	public void BigDecimal(BigDecimal cnpj) {
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

//	public String getDescricaoMunicipio() {
//		return descricaoMunicipio;
//	}
//
//
//	public void setDescricaoMunicipio(String descricaoMunicipio) {
//		this.descricaoMunicipio = descricaoMunicipio;
//	}


	public void setCnpj(BigDecimal cnpj) {
		this.cnpj = cnpj;
	}


	/**
	 * Metodo que retorna a unidade convertida
	 * 
	 * @return
	 */
	public Unidade getUnidade() {
		Unidade unidade = new Unidade();
		unidade.setCodigoInscricaoMunicipal(codigoInscricaoMunicipal);
		unidade.setCodigoSGMO(codigoSGMO);
		unidade.setCnpj(cnpj);
		unidade.setDigitoCnpj(digitoCnpj);
		unidade.setDataFim(dataFim);
		unidade.setDataInicio(dataInicio);
		unidade.setDigitoUnidade(digitoUnidade);
		unidade.setIndicativoCNPJ(indicativoCNPJ);
		unidade.setIndicativoDisponibilidade(indicativoDisponibilidade);
		unidade.setIndicativoMovimentacao(indicativoMovimentacao);
		unidade.setIndicativoPioneira(indicativoPioneira);
		unidade.setIndiUltimaSituacao(indiUltimaSituacao);
		unidade.setNomeUnidade(nomeUnidade);
		unidade.setNumeroNatural(numeroNatural);
		unidade.setNumeroTipoUnidade(numeroTipoUnidade);
		unidade.setNumeroUnidade(numeroUnidade);
		unidade.setSiglaUnidade(siglaUnidade);
		
		//Tipo da Unidade
		TipoUnidade tipoUnidade = new TipoUnidade();
		tipoUnidade.setCodigo(numeroTipoUnidade);
		
		unidade.setTipoUnidade(tipoUnidade);
		
		//UF
		UF uf = new UF();		
		uf.setNumeroUFIBGE(numeroUFIBGE);		
		uf.setSiglaUF(siglaUF);
		
		unidade.setUf(uf);		
		
		//MUNICIPIO
		Municipio municipio = new Municipio();
		municipio.setNumeroMunicipioIBGE(numeroMunicipioIBGE);
		municipio.setSiglaLocalidade(siglaLocalizacao);
		municipio.setNumeroLocalidade(numeroLocalidade);
		municipio.setNumeroDVIBGE(digitoIBGE);
//		municipio.setDescricaoMunicipio(descricaoMunicipio);
		
		unidade.setMunicipio(municipio);
		
		
		
	
		return unidade;
	}
	
	
	
	@Override
	public String toString() {
		return "UnidadeTO [numeroUnidade=" + numeroUnidade + ", numeroNatural="
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
				+ codigoInscricaoMunicipal + "]";
	}


	
	
	
	
	
	
}
