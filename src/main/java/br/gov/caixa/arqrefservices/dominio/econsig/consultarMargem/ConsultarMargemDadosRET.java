package br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.InfoMargem;

@XmlRootElement(name="ns13:consultarMargemResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","infoMargens"})
@XmlSeeAlso({InfoMargem.class})
public class ConsultarMargemDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	@XmlAttribute(name = "xmlns:ns13")
	private String xmlns_soapenv = "HostaHostService";			
	
	private Boolean sucesso;
	
	private Integer codRetorno;
	
	private String mensagem;
	
	private List<InfoMargem> infoMargens;

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
	
	@XmlElement(name="ns13:infoMargem")
	public List<InfoMargem> getInfoMargens() {
		return infoMargens;
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
	
	public void setInfoMargens(List<InfoMargem> infoMargens) {
		this.infoMargens = infoMargens;
	}
	
}