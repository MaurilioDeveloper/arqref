package br.gov.caixa.arqrefservices.dominio.serpro.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dados_autorizacao")
public class DadosAutorizacao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6223128271094472100L;
	
	/**
	 * código da consignatária da autorização
	 */
	private String cdConsig;
	/**
	 * Desc. da consignatária da autorização.
	 */
	private String dsConsig;
	/**
	 * Prazo da autorização 
	 */
	private String prazo;
	
	/**
	 * Data da Operação da autorização.
	 */
	private String dtOperacao;
	
	/**
	 *  Data do primeiro desconto da autorização
	 */
	private String dtPrimDesc;
	/**
	 * data do último desconto da autorização
	 * 
	 */
	private String dtUltDesc;
	
	/**
	 * Valor do desconto da autorização
	 * 
	 */
	private String vlDesconto;
	
	/**
	 * Número da operação
	 */
	private String nrExterno;
	
	/**
	 * Código da situação da autorizada
	 */
	private String cdSituacao;
	
	/**
	 * Descrição da situação da autorizada
	 */
	private String dsSituacao;
	
	/**
	 * Código do convênio da autorização
	 */
	private String cdConvenio;
	
	/**
	 * Descrição do convênio da autorização
	 */
	private String dsConvenio;
	
	/**
	 * Descrição Livre
	 */
	private String dsAuto;

	
	@XmlElement(name="cd_consig")
	public String getCdConsig() {
		return cdConsig;
	}

	public void setCdConsig(String cdConsig) {
		this.cdConsig = cdConsig;
	}

	@XmlElement(name="ds_consig")
	public String getDsConsig() {
		return dsConsig;
	}

	public void setDsConsig(String dsConsig) {
		this.dsConsig = dsConsig;
	}

	@XmlElement(name="prazo")
	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	@XmlElement(name="dt_operacao")
	public String getDtOperacao() {
		return dtOperacao;
	}

	public void setDtOperacao(String dtOperacao) {
		this.dtOperacao = dtOperacao;
	}

	@XmlElement(name="dt_prim_desc")
	public String getDtPrimDesc() {
		return dtPrimDesc;
	}

	public void setDtPrimDesc(String dtPrimDesc) {
		this.dtPrimDesc = dtPrimDesc;
	}

	@XmlElement(name="dt_ult_desc")
	public String getDtUltDesc() {
		return dtUltDesc;
	}

	public void setDtUltDesc(String dtUltDesc) {
		this.dtUltDesc = dtUltDesc;
	}

	@XmlElement(name="vl_desconto")
	public String getVlDesconto() {
		return vlDesconto;
	}

	public void setVlDesconto(String vlDesconto) {
		this.vlDesconto = vlDesconto;
	}

	@XmlElement(name="nr_externo")
	public String getNrExterno() {
		return nrExterno;
	}

	public void setNrExterno(String nrExterno) {
		this.nrExterno = nrExterno;
	}

	@XmlElement(name="cd_situacao")
	public String getCdSituacao() {
		return cdSituacao;
	}

	public void setCdSituacao(String cdSituacao) {
		this.cdSituacao = cdSituacao;
	}

	@XmlElement(name="ds_situacao")
	public String getDsSituacao() {
		return dsSituacao;
	}

	public void setDsSituacao(String dsSituacao) {
		this.dsSituacao = dsSituacao;
	}

	@XmlElement(name="cd_convenio")
	public String getCdConvenio() {
		return cdConvenio;
	}

	public void setCdConvenio(String cdConvenio) {
		this.cdConvenio = cdConvenio;
	}

	@XmlElement(name="ds_convenio")
	public String getDsConvenio() {
		return dsConvenio;
	}

	public void setDsConvenio(String dsConvenio) {
		this.dsConvenio = dsConvenio;
	}

	@XmlElement(name="ds_auto")
	public String getDsAuto() {
		return dsAuto;
	}

	public void setDsAuto(String dsAuto) {
		this.dsAuto = dsAuto;
	}
	
	
	
}