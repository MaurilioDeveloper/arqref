package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.Arrays;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.renegociarConsignacao.RenegociarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.renegociarConsignacao.RenegociarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.renegociarConsignacao.RenegociarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class RenegociarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(RenegociarConsignacaoTest.class.getName());
	
	@Test
	public void renegociarConsignacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: RenegociarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		RenegociarConsignacaoREQ mensagemREQ = new RenegociarConsignacaoREQ();
		SOAPCorpo<RenegociarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<RenegociarConsignacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		RenegociarConsignacaoDadosREQ dadosREQ = new RenegociarConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		
		dadosREQ.setAdeNumeros(Arrays.asList("3179"));
		dadosREQ.setAdeIdentificador(Arrays.asList("IMPORTADO 20100901"));
		
		dadosREQ.setValorParcela(19350.16);
		dadosREQ.setValorLiberado(13496.18);
		dadosREQ.setCodVerba("304");
		dadosREQ.setPrazo(10);
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");
		
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, RenegociarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		RenegociarConsignacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, RenegociarConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: RenegociarConsignacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
