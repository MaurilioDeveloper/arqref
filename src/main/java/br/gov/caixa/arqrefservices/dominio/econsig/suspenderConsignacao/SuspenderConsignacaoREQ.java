package br.gov.caixa.arqrefservices.dominio.econsig.suspenderConsignacao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.commom.SOAPEnvelopeEconsig;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, SuspenderConsignacaoDadosREQ.class})
public class SuspenderConsignacaoREQ extends SOAPEnvelopeEconsig<SuspenderConsignacaoDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
