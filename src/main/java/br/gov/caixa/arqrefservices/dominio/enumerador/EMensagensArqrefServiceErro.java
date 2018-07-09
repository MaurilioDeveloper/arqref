package br.gov.caixa.arqrefservices.dominio.enumerador;

/**
 * Enumerador que contem todas os mensagens de erro utilizada no arqrefservice
 * por descricao e sigla
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum EMensagensArqrefServiceErro {
	
	MN_001("Não foi possível localizar os atributos do usúario logado",1),	
	MN_002("Paramêtro em um formato inválido",2),
	MN_003("Paramêtro inválido",3),
	MN_004("Não houve retorno da fila MQ",4);
	
	//Definicao das constantes
	private final String descricao;
	
	private final int valor;
	
	//método que define as constantes
	private EMensagensArqrefServiceErro(String descricao, int valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	//GET e SET
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getValor() {
		return valor;
	}
}
