package br.gov.caixa.arqrefservices.dominio.serpro.incluirContrato;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class IncluirContratoSaidaTO implements Serializable {


	private static final long serialVersionUID = 925496319863446780L;

	/**
	 *  Nome do servidor, tamanho variavel.
	 */
	private String nmServ;
	
	/**
	 * Banco do Servidor, tamanho variavel.
	 */
	private String cdBcoServ;
	
	/**
	 * Agencia do Servidor, tamanho variavel.
	 */
	private String cdAgeServ;
	
	/**
	 * Conta do Servidor, tamanho variavel.
	 */
	private String cdCcsServ;
	
	/**
	 * Situação do Servidor, alfa(40).
	 */
	private String inSitServ;
	
	/**
	 * Classificação do Servidor, alfa(40).
	 */
	private String inClassServ;
	
	/**
	 * Link arquivo no formato JPG, tamanho variavel.
	 */
	private String imFoto;
	
	/**
	 * Gerado pelo sistema, se não informado, alfa(20).
	 */
	private String nrContrato;
	
	/**
	 * Valor do desconto, numerico(13,2).
	 */
	private String vlBruto;
	
	/**
	 * Número da sequência do contrato, numerico(1).
	 */
	private String seqContrato;
	
	/**
	 * Ano/mês do primeiro desconto do contrato, gerado pelo sistema se não informado 
	 * a partir das datas vigentes no momento da operação.
	 */
	private String dtPrimDesc;
	
	/**
	 * Data de operação do contrato, gerado pelo SCA se não informado 
	 * a partir das datas vigentes no momento da operação. 
	 * Numerico(8).
	 */
	private String dataOperacao;
	
	/**
	 * Codigo de Retorno, numerico(4).
	 */
	private String cdRetCode;
	
	/**
	 * Mensagem de Retorno, alfa(220).
	 */
	private String dsRetCode;

	@XmlElement(name="nm_serv")
	public String getNmServ() {
		return nmServ;
	}
	public void setNmServ(String nmServ) {
		this.nmServ = nmServ;
	}
	@XmlElement(name="cd_bco_serv")
	public String getCdBcoServ() {
		return cdBcoServ;
	}
	public void setCdBcoServ(String cdBcoServ) {
		this.cdBcoServ = cdBcoServ;
	}
	@XmlElement(name="cd_age_serv")
	public String getCdAgeServ() {
		return cdAgeServ;
	}
	public void setCdAgeServ(String cdAgeServ) {
		this.cdAgeServ = cdAgeServ;
	}
	@XmlElement(name="cd_ccs_serv")
	public String getCdCcsServ() {
		return cdCcsServ;
	}
	public void setCdCcsServ(String cdCcsServ) {
		this.cdCcsServ = cdCcsServ;
	}
	@XmlElement(name="in_sit_serv")
	public String getInSitServ() {
		return inSitServ;
	}
	public void setInSitServ(String inSitServ) {
		this.inSitServ = inSitServ;
	}
	@XmlElement(name="in_class_serv")
	public String getInClassServ() {
		return inClassServ;
	}
	public void setInClassServ(String inClassServ) {
		this.inClassServ = inClassServ;
	}
	@XmlElement(name="im_foto")
	public String getImFoto() {
		return imFoto;
	}
	public void setImFoto(String imFoto) {
		this.imFoto = imFoto;
	}
	@XmlElement(name="nr_contrato")
	public String getNrContrato() {
		return nrContrato;
	}
	public void setNrContrato(String nrContrato) {
		this.nrContrato = nrContrato;
	}
	@XmlElement(name="vl_bruto")
	public String getVlBruto() {
		return vlBruto;
	}
	public void setVlBruto(String vlBruto) {
		this.vlBruto = vlBruto;
	}
	@XmlElement(name="seq_contrato")
	public String getSeqContrato() {
		return seqContrato;
	}
	public void setSeqContrato(String seqContrato) {
		this.seqContrato = seqContrato;
	}
	@XmlElement(name="dt_prim_desc")
	public String getDtPrimDesc() {
		return dtPrimDesc;
	}
	public void setDtPrimDesc(String dtPrimDesc) {
		this.dtPrimDesc = dtPrimDesc;
	}
	@XmlElement(name="data_operacao")
	public String getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	@XmlElement(name="ds_ret_code")
	public String getDsRetCode() {
		return dsRetCode;
	}
	public void setDsRetCode(String dsRetCode) {
		this.dsRetCode = dsRetCode;
	}
	@XmlElement(name="cd_ret_code")
	public String getCdRetCode() {
		return cdRetCode;
	}
	public void setCdRetCode(String cdRetCode) {
		this.cdRetCode = cdRetCode;
	}
}
