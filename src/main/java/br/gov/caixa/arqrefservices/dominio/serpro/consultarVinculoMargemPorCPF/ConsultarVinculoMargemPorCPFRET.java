package br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeRespostaSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, ConsultarVinculoMargemPorCPFDadosRET.class})
public class ConsultarVinculoMargemPorCPFRET extends SOAPEnvelopeRespostaSerpro<ConsultarVinculoMargemPorCPFDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
