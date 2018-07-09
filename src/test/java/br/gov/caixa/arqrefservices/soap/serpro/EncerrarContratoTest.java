package br.gov.caixa.arqrefservices.soap.serpro;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.serpro.encerrarContrato.ConsumidorEncerrarContrato;
import br.gov.caixa.arqrefservices.dominio.serpro.encerrarContrato.EncerrarContratoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.serpro.encerrarContrato.EncerrarContratoSaidaTO;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class EncerrarContratoTest extends SystemProxyFabrica {
	
	private static Logger log = Logger.getLogger(EncerrarContratoTest.class.getName());
	
	@Test
	public void testaComunicacao(){
		
		log.info(" ====================================================================");
		log.info(" =====>>>  INICIO DO TESTE DO SERVIÇO: EncerrarContrato   <<<<=====");
		
		configuraAmbienteCertificado();
		
		EncerrarContratoDadosREQ dadosREQ = new EncerrarContratoDadosREQ();
		
		dadosREQ.setCdCia(getProperties().getProperty("CD_CIA"));
		dadosREQ.setCdEmpresa(getProperties().getProperty("CD_EMPRESA"));
		dadosREQ.setCdOrgao(getProperties().getProperty("CD_ORGAO")); 
		dadosREQ.setCdMatricula(getProperties().getProperty("CD_MATRICULA"));
		dadosREQ.setCdUsuario(getProperties().getProperty("CD_USUARIO"));
		dadosREQ.setCdSenhaConsig(getProperties().getProperty("CD_SENHA_CONSIG"));
		dadosREQ.setOrgMatInst("");
		dadosREQ.setCdConsigA("7032");
		dadosREQ.setNrContrato("902492276");
		dadosREQ.setNrCpfA("37167200972");
		dadosREQ.setDsLivre("");
		
		ConsumidorEncerrarContrato consumidor = new ConsumidorEncerrarContrato(getProperties().getProperty("URL_SERPRO"), dadosREQ);
				
		try {
			EncerrarContratoSaidaTO dadosRetorno = consumidor.executarServico();
			log.info("Mensagem de retorno do MPOG : " + dadosRetorno.getCdRetCode() + " - " + dadosRetorno.getDsRetCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoSOAP e) {
			log.info("Mensagem de retorno do MPOG : " + e.getDetalheErro().getCdRetCode() + " - " +e.getDetalheErro().getDsRetCode());
		}		
	
		log.info(" =====>>>  FIM DO TESTE DO SERVIÇO: EncerrarContrato   <<<<=====");
		
		
	}	
}
