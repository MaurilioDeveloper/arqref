package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada pela avaliacao de risco SIRIC
 * 
 * @author c110503
 * @version 1.0.0.1
 * 
 */
@XmlRootElement(name = "QUADRO_VALORES")
@XmlType(propOrder = {"codigoQuadroValor","linha1","linha2","linha3","linha4"})
public class QuadroValores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4289874389692428105L;

	private String codigoQuadroValor;

	private String linha1;

	private String linha2;

	private String linha3;

	private String linha4;

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

	@Override
	public String toString() {
		return "QuadroValores [codigoQuadroValor=" + codigoQuadroValor
				+ ", linha1=" + linha1 + ", linha2=" + linha2 + ", linha3="
				+ linha3 + ", linha4=" + linha4 + "]";
	}

	
}
