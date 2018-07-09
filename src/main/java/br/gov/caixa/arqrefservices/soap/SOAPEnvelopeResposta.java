package br.gov.caixa.arqrefservices.soap;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"body"})
public abstract class SOAPEnvelopeResposta<T> implements Serializable {

	private static final long serialVersionUID = -6432687458574118315L;
	
	@XmlAttribute(name = "xmlns:soapenv")
	private String xmlns_soapenv = "http://schemas.xmlsoap.org/soap/envelope/";
		
	private SOAPCorpo<T> body;
	
	@XmlElement(name="soapenv:Body")
	public SOAPCorpo<T> getBody() {
		return body;
	}

	public void setBody(SOAPCorpo<T> body) {
		this.body = body;
	}
}
