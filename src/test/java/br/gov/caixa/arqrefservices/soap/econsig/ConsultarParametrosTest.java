package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarParametros.ConsultarParametrosDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarParametros.ConsultarParametrosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarParametros.ConsultarParametrosRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsultarParametrosTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ConsultarParametrosTest.class.getName());
	
	@Test
	public void valorDaParcelaMaiorQueMargemDisponivel() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConsultarParametros   <<<<=====");
		
		verificaProxyRequerido();
		
		ConsultarParametrosREQ mensagemREQ = new ConsultarParametrosREQ();
		SOAPCorpo<ConsultarParametrosDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarParametrosDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		ConsultarParametrosDadosREQ dadosREQ = new ConsultarParametrosDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setCodVerba("304");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ConsultarParametrosREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ConsultarParametrosRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConsultarParametrosRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConsultarParametros   <<<<=====");
	
		Assert.assertTrue(mensagemRET.getBody().getDados().getSucesso());
		
	}	
	
	@Test
	public void litarServicosContratados() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConsultarParametros   <<<<=====");
		
		verificaProxyRequerido();
		
		ConsultarParametrosREQ mensagemREQ = new ConsultarParametrosREQ();
		SOAPCorpo<ConsultarParametrosDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarParametrosDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		ConsultarParametrosDadosREQ dadosREQ = new ConsultarParametrosDadosREQ();
		
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA_CEF_XML"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
				

		dadosREQ.setConvenio("10427080548000145");

						
		
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ConsultarParametrosREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ConsultarParametrosRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConsultarParametrosRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConsultarParametros   <<<<=====");
	
		Assert.assertTrue(mensagemRET.getBody().getDados().getSucesso());
		
	}
	
}
