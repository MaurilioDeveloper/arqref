package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.autorizarReserva.AutorizarReservaDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.autorizarReserva.AutorizarReservaREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.autorizarReserva.AutorizarReservaRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class AutorizarReservaTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(AutorizarReservaTest.class.getName());
	
	@Test
	public void autorizarReserva() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: AutorizarReserva   <<<<=====");
		
		verificaProxyRequerido();
		
		AutorizarReservaREQ autorizarReserva = new AutorizarReservaREQ();
		SOAPCorpo<AutorizarReservaDadosREQ> corpoSOAP = new SOAPCorpo<AutorizarReservaDadosREQ>();
		autorizarReserva.setBody(corpoSOAP);
		
		AutorizarReservaDadosREQ dadosREQ = new AutorizarReservaDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		dadosREQ.setSenhaServidor("abc12345");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(autorizarReserva, AutorizarReservaREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		AutorizarReservaRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, AutorizarReservaRET.class);
	
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: AutorizarReserva   <<<<=====");
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
		
	}	
}
