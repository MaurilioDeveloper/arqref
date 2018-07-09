package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem todos os tipos de pesquisa de documento identidade SICLI
 * por descricao e sigla
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum ETipoPequisaDocumentoIdentidade {
	
	PRINCIPAL("PRINCIPAL", "P"),
	UNICO("UNICO", "1");
	

	// Definicao das constantes
	private final String descricao;

	private final String valor;

	// método que define as constantes
	private ETipoPequisaDocumentoIdentidade(String descricao, String valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	// GET e SET

	public String getDescricao() {
		return descricao;
	}

	public String getValor() {
		return valor;
	}

}
