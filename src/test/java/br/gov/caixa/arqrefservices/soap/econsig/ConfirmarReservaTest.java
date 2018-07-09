package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.confirmarReserva.ConfirmarReservaDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.confirmarReserva.ConfirmarReservaREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.confirmarReserva.ConfirmarReservaRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConfirmarReservaTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ConfirmarReservaTest.class.getName());
	
	@Test
	public void confirmarReserva() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConfirmarReserva   <<<<=====");
		
		verificaProxyRequerido();
		
		ConfirmarReservaREQ reserva = new ConfirmarReservaREQ();
		SOAPCorpo<ConfirmarReservaDadosREQ> corpoSOAP = new SOAPCorpo<ConfirmarReservaDadosREQ>();
		reserva.setBody(corpoSOAP);
		
		ConfirmarReservaDadosREQ dadosREQ = new ConfirmarReservaDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(reserva, ConfirmarReservaREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ConfirmarReservaRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConfirmarReservaRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConfirmarReserva   <<<<=====");
	
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
	}	
}
