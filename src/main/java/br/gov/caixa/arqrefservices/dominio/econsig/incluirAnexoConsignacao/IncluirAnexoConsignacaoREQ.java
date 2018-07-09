package br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.econsig.commom.SOAPEnvelopeEconsig;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, IncluirAnexoConsignacaoDadosREQ.class})
public class IncluirAnexoConsignacaoREQ extends SOAPEnvelopeEconsig<IncluirAnexoConsignacaoDadosREQ> {
	
	private static final long serialVersionUID = 5301504551926228583L;

	@XmlAttribute(name = "xmlns:anex")
	private String xmlns = "Anexo";
	
}
