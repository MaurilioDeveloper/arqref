package br.gov.caixa.arqrefservices.dominio.econsig.simularConsignacao;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.Servico;
import br.gov.caixa.arqrefservices.dominio.econsig.Servidor;
import br.gov.caixa.arqrefservices.dominio.econsig.Simulacao;

@XmlRootElement(name="ns10:simularConsignacaoResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","simulacoes","servicos","servidores"})
@XmlSeeAlso({Simulacao.class,Servico.class,Servidor.class})
public class SimularConsignacaoDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	@XmlAttribute(name = "xmlns:ns10")
	private String xmlns_soapenv = "HostaHostService";
	
	private Boolean sucesso;
			
	private Integer codRetorno;
	
	private String mensagem;
					
	private List<Simulacao> simulacoes;
	
	private List<Servico> servicos;
	
	private List<Servidor> servidores;
	
	@XmlElement(name="ns10:sucesso")
	public Boolean getSucesso() {
		return sucesso;
	}

	@XmlElement(name="ns10:codRetorno")
	public Integer getCodRetorno() {
		return codRetorno;
	}

	@XmlElement(name="ns10:mensagem")
	public String getMensagem() {
		return mensagem;
	}

	@XmlElement(name="ns10:servidores")
	public List<Servidor> getServidores() {
		return servidores;
	}

	@XmlElement(name="ns10:simulacoes")
	public List<Simulacao> getSimulacoes() {
		return simulacoes;
	}

	@XmlElement(name="ns10:servicos")
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public void setCodRetorno(Integer codRetorno) {
		this.codRetorno = codRetorno;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setSimulacoes(List<Simulacao> simulacoes) {
		this.simulacoes = simulacoes;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}

	
}