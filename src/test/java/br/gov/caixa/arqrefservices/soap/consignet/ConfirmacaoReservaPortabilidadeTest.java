package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.confirmacaoReservaPortabilidade.ConfirmacaoReservaPortabilidadeDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConfirmacaoReservaPortabilidadeTest extends SystemProxyFabrica {
		
	@Test
	public void confirmacaoReservaPortabilidadeTest() throws Exception {
						
		ConfirmacaoReservaPortabilidadeDadosREQ dadosREQ = new ConfirmacaoReservaPortabilidadeDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");				
		dadosREQ.setConvenio("3697246");
		dadosREQ.setContrato("28730049");	
		dadosREQ.setAceito("SIM");
		dadosREQ.setMotivoRecusa("123");
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Contrato não localizado.");
//		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
		
	}
	
}
