package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.consultaMargemFuturaServidor.ConsultaMargemFuturaServidorDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConsultaMargemFuturaServidorTest extends SystemProxyFabrica {
		
	@Test
	public void consultaMargemFuturaServidorTest() throws Exception {
						
		ConsultaMargemFuturaServidorDadosREQ dadosREQ = new ConsultaMargemFuturaServidorDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");				
		dadosREQ.setConvenio("3697246");
		dadosREQ.setAnoMesFolhaPagamento("201605");
		dadosREQ.setMatricula("375659013");									
		dadosREQ.setIdFolhaPagamento("2331903");
		
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
		
	}
	
}
