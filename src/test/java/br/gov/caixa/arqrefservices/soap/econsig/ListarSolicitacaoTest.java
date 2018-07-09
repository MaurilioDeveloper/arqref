package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.listarSolicitacao.ListarSolicitacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.listarSolicitacao.ListarSolicitacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.listarSolicitacao.ListarSolicitacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;


public class ListarSolicitacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ListarSolicitacaoTest.class.getName());
	
	@Test
	public void listarSolicitacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ListarSolicitacao   <<<<=====");
		
		verificaProxyRequerido();
		
		ListarSolicitacaoREQ mensagemREQ = new ListarSolicitacaoREQ();
		SOAPCorpo<ListarSolicitacaoDadosREQ> corpoSOAP = new SOAPCorpo<ListarSolicitacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		ListarSolicitacaoDadosREQ dadosREQ = new ListarSolicitacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));		
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));						
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");

		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ListarSolicitacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ListarSolicitacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ListarSolicitacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ListarSolicitacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
