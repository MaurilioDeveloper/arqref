package br.gov.caixa.arqrefservices.soap.consignet;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.confirmacaoReservas.ConfirmacaoReservasDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.consultaSaldo.ConsultaSaldoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.dominio.consignet.reservaMargemEmprestimo.ReservaMargemEmprestimoDadosREQ;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class FluxoContratacaoTest extends SystemProxyFabrica {
	
	private static int DESC_RETORNO_IDX = 1;
	private int CONTRATO_IDX = 2;

	@Test
	public void fluxoContratacaoTest() throws Exception {
		consultarSaldo();				
		AtributoConsignet contrato = reservarMargem();
		consultarSaldo();												
		confirmacaoReserva(contrato);
	    consultarSaldo();
	}

	private void confirmacaoReserva(AtributoConsignet contrato) throws IOException, ExcecaoSOAP {
		
		ConfirmacaoReservasDadosREQ confirmaReservaDadosREQ = new ConfirmacaoReservasDadosREQ();
		confirmaReservaDadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");
		confirmaReservaDadosREQ.setSenhaConvenio("5ff37dcb5f0b76111bfbcffdbc128b15");
		confirmaReservaDadosREQ.setContrato(contrato.getValor());
		confirmaReservaDadosREQ.setConvenio("3697246");
		confirmaReservaDadosREQ.setNrContratoConvenio(contrato.getValor());
		confirmaReservaDadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(confirmaReservaDadosREQ).executar();			
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(DESC_RETORNO_IDX);		
		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
	}

	private AtributoConsignet reservarMargem() throws IOException, ExcecaoSOAP {
		
		ReservaMargemEmprestimoDadosREQ reservaMargemDadosREQ = new ReservaMargemEmprestimoDadosREQ();
		reservaMargemDadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");				
		reservaMargemDadosREQ.setSenhaConvenio("5ff37dcb5f0b76111bfbcffdbc128b15");				
		reservaMargemDadosREQ.setMatricula("375659013");		
		reservaMargemDadosREQ.setCpf("69194580200");		
		reservaMargemDadosREQ.setOrigem("01");	
		reservaMargemDadosREQ.setVlParcela("0.05");		
		reservaMargemDadosREQ.setQtdeParcela("12");
		reservaMargemDadosREQ.setConvenio("3697246");
		reservaMargemDadosREQ.setJurosMensal("0.791");
		reservaMargemDadosREQ.setVlLiquidoLiberado("1.99");
		reservaMargemDadosREQ.setDtLiberacaoCredito("15/01/2016");
		reservaMargemDadosREQ.setFolha1Desconto("201603");
		
		reservaMargemDadosREQ.setSenhaServidor("e10adc3949ba59abbe56e057f20f883e");				
											
		reservaMargemDadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(reservaMargemDadosREQ).executar();
			
		AtributoConsignet contrato = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(CONTRATO_IDX);
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(DESC_RETORNO_IDX);
		
		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
		return contrato;
	}

	private void consultarSaldo() throws IOException,ExcecaoSOAP {
		
		ConsultaSaldoDadosREQ dadosREQ = new ConsultaSaldoDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");
		dadosREQ.setSenhaConvenio("5ff37dcb5f0b76111bfbcffdbc128b15");
		dadosREQ.setMatricula("375659013");
		dadosREQ.setCpf("69194580200");
		dadosREQ.setOrigem("01");
		dadosREQ.setConvenio("3697246");
		dadosREQ.setSenhaServidor("e10adc3949ba59abbe56e057f20f883e");
		dadosREQ.setFolha1Desconto("201603");
								
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();			
		AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(DESC_RETORNO_IDX);		
		Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
	}
		
}
