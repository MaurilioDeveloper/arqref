package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 * @TODO
 * 		Implementado ate a linha5.
 * 		Vai ate a linha40
 */
@XmlRootElement(name="QUADRO_VALORES")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class QuadroValores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3080919652350861658L;
	
	private String codigoQuadroValor;
	
	private String linha1;
	
	private String linha2;
	
	private String linha3;
	
	private String linha4;
	
	private String linha5;

	@XmlElement(name="COD_QUADRO_VALOR")
	public String getCodigoQuadroValor() {
		return codigoQuadroValor;
	}

	public void setCodigoQuadroValor(String codigoQuadroValor) {
		this.codigoQuadroValor = codigoQuadroValor;
	}

	@XmlElement(name="LINHA_1")
	public String getLinha1() {
		return linha1;
	}

	public void setLinha1(String linha1) {
		this.linha1 = linha1;
	}

	@XmlElement(name="LINHA_2")
	public String getLinha2() {
		return linha2;
	}

	public void setLinha2(String linha2) {
		this.linha2 = linha2;
	}

	@XmlElement(name="LINHA_3")
	public String getLinha3() {
		return linha3;
	}

	public void setLinha3(String linha3) {
		this.linha3 = linha3;
	}

	@XmlElement(name="LINHA_4")
	public String getLinha4() {
		return linha4;
	}

	public void setLinha4(String linha4) {
		this.linha4 = linha4;
	}

	@XmlElement(name="LINHA_5")
	public String getLinha5() {
		return linha5;
	}

	public void setLinha5(String linha5) {
		this.linha5 = linha5;
	}

	@Override
	public String toString() {
		return "QuadroValores [codigoQuadroValor=" + codigoQuadroValor
				+ ", linha1=" + linha1 + ", linha2=" + linha2 + ", linha3="
				+ linha3 + ", linha4=" + linha4 + ", linha5=" + linha5 + "]";
	}
	
	
	
	
}
