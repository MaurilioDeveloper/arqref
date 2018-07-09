package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato.CancelarContratoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato.CancelarContratoSaidaTO;
import br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato.ConsumidorCancelarContrato;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class CancelarContratoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(CancelarContratoTest.class.getName());
	
	@Test
	public void testaComunicacao(){
				
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: CancelarContrato   <<<<=====");
		
		configuraAmbienteCertificado();
		
		CancelarContratoDadosREQ dadosREQ = new CancelarContratoDadosREQ();
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdMatricula(getProperties().getProperty("CD_MATRICULA"));
		dadosREQ.setCdUsuario(getProperties().getProperty("CD_USUARIO"));
		dadosREQ.setCdSenhaConsig(getProperties().getProperty("CD_SENHA_CONSIG"));
		dadosREQ.setOrgMatInst("");
		dadosREQ.setCdConsigA("7032");
		dadosREQ.setNrContrato("902492276");
		dadosREQ.setNrCpfA("04287061187");
		dadosREQ.setDtOperacao("20150904");
		dadosREQ.setDsLivre("");
		
		ConsumidorCancelarContrato consumidor = new ConsumidorCancelarContrato(getProperties().getProperty("URL_SERPRO"), dadosREQ);
		
		try {
			CancelarContratoSaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: CancelarContrato   <<<<=====");
		
	}	
}
