package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarRenegociacao.CancelarRenegociacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarRenegociacao.CancelarRenegociacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.cancelarRenegociacao.CancelarRenegociacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class CancelarRenegociacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(CancelarRenegociacaoTest.class.getName());
	
	@Test
	public void cancelarRenegociacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: CancelarRenegociacao   <<<<=====");
		
		verificaProxyRequerido();
		
		CancelarRenegociacaoREQ cancelarRenegociacao = new CancelarRenegociacaoREQ();
		SOAPCorpo<CancelarRenegociacaoDadosREQ> corpoSOAP = new SOAPCorpo<CancelarRenegociacaoDadosREQ>();
		cancelarRenegociacao.setBody(corpoSOAP);
		
		CancelarRenegociacaoDadosREQ dadosREQ = new CancelarRenegociacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(cancelarRenegociacao, CancelarRenegociacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		CancelarRenegociacaoRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, CancelarRenegociacaoRET.class);
	
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: CancelarRenegociacao   <<<<=====");
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
	}	
}
