package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarMargem.ConsultarMargemRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsultarMargemTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ConsultarMargemTest.class.getName());
	
	@Test
	public void valorDaParcelaMaiorQueMargemDisponivel() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConsultarMargem   <<<<=====");
		
		verificaProxyRequerido();
		
		ConsultarMargemREQ consultarMargem = new ConsultarMargemREQ();
		SOAPCorpo<ConsultarMargemDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarMargemDadosREQ>();
		consultarMargem.setBody(corpoSOAP);
		
		ConsultarMargemDadosREQ dadosREQ = new ConsultarMargemDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setMatricula("27767740300");
		dadosREQ.setCpf("436.061.657-06");
		dadosREQ.setValorParcela(1.0);
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(consultarMargem, ConsultarMargemREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ConsultarMargemRET margemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConsultarMargemRET.class);
		
		margemRET.getBody().getDados();
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConsultarMargem   <<<<=====");
	
		Assert.assertTrue(margemRET.getBody().getDados().getSucesso());
		
	}	
	
	@Test
	public void listarVariasMargensZETRA() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: listarVariasMargensZETRA   <<<<=====");
		
		verificaProxyRequerido();
		
		ConsultarMargemREQ consultarMargem = new ConsultarMargemREQ();
		SOAPCorpo<ConsultarMargemDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarMargemDadosREQ>();
		consultarMargem.setBody(corpoSOAP);
		
		ConsultarMargemDadosREQ dadosREQ = new ConsultarMargemDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CEF_XML"));
		dadosREQ.setConvenio(getProperties().getProperty("10427080548000145"));
		dadosREQ.setUsuario(getProperties().getProperty("cef_xml"));
		dadosREQ.setSenha(getProperties().getProperty("cef12345"));
		dadosREQ.setCpf("721.317.614-57");
		dadosREQ.setValorParcela(1.0);
		dadosREQ.setMatriculaMultipla(true);
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(consultarMargem, ConsultarMargemREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET;
		//xmlRET = consumidor.executar(xmlREQ);

		//MOCK MOCK MOCK
		xmlRET = new ResourceLoader().with(getClass()).load("retorno_consulta_margem_ZETRA_varias_margens.xml").asText();
		log.info(xmlRET);
		//MOCK MOCK MOCK
		
		ConsultarMargemRET margemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConsultarMargemRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: listarVariasMargensZETRA   <<<<=====");
	
		Assert.assertTrue(margemRET.getBody().getDados().getSucesso());
	}	
	
}
