package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.saida;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, IncluirBoletoSaidaCorpo.class})
public class IncluirBoletoSaida extends SOAPEnvelopeResposta<IncluirBoletoSaidaCorpo> {

	private static final long serialVersionUID = 4926269133133840246L;

}
