package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CNAE")
public class CNAE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nivel01;
	private String nivel02;
	private String nivel03;
	private String nivel04;
	private String nivel05;

	@XmlElement(name = "NIVEL_1")
	public String getNivel01() {
		return nivel01;
	}

	
	public void setNivel01(String nivel01) {
		this.nivel01 = nivel01;
	}

	@XmlElement(name = "NIVEL_2")
	public String getNivel02() {
		return nivel02;
	}

	
	public void setNivel02(String nivel02) {
		this.nivel02 = nivel02;
	}

	@XmlElement(name = "NIVEL_3")
	public String getNivel03() {
		return nivel03;
	}

	public void setNivel03(String nivel03) {
		this.nivel03 = nivel03;
	}

	@XmlElement(name = "NIVEL_4")
	public String getNivel04() {
		return nivel04;
	}

	public void setNivel04(String nivel04) {
		this.nivel04 = nivel04;
	}

	@XmlElement(name = "NIVEL_5")
	public String getNivel05() {
		return nivel05;
	}

	public void setNivel05(String nivel05) {
		this.nivel05 = nivel05;
	}

}
