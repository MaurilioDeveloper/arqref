package br.gov.caixa.arqrefservices.soap.consignet;

import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.dominio.consignet.reservaCompostaConsultaSaldoQuitado.ReservaCompostaConsultaSaldoQuitadoDadosREQ;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ReservaCompostaConsultaSaldoQuitadoTest extends SystemProxyFabrica {
		
	@Test
	public void reservaCompostaConsultaSaldoQuitadoTest() throws Exception {
						
		ReservaCompostaConsultaSaldoQuitadoDadosREQ dadosREQ = new ReservaCompostaConsultaSaldoQuitadoDadosREQ();	
		
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");		
		dadosREQ.setContrato("123456789");
		dadosREQ.setConvenio("3697246");	
		
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "Contrato não localizado.");
		
	}
	
}
