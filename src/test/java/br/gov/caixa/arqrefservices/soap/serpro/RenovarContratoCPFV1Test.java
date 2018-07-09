package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1.ConsumidorRenovarContratoCPFV1;
import br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1.RenovarContratoCPFV1DadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1.RenovarContratoCPFV1SaidaTO;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class RenovarContratoCPFV1Test extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(RenovarContratoCPFV1Test.class.getName());
	
	@Test
	public void testaComunicacao() {
		
		log.info(" ====================================================================");
		log.info(" ====>>>  INICIO DO TESTE DO SERVIÇO: RenovarContratoCPFV1   <<<<====");
		
		configuraAmbienteCertificado();
		
		RenovarContratoCPFV1DadosREQ dadosREQ = new RenovarContratoCPFV1DadosREQ();
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdMatricula(getProperties().getProperty("CD_MATRICULA"));
		dadosREQ.setOrgMatInst("");
		dadosREQ.setNrCPFA("04287061187");
		dadosREQ.setVlOperacaoA("2856.87");
		dadosREQ.setCdConsigA("7032");
		dadosREQ.setCdSenhaConsig(getProperties().getProperty("CD_SENHA_CONSIG"));		
		dadosREQ.setCdUsuario(getProperties().getProperty("CD_USUARIO"));
		
		dadosREQ.setCdIdServ("01");
		dadosREQ.setCdOrigemTrans("02");
		dadosREQ.setCdSenhaServidor("03");
		dadosREQ.setCdConvenioA("04");
		dadosREQ.setQtPrazoA("05");
		dadosREQ.setDtOperacaoA("20150904");
		dadosREQ.setDtAnoMesA("201602");				
		dadosREQ.setNrContrato("902492276");
		
		dadosREQ.setDsLivre("06");
		dadosREQ.setQtRenovaA("03");
		dadosREQ.setVlLiquidoA("3856.87");
		
		dadosREQ.setNrContratos(new ArrayList<String>( Arrays.asList("123", "456", "789")));
		
		ConsumidorRenovarContratoCPFV1 consumidor = new ConsumidorRenovarContratoCPFV1(getProperties().getProperty("URL_SERPRO"), dadosREQ);
				
		try {
			RenovarContratoCPFV1SaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		
	
		log.info(" ====>>>  FIM DO TESTE DO SERVIÇO: RenovarContratoCPFV1   <<<<==== ");
		
		
	}	
}
