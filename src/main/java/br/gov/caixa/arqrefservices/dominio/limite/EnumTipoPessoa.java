package br.gov.caixa.arqrefservices.dominio.limite;

public enum EnumTipoPessoa {
	FISICA("F"),JURIDICA("J");
	private String codigo;


	private EnumTipoPessoa(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
