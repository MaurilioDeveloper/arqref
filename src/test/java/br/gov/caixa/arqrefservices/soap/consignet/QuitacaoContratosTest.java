package br.gov.caixa.arqrefservices.soap.consignet;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.dominio.consignet.quitacaoContratos.QuitacaoContratosDadosREQ;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class QuitacaoContratosTest extends SystemProxyFabrica {
		
	@Test
	public void quitacaoContratosTest() throws Exception {
						
		QuitacaoContratosDadosREQ dadosREQ = new QuitacaoContratosDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		dadosREQ.setSenhaConvenio("5FF37DCB5F0B76111BFBCFFDBC128B15");
		dadosREQ.setNrContratoConvenio("29070049");
		dadosREQ.setVlCobradoQuitacao("9.99");
		dadosREQ.setJustificativa("QUITADO PARA TESTE");
		

		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
			
		int descRetornoIdx = 1;
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
		
		Assert.assertEquals(descRetorno.getValor(), "O(s) contrato(s) informado(s) nesta operação devem estar ATIVO(S).");
	}
	
}
