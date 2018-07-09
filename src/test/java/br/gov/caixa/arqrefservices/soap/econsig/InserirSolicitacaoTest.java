package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.inserirSolicitacao.InserirSolicitacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.inserirSolicitacao.InserirSolicitacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.inserirSolicitacao.InserirSolicitacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;


public class InserirSolicitacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(InserirSolicitacaoTest.class.getName());
	
	@Test
	public void inserirSolicitacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: InserirSolicitacao   <<<<=====");
		
		verificaProxyRequerido();
		
		InserirSolicitacaoREQ mensagemREQ = new InserirSolicitacaoREQ();
		SOAPCorpo<InserirSolicitacaoDadosREQ> corpoSOAP = new SOAPCorpo<InserirSolicitacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		InserirSolicitacaoDadosREQ dadosREQ = new InserirSolicitacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));		
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));						
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");
		dadosREQ.setValorParcela(133.19);
		dadosREQ.setPrazo(10);
		dadosREQ.setCodVerba("304");
		
		dadosREQ.setEndereco("");
		dadosREQ.setBairro("");
		dadosREQ.setCidade("");
		dadosREQ.setUf("");
		dadosREQ.setCep("");
		dadosREQ.setTelefone("");

		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, InserirSolicitacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		InserirSolicitacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, InserirSolicitacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: InserirSolicitacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
