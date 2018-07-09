package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.consultaParcelasFolha.ConsultaParcelasFolhaDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConsultaParcelasFolhaTest extends SystemProxyFabrica {
		
	@Test
	public void consultaParcelasFolhaTest() throws Exception {
						
		ConsultaParcelasFolhaDadosREQ dadosREQ = new ConsultaParcelasFolhaDadosREQ();	
		dadosREQ.setUsuario("WEBSERVICE_CAIXA");				
		dadosREQ.setSenha("5FF37DCB5F0B76111BFBCFFDBC128B15");		
		dadosREQ.setMatricula("375659013");		
		dadosREQ.setCpf("69194580200");		
		dadosREQ.setOrigem("1");				
		dadosREQ.setFolhaConsulta("201603");
		dadosREQ.setInstituicao("2331613");
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Sistema em manutenção, tente novamente em alguns instantes.");
	}
	
}
