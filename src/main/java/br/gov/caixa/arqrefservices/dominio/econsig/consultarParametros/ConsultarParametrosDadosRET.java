package br.gov.caixa.arqrefservices.dominio.econsig.consultarParametros;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.ParametroSet;
import br.gov.caixa.arqrefservices.dominio.econsig.Servico;

@XmlRootElement(name="ns13:consultarParametrosResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","parametroSet","servicos"})
@XmlSeeAlso({ParametroSet.class})
public class ConsultarParametrosDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	@XmlAttribute(name = "xmlns:ns13")
	private String xmlns_soapenv = "HostaHostService";			
	
	private Boolean sucesso;
	
	private Integer codRetorno;
	
	private String mensagem;
	
	private ParametroSet parametroSet;
	
	private List<Servico> servicos;
	
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
	
	@XmlElement(name="ns13:parametroSet")	
	public ParametroSet getParametroSet() {
		return parametroSet;
	}
		
	@XmlElement(name="ns13:servicos")
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public void setParametroSet(ParametroSet parametroSet) {
		this.parametroSet = parametroSet;
	}

	public void setCodRetorno(Integer codRetorno) {
		this.codRetorno = codRetorno;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
}