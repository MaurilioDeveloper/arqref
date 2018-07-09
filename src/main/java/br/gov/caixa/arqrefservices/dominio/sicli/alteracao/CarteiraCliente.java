package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CARTEIRA_CLIENTE")
public class CarteiraCliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9212163315740405463L;
	
	private String codigoSubsequente;
    
    private String tipoCarteira;
    
    private String agencia;
    
    private String carteiraPrincipal;
    
    private String carteiraSecundaria;
    
    private String segmento;

    @XmlElement(name="COD_SUBSEG")
	public String getCodigoSubsequente() {
		return this.codigoSubsequente;
	}

    @XmlElement(name="TP_CARTEIRA")
	public String getTipoCarteira() {
		return this.tipoCarteira;
	}

    @XmlElement(name="AGENCIA")
	public String getAgencia() {
		return this.agencia;
	}

    @XmlElement(name="CARTEIRA_PRINCIPAL")
	public String getCarteiraPrincipal() {
		return this.carteiraPrincipal;
	}

    @XmlElement(name="CARTEIRA_SECUNDARIA")
	public String getCarteiraSecundaria() {
		return this.carteiraSecundaria;
	}

    @XmlElement(name="SEGMENTO")
	public String getSegmento() {
		return this.segmento;
	}

	public void setCodigoSubsequente(String codigoSubsequente) {
		this.codigoSubsequente = codigoSubsequente;
	}

	public void setTipoCarteira(String tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setCarteiraPrincipal(String carteiraPrincipal) {
		this.carteiraPrincipal = carteiraPrincipal;
	}

	public void setCarteiraSecundaria(String carteiraSecundaria) {
		this.carteiraSecundaria = carteiraSecundaria;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
    
    
	
	

}
