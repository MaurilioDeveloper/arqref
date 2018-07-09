package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

/**
 * Classe utilizada pelo COBOL
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class TipoCliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6970885237302484784L;

	@Tamanho(tamanho = 1)
	private String indicativoRelacionamento;
	
	private String descricao;

	public String getIndicativoRelacionamento() {
		return indicativoRelacionamento;
	}

	public void setIndicativoRelacionamento(String indicativoRelacionamento) {
		this.indicativoRelacionamento = indicativoRelacionamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
