package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.consignarRefinanciamento.ConsignarRefinanciamentoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConsignarRefinanciamentoTest extends SystemProxyFabrica {
			
	@Test
	public void consignarRefinanciamentoTest() throws Exception {
										
		ConsignarRefinanciamentoDadosREQ dadosREQ = new ConsignarRefinanciamentoDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");
		dadosREQ.setMatricula("375659013");
		dadosREQ.setCpf("69194580200");
		dadosREQ.setOrigem("1");
		dadosREQ.setVlParcela("9.99");
		dadosREQ.setQtdeParcela("1");
		dadosREQ.setConvenio("3697246");
		dadosREQ.setJurosMensal("1");
		dadosREQ.setVlLiquidoLiberado("19.98");
		dadosREQ.setDtLiberacaoCredito("12/01/2016");
		dadosREQ.setFolha1Desconto("201602");
		dadosREQ.setContratos("29740049");		
		dadosREQ.setSenhaServidor("E10ADC3949BA59ABBE56E057F20F883E");
				
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
					
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "O funcionário não possui saldo suficiente para o lançamento.");
		
	}

}
