package br.gov.caixa.arqrefservices.dominio.consignet.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelope;

@XmlSeeAlso({SOAPCorpo.class, SOAPCabecalho.class})
public abstract class SOAPEnvelopeConsignet<T> extends SOAPEnvelope<T> {
	
	private static final long serialVersionUID = -3156570059480216567L;
	
	@XmlAttribute(name = "xmlns:ser")
	private String xmlns_ser = "http://services.consignet.db1.com.br";

}