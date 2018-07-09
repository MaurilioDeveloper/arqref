package br.gov.caixa.arqrefservices.dominio.econsig.suspenderConsignacao;

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
import br.gov.caixa.arqrefservices.dominio.econsig.Servidor;

@XmlRootElement(name="ns10:suspenderConsignacaoResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","boleto","historicos","servidores","resumos"})
@XmlSeeAlso({Boleto.class,Historico.class,Servidor.class,Resumo.class})
public class SuspenderConsignacaoDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	@XmlAttribute(name = "xmlns:ns10")
	private String xmlns_soapenv = "HostaHostService";
	
	private Boolean sucesso;
			
	private Integer codRetorno;
	
	private String mensagem;
	
	private Boleto boleto;			
		
	private List<Historico> historicos;
	
	private List<Servidor> servidores;
	
	private List<Resumo> resumos;
	
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

	@XmlElement(name="ns10:boleto")
	public Boleto getBoleto() {
		return boleto;
	}

	@XmlElement(name="ns10:historicos")
	public List<Historico> getHistoricos() {
		return historicos;
	}

	@XmlElement(name="ns10:servidores")
	public List<Servidor> getServidores() {
		return servidores;
	}

	@XmlElement(name="ns10:resumos")
	public List<Resumo> getResumos() {
		return resumos;
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

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}

	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}

	public void setResumos(List<Resumo> resumos) {
		this.resumos = resumos;
	}	
	
}