package br.gov.caixa.arqrefservices.dominio.consignet;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({WebServiceConsignet.class})
public class XmlEntrada implements Serializable {

	private static final long serialVersionUID = 5137701738261682792L;
	
	private WebServiceConsignet webservice;

	public WebServiceConsignet getWebservice() {
		return webservice;
	}

	public void setWebservice(WebServiceConsignet webservice) {
		this.webservice = webservice;
	}	
}
