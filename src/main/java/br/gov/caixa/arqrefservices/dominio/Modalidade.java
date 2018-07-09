package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Modalidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 549460469447240785L;

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
