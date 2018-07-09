package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem todas as possibilidades de pesquisa
 * de endereco nacional por descricao e sigla
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum ETipoPesquisaEnderecoNacional {
	GENERICO("Generico","G");
	
	//Definicao das constantes
	private final String descricao;
	
	private final String valor;
	
	//método que define as constantes
	private ETipoPesquisaEnderecoNacional(String descricao, String valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	//GET e SET
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getValor() {
		return valor;
	}
	
	

}
