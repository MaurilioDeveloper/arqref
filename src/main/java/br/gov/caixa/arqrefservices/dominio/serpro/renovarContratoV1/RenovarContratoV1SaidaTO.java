package br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoV1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RenovarContratoV1SaidaTO implements Serializable {


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
	 * Mantido para não quebrar interface. Sempre retorna vazio.
	 */
	private String imFoto;
	
	/**
	 * Gerado pelo sistema, se não informado, alfa(20).
	 */
	private String nrContrato;
	
	/**
	 * Número da sequência do contrato, numerico(1). Mantido para não quebrar
	 * interface. Sempre retorna vazio.
	 */
	private String seqContrato;
	
	/**
	 * Valor do desconto, numerico(13,2).
	 */
	private String vlBruto;
	
	
	/**
	 * Ano/mês do primeiro desconto do contrato, gerado pelo sistema, Numérico(6).
	 */
	private String dtPrimDesc;
	
	/**
	 * Data de operação do contrato. Numerico(8).
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
	@XmlElement(name="cd_bco_serv")
	public String getCdBcoServ() {
		return cdBcoServ;
	}
	@XmlElement(name="cd_age_serv")
	public String getCdAgeServ() {
		return cdAgeServ;
	}
	@XmlElement(name="cd_ccs_serv")
	public String getCdCcsServ() {
		return cdCcsServ;
	}
	@XmlElement(name="in_sit_serv")
	public String getInSitServ() {
		return inSitServ;
	}
	@XmlElement(name="in_class_serv")
	public String getInClassServ() {
		return inClassServ;
	}
	@XmlElement(name="im_foto")
	public String getImFoto() {
		return imFoto;
	}
	@XmlElement(name="nr_contrato")
	public String getNrContrato() {
		return nrContrato;
	}
	@XmlElement(name="vl_bruto")
	public String getVlBruto() {
		return vlBruto;
	}
	@XmlElement(name="seq_contrato")
	public String getSeqContrato() {
		return seqContrato;
	}
	@XmlElement(name="dt_prim_desc")
	public String getDtPrimDesc() {
		return dtPrimDesc;
	}
	@XmlElement(name="data_operacao")
	public String getDataOperacao() {
		return dataOperacao;
	}
	@XmlElement(name="ds_ret_code")
	public String getDsRetCode() {
		return dsRetCode;
	}
	@XmlElement(name="cd_ret_code")
	public String getCdRetCode() {
		return cdRetCode;
	}
	public void setNmServ(String nmServ) {
		this.nmServ = nmServ;
	}
	public void setCdBcoServ(String cdBcoServ) {
		this.cdBcoServ = cdBcoServ;
	}
	public void setCdAgeServ(String cdAgeServ) {
		this.cdAgeServ = cdAgeServ;
	}
	public void setCdCcsServ(String cdCcsServ) {
		this.cdCcsServ = cdCcsServ;
	}
	public void setInSitServ(String inSitServ) {
		this.inSitServ = inSitServ;
	}
	public void setInClassServ(String inClassServ) {
		this.inClassServ = inClassServ;
	}
	public void setImFoto(String imFoto) {
		this.imFoto = imFoto;
	}
	public void setNrContrato(String nrContrato) {
		this.nrContrato = nrContrato;
	}
	public void setVlBruto(String vlBruto) {
		this.vlBruto = vlBruto;
	}
	public void setSeqContrato(String seqContrato) {
		this.seqContrato = seqContrato;
	}
	public void setDtPrimDesc(String dtPrimDesc) {
		this.dtPrimDesc = dtPrimDesc;
	}
	public void setDataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	public void setDsRetCode(String dsRetCode) {
		this.dsRetCode = dsRetCode;
	}
	public void setCdRetCode(String cdRetCode) {
		this.cdRetCode = cdRetCode;
	}
}
