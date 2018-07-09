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
@XmlRootElement(name="PROTOCOLO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Protocolo  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5732452102299160937L;
	
	private String tipoPessoa;
	
	private String cpf;
	
	private AvaliacaoProtocolo avaliacaoProtolo;

	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@XmlElement(name="AVALIACAO")
	public AvaliacaoProtocolo getAvaliacaoProtolo() {
		return avaliacaoProtolo;
	}

	public void setAvaliacaoProtolo(AvaliacaoProtocolo avaliacaoProtolo) {
		this.avaliacaoProtolo = avaliacaoProtolo;
	}

	@Override
	public String toString() {
		return "Protocolo [tipoPessoa=" + tipoPessoa + ", cpf=" + cpf
				+ ", avaliacaoProtolo=" + avaliacaoProtolo + "]";
	}
	
	
	
	

}
