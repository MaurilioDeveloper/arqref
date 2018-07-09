package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, ConsultaCobrancaBancariaCorpo.class})
public class ConsultaCobrancaBancariaSoap extends SOAPEnvelopeResposta<ConsultaCobrancaBancariaCorpo> {

	private static final long serialVersionUID = 4926269133133840246L;

}
