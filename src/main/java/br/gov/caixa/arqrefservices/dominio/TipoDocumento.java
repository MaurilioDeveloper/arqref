package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class TipoDocumento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7988795972774960243L;
	
	private String codigo;
	
	private String subTipoDocumento;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSubTipoDocumento() {
		return subTipoDocumento;
	}

	public void setSubTipoDocumento(String subTipoDocumento) {
		this.subTipoDocumento = subTipoDocumento;
	}
	
	

}
