package br.gov.caixa.arqrefservices.dominio.limite;

public enum EnumOperacao {
	CONSULTA("C"),ATUALIZACAO("U");
	private String codigo;


	private EnumOperacao(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
