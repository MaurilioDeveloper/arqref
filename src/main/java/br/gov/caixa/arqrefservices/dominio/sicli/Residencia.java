package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="RESIDENCIA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Residencia  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1879819337259005244L;

	private String descricaoTipoResidencia;
	
	private String tipoResidencia;
	
	private String mesResidencia;
	
	private String anoResidencia;
	
	private String valorAluguel;
	
	private String qtMesesResidenciaAnterior;
	
	private String qtAnosResidenciaAnterior;
	
	private String dataApuracao;

	@XmlElement(name="DESC_TP_RESID")
	public String getDescricaoTipoResidencia() {
		return descricaoTipoResidencia;
	}

	public void setDescricaoTipoResidencia(String descricaoTipoResidencia) {
		this.descricaoTipoResidencia = descricaoTipoResidencia;
	}

	@XmlElement(name="TP_RESID")
	public String getTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	@XmlElement(name="MES_RESID")
	public String getMesResidencia() {
		return mesResidencia;
	}

	public void setMesResidencia(String mesResidencia) {
		this.mesResidencia = mesResidencia;
	}

	@XmlElement(name="ANO_RESID")
	public String getAnoResidencia() {
		return anoResidencia;
	}

	public void setAnoResidencia(String anoResidencia) {
		this.anoResidencia = anoResidencia;
	}

	@XmlElement(name="VL_ALUGUEL")
	public String getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(String valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	@XmlElement(name="QT_MESES_RESID_ANT")
	public String getQtMesesResidenciaAnterior() {
		return qtMesesResidenciaAnterior;
	}

	public void setQtMesesResidenciaAnterior(String qtMesesResidenciaAnterior) {
		this.qtMesesResidenciaAnterior = qtMesesResidenciaAnterior;
	}

	@XmlElement(name="QT_ANOS_RESID_ANT")
	public String getQtAnosResidenciaAnterior() {
		return qtAnosResidenciaAnterior;
	}

	public void setQtAnosResidenciaAnterior(String qtAnosResidenciaAnterior) {
		this.qtAnosResidenciaAnterior = qtAnosResidenciaAnterior;
	}

	@XmlElement(name="DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	@Override
	public String toString() {
		return "Residencia [descricaoTipoResidencia=" + descricaoTipoResidencia
				+ ", tipoResidencia=" + tipoResidencia + ", mesResidencia="
				+ mesResidencia + ", anoResidencia=" + anoResidencia
				+ ", valorAluguel=" + valorAluguel
				+ ", qtMesesResidenciaAnterior=" + qtMesesResidenciaAnterior
				+ ", qtAnosResidenciaAnterior=" + qtAnosResidenciaAnterior
				+ ", dataApuracao=" + dataApuracao + "]";
	}
	
	
}
