package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.SOAPManutencaoCobrancaBancariaBoleto;
import br.gov.caixa.arqrefservices.soap.SOAPCabecalho;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;

@XmlRootElement(name="soapenv:Envelope")
@XmlSeeAlso({ SOAPCorpo.class, SOAPCabecalho.class, IncluirBoletoEntradaCorpo.class})
public class IncluirBoletoEntrada extends SOAPManutencaoCobrancaBancariaBoleto<IncluirBoletoEntradaCorpo> {
	
	private static final long serialVersionUID = 5301504551926228583L;

}
