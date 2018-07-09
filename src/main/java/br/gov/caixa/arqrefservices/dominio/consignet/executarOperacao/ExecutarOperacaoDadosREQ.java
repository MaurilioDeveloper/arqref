package br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ser:executarOperacao")
@XmlType(propOrder={"xmlParam"})
public class ExecutarOperacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
		
	private String xmlParam;
	
	public ExecutarOperacaoDadosREQ() {	
	}
	
	public ExecutarOperacaoDadosREQ(String xmlParam) {
		this.setXmlParam(xmlParam);		
	}
	
	@XmlElement(name="ser:xmlParam")
	public String getXmlParam() {
		return xmlParam;
	}
	
	public void setXmlParam(String xmlParam) {
		this.xmlParam = "<![CDATA[" + xmlParam + "]]>";
	}	
	
}