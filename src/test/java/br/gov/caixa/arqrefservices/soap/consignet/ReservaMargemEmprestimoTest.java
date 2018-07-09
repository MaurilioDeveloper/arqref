package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.dominio.consignet.reservaMargemEmprestimo.ReservaMargemEmprestimoDadosREQ;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ReservaMargemEmprestimoTest extends SystemProxyFabrica {
		
	@Test
	public void reservaMargemEmprestimoTest() throws Exception {
						
		ReservaMargemEmprestimoDadosREQ dadosREQ = new ReservaMargemEmprestimoDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5ff37dcb5f0b76111bfbcffdbc128b15");				
		dadosREQ.setMatricula("375659013");		
		dadosREQ.setCpf("69194580200");		
		dadosREQ.setOrigem("1");
		dadosREQ.setVlParcela("0.09");		
		dadosREQ.setQtdeParcela("1");
		dadosREQ.setConvenio("3697246");		
		dadosREQ.setJurosMensal("1");
		dadosREQ.setVlLiquidoLiberado("0.08");
		dadosREQ.setDtLiberacaoCredito("12/01/2016");
		dadosREQ.setFolha1Desconto("201603");		
		dadosREQ.setSenhaServidor("e10adc3949ba59abbe56e057f20f883e");
		dadosREQ.setValorTAC("1.00");
		dadosREQ.setValorIOF("48.35");
		dadosREQ.setDiasCarencia("30");
		dadosREQ.setValorCobradoCarencia("121.70");
		dadosREQ.setCustoEfetivoTotal("8.39");
											
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
		
	}
		
}
