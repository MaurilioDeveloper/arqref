package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.confirmarSolicitacao.ConfirmarSolicitacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.confirmarSolicitacao.ConfirmarSolicitacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.confirmarSolicitacao.ConfirmarSolicitacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConfirmarSolicitacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ConfirmarSolicitacaoTest.class.getName());
	
	@Test
	public void confirmarSolicitacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConfirmarSolicitacao   <<<<=====");
		
		verificaProxyRequerido();
		
		ConfirmarSolicitacaoREQ solicitacao = new ConfirmarSolicitacaoREQ();
		SOAPCorpo<ConfirmarSolicitacaoDadosREQ> corpoSOAP = new SOAPCorpo<ConfirmarSolicitacaoDadosREQ>();
		solicitacao.setBody(corpoSOAP);
		
		ConfirmarSolicitacaoDadosREQ dadosREQ = new ConfirmarSolicitacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(solicitacao, ConfirmarSolicitacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ConfirmarSolicitacaoRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, ConfirmarSolicitacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConfirmarSolicitacao   <<<<=====");
	
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
	}	
}
