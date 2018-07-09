package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.confirmacaoReservaComposta.ConfirmacaoReservaCompostaDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConfirmacaoReservaCompostaTest extends SystemProxyFabrica {
		
	private static int DESC_RETORNO_IDX = 1;
	
	@Test
	public void confirmacaoReservaCompostaTest() throws Exception {
								
		ConfirmacaoReservaCompostaDadosREQ dadosREQ = new ConfirmacaoReservaCompostaDadosREQ();	
		
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");
		
		
		dadosREQ.setContrato("29740049");
		
		dadosREQ.setConvenio("3697246");
		
		dadosREQ.setNrContratoConvenio("29740049");
		dadosREQ.setVlLiberadoConfirmacao("0.01");
		dadosREQ.setVlParcelaConfirmacao("00.05");
		dadosREQ.setJurosConfirmacao("0.795");
		dadosREQ.setCetConfirmacao("0.897");
		
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(DESC_RETORNO_IDX);
		
		Assert.assertEquals(descRetorno.getValor(), "Não foi possível confirmar o contrato. Verifique se o contrato foi informado corretamente.");
//		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
	}
	
}
