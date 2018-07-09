package br.gov.caixa.arqrefservices.dominio.econsig.validarAcesso;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPEnvelopeResposta;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, ValidarAcessoDadosRET.class})
public class ValidarAcessoRET extends SOAPEnvelopeResposta<ValidarAcessoDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
