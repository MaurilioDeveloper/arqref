package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -638277287419175780L;

	private String codigo;
	
	private Agencia agencia;
	
	private TipoConta tipoConta;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}
