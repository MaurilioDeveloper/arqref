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
@XmlRootElement(name="PAIS_ORIGEM")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class PaisOrigem implements Serializable{

	private static final long serialVersionUID = -7294319527349653068L;

	private String codigoPais;
	
	private String tipoNacionalidade;

	@XmlElement(name="COD_PAIS")
	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	@XmlElement(name="TP_NACIONALIDADE")
	public String getTipoNacionalidade() {
		return tipoNacionalidade;
	}

	public void setTipoNacionalidade(String tipoNacionalidade) {
		this.tipoNacionalidade = tipoNacionalidade;
	}
	
}
