package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF.ConsultarVinculoMargemPorCPFDadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF.ConsultarVinculoMargemPorCPFSaidaTO;
import br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF.ConsumidorConsultarVinculoMargemPorCPF;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class ConsultarVinculoMargemPorCPFTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(ConsultarVinculoMargemPorCPFTest.class.getName());
	
	@Test
	public void testaComunicacao(){
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: ConsultarVinculoMargemPorCPF   <<<<=====");
		
		configuraAmbienteCertificado();
		
		ConsultarVinculoMargemPorCPFDadosREQ dadosREQ = new ConsultarVinculoMargemPorCPFDadosREQ();
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdSenhaConsig(getProperties().getProperty("CD_SENHA_CONSIG"));
		dadosREQ.setNrCpfA("37167200972");
		dadosREQ.setNrCNPJOrgao("000000");
		dadosREQ.setCdConsig("7032");
		dadosREQ.setInRegHold("N");
		dadosREQ.setCdIdServ("1");
		dadosREQ.setCdSenhaServidor("");
		dadosREQ.setCdTranHoldServ("01");
		dadosREQ.setCdOrigemTrans("02");
		
		ConsumidorConsultarVinculoMargemPorCPF consumidor = new ConsumidorConsultarVinculoMargemPorCPF(getProperties().getProperty("URL_SERPRO"), dadosREQ);
		
		try {
			ConsultarVinculoMargemPorCPFSaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		

		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: ConsultarVinculoMargemPorCPF   <<<<=====");
		
	}	
}
