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
@XmlRootElement(name="DOCUMENTO_IDENTIFICACAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class DocumentoIdentificacao  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2418134965232826528L;

	private String codigoCampoIdentificacao;
	
	private String tipo;
	
	private String sequencia;

	@XmlElement(name="CODIGO_CAMPO_IDENTIFICACAO")
	public String getCodigoCampoIdentificacao() {
		return codigoCampoIdentificacao;
	}

	public void setCodigoCampoIdentificacao(String codigoCampoIdentificacao) {
		this.codigoCampoIdentificacao = codigoCampoIdentificacao;
	}

	@XmlElement(name="TIPO")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@XmlElement(name="SEQUENCIAL")
	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	@Override
	public String toString() {
		return "DocumentoIdentificacao [codigoCampoIdentificacao="
				+ codigoCampoIdentificacao + ", tipo=" + tipo + ", sequencia="
				+ sequencia + "]";
	}
	
	

}
