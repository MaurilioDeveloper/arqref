package br.gov.caixa.arqrefservices.dominio.econsig.commom;

import javax.xml.bind.annotation.XmlAttribute;

import br.gov.caixa.arqrefservices.soap.SOAPEnvelope;

public abstract class SOAPEnvelopeEconsig<T> extends SOAPEnvelope <T> {
	
	private static final long serialVersionUID = 4252281607736841991L;
	
	@XmlAttribute(name = "xmlns:hos")
	private String xmlns_urn = "HostaHostService";

}
