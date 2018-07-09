package br.gov.caixa.arqrefservices.soap.consignet;

import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.excecao.enumerador.ECategoriaErro;
import br.gov.caixa.arqrefcore.excecao.enumerador.ESeveridadeErro;
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetConsumidor;
import br.gov.caixa.arqrefservices.dominio.consignet.consultarMargemPorCPF.ConsultarMargemPorCPFDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConsultaMargemPorCPFTest extends SystemProxyFabrica {
		
	@Test
	public void consultaMargemPorCPFTest() throws Exception {
		
		configuraAmbienteCertificado();
						
		ConsultarMargemPorCPFDadosREQ dadosREQ = new ConsultarMargemPorCPFDadosREQ();
		dadosREQ.setUsuarioConvenio("WEBSERVICE_CAIXA@CAIXA");
		dadosREQ.setSenhaConvenio("5ff37dcb5f0b76111bfbcffdbc128b15");
		dadosREQ.setCNPJConvenente("57639816000187");
		dadosREQ.setCpf("00030424216");
								
		dadosREQ.setURL(getProperties().getProperty("URL_CONSIGNET"));
		ExecutarOperacaoRET mensagemRET = new ConsignetConsumidor(dadosREQ).executar();
		
		List<AtributoConsignet> listAtributos = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos();
		
		String codigoRetorno = null, descricaoRetorno = null;
		for (Iterator<AtributoConsignet> iterator = listAtributos.iterator(); iterator.hasNext();) {
			AtributoConsignet atributoConsignet = (AtributoConsignet) iterator.next();
			if(atributoConsignet!=null && atributoConsignet.getNome().equals("COD_RETORNO")){
			   codigoRetorno = atributoConsignet.getValor();	
			}
			if(atributoConsignet!=null && atributoConsignet.getNome().equals("DESC_RETORNO")){
				descricaoRetorno = atributoConsignet.getValor();	
			}
		}
		if(codigoRetorno!=null && !codigoRetorno.equals("")){
			int valorCodigoRetorno = Integer.parseInt(codigoRetorno);
			if(valorCodigoRetorno != 0){
				System.out.println("MENSAGEM DE RETORNO DB1: "+codigoRetorno +" "+descricaoRetorno);
			}
		}else{
			int descRetornoIdx = 1;
			AtributoConsignet descRetorno = mensagemRET.getBody().getDados().getExecutarOperacaoReturn().getWebservice().getAtributos().get(descRetornoIdx);
			Assert.assertEquals(descRetorno.getValor(), "Sucesso.");
		}
	}
	
}
