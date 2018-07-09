package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "PRODUTO")
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2378968374177521812L;

	private String codigo;
	
	private Contrato contrato = new Contrato();
	
	private String flagTitular;
	
	private String dataInicioAtividade;
	
	private String dataFimAtividade;
	
	private Agencia agencia = new Agencia();
	
	private String tipoContrato;
	
	private String flagSituacao;
	
	private String dataAlteracao;
	
	private String caracterizacao;
	
	private String correspondenteNegocial;
	
	private String canal;

	@XmlElement(name = "PRODUTO")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	@XmlElement(name = "CONTRATO")
	private String getContratoCodigo() {
		return this.contrato.getCodigo().toString();
	}

	private void setContratoCodigo(String contrato) {
		this.contrato.setCodigo(new BigInteger(contrato));
	}

	@XmlElement(name = "FLAG_TITULAR")
	public String getFlagTitular() {
		return flagTitular;
	}

	public void setFlagTitular(String flagTitular) {
		this.flagTitular = flagTitular;
	}

	@XmlElement(name = "DT_INICIO_ATIVIDADE")
	public String getDataInicioAtividade() {
		return dataInicioAtividade;
	}

	public void setDataInicioAtividade(String dataInicioAtividade) {
		this.dataInicioAtividade = dataInicioAtividade;
	}

	@XmlElement(name = "DT_FIM_ATIVIDADE")
	public String getDataFimAtividade() {
		return dataFimAtividade;
	}

	public void setDataFimAtividade(String dataFimAtividade) {
		this.dataFimAtividade = dataFimAtividade;
	}

	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	@XmlElement(name = "AGENCIA")
	private String getAgenciaCodigo() {
		return this.agencia.getCodigo();
	}

	private void setAgenciaCodigo(String codigo) {
		this.agencia.setCodigo(codigo);
	}

	@XmlElement(name = "TP_CONTRATO")
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	@XmlElement(name = "FLAG_SITUACAO")
	public String getFlagSituacao() {
		return flagSituacao;
	}

	public void setFlagSituacao(String flagSituacao) {
		this.flagSituacao = flagSituacao;
	}

	@XmlElement(name = "DT_ALTERACAO")
	public String getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@XmlElement(name = "CARACTERIZACAO")
	public String getCaracterizacao() {
		return caracterizacao;
	}

	public void setCaracterizacao(String caracterizacao) {
		this.caracterizacao = caracterizacao;
	}

	@XmlElement(name = "CORRESPONDENTE_NEGOCIAL")
	public String getCorrespondenteNegocial() {
		return correspondenteNegocial;
	}

	public void setCorrespondenteNegocial(String correspondenteNegocial) {
		this.correspondenteNegocial = correspondenteNegocial;
	}

	@XmlElement(name = "CANAL")
	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	
	
	
	
}
