package br.gov.caixa.arqrefservices.dominio.transicao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 * USA A VIEW FECVW002_UNIDADE   
 *
 */
@Entity
@Table(name="FECVW003_VINCULACAO_RISCO")
public class VinculoUnidadeTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1957401891530209362L;
	
	@Id
	@Column(name="NU_PV")
	private Integer numeroPV;
	
	@Column(name="NU_NATURAL_PV")
	private Integer numeroNaturalPV;
	
	@Column(name="NU_GIRIS")
	private Integer numeroGIRIS;

	@Column(name="NU_NATURAL_GIRIS")
	private Integer numeroNaturalGIRIS;
	
	@Column(name="NU_SR")
	private Integer numeroSR;
	
	@Column(name="NU_NATURAL_SR")
	private Integer numeroNaturalSR;

	public Integer getNumeroPV() {
		return numeroPV;
	}

	public void setNumeroPV(Integer numeroPV) {
		this.numeroPV = numeroPV;
	}

	public Integer getNumeroNaturalPV() {
		return numeroNaturalPV;
	}

	public void setNumeroNaturalPV(Integer numeroNaturalPV) {
		this.numeroNaturalPV = numeroNaturalPV;
	}

	public Integer getNumeroGIRIS() {
		return numeroGIRIS;
	}

	public void setNumeroGIRIS(Integer numeroGIRIS) {
		this.numeroGIRIS = numeroGIRIS;
	}

	public Integer getNumeroNaturalGIRIS() {
		return numeroNaturalGIRIS;
	}

	public void setNumeroNaturalGIRIS(Integer numeroNaturalGIRIS) {
		this.numeroNaturalGIRIS = numeroNaturalGIRIS;
	}

	public Integer getNumeroSR() {
		return numeroSR;
	}

	public void setNumeroSR(Integer numeroSR) {
		this.numeroSR = numeroSR;
	}

	public Integer getNumeroNaturalSR() {
		return numeroNaturalSR;
	}

	public void setNumeroNaturalSR(Integer numeroNaturalSR) {
		this.numeroNaturalSR = numeroNaturalSR;
	}

	@Override
	public String toString() {
		return "VinculoUnidadeTO [numeroPV=" + numeroPV + ", numeroNaturalPV="
				+ numeroNaturalPV + ", numeroGIRIS=" + numeroGIRIS
				+ ", numeroNaturalGIRIS=" + numeroNaturalGIRIS + ", numeroSR="
				+ numeroSR + ", numeroNaturalSR=" + numeroNaturalSR + "]";
	}
	
	
	

}
