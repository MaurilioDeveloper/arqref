package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoV1.ConsumidorRenovarContratoV1;
import br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoV1.RenovarContratoV1DadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoV1.RenovarContratoV1SaidaTO;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class RenovarContratoV1Test extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(RenovarContratoV1Test.class.getName());
	
	@Test
	public void testaComunicacao(){
		
		log.info(" ====================================================================");
		log.info(" ====>>>  INICIO DO TESTE DO SERVIÇO: RenovarContratoV1   <<<<====");
		
		configuraAmbienteCertificado();
		
		RenovarContratoV1DadosREQ dadosREQ = new RenovarContratoV1DadosREQ();
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdMatricula(getProperties().getProperty("CD_MATRICULA"));
		dadosREQ.setOrgMatInst("");
		dadosREQ.setNrCPFA("04287061187");
		dadosREQ.setVlLiquidoA("3856.87");
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
		dadosREQ.setQtRenovaA("05");
		
		dadosREQ.setNrContrato1("902492271");
		dadosREQ.setNrContrato2("902492272");
		dadosREQ.setNrContrato3("902492273");		
		dadosREQ.setNrContrato4("902492274");
		dadosREQ.setNrContrato5("902492275");

		dadosREQ.setTxEfetivaAutoA("123,1234567");
		
		ConsumidorRenovarContratoV1 consumidor = new ConsumidorRenovarContratoV1(getProperties().getProperty("URL_SERPRO"), dadosREQ);
				
		try {
			RenovarContratoV1SaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		

		log.info(" ====>>>  FIM DO TESTE DO SERVIÇO: RenovarContratoV1   <<<<==== ");
		
	}	
}
