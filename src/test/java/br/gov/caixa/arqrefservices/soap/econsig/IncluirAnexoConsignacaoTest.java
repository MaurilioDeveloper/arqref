package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.jboss.util.Base64;
import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.Anexo;
import br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao.IncluirAnexoConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao.IncluirAnexoConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao.IncluirAnexoConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class IncluirAnexoConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(IncluirAnexoConsignacaoTest.class.getName());
	
	@Test
	public void incluirAnexoConsignacaoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: IncluirAnexoConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		IncluirAnexoConsignacaoREQ mensagemREQ = new IncluirAnexoConsignacaoREQ();
		SOAPCorpo<IncluirAnexoConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<IncluirAnexoConsignacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		IncluirAnexoConsignacaoDadosREQ dadosREQ = new IncluirAnexoConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));		
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));						
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		
		dadosREQ.setDescricaoAnexo("");
		
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setAdeIdentificador("IMPORTADO 20100901");
		
		Anexo anexo = new Anexo();
		anexo.setNomeArquivo("");
		anexo.setArquivo(Base64.encodeBytes("cid:118530912747".getBytes()));
					
		dadosREQ.setAnexo(anexo);
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, IncluirAnexoConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		IncluirAnexoConsignacaoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, IncluirAnexoConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: IncluirAnexoConsignacao   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
