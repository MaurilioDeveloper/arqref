package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.suspenderConsignacao.SuspenderConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.suspenderConsignacao.SuspenderConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.suspenderConsignacao.SuspenderConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class SuspenderConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(SuspenderConsignacaoTest.class.getName());
	
	@Test
	public void suspenderConsignacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: SuspenderConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		SuspenderConsignacaoREQ mensagemREQ = new SuspenderConsignacaoREQ();
		SOAPCorpo<SuspenderConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<SuspenderConsignacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		SuspenderConsignacaoDadosREQ dadosREQ = new SuspenderConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario("27594");
		dadosREQ.setSenha("541.878.673-33");
		dadosREQ.setAdeNumero(Long.valueOf("001000"));
		dadosREQ.setAdeIdentificador("001");
		dadosREQ.setCodigoMotivoOperacao("abc12345");
		dadosREQ.setObsMotivoOperacao("abc12345");
		
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, SuspenderConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		SuspenderConsignacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, SuspenderConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: SuspenderConsignacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
