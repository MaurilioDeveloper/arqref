package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class CarteiraGRC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8519019809411781181L;

	private Agencia agencia;
	
	private String carteira;
	
	private String pvGerente;
	
	private String carteiraAnterior;
	
	private String motivo;

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getCarteira() {
		return carteira;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	public String getPvGerente() {
		return pvGerente;
	}

	public void setPvGerente(String pvGerente) {
		this.pvGerente = pvGerente;
	}

	public String getCarteiraAnterior() {
		return carteiraAnterior;
	}

	public void setCarteiraAnterior(String carteiraAnterior) {
		this.carteiraAnterior = carteiraAnterior;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
