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
@XmlRootElement(name="CARTEIRA_CLIENTE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CarteiraCliente  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4169882760212977458L;

	private String descricaoCodigoSubSegmento;
	
	private String descricaoSegmento;
	
	private String codSubSegmento;
	
	private String tipoCarteira;
	
	private String agencia;
	
	private String carteiraPrincipal;
	
	private String carteiraSecundaria;
	
	private String segmento;

	@XmlElement(name="DESC_COD_SUBSEG")
	public String getDescricaoCodigoSubSegmento() {
		return descricaoCodigoSubSegmento;
	}

	public void setDescricaoCodigoSubSegmento(String descricaoCodigoSubSegmento) {
		this.descricaoCodigoSubSegmento = descricaoCodigoSubSegmento;
	}

	@XmlElement(name="DESC_SEGMENTO")
	public String getDescricaoSegmento() {
		return descricaoSegmento;
	}

	public void setDescricaoSegmento(String descricaoSegmento) {
		this.descricaoSegmento = descricaoSegmento;
	}

	@XmlElement(name="COD_SUBSEG")
	public String getCodSubSegmento() {
		return codSubSegmento;
	}

	public void setCodSubSegmento(String codSubSegmento) {
		this.codSubSegmento = codSubSegmento;
	}

	@XmlElement(name="TP_CARTEIRA")
	public String getTipoCarteira() {
		return tipoCarteira;
	}

	public void setTipoCarteira(String tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	@XmlElement(name="AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name="CARTEIRA_PRINCIPAL")
	public String getCarteiraPrincipal() {
		return carteiraPrincipal;
	}

	public void setCarteiraPrincipal(String carteiraPrincipal) {
		this.carteiraPrincipal = carteiraPrincipal;
	}

	@XmlElement(name="CARTEIRA_SECUNDARIA")
	public String getCarteiraSecundaria() {
		return carteiraSecundaria;
	}

	public void setCarteiraSecundaria(String carteiraSecundaria) {
		this.carteiraSecundaria = carteiraSecundaria;
	}

	@XmlElement(name="SEGMENTO")
	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	@Override
	public String toString() {
		return "CarteiraCliente [descricaoCodigoSubSegmento="
				+ descricaoCodigoSubSegmento + ", descricaoSegmento="
				+ descricaoSegmento + ", codSubSegmento=" + codSubSegmento
				+ ", tipoCarteira=" + tipoCarteira + ", agencia=" + agencia
				+ ", carteiraPrincipal=" + carteiraPrincipal
				+ ", carteiraSecundaria=" + carteiraSecundaria + ", segmento="
				+ segmento + "]";
	}
	
	
}
