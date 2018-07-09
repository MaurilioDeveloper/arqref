package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class OrgaoEmissor  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 355211034383163150L;

	private String descOrgaoEmissor;
	
	private String sgOrgaoEmissor;
	
	private String codOrgaoEmissor;
	
	public String getDescOrgaoEmissor() {
		return descOrgaoEmissor;
	}

	public void setDescOrgaoEmissor(String descOrgaoEmissor) {
		this.descOrgaoEmissor = descOrgaoEmissor;
	}

	public String getSgOrgaoEmissor() {
		return sgOrgaoEmissor;
	}

	public void setSgOrgaoEmissor(String sgOrgaoEmissor) {
		this.sgOrgaoEmissor = sgOrgaoEmissor;
	}

	public String getCodOrgaoEmissor() {
		return codOrgaoEmissor;
	}

	public void setCodOrgaoEmissor(String codOrgaoEmissor) {
		this.codOrgaoEmissor = codOrgaoEmissor;
	}
}
