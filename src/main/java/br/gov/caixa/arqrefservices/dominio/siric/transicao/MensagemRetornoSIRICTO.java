package br.gov.caixa.arqrefservices.dominio.siric.transicao;

import java.io.Serializable;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * Objeto de transicao usado para encapsular mensagens de retorno
 * do SIRIC
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
public class MensagemRetornoSIRICTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1749337806310607109L;
	
	private String codigoRetorno;
	
	private String origemRetorno;
	
	private String mensagemRetorno;

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getOrigemRetorno() {
		return origemRetorno;
	}

	public void setOrigemRetorno(String origemRetorno) {
		this.origemRetorno = origemRetorno;
	}

	public String getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	@Override
	public String toString() {
		return "MensagemRetornoSIRICTO [codigoRetorno=" + codigoRetorno
				+ ", origemRetorno=" + origemRetorno + ", mensagemRetorno="
				+ mensagemRetorno + "]";
	}
	
	

}
