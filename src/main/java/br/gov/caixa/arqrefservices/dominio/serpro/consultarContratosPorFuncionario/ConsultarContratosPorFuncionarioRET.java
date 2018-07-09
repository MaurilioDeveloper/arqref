package br.gov.caixa.arqrefservices.dominio.serpro.consultarContratosPorFuncionario;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.commom.SOAPEnvelopeRespostaSerpro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, ConsultarContratosPorFuncionarioDadosRET.class})
public class ConsultarContratosPorFuncionarioRET extends SOAPEnvelopeRespostaSerpro<ConsultarContratosPorFuncionarioDadosRET> {

	private static final long serialVersionUID = 4926269133133840246L;

}
