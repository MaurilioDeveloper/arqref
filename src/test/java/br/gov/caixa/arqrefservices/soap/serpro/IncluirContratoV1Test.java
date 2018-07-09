package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1.ConsumidorIncluirContratoV1;
import br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1.IncluirContratoV1DadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1.IncluirContratoV1SaidaTO;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class IncluirContratoV1Test extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(IncluirContratoV1Test.class.getName());
	
	@Test
	public void testaComunicacao(){
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: IncluirContratoV1   <<<<=====");
		
		configuraAmbienteCertificado();
		
		IncluirContratoV1DadosREQ dadosREQ = new IncluirContratoV1DadosREQ();
		
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
		String dataSistema = formatador.format(new Date());
		SimpleDateFormat formatadorAnoMes = new SimpleDateFormat("yyyyMM");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 3);
		String dataSistemaAnoMes = formatadorAnoMes.format(c.getTime());
		Random rnd = new Random();		
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdMatricula(getProperties().getProperty("CD_MATRICULA"));
		dadosREQ.setCdUsuario(getProperties().getProperty("CD_USUARIO"));
		dadosREQ.setCdSenhaConsig(getProperties().getProperty("CD_SENHA_CONSIG"));
		dadosREQ.setOrgMatInst("");
		dadosREQ.setCdConsigA("7032");
		dadosREQ.setNrContrato("902492276");
		dadosREQ.setNrCPFA("04287061187");
		dadosREQ.setVlLiquidoA("100.00");
		dadosREQ.setVlOperacaoA("10.00");
		dadosREQ.setCdConsigA("7032");
		dadosREQ.setCdSenhaConsig("UB15W3NUCO");
		dadosREQ.setCdUsuario("WSCEFS01");
		dadosREQ.setCdIdServ("1"); //Qdo preencher cdSEnhaServidor o cdIdServ deve ser 01
		dadosREQ.setCdSenhaServidor("");
		dadosREQ.setCdConvenioA("703201");
		dadosREQ.setQtPrazoA("12");
		dadosREQ.setDtAnoMesA(dataSistemaAnoMes);
		dadosREQ.setDtOperacaoA(dataSistema);
		String contrato = String.valueOf(rnd.nextInt(999999999));
		dadosREQ.setNrContrato(contrato);
		dadosREQ.setTxEfetivaAutoA("1.1");
		dadosREQ.setDsLivre("");
		dadosREQ.setInRegHold("");
		dadosREQ.setCdTranHoldServ("01");
		dadosREQ.setCdOrigemTrans("02");		
		
		ConsumidorIncluirContratoV1 consumidor = new ConsumidorIncluirContratoV1(getProperties().getProperty("URL_SERPRO"), dadosREQ);
				
		try {
			IncluirContratoV1SaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: IncluirContratoV1   <<<<=====");
		
		
	}	
}
