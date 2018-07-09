package br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.consignet.WebServiceConsignet;

@XmlSeeAlso({WebServiceConsignet.class})
public class ExecutarOperacaoReturn implements Serializable {

	private static final long serialVersionUID = -7139905343726189156L;

	private WebServiceConsignet webservice;

	@XmlElement(name="webservice")
	public WebServiceConsignet getWebservice() {
		return webservice;
	}

	public void setWebservice(WebServiceConsignet webservice) {
		this.webservice = webservice;
	}
	
}
