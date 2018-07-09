package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CARTEIRA_GRC")
public class CarteiraGRC implements Serializable {

	private static final long serialVersionUID = -3274833900201894699L;

    private String agencia;
    
    private String carteira;
    
    private String pvGerenteReferencia;
    
    private String carteiraAnterior;
    
    private String motivo;

    @XmlElement(name="AGENCIA")
	public String getAgencia() {
		return this.agencia;
	}

    @XmlElement(name="CARTEIRA")
	public String getCarteira() {
		return this.carteira;
	}

    @XmlElement(name="PV_GERENTE_REF")
	public String getPvGerenteReferencia() {
		return this.pvGerenteReferencia;
	}

    @XmlElement(name="CARTEIRA_ANTERIOR")
	public String getCarteiraAnterior() {
		return this.carteiraAnterior;
	}

    @XmlElement(name="MOTIVO")
	public String getMotivo() {
		return this.motivo;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	public void setPvGerenteReferencia(String pvGerenteReferencia) {
		this.pvGerenteReferencia = pvGerenteReferencia;
	}

	public void setCarteiraAnterior(String carteiraAnterior) {
		this.carteiraAnterior = carteiraAnterior;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
    
    
    
	
	
}
