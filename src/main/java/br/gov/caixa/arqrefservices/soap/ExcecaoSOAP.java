package br.gov.caixa.arqrefservices.soap;

public class ExcecaoSOAP extends Exception {

	private static final long serialVersionUID = 336651672798155894L;
	
	private RetornoErro detalheErro;

	public ExcecaoSOAP() {
		super();
	}

	public ExcecaoSOAP(String message) {
		super(message);
	}
	
	public ExcecaoSOAP(RetornoErro detalheErro) {
		this.detalheErro = detalheErro;
	}

	public ExcecaoSOAP(Throwable cause) {
		super(cause);
	}

	public ExcecaoSOAP(String message, Throwable cause) {
		super(message, cause);
	}
	
	public RetornoErro getDetalheErro() {
		return detalheErro;
	}
}
