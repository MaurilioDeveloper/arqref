package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarReserva.CancelarReservaDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarReserva.CancelarReservaREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarReserva.CancelarReservaRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class CancelarReservaTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(CancelarReservaTest.class.getName());
	
	@Test
	public void autorizarReserva() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: CancelarReserva   <<<<=====");
		
		verificaProxyRequerido();
		
		CancelarReservaREQ reserva = new CancelarReservaREQ();
		SOAPCorpo<CancelarReservaDadosREQ> corpoSOAP = new SOAPCorpo<CancelarReservaDadosREQ>();
		reserva.setBody(corpoSOAP);
		
		CancelarReservaDadosREQ dadosREQ = new CancelarReservaDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(reserva, CancelarReservaREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		CancelarReservaRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, CancelarReservaRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: CancelarReserva   <<<<=====");
	
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
	}	
}
