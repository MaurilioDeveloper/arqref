package br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.consignet.common.SOAPEnvelopeConsignet;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ExecutarOperacaoDadosREQ.class})
public class ExecutarOperacaoREQ extends SOAPEnvelopeConsignet<ExecutarOperacaoDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;
	
}
