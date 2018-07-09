package br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeRespostaSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soap:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, CancelarContratoDadosRET.class})
public class CancelarContratoRET extends SOAPEnvelopeRespostaSerpro<CancelarContratoDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
