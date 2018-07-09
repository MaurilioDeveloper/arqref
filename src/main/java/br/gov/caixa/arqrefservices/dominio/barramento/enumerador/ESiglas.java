package br.gov.caixa.arqrefservices.dominio.barramento.enumerador;

public enum ESiglas {

	SIAPX("SIAPX"),
	SICCR("SICCR");
	
	private String singla;

	private ESiglas(String s) {
		singla = s;
	}
	
	public ESiglas get(String siglas) {
		return ESiglas.valueOf(siglas);
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : singla.equals(otherName);
	}

	public String toString() {
		return singla;
	}
	
}
