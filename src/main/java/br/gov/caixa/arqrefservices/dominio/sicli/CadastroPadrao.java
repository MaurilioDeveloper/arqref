package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="CADASTRO_PADRAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CadastroPadrao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1156050224081294457L;
	
	private String campoErro;
	
	private String mensagemErro;

	@XmlElement(name="CAMPO_ERRO")
	public String getCampoErro() {
		return campoErro;
	}

	public void setCampoErro(String campoErro) {
		this.campoErro = campoErro;
	}

	@XmlElement(name="MENSAGEM_ERRO")
	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	@Override
	public String toString() {
		return "CadastroPadrao [campoErro=" + campoErro + ", mensagemErro="
				+ mensagemErro + "]";
	}
	
	

}
