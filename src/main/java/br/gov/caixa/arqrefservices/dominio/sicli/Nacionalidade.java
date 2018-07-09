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
@XmlRootElement(name="NACIONALIDADE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Nacionalidade  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 296844667547670285L;

	private String codigo;
	
	private String paisNatural;

	@XmlElement(name="CODIGO")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@XmlElement(name="PAIS_NATURAL")
	public String getPaisNatural() {
		return paisNatural;
	}

	public void setPaisNatural(String paisNatural) {
		this.paisNatural = paisNatural;
	}

	@Override
	public String toString() {
		return "Nacionalidade [codigo=" + codigo + ", paisNatural="
				+ paisNatural + "]";
	}
	
	

	
	
	
	
	
	
	
	

}
