package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="ERROS_VALIDACAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ErrosValidacao  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3969497337335543736L;
	
	private String tipo;
	
	private String item;
	
	private String erro;

	@XmlElement(name="TIPO")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@XmlElement(name="ITEM")
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@XmlElement(name="ERRO")
	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	@Override
	public String toString() {
		return "ErrosValidacao [tipo=" + tipo + ", item=" + item + ", erro="
				+ erro + "]";
	}
	
	
	
	
	
	

}
