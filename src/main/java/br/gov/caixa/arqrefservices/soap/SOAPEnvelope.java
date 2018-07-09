package br.gov.caixa.arqrefservices.soap;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"header", "body"})
public abstract class SOAPEnvelope<T> implements Serializable {

	private static final long serialVersionUID = 718702224856429165L;
	
	private SOAPCabecalho header;
	
	private SOAPCorpo<T> body;
	
	@XmlAttribute(name = "xmlns:soapenv")
	private String xmlns_soapenv = "http://schemas.xmlsoap.org/soap/envelope/";
	
	@XmlAttribute(name = "xmlns:sib")
	private String xmlnsSib = "http://caixa.gov.br/sibar";
	
	@XmlElement(name="soapenv:Header")
	public SOAPCabecalho getHeader() {
		if (header == null) {
			setHeader(new SOAPCabecalho());
		}
		
		return header;
	}
	
	@XmlElement(name="soapenv:Body")
	public SOAPCorpo<T> getBody() {
		return body;
	}

	public void setHeader(SOAPCabecalho header) {
		this.header = header;
	}
	
	public void setBody(SOAPCorpo<T> body) {
		this.body = body;
	}
}
