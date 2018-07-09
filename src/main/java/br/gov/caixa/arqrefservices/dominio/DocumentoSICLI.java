package br.gov.caixa.arqrefservices.dominio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "DOC")
public class DocumentoSICLI {
	
private String numero;
	
	private String dv;
	
	@XmlElement(name = "NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@XmlElement(name = "DV")
	public String getDv() {
		return dv;
	}
	
	public void setDv(String dv) {
		this.dv = dv;
	}	
	

}
