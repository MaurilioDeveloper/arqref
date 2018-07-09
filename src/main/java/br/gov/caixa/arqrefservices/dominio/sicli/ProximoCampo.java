package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="PROXIMO_CAMPO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ProximoCampo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6813727496071156352L;

}
