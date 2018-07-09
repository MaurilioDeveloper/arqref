package br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, ConsultarVinculoMargemPorCPFDadosREQ.class})
public class ConsultarVinculoMargemPorCPFREQ extends SOAPEnvelopeSerpro<ConsultarVinculoMargemPorCPFDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
