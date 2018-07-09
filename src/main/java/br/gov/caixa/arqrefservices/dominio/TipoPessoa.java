package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * Classe utilizada para qualificar a pessoa
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class TipoPessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6435858054358176345L;

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
