package br.gov.caixa.arqrefservices.dominio.serpro.consultarContratosPorFuncionarioV1;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, ConsultarContratosPorFuncionarioV1DadosREQ.class})
public class ConsultarContratosPorFuncionarioV1REQ extends SOAPEnvelopeSerpro<ConsultarContratosPorFuncionarioV1DadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
