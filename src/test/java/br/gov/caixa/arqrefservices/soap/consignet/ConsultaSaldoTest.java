package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.consultaSaldo.ConsultaSaldoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConsultaSaldoTest extends SystemProxyFabrica {
		
	@Test
	public void consultaSaldoTest() throws Exception {
						
		ConsultaSaldoDadosREQ dadosREQ = new ConsultaSaldoDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");
		dadosREQ.setMatricula("375659013");
		dadosREQ.setCpf("69194580200");
		dadosREQ.setOrigem("01");
		dadosREQ.setSenhaServidor("E10ADC3949BA59ABBE56E057F20F883E");
		dadosREQ.setConvenio("3697246");
		dadosREQ.setFolha1Desconto("201603");
								
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
	}
	
}
