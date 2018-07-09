package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="COCLI_ATIVO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CocliAtivo  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2041076687953241174L;

	private String cocliAtivo;
	
	private String flagDadosMinIncompletos;

	@XmlElement(name="COCLI_ATIVO")
	public String getCocliAtivo() {
		return cocliAtivo;
	}

	public void setCocliAtivo(String cocliAtivo) {
		this.cocliAtivo = cocliAtivo;
	}

	@XmlElement(name="FLAG_DADOS_MIN_INCOMPL")
	public String getFlagDadosMinIncompletos() {
		return flagDadosMinIncompletos;
	}

	public void setFlagDadosMinIncompletos(String flagDadosMinIncompletos) {
		this.flagDadosMinIncompletos = flagDadosMinIncompletos;
	}

	@Override
	public String toString() {
		return "CocliAtivo [cocliAtivo=" + cocliAtivo
				+ ", flagDadosMinIncompletos=" + flagDadosMinIncompletos + "]";
	}
	
	

}
