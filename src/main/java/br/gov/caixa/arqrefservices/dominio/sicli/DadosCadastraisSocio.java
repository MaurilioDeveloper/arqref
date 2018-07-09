package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "DADOS_CADASTRAIS_SOCIO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "socio" })
public class DadosCadastraisSocio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1773407103354588594L;

	private Socio socio;

	/**
	 * @return the socio
	 */
	@XmlElement(name = "SOCIO")
	public Socio getSocio() {
		return socio;
	}

	/**
	 * @param socio	
	 *            the socio to set
	 */
	public void setSocio(Socio socio) {
		this.socio = socio;
	}

}
