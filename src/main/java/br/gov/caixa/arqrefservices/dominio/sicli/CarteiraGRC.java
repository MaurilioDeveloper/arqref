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
@XmlRootElement(name="CARTEIRA_GRC")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CarteiraGRC  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5250876395667977726L;

	private String agencia;
	
	private String carteria;
	
	private String pvGerenteReferencia;
	
	private String carteriaAnterior;
	
	private String motivo;

	@XmlElement(name="AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name="CARTEIRA")
	public String getCarteria() {
		return carteria;
	}

	public void setCarteria(String carteria) {
		this.carteria = carteria;
	}

	@XmlElement(name="PV_GERENTE_REF")
	public String getPvGerenteReferencia() {
		return pvGerenteReferencia;
	}

	public void setPvGerenteReferencia(String pvGerenteReferencia) {
		this.pvGerenteReferencia = pvGerenteReferencia;
	}

	@XmlElement(name="CARTEIRA_ANTERIOR")
	public String getCarteriaAnterior() {
		return carteriaAnterior;
	}

	public void setCarteriaAnterior(String carteriaAnterior) {
		this.carteriaAnterior = carteriaAnterior;
	}

	@XmlElement(name="MOTIVO")
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return "CarteiraGRC [agencia=" + agencia + ", carteria=" + carteria
				+ ", pvGerenteReferencia=" + pvGerenteReferencia
				+ ", carteriaAnterior=" + carteriaAnterior + ", motivo="
				+ motivo + "]";
	}
	
	
	

}
