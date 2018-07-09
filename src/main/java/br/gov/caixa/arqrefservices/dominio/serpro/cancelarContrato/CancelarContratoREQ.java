package br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, CancelarContratoDadosREQ.class})
public class CancelarContratoREQ extends SOAPEnvelopeSerpro<CancelarContratoDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;
	
}
