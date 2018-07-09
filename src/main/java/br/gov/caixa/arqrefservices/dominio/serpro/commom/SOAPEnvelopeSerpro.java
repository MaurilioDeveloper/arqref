package br.gov.caixa.arqrefservices.dominio.serpro.commom;

import javax.xml.bind.annotation.XmlAttribute;

import br.gov.caixa.arqrefservices.soap.SOAPEnvelope;

public abstract class SOAPEnvelopeSerpro<T> extends SOAPEnvelope <T> {
	
	private static final long serialVersionUID = 4252281607736841991L;
	
	@XmlAttribute(name = "soapenv:encodingStyle")
	private String soapenv_encodingStyle = "http://schemas.xmlsoap.org/soap/encoding/";
	
	@XmlAttribute(name = "xmlns:urn")
	private String xmlns_urn = "urn:consignataria";

}
