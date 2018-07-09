package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem todas os tipos de operacoes
 * usadas pelo barramento nas consultas SICLI/SIRIC
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum EtipoOperacaoBarramento {
	
	CPF("CPF", 1),	
	AVALIACAORISCOCREDITO("AVALIACAO_RISCO_CREDITO", 2),
	CONSULTARISCOCREDITO("CONSULTAAVALIACAORISCOCREDITO", 3),
	RELATORIORISCOCREDITO("RELATORIOAVALIACAORISCOCREDITO", 4),
	CANCELARISCOCREDITO("CANCELAAVALIACAORISCOCREDITO", 5),
	CNPJ("CNPJ", 6);

	// Definicao das constantes
	private final String descricao;

	private final int valor;

	// método que define as constantes
	private EtipoOperacaoBarramento(String descricao, int valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	// GET e SET

	public String getDescricao() {
		return descricao;
	}

	public int getValor() {
		return valor;
	}

}
