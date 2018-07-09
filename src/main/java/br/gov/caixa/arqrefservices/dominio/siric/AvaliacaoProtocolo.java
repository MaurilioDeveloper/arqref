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
@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AvaliacaoProtocolo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6547784989174158474L;

	private String proposta;

	private String agencia;

	private String origemRecurso;

	private String produto;

	@XmlElement(name = "PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name = "PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name = "AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name = "ORIGEM_RECURSO")
	public String getOrigemRecurso() {
		return origemRecurso;
	}

	public void setOrigemRecurso(String origemRecurso) {
		this.origemRecurso = origemRecurso;
	}

	@Override
	public String toString() {
		return "AvaliacaoProtocolo [proposta=" + proposta + ", agencia="
				+ agencia + ", origemRecurso=" + origemRecurso + ", produto="
				+ produto + "]";
	}

}
