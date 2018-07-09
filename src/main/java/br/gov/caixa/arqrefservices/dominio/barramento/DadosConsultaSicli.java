package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe para montar os dados que serao enviados 
 * para o SICLI e para o retorno do SICLI
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="DADOS")
@XmlSeeAlso({ Chave.class ,Filtros.class, ClienteDetalhado.class})
@XmlType(propOrder={"chave", "filtros", "clienteDetalhado","retornoConsultaErroSICLI","excecao"})
public class DadosConsultaSicli implements Serializable{

	private static final long serialVersionUID = 5685993913119908227L;
	
	
	private Chave chave;
	
	private Filtros filtros;
	
	private ClienteDetalhado clienteDetalhado;
	
	private RetornoConsultaErroSICLI retornoConsultaErroSICLI;
	
	private String excecao;

	@XmlElement(name="CHAVE")
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
	public RetornoConsultaErroSICLI getRetornoConsultaErroSICLI() {
		return retornoConsultaErroSICLI;
	}
	
	public void setRetornoConsultaErroSICLI(RetornoConsultaErroSICLI retornoConsultaErroSICLI) {
		this.retornoConsultaErroSICLI = retornoConsultaErroSICLI;
	}

}
