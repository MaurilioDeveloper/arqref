package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarConsignacao.CancelarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarConsignacao.CancelarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarConsignacao.CancelarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class CancelarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(CancelarConsignacaoTest.class.getName());
	
	@Test
	public void cancelarConsignacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: CancelarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		CancelarConsignacaoREQ cancelarConsignacao = new CancelarConsignacaoREQ();
		SOAPCorpo<CancelarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<CancelarConsignacaoDadosREQ>();
		cancelarConsignacao.setBody(corpoSOAP);
		
		CancelarConsignacaoDadosREQ dadosREQ = new CancelarConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(cancelarConsignacao, CancelarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		CancelarConsignacaoRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, CancelarConsignacaoRET.class);
	
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: CancelarConsignacao   <<<<=====");
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
		
	}	
}
