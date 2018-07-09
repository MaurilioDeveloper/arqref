package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem os codigo de pergunta
 * usado pelo SIRIC
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum ECodigoPergunta {
	
	CODIGO_PERGUNTA_259("CODIGO PARA PERGUNTA PRODUTO 110", "259");

	// Definicao das constantes
	private final String descricao;

	private final String valor;

	// método que define as constantes
	private ECodigoPergunta(String descricao, String valor) {
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
