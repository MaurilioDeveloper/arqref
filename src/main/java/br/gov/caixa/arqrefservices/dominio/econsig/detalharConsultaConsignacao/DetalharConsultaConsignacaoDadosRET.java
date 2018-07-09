package br.gov.caixa.arqrefservices.dominio.econsig.detalharConsultaConsignacao;


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

@XmlRootElement(name="ns13:detalharConsultaConsignacaoResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","boleto","historicos","servidores","resumos"})
@XmlSeeAlso({Boleto.class, Historico.class, Servidor.class, Resumo.class})
public class DetalharConsultaConsignacaoDadosRET implements Serializable {

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

	@XmlElement(name="ns13:sucesso")
	public Boolean getSucesso() {
		return sucesso;
	}

	@XmlElement(name="ns13:codRetorno")
	public Integer getCodRetorno() {
		return codRetorno;
	}

	@XmlElement(name="ns13:mensagem")
	public String getMensagem() {
		return mensagem;
	}
	
	@XmlElement(name="ns1:boleto")
	public Boleto getBoleto() {
		return boleto;
	}

	@XmlElement(name="ns4:historicos")
	public List<Historico> getHistoricos() {
		return historicos;
	}

	@XmlElement(name="ns3:servidores")
	public List<Servidor> getServidores() {
		return servidores;
	}

	@XmlElement(name="ns5:resumos")
	public List<Resumo> getResumos() {
		return resumos;
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

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public void setCodRetorno(Integer codRetorno) {
		this.codRetorno = codRetorno;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
}