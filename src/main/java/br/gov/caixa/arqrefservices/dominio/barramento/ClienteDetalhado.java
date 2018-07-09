package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.ClientePessoaFisica;

/**
 * Classe para montar o retorno do cliente pesquisa no
 * SICLI
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="RET_CLIENTE_DETALHADO")
public class ClienteDetalhado implements Serializable {

	private static final long serialVersionUID = -7041720471612982198L;

	private String proximoCampo;
	
	private ClientePessoaFisica cliente;	

	@XmlElement(name="PROXIMO_CAMPO")
	public String getProximoCampo() {
		return this.proximoCampo;
	}
	
	@XmlElement(name="CAMPOS_RETORNADOS")
	public ClientePessoaFisica getCliente() {
		return cliente;
	}
	
	public void setCliente(ClientePessoaFisica cliente) {
		this.cliente = cliente;
	}
	

	public void setProximoCampo(String proximoCampo) {
		this.proximoCampo = proximoCampo;
	}

	
}
