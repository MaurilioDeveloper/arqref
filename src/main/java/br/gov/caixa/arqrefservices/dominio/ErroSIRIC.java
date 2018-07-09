package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela avaliacao de risco SIRIC
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="ERROS_VALIDACAO")
public class ErroSIRIC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8410663584396327144L;

	private String tipo;
	
	private String item;
	
	private String erro;

	@XmlElement(name = "TIPO")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@XmlElement(name = "ITEM")
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@XmlElement(name = "ERRO")
	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}
	
	
}
