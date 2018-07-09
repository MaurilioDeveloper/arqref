package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.Cliente;
import br.gov.caixa.arqrefservices.dominio.ClientePessoaFisica;
import br.gov.caixa.arqrefservices.dominio.ClientePessoaJuridica;

/**
 * Classe para montar os dados de entrada e saida do SICLI
 * de forma generica.
 * 
 * @TODO
 * 		Classe ainda nao esta em uso.
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlTransient
@XmlRootElement(name="DADOS")
@XmlSeeAlso({ Chave.class ,Filtros.class, ClienteDetalhado.class, Cliente.class,ClientePessoaFisica.class,ClientePessoaJuridica.class})
@XmlType(propOrder={"cliente", "filtros", "clienteDetalhado","clienteDetalhadoErro","excecao"})
public class DadosConsultaSicliGenerico<T> implements Serializable{

	private static final long serialVersionUID = 5685993913119908227L;
	
	private T cliente;
	
	private Chave chave;
	
	private Filtros filtros;
	
	private ClienteDetalhado clienteDetalhado;
	
	private ClienteDetalhado clienteDetalhadoErro;
	
	private String excecao;
	
	
	@XmlElement(name="CHAVE")
	public T getCliente() {
		return cliente;
	}

	public void setCliente(T cliente) {
		this.cliente = cliente;
	}
	
	
	/*@XmlElement(name="CHAVE")*/
	public Chave getChave() {
		return this.chave;
	}

	@XmlElement(name="FILTROS")
	public Filtros getFiltros() {
		return this.filtros;
	}

	@XmlElement(name="RET_CLIENTE_DETALHADO")
	public ClienteDetalhado getClienteDetalhado() {
		return this.clienteDetalhado;
	}

	public void setChave(Chave chave) {
		this.chave = chave;
	}

	public void setFiltros(Filtros filtros) {
		this.filtros = filtros;
	}

	public void setClienteDetalhado(ClienteDetalhado clienteDetalhado) {
		this.clienteDetalhado = clienteDetalhado;
	}
	
	@XmlElement(name="EXCECAO")
	public String getExcecao() {
		return this.excecao;
	}
	
	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}	
	
	@XmlElement(name="RET_CONSULTA_ERRO")
	public ClienteDetalhado getClienteDetalhadoErro() {
		return clienteDetalhadoErro;
	}
	
	public void setClienteDetalhadoErro(ClienteDetalhado clienteDetalhadoErro) {
		this.clienteDetalhadoErro = clienteDetalhadoErro;
	}

	

}
