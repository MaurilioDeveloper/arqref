package br.gov.caixa.arqrefservices.dominio.econsig.inserirSolicitacao;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.Boleto;
import br.gov.caixa.arqrefservices.dominio.econsig.Historico;
import br.gov.caixa.arqrefservices.dominio.econsig.Resumo;
import br.gov.caixa.arqrefservices.dominio.econsig.Servico;
import br.gov.caixa.arqrefservices.dominio.econsig.Servidor;
import br.gov.caixa.arqrefservices.dominio.econsig.Solicitacao;

@XmlRootElement(name="ns10:inserirSolicitacaoResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","boleto","servicos","servidores"})
@XmlSeeAlso({Boleto.class,Historico.class,Servidor.class,Resumo.class})
public class InserirSolicitacaoDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	private Boleto boleto;
	
	private Integer codRetorno;
			
	private String mensagem;
	
	private List<Servico> servicos;
	
	private List<Servidor> servidores;			
		
	private Boolean sucesso;
	
	@XmlAttribute(name = "xmlns:ns10")
	private String xmlns_soapenv = "HostaHostService";
	
	
	@XmlElement(name="ns10:boleto")
	public Boleto getBoleto() {
		return boleto;
	}

	@XmlElement(name="ns10:codRetorno")
	public Integer getCodRetorno() {
		return codRetorno;
	}

	@XmlElement(name="ns10:mensagem")
	public String getMensagem() {
		return mensagem;
	}

	@XmlElement(name="ns2:servicos")
	public List<Servico> getServicos() {
		return servicos;
	}

	@XmlElement(name="ns3:servidores")
	public List<Servidor> getServidores() {
		return servidores;
	}

	@XmlElement(name="ns10:sucesso")
	public Boolean getSucesso() {
		return sucesso;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	public void setCodRetorno(Integer codRetorno) {
		this.codRetorno = codRetorno;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

}