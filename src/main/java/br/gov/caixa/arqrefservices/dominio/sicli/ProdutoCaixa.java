package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="PRODUTO_CAIXA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ProdutoCaixa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6071807750842897159L;

	private String produto;
	
	private String contrato;
	
	private String flagTitular;
	
	private String dataInicioAtividade;
	
	private String dataFimAtividade;
	
	private String agencia;
	
	private String tipoContrato;
	
	private String flagSituacao;
	
	private String dataAlteracao;
	
	private String caracterizacao;
	
	private String correspondenteNegocial;
	
	private String canal;
	
	//USADO SOMENTE PELO SIAPX
	private String tipoConta;

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name="CONTRATO")
	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@XmlElement(name="FLAG_TITULAR")
	public String getFlagTitular() {
		return flagTitular;
	}

	public void setFlagTitular(String flagTitular) {
		this.flagTitular = flagTitular;
	}

	@XmlElement(name="DT_INICIO_ATIVIDADE")
	public String getDataInicioAtividade() {
		return dataInicioAtividade;
	}

	public void setDataInicioAtividade(String dataInicioAtividade) {
		this.dataInicioAtividade = dataInicioAtividade;
	}

	@XmlElement(name="DT_FIM_ATIVIDADE")
	public String getDataFimAtividade() {
		return dataFimAtividade;
	}

	public void setDataFimAtividade(String dataFimAtividade) {
		this.dataFimAtividade = dataFimAtividade;
	}

	@XmlElement(name="AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name="TP_CONTRATO")
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	@XmlElement(name="FLAG_SITUACAO")
	public String getFlagSituacao() {
		return flagSituacao;
	}

	public void setFlagSituacao(String flagSituacao) {
		this.flagSituacao = flagSituacao;
	}

	@XmlElement(name="DT_ALTERACAO")
	public String getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@XmlElement(name="CARACTERIZACAO")
	public String getCaracterizacao() {
		return caracterizacao;
	}

	public void setCaracterizacao(String caracterizacao) {
		this.caracterizacao = caracterizacao;
	}

	@XmlElement(name="CORRESPONDENTE_NEGOCIAL")
	public String getCorrespondenteNegocial() {
		return correspondenteNegocial;
	}

	public void setCorrespondenteNegocial(String correspondenteNegocial) {
		this.correspondenteNegocial = correspondenteNegocial;
	}

	@XmlElement(name="CANAL")
	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}
	
	
	@XmlAttribute(name="TIPO-CONTA")
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	@Override
	public String toString() {
		return "ProdutoCaixa [produto=" + produto + ", contrato=" + contrato
				+ ", flagTitular=" + flagTitular + ", dataInicioAtividade="
				+ dataInicioAtividade + ", dataFimAtividade="
				+ dataFimAtividade + ", agencia=" + agencia + ", tipoContrato="
				+ tipoContrato + ", flagSituacao=" + flagSituacao
				+ ", dataAlteracao=" + dataAlteracao + ", caracterizacao="
				+ caracterizacao + ", correspondenteNegocial="
				+ correspondenteNegocial + ", canal=" + canal + "]";
	}
	
	

}
