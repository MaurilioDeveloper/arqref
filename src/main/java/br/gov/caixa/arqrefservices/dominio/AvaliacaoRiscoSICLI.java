package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela avaliacao de risco com
 * atualizacao automatica via SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
public class AvaliacaoRiscoSICLI implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8881439029627700084L;
	
	private String codigoTipoPessoa;
	
	private String cpf;

	@XmlElement(name="TP_PESSOA")
	public String getCodigoTipoPessoa() {
		return codigoTipoPessoa;
	}

	public void setCodigoTipoPessoa(String codigoTipoPessoa) {
		this.codigoTipoPessoa = codigoTipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
