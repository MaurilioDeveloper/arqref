package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "FATURAMENTO_ANUAL")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "ocorrencia", "valorFaturaAnual", "anoRef", "flagCaracterizacao","dataApuracao" })
public class FaturamentoAnual implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1773407103354588594L;

	private String ocorrencia;

	private String valorFaturaAnual;

	private String anoRef;

	private String flagCaracterizacao;

	private String dataApuracao;

	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	/**
	 * @return the valorFaturaAnual
	 */
	@XmlElement(name = "VR_FATURA_ANUAL")
	public String getValorFaturaAnual() {
		return valorFaturaAnual;
	}

	/**
	 * @param valorFaturaAnual
	 *            the valorFaturaAnual to set
	 */
	public void setValorFaturaAnual(String valorFaturaAnual) {
		this.valorFaturaAnual = valorFaturaAnual;
	}

	/**
	 * @return the anoRef
	 */
	@XmlElement(name = "ANO_REF")
	public String getAnoRef() {
		return anoRef;
	}

	/**
	 * @param anoRef
	 *            the anoRef to set
	 */
	public void setAnoRef(String anoRef) {
		this.anoRef = anoRef;
	}

	/**
	 * @return the flagCaracterizacao
	 */

	@XmlElement(name = "FLAG_CARACTERIZACAO")
	public String getFlagCaracterizacao() {
		return flagCaracterizacao;
	}

	/**
	 * @param flagCaracterizacao
	 *            the flagCaracterizacao to set
	 */
	public void setFlagCaracterizacao(String flagCaracterizacao) {
		this.flagCaracterizacao = flagCaracterizacao;
	}

	/**
	 * @return the dataApuracao
	 */

	@XmlElement(name = "DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	/**
	 * @param dataApuracao
	 *            the dataApuracao to set
	 */
	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FaturamentoAnual [ocorrencia=" + ocorrencia + ", valorFaturaAnual=" + valorFaturaAnual + ", anoRef="
				+ anoRef + ", flagCaracterizacao=" + flagCaracterizacao + ", dataApuracao=" + dataApuracao + "]";
	}

}
