package br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ns11:incluirAnexoConsignacaoResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem"})
public class IncluirAnexoConsignacaoDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	@XmlAttribute(name = "xmlns:ns11")
	private String xmlns_soapenv = "HostaHostService";
	
	private Boolean sucesso;
			
	private Integer codRetorno;
	
	private String mensagem;
	
	@XmlElement(name="ns11:sucesso")
	public Boolean getSucesso() {
		return sucesso;
	}

	@XmlElement(name="ns11:codRetorno")
	public Integer getCodRetorno() {
		return codRetorno;
	}

	@XmlElement(name="ns11:mensagem")
	public String getMensagem() {
		return mensagem;
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