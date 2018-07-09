package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem os codigo de quadro 
 * de valor usado pelo SIRIC
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum ECodigoQuadroValor {
	
	COD_QUADRO_VALOR_700("CODIGO PARA AVALIAÇÂO PRODUTO 110", "700");

	// Definicao das constantes
	private final String descricao;

	private final String valor;

	// método que define as constantes
	private ECodigoQuadroValor(String descricao, String valor) {
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
