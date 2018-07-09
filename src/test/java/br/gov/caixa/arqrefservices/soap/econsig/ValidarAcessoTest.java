package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.validarAcesso.ValidarAcessoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.validarAcesso.ValidarAcessoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.validarAcesso.ValidarAcessoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ValidarAcessoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ValidarAcessoTest.class.getName());
	
	@Test
	public void validarAcessoTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ValidarAcesso   <<<<=====");
		
		verificaProxyRequerido();
		
		ValidarAcessoREQ mensagemREQ = new ValidarAcessoREQ();
		SOAPCorpo<ValidarAcessoDadosREQ> corpoSOAP = new SOAPCorpo<ValidarAcessoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		ValidarAcessoDadosREQ dadosREQ = new ValidarAcessoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setMatricula("27594");
		dadosREQ.setCpf("541.878.673-33");
		dadosREQ.setOrgaoCodigo("001000");
		dadosREQ.setEstabelecimentoCodigo("001");
		dadosREQ.setSenhaServidor("abc12345");
		
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ValidarAcessoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ValidarAcessoRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ValidarAcessoRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ValidarAcesso   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
