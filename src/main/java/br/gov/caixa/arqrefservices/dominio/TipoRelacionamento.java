package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class TipoRelacionamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7376398149048754180L;

	private String codigo;
	
	private String descricao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
