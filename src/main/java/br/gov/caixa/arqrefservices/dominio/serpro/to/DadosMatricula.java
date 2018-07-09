package br.gov.caixa.arqrefservices.dominio.serpro.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dados_matricula")
public class DadosMatricula implements Serializable {


	private static final long serialVersionUID = 925496319863446780L;

	/**
	 * Codigo do orgao, alfa(10).
	 */
	private String cdOrgao;

	/**
	 * CNPJ do orgao, numerico(15).
	 */
	private String nrCNPJOrgao;

	/**
	 * Matricula do servidor, alfa(13).
	 */
	private String cdMatricula;

	/**
	 * Identificacao unica, alfa(20).
	 */
	private String idUnica;

	/**
	 * Dados do instituidor, alfa(12).
	 */
	private String orgMatInst;

	/**
	 * Valor da margem consignavel, numerico(13,2).
	 */
	private String vlMargemConsig;

	/**
	 * Valor de Margem Utilizada, numerico(13,2).
	 */
	private String vlMargemUtiliz;

	/**
	 * Valor de Margem Disponível, numerico(13,2).
	 */
	private String vlMargemDisp;

	/**
	 * Valor de Margem Fixa, numerico(13,2).
	 */
	private String vlMargemFixa;

	/**
	 * Valor de Margem Variável, numerico(13,2).
	 */
	private String vlMargemVar;

	/**
	 * Valor de margem Disponível Fixa, numerico(13,2).
	 */
	private String vlMargemDispFixa;

	/**
	 * Ano/mês do primeiro desconto do contrato, numerico(6).
	 */
	private String dtPrimDesc;

	/**
	 * Código da UPAG, numerico(9).
	 */
	private String cdUpagServ;

	/**
	 * Código da UF da UPAG, alfa(2).
	 */
	private String cdUFUpagServ;

	/**
	 * Indicador de bloqueio judicial, alfa(1).
	 * Se houver algum contrato bloqueado por suspensão judicial da 
	 * matrícula/consignatária em questão o campo retornará ‘S’ caso contrário retornará branco.
	 */
	private String bloqueioJudicial;

	/**
	 * Código de Retorno da matricula, numerico(4).
	 */
	private String cdRetCodeMatricula;

	/**
	 * Mensagem de Retorno da matricula, alfa(220).
	 */
	private String dsRetCodeMatricula;

	@XmlElement(name="cd_orgao")
	public String getCdOrgao() {
		return cdOrgao;
	}

	public void setCdOrgao(String cdOrgao) {
		this.cdOrgao = cdOrgao;
	}
	
	@XmlElement(name="nr_cnpj_orgao")
	public String getNrCNPJOrgao() {
		return nrCNPJOrgao;
	}

	public void setNrCNPJOrgao(String nrCNPJOrgao) {
		this.nrCNPJOrgao = nrCNPJOrgao;
	}

	@XmlElement(name="cd_matricula")
	public String getCdMatricula() {
		return cdMatricula;
	}

	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	@XmlElement(name="id_unica")
	public String getIdUnica() {
		return idUnica;
	}

	public void setIdUnica(String idUnica) {
		this.idUnica = idUnica;
	}

	@XmlElement(name="org_mat_inst")
	public String getOrgMatInst() {
		return orgMatInst;
	}

	public void setOrgMatInst(String orgMatInst) {
		this.orgMatInst = orgMatInst;
	}

	@XmlElement(name="vl_margem_consig")
	public String getVlMargemConsig() {
		return vlMargemConsig;
	}

	public void setVlMargemConsig(String vlMargemConsig) {
		this.vlMargemConsig = vlMargemConsig;
	}

	@XmlElement(name="vl_margem_utiliz")
	public String getVlMargemUtiliz() {
		return vlMargemUtiliz;
	}

	public void setVlMargemUtiliz(String vlMargemUtiliz) {
		this.vlMargemUtiliz = vlMargemUtiliz;
	}

	@XmlElement(name="vl_margem_disp")
	public String getVlMargemDisp() {
		return vlMargemDisp;
	}

	public void setVlMargemDisp(String vlMargemDisp) {
		this.vlMargemDisp = vlMargemDisp;
	}

	@XmlElement(name="vl_margem_fixa")
	public String getVlMargemFixa() {
		return vlMargemFixa;
	}

	public void setVlMargemFixa(String vlMargemFixa) {
		this.vlMargemFixa = vlMargemFixa;
	}

	@XmlElement(name="vl_margem_var")
	public String getVlMargemVar() {
		return vlMargemVar;
	}

	public void setVlMargemVar(String vlMargemVar) {
		this.vlMargemVar = vlMargemVar;
	}

	@XmlElement(name="vl_margem_disp_fixa")
	public String getVlMargemDispFixa() {
		return vlMargemDispFixa;
	}

	public void setVlMargemDispFixa(String vlMargemDispFixa) {
		this.vlMargemDispFixa = vlMargemDispFixa;
	}

	@XmlElement(name="dt_prim_desc")
	public String getDtPrimDesc() {
		return dtPrimDesc;
	}

	public void setDtPrimDesc(String dtPrimDesc) {
		this.dtPrimDesc = dtPrimDesc;
	}

	@XmlElement(name="cd_upag_serv")
	public String getCdUpagServ() {
		return cdUpagServ;
	}

	public void setCdUpagServ(String cdUpagServ) {
		this.cdUpagServ = cdUpagServ;
	}

	@XmlElement(name="cd_uf_upag_serv")
	public String getCdUFUpagServ() {
		return cdUFUpagServ;
	}

	public void setCdUFUpagServ(String cdUFUpagServ) {
		this.cdUFUpagServ = cdUFUpagServ;
	}

	@XmlElement(name="bloqueio_judicial")
	public String getBloqueioJudicial() {
		return bloqueioJudicial;
	}

	public void setBloqueioJudicial(String bloqueioJudicial) {
		this.bloqueioJudicial = bloqueioJudicial;
	}

	@XmlElement(name="cd_ret_code_matricula")
	public String getCdRetCodeMatricula() {
		return cdRetCodeMatricula;
	}

	public void setCdRetCodeMatricula(String cdRetCodeMatricula) {
		this.cdRetCodeMatricula = cdRetCodeMatricula;
	}

	@XmlElement(name="ds_ret_code_matricula")
	public String getDsRetCodeMatricula() {
		return dsRetCodeMatricula;
	}

	public void setDsRetCodeMatricula(String dsRetCodeMatricula) {
		this.dsRetCodeMatricula = dsRetCodeMatricula;
	}
	
}
