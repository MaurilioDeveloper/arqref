package br.gov.caixa.arqrefservices.dominio.serpro.alterarValorPrazoParcelaV1;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeRespostaSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, AlterarValorPrazoParcelaV1DadosRET.class})
public class AlterarValorPrazoParcelaV1RET extends SOAPEnvelopeRespostaSerpro<AlterarValorPrazoParcelaV1DadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
