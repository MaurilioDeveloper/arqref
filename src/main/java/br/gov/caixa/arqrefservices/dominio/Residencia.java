package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Residencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2595358560650586107L;

	private TipoResidencia tipoResidencia;
	
	private String qtMes;
	
	private String qtAno;
	
	private String vrAluguel;
	
	private String qtMesAnterior;
	
	private String qtAnoAnterior;
	
	private String dataApuracao;

	public TipoResidencia getTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(TipoResidencia tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	public String getQtMes() {
		return qtMes;
	}

	public void setQtMes(String qtMes) {
		this.qtMes = qtMes;
	}

	public String getQtAno() {
		return qtAno;
	}

	public void setQtAno(String qtAno) {
		this.qtAno = qtAno;
	}

	public String getVrAluguel() {
		return vrAluguel;
	}

	public void setVrAluguel(String vrAluguel) {
		this.vrAluguel = vrAluguel;
	}

	public String getQtMesAnterior() {
		return qtMesAnterior;
	}

	public void setQtMesAnterior(String qtMesAnterior) {
		this.qtMesAnterior = qtMesAnterior;
	}

	public String getQtAnoAnterior() {
		return qtAnoAnterior;
	}

	public void setQtAnoAnterior(String qtAnoAnterior) {
		this.qtAnoAnterior = qtAnoAnterior;
	}

	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}
	
	
	
}
