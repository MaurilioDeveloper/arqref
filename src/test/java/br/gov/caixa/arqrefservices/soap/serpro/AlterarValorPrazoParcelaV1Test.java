package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.alterarValorPrazoParcelaV1.AlterarValorPrazoParcelaV1DadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.alterarValorPrazoParcelaV1.AlterarValorPrazoParcelaV1SaidaTO;
import br.gov.caixa.arqrefservices.dominio.serpro.alterarValorPrazoParcelaV1.ConsumidorAlterarValorPrazoParcelaV1;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class AlterarValorPrazoParcelaV1Test extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(AlterarValorPrazoParcelaV1Test.class.getName());
	
	@Test
	public void testaComunicacao() throws Exception {
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: AlterarValorPrazoParcelaV1   <<<<=====");
		
		configuraAmbienteCertificado();
		
		AlterarValorPrazoParcelaV1DadosREQ dadosREQ = new AlterarValorPrazoParcelaV1DadosREQ();
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdMatricula(getProperties().getProperty("CD_MATRICULA"));
		dadosREQ.setCdUsuario(getProperties().getProperty("CD_USUARIO"));
		dadosREQ.setCdSenhaConsig(getProperties().getProperty("CD_SENHA_CONSIG"));
		dadosREQ.setOrgMatInst("");
		dadosREQ.setCdIdServ("1");
		dadosREQ.setCdOrigemTrans("1");
		dadosREQ.setCdConsigA("7032");
		dadosREQ.setCdSenhaServidor("");
		dadosREQ.setNrContrato("902492276");
		dadosREQ.setNrPrazo("30");
		dadosREQ.setNrCpfA("04287061187");
		dadosREQ.setVlOperacao("1.00");
		
		ConsumidorAlterarValorPrazoParcelaV1 consumidor = new ConsumidorAlterarValorPrazoParcelaV1(getProperties().getProperty("URL_SERPRO"), dadosREQ);
				
		try {
			AlterarValorPrazoParcelaV1SaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		
		
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: AlterarValorPrazoParcelaV1   <<<<=====");
		
		
	}	
}
