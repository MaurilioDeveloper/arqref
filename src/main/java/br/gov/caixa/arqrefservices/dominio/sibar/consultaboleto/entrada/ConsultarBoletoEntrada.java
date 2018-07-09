package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.SOAPEnvelopeConsultaCobancaBancariaBoleto;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, ConsultarBoletoEntradaCorpo.class})
public class ConsultarBoletoEntrada extends SOAPEnvelopeConsultaCobancaBancariaBoleto<ConsultarBoletoEntradaCorpo> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
