package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.dominio.consignet.reservaComposta.ReservaCompostaDadosREQ;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ReservaCompostaTest extends SystemProxyFabrica {
	
	@Test
	public void reservaCompostaTest() throws Exception {
								
		ReservaCompostaDadosREQ dadosREQ = new ReservaCompostaDadosREQ();		
		
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");
		
		dadosREQ.setMatricula("375659013");				
		dadosREQ.setCpf("59810122268");		
		dadosREQ.setOrigem("01");			
		dadosREQ.setVlParcela("00.25");
		dadosREQ.setQtdeParcela("1");
		dadosREQ.setConvenio("3697246");		
		dadosREQ.setContratos("29740049");
		dadosREQ.setJurosMensal("0.791");
		dadosREQ.setVlLiquidoLiberado("0.05");
		dadosREQ.setDtLiberacaoCredito("15/01/2016");
		dadosREQ.setFolha1Desconto("201602");
		dadosREQ.setSenhaServidor("E10ADC3949BA59ABBE56E057F20F883E");						

		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Existem contratos que já pertencem a outra operação de Reserva Composta.");
		
	}

}
