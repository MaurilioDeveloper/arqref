package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.reativarConsignacao.ReativarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.reativarConsignacao.ReativarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.reativarConsignacao.ReativarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ReativarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ReativarConsignacaoTest.class.getName());
	
	@Test
	public void reativarConsignacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ReativarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		ReativarConsignacaoREQ mensagemREQ = new ReativarConsignacaoREQ();
		SOAPCorpo<ReativarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<ReativarConsignacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		ReativarConsignacaoDadosREQ dadosREQ = new ReativarConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));		
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));						
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		dadosREQ.setCodigoMotivoOperacao("REAT");
		dadosREQ.setObsMotivoOperacao("OBSERVACAO");
										
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ReativarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ReativarConsignacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ReativarConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ReativarConsignacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
