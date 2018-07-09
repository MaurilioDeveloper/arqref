package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para busca no SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "MEIO_COMUNICACAO")
public class TipoMeioComunicacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9139577602540172551L;

	private String codigo;
	
	private String descricao;

	@XmlElement(name = "MEIO_COMUNICACAO")
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
