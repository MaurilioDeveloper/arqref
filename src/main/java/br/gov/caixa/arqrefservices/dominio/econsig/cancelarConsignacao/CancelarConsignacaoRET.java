package br.gov.caixa.arqrefservices.dominio.econsig.cancelarConsignacao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemDadosRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, CancelarConsignacaoDadosRET.class})
public class CancelarConsignacaoRET extends SOAPEnvelopeResposta<CancelarConsignacaoDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
