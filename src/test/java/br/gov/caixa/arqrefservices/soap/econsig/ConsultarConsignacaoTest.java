package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarConsignacao.ConsultarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarConsignacao.ConsultarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.consultarConsignacao.ConsultarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsultarConsignacaoTest extends SystemProxyFabrica {
	  
	private static Logger log = Logger.getLogger(ConsultarConsignacaoTest.class.getName());
	
	@Test
	public void operacaoRealziadaComSucessoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConsultarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		ConsultarConsignacaoREQ consultarConsignacaoREQ = new ConsultarConsignacaoREQ();
		SOAPCorpo<ConsultarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarConsignacaoDadosREQ>();
		
		ConsultarConsignacaoDadosREQ dadosREQ = new ConsultarConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");
		dadosREQ.setOrgaoCodigo("001000");
		dadosREQ.setEstabelecimentoCodigo("001");
		
		
		corpoSOAP.setDados(dadosREQ);
		consultarConsignacaoREQ.setBody(corpoSOAP);
		
		String xmlREQ = ConverterXML.convertToXml(consultarConsignacaoREQ, ConsultarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ConsultarConsignacaoRET margemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConsultarConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConsultarConsignacao   <<<<=====");
	
		Assert.assertTrue(margemRET.getBody().getDados().getSucesso());
		
		
		
	}	
}
