package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;

public class MantemDadosCliente extends AbstractMainframeHelper {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2265723818831568990L;

	private CamposSicli camposSicli;
	
	private CamposRetornados camposRetornadosSICLI;
	
	private String numeroCocli;

	public CamposSicli getCamposSicli() {
		return camposSicli;
	}

	public void setCamposSicli(CamposSicli camposSicli) {
		this.camposSicli = camposSicli;
	}

	public CamposRetornados getCamposRetornadosSICLI() {
		return camposRetornadosSICLI;
	}

	public void setCamposRetornadosSICLI(CamposRetornados camposRetornadosSICLI) {
		this.camposRetornadosSICLI = camposRetornadosSICLI;
	}

	public String getNumeroCocli() {
		return numeroCocli;
	}

	public void setNumeroCocli(String numeroCocli) {
		this.numeroCocli = numeroCocli;
	}

	
	
	
}