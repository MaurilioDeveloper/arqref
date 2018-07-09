package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

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
@XmlRootElement(name="DOC")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"numero", "serie", "uf", "dataEmissao"})

public class DocumentoCarteiraTrabalho implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6735649292665155041L;

	private String numero;
	
	private String uf;
	
	private String serie;

	private String dataEmissao;
	

	@XmlElement(name="NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}



	@XmlElement(name="UF")
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@XmlElement(name="SERIE")
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@XmlElement(name="DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}	
	


	@Override
	public String toString() {
		return "Documento [numero=" + numero + ", serie=" + serie + ", uf=" + uf
				+ ", dataEmissao=" + dataEmissao + "]";
	}
	
	

}
