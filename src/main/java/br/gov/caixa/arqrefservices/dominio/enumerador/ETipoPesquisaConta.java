package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem todas os tipos de pesqusa de contas
 * por descricao e codigo
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum ETipoPesquisaConta {

	CONTA_CORRENTE_PESSOA_FISICA("CONTA CORRENTE PESSOA FISICA", 1),
	DEP_JUD_JUSTICA_COMUM("DEP JUD JUSTICA COMUM", 4),
	POUPANCA_CAIXA("POUPANCA CAIXA", 13),
	CONTA_CAIXA_0002("CONTA_CAIXA_0002", 2),
	CONTA_CAIXA_0003("CONTA_CAIXA_0003", 3),
	CONTA_CAIXA_0006("CONTA_CAIXA_0006", 6),
	CONTA_CAIXA_0022("CONTA_CAIXA_0022", 22),
	CONTA_CAIXA_0023("CONTA_CAIXA_0023", 23),
	CONTA_CAIXA_0028("CONTA_CAIXA_0028", 28),
	CONTA_CAIXA_0032("CONTA_CAIXA_0032", 32),
	CONTA_CAIXA_0034("CONTA_CAIXA_0034", 34),
	CONTA_CAIXA_0043("CONTA_CAIXA_0043", 43),
	CONTA_CAIXA_0093("CONTA_CAIXA_0093", 93),
	CONTA_CAIXA_1288("CONTA_CAIXA_1288", 1288),
	CONTA_CAIXA_3702("CONTA_CAIXA_3702", 3702);

	// Definicao das constantes
	private final String descricao;

	private final int valor;

	// método que define as constantes
	private ETipoPesquisaConta(String descricao, int valor) {
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
