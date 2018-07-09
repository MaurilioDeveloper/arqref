package br.gov.caixa.arqrefservices.dominio.serpro.encerrarContrato;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, EncerrarContratoDadosREQ.class})
public class EncerrarContratoREQ extends SOAPEnvelopeSerpro<EncerrarContratoDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
