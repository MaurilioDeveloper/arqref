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
@XmlRootElement(name="DOC")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Documento implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6735649292665155041L;

	private String numero;
	
	private String digitoVerificador;
	
	private String serie;
	
	private String uf;
	
	private String dataEmissao;
	
	private String orgaoEmissor;

	@XmlElement(name="NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@XmlElement(name="DV")
	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}	

	@XmlElement(name="SERIE")
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@XmlElement(name="UF")
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@XmlElement(name="DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}	
	
	@XmlElement(name="ORGAO_EMISSOR")
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	@Override
	public String toString() {
		return "Documento [numero=" + numero + ", digitoVerificador="
				+ digitoVerificador + ", serie=" + serie + ", uf=" + uf
				+ ", dataEmissao=" + dataEmissao + "]";
	}
	
	

}
