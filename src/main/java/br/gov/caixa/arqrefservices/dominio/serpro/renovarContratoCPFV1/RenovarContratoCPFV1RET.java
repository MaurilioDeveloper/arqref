package br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeRespostaSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, RenovarContratoCPFV1DadosRET.class})
public class RenovarContratoCPFV1RET extends SOAPEnvelopeRespostaSerpro<RenovarContratoCPFV1DadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
