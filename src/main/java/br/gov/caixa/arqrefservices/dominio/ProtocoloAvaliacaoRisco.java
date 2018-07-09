package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para o retorno do protocolo
 * do avaliacao de risco SIRIC.
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="PROTOCOLO")
public class ProtocoloAvaliacaoRisco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1454705604773216931L;
	
	private String tipoPessoa;
	
	private String cpf;
	
	private DadosOperacao avaliacao;

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
	public DadosOperacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(DadosOperacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	

}
