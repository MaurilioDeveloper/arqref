package br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.commom.SOAPEnvelopeEconsig;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, ConsultarMargemDadosREQ.class})
public class ConsultarMargemREQ extends SOAPEnvelopeEconsig<ConsultarMargemDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
