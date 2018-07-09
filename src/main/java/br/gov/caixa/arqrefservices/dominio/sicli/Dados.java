package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.ErroSICLI;
import br.gov.caixa.arqrefservices.dominio.barramento.RetornoConsultaErroSICLI;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="DADOS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Dados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3061674537216582258L;
	
	private RetronoClienteDetalhado retronoClienteDetalhado;
	
	private RetornoConsultaErroSICLI retornoConsultaErro;
	

	private List<ErroSICLI> listaErroSICLI;

	private String excecao;	

	@XmlElement(name="RET_CLIENTE_DETALHADO")
	public RetronoClienteDetalhado getRetronoClienteDetalhado() {
		return retronoClienteDetalhado;
	}

	public void setRetronoClienteDetalhado(
			RetronoClienteDetalhado retronoClienteDetalhado) {
		this.retronoClienteDetalhado = retronoClienteDetalhado;
	}
	
	@XmlElement(name="EXCECAO")
	public String getExcecao() {
		return this.excecao;
	}
	
	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}		
	
	@XmlElement(name="RET_CONSULTA_ERRO")
	public RetornoConsultaErroSICLI getRetornoConsultaErro() {
		return retornoConsultaErro;
	}

	public void setRetornoConsultaErro(RetornoConsultaErroSICLI retornoConsultaErro) {
		this.retornoConsultaErro = retornoConsultaErro;
	}
	
	@XmlElement(name = "LISTA_ERROS")
	public List<ErroSICLI> getListaErroSICLI() {
		return listaErroSICLI;
	}

	public void setListaErroSICLI(List<ErroSICLI> listaErroSICLI) {
		this.listaErroSICLI = listaErroSICLI;
	}
	

	@Override
	public String toString() {
		return "Dados [retronoClienteDetalhado=" + retronoClienteDetalhado
				+ ", excecao=" + excecao + "]";
	}

}
