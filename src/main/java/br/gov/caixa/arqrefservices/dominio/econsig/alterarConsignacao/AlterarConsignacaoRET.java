package br.gov.caixa.arqrefservices.dominio.econsig.alterarConsignacao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, AlterarConsignacaoDadosRET.class})
public class AlterarConsignacaoRET extends SOAPEnvelopeResposta<AlterarConsignacaoDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
