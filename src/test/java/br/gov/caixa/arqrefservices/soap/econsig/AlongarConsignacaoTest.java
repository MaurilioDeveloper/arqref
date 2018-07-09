package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.Date;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.alongarConsignacao.AlongarConsignacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.alongarConsignacao.AlongarConsignacaoREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.alongarConsignacao.AlongarConsignacaoRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class AlongarConsignacaoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(AlongarConsignacaoTest.class.getName());
	
	@Test
	public void alongarConsignacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: AlongarConsignacao   <<<<=====");
		
		verificaProxyRequerido();
		
		AlongarConsignacaoREQ alongarConsignacao = new AlongarConsignacaoREQ();
		SOAPCorpo<AlongarConsignacaoDadosREQ> corpoSOAP = new SOAPCorpo<AlongarConsignacaoDadosREQ>();
		alongarConsignacao.setBody(corpoSOAP);
		
		AlongarConsignacaoDadosREQ dadosREQ = new AlongarConsignacaoDadosREQ();
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
		
		dadosREQ.setDataNascimento(new Date());
		
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(alongarConsignacao, AlongarConsignacaoREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		AlongarConsignacaoRET dadosRetorno = ConverterXML.converterXmlSemSanitizacao(xmlRET, AlongarConsignacaoRET.class);
	
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: AlongarConsignacao   <<<<=====");
		Assert.assertFalse(dadosRetorno.getBody().getDados().getSucesso());
		
		
	}	
}
