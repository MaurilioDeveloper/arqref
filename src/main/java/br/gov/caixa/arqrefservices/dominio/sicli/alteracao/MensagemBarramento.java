package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;

@SuppressWarnings("serial")
@XmlRootElement
@XmlType(propOrder={"sibarHeader", "codigoRetorno", "origemRetorno", "mensagemRetorno"})
public abstract class MensagemBarramento implements Serializable {

	protected SibarHeader sibarHeader;
	
	protected String codigoRetorno;
	
	protected String origemRetorno;
	
	protected String mensagemRetorno;
	
	@XmlElement(name="sibar_base:HEADER")
	public SibarHeader getSibarHeader() {
		if(sibarHeader == null){
			sibarHeader = new SibarHeader();
		}
		return sibarHeader;
	}

	public void setSibarHeader(SibarHeader sibarHeader) {
		this.sibarHeader = sibarHeader;
	}
	
	@XmlElement(name="COD_RETORNO")
	public String getCodigoRetorno() {
		return this.codigoRetorno;
	}

	@XmlElement(name="ORIGEM_RETORNO")
	public String getOrigemRetorno() {
		return this.origemRetorno;
	}

	@XmlElement(name="MSG_RETORNO")
	public String getMensagemRetorno() {
		return this.mensagemRetorno;
	}
	
	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public void setOrigemRetorno(String origemRetorno) {
		this.origemRetorno = origemRetorno;
	}

	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
}
