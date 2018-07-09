package br.gov.caixa.arqrefservices.dominio.serpro.alterarValorParcela;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeRespostaSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soap:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, AlterarValorParcelaDadosRET.class})
public class AlterarValorParcelaRET extends SOAPEnvelopeRespostaSerpro<AlterarValorParcelaDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
