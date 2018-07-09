package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.dominio.consignet.reservaPortabilidade.ReservaPortabilidadeDadosREQ;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ReservaPortabilidadeTest extends SystemProxyFabrica {
		
	@Test
	public void reservaPortabilidadeTest() throws Exception {
						
		ReservaPortabilidadeDadosREQ dadosREQ = new ReservaPortabilidadeDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5ff37dcb5f0b76111bfbcffdbc128b15");				
		dadosREQ.setMatricula("375659013");		
		dadosREQ.setCpf("69194580200");		
		dadosREQ.setOrigem("1");		
		dadosREQ.setVlParcela("9.99");
		dadosREQ.setQtdeParcela("2");		
		dadosREQ.setConvenio("3697246");
		dadosREQ.setContratos("29360049");		
		dadosREQ.setJurosMensal("1");		
		dadosREQ.setVlLiquidoLiberado("19.98");
		dadosREQ.setDtLiberacaoCredito("12/01/2016");
		dadosREQ.setFolha1Desconto("201603");
		dadosREQ.setSenhaServidor("e10adc3949ba59abbe56e057f20f883e");
		
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Contrato não localizado.");
		
	}
	
}
