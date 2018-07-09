package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem todas os tipos de pessoas
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum EtipoPessoa {
	
	CPF ("CADASTRO PESSOA FISICA", 1),	
	CNPJ("CADASTRO NACIONAL DE PESSOA JURIDICA", 2);

	// Definicao das constantes
	private final String descricao;

	private final int valor;

	// método que define as constantes
	private EtipoPessoa(String descricao, int valor) {
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
