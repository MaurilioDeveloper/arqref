package br.gov.caixa.arqrefservices.soap.econsig;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.econsig.reservarMargem.ReservarMargemDadosREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.reservarMargem.ReservarMargemREQ;
import br.gov.caixa.arqrefservices.dominio.econsig.reservarMargem.ReservarMargemRET;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ReservarMargemTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ReservarMargemTest.class.getName());
	
	@Test
	public void reservarMargemTest() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ReservarMargem   <<<<=====");
		
		verificaProxyRequerido();
		
		ReservarMargemREQ mensagemREQ = new ReservarMargemREQ();
		SOAPCorpo<ReservarMargemDadosREQ> corpoSOAP = new SOAPCorpo<ReservarMargemDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
		
		ReservarMargemDadosREQ dadosREQ = new ReservarMargemDadosREQ();
		dadosREQ.setCliente(getProperties().getProperty("CLIENTE_ZETRA"));		
		dadosREQ.setConvenio(getProperties().getProperty("CONVENIO_ZETRA"));						
		dadosREQ.setUsuario(getProperties().getProperty("USUARIO_ZETRA"));
		dadosREQ.setSenha(getProperties().getProperty("SENHA_ZETRA"));
		
		dadosREQ.setCpf("541.878.673-33");
		dadosREQ.setMatricula("27594");
		dadosREQ.setOrgaoCodigo("001000");
		dadosREQ.setEstabelecimentoCodigo("001");
		dadosREQ.setSenhaServidor("abc12345");
		dadosREQ.setValorParcela(193.50);
		dadosREQ.setOrgaoCodigo("001000");
		dadosREQ.setEstabelecimentoCodigo("001");
		dadosREQ.setSenhaServidor("abc12345");		
		dadosREQ.setPrazo(10);
		dadosREQ.setValorLiberado(100.00);
		dadosREQ.setCodVerba("304");
		
								
		corpoSOAP.setDados(dadosREQ);
		
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ReservarMargemREQ.class);
				
		WSConsumidor consumidor = new WSConsumidor(getProperties().getProperty("URL_ZETRA"));
		String xmlRET = consumidor.executar(xmlREQ);
		
		ReservarMargemRET mensagemRET = ConverterXML.converterXmlSemSanitizacao(xmlRET, ReservarMargemRET.class);
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ReservarMargem   <<<<=====");
	
		Assert.assertFalse(mensagemRET.getBody().getDados().getSucesso());
		
	}	
}
