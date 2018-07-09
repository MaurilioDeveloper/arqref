package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.simularConsignacao.SimularConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.simularConsignacao.SimularConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.simularConsignacao.SimularConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class SimularConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(SimularConsignacaoTest.class.getName());
	
	@Test
	public void simularConsignacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: SimularConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		SimularConsignacaoREQ mensagemREQ = new SimularConsignacaoREQ();
		SOAPCorpo<SimularConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<SimularConsignacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		SimularConsignacaoDadosREQ dadosREQ = new SimularConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));		
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");
		dadosREQ.setOrgaoCodigo("001000");
		dadosREQ.setEstabelecimentoCodigo("001");
		dadosREQ.setPrazo(10);
		dadosREQ.setValorParcela(1500.00);
		dadosREQ.setValorLiberado(150.00);
		dadosREQ.setCodVerba("304");
		
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, SimularConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		SimularConsignacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, SimularConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: SimularConsignacao   <<<<=====");
	
		Assert.assertTrue(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
