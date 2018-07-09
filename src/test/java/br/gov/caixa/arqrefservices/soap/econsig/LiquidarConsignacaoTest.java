package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.liquidarConsignacao.LiquidarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.liquidarConsignacao.LiquidarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.liquidarConsignacao.LiquidarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;


public class LiquidarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(LiquidarConsignacaoTest.class.getName());
	
	@Test
	public void liquidarConsignacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: LiquidarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		LiquidarConsignacaoREQ mensagemREQ = new LiquidarConsignacaoREQ();
		SOAPCorpo<LiquidarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<LiquidarConsignacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		LiquidarConsignacaoDadosREQ dadosREQ = new LiquidarConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));		
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));						
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));		
		dadosREQ.setAdeNumero(3179L);
												
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, LiquidarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		LiquidarConsignacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, LiquidarConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: LiquidarConsignacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
