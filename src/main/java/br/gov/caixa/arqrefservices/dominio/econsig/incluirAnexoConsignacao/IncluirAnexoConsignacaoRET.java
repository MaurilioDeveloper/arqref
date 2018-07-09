package br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, IncluirAnexoConsignacaoDadosRET.class})
public class IncluirAnexoConsignacaoRET extends SOAPEnvelopeResposta<IncluirAnexoConsignacaoDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
