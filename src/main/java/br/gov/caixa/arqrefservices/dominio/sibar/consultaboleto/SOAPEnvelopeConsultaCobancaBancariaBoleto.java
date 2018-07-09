package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto;

import javax.xml.bind.annotation.XmlAttribute;

import br.gov.caixa.arqrefservices.soap.SOAPEnvelope;

public abstract class SOAPEnvelopeConsultaCobancaBancariaBoleto<T> extends SOAPEnvelope <T> {
	
	private static final long serialVersionUID = 4252281607736841991L;
		
	@XmlAttribute(name = "xmlns:bol")
	private String xmlnsBol = "http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto" ;
	
}
