package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NATUREZA_JURIDICA")
public class NaturezaJuridica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cdNivel1;
	private String cdNivel2;
	private String codConcla;
	/**
	 * Recupera o valor de cdNivel1.
	 *
	 * @return o valor atual de cdNivel1
	 */
	@XmlElement(name = "CD_NIVEL1")
	public String getCdNivel1() {
		return cdNivel1;
	}
	/**
	 * Atribuiu um valor a cdNivel1.
	 *
	 * @param cdNivel1 o novo valor de cdNivel1
	 */
	public void setCdNivel1(String cdNivel1) {
		this.cdNivel1 = cdNivel1;
	}
	/**
	 * Recupera o valor de cdNivel2.
	 *
	 * @return o valor atual de cdNivel2
	 */
	@XmlElement(name = "CD_NIVEL2")
	public String getCdNivel2() {
		return cdNivel2;
	}
	/**
	 * Atribuiu um valor a cdNivel2.
	 *
	 * @param cdNivel2 o novo valor de cdNivel2
	 */
	public void setCdNivel2(String cdNivel2) {
		this.cdNivel2 = cdNivel2;
	}
	/**
	 * Recupera o valor de codConcla.
	 *
	 * @return o valor atual de codConcla
	 */
	@XmlElement(name = "COD_CONCLA")
	public String getCodConcla() {
		return codConcla;
	}
	/**
	 * Atribuiu um valor a codConcla.
	 *
	 * @param codConcla o novo valor de codConcla
	 */
	public void setCodConcla(String codConcla) {
		this.codConcla = codConcla;
	}
}
