package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.detalharConsultaConsignacao.DetalharConsultaConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.detalharConsultaConsignacao.DetalharConsultaConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.detalharConsultaConsignacao.DetalharConsultaConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class DetalharConsultarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(DetalharConsultarConsignacaoTest.class.getName());
	  
	@Test
	public void detalharDetalharConsultarConsignacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: DetalharConsultarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		DetalharConsultaConsignacaoREQ detalhar = new DetalharConsultaConsignacaoREQ();
		SOAPCorpo<DetalharConsultaConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<DetalharConsultaConsignacaoDadosREQ>();
		detalhar.setBody(corpoSOAP);
		
		DetalharConsultaConsignacaoDadosREQ dadosREQ = new DetalharConsultaConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");
		dadosREQ.setOrgaoCodigo("001000");
		dadosREQ.setEstabelecimentoCodigo("001");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(detalhar, DetalharConsultaConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		DetalharConsultaConsignacaoRET margemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, DetalharConsultaConsignacaoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: DetalharConsultarConsignacao   <<<<=====");
	
		Assert.assertTrue(margemRET.getBody().getDados().getSucesso());
		
		
		
	}	
}
