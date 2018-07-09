package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.alterarConsignacao.AlterarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.alterarConsignacao.AlterarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.alterarConsignacao.AlterarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class AlterarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(AlterarConsignacaoTest.class.getName());
	
	@Test
	public void alterarConsignacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: AlterarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		AlterarConsignacaoREQ alterarConsignacao = new AlterarConsignacaoREQ();
		SOAPCorpo<AlterarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<AlterarConsignacaoDadosREQ>();
		alterarConsignacao.setBody(corpoSOAP);
		
		AlterarConsignacaoDadosREQ dadosREQ = new AlterarConsignacaoDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		dadosREQ.setAdeNumero(3179L);
		dadosREQ.setNovoAdeIdentificador("IMPORTADO 20100901");
		dadosREQ.setValorParcela(19350.16);
		dadosREQ.setValorLiberado(1000000.00);
		dadosREQ.setPrazo(Integer.valueOf(34));
		dadosREQ.setSenhaServidor("abc12345");
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(alterarConsignacao, AlterarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		AlterarConsignacaoRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, AlterarConsignacaoRET.class);
	
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: AlterarConsignacao   <<<<=====");
		Assert.assertTrue(dadosRetorno.getBody().getDados().getSucesso());
		
		
	}	
}
