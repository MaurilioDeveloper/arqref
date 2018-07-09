package br.gov.caixa.arqrefservices.dominio.econsig.autorizarReserva;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemDadosRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, AutorizarReservaDadosRET.class})
public class AutorizarReservaRET extends SOAPEnvelopeResposta<AutorizarReservaDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
