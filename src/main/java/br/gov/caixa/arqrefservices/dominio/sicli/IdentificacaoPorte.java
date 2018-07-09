package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IDENTIFICACAO_PORTE")
public class IdentificacaoPorte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String porteMinisterioFazenda;
	private String porteMercosul;
	private String porteCaixa;
	private String porteEstatMe;

	
	@XmlElement(name = "CL_PORTE_MF")
	public String getPorteMinisterioFazenda() {
		return porteMinisterioFazenda;
	}

	public void setPorteMinisterioFazenda(String porteMinisterioFazenda) {
		this.porteMinisterioFazenda = porteMinisterioFazenda;
	}
	
	@XmlElement(name = "CL_PORTE_MERCOSUL")
	public String getPorteMercosul() {
		return porteMercosul;
	}

	public void setPorteMercosul(String porteMercosul) {
		this.porteMercosul = porteMercosul;
	}
	
	@XmlElement(name = "CL_PORTE_CAIXA")
	public String getPorteCaixa() {
		return porteCaixa;
	}

	public void setPorteCaixa(String porteCaixa) {
		this.porteCaixa = porteCaixa;
	}

	@XmlElement(name = "CL_PORTE_ESTAT_ME")
	public String getPorteEstatMe() {
		return porteEstatMe;
	}

	public void setPorteEstatMe(String porteEstatMe) {
		this.porteEstatMe = porteEstatMe;
	}

}
