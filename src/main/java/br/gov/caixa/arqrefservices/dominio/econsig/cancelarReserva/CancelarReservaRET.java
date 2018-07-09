package br.gov.caixa.arqrefservices.dominio.econsig.cancelarReserva;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemDadosRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, CancelarReservaDadosRET.class})
public class CancelarReservaRET extends SOAPEnvelopeResposta<CancelarReservaDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
