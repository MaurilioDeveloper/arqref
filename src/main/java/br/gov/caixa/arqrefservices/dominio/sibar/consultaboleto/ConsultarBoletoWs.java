package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto;

import java.io.IOException;
import java.util.logging.Logger;

import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada.ConsultarBoletoEntrada;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada.ConsultarBoletoEntradaCorpo;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida.ConsultaCobrancaBancariaCorpo;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida.ConsultaCobrancaBancariaSoap;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsultarBoletoWs {
	
	private static Logger log = Logger.getLogger(ConsultarBoletoWs.class.getName());	
	
	private ConsultarBoletoEntradaCorpo consultarBoletoEntradaCorpo;

	public ConsultarBoletoWs(ConsultarBoletoEntradaCorpo consultarBoletoEntradaCorpo) {
		this.consultarBoletoEntradaCorpo = consultarBoletoEntradaCorpo;
	}
	
	
	public ConsultaCobrancaBancariaCorpo executar() throws IOException, ExcecaoSOAP{
								
		if(isRecuperarXml()){
			ResourceLoader loader = new ResourceLoader();
			String xmlMock = loader.with(getClass()).load("CONSULTAR_DADOS_BOLETO_SAIDA.xml").asText();						
			log.info("XML_SAIDA_MOCK: " + xmlMock);									
			return converterBoletoCorpo(xmlMock);						
		}
		
		String xmlRet =  new WSConsumidor(this.consultarBoletoEntradaCorpo.getUrl()).executar(gerarXmlEnvioSoap());
		
		log.info("XML_SAIDA: " + xmlRet);
		
		return converterBoletoCorpo(xmlRet);
	}


	private ConsultaCobrancaBancariaCorpo converterBoletoCorpo(String xmlRet) {
		ConsultaCobrancaBancariaSoap ccberet = ConverterXML.converterXmlSemSanitizacao(xmlRet, ConsultaCobrancaBancariaSoap.class);
		
		return ccberet.getBody().getDados();
	}

	private Boolean isRecuperarXml() {
		String isMockIncluirBoleto = System.getProperty("MOCK_CONSULTAR_BOLETO_SIGCB");
		return isMockIncluirBoleto != null && isMockIncluirBoleto.equals("true");
	}
	
	private String gerarXmlEnvioSoap() {
		
		ConsultarBoletoEntrada consultarBoletoEntrada = new ConsultarBoletoEntrada();		
		SOAPCorpo<ConsultarBoletoEntradaCorpo> corpoSOAP = new SOAPCorpo<ConsultarBoletoEntradaCorpo>();
		consultarBoletoEntrada.setBody(corpoSOAP);						
		corpoSOAP.setDados(this.consultarBoletoEntradaCorpo);
															
		String xmlEnvioSoap = ConverterXML.convertToXml(consultarBoletoEntrada, ConsultarBoletoEntrada.class);
		log.info("XML_REQ: " + xmlEnvioSoap);
		
		return xmlEnvioSoap;
	}		
}
