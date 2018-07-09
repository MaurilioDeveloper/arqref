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
@XmlRootElement(name="MENSAGEM_RETORNO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class MensagemRetorno  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2028750842436588650L;
	
	private String proposta;
	
	private ClienteSIRIC cliente;
	
	private String produto;
	
	private String identificadorMensagem;

	@XmlElement(name="PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name="CLIENTE")
	public ClienteSIRIC getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSIRIC cliente) {
		this.cliente = cliente;
	}

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name="IDENTIFICADOR_MENSAGEM")
	public String getIdentificadorMensagem() {
		return identificadorMensagem;
	}

	public void setIdentificadorMensagem(String identificadorMensagem) {
		this.identificadorMensagem = identificadorMensagem;
	}

	@Override
	public String toString() {
		return "MensagemRetorno [proposta=" + proposta + ", cliente=" + cliente
				+ ", produto=" + produto + ", identificadorMensagem="
				+ identificadorMensagem + "]";
	}
	
	
	
	
	

}
