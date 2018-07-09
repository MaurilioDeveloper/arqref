package br.gov.caixa.arqrefservices.dominio.econsig.confirmarReserva;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemDadosRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, ConfirmarReservaDadosRET.class})
public class ConfirmarReservaRET extends SOAPEnvelopeResposta<ConfirmarReservaDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
 