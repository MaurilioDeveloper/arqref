package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada.ConsultarBoletoDados;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada.ConsultarBoletoDadosEntrada;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada.ConsultarBoletoEntradaCorpo;
import br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida.ConsultaCobrancaBancariaCorpo;

public class ConsultaBoletoTest {
	
	private Properties properties;
		
	@Test
	public void consultaBoletoTest() throws Exception {
				
		ConsultarBoletoEntradaCorpo consultarBoletoEntradaCorpo = new ConsultarBoletoEntradaCorpo();
		
		ConsultarBoletoDadosEntrada dadosREQ = new ConsultarBoletoDadosEntrada();	
		consultarBoletoEntradaCorpo.setDados(dadosREQ);
		
		ConsultarBoletoDados consultarBoletoDados = new ConsultarBoletoDados();
		consultarBoletoDados.setCoBeneficiario("0820001");
		consultarBoletoDados.setNuNossoNumero("14800500000113099");
		dadosREQ.setConsultarBoleto(consultarBoletoDados);
		
		SibarHeader header = new SibarHeader();
		header.setVersao("2.4.2");
		header.setAutenticacao("78pjcBBlWTLNdNQKpl9DARwuujkuYgtumzjue6AHG3U=");
		header.setUsuarioServico("SCNLFECD");
		header.setOperacao("CONSULTA_BOLETO");
		header.setSistemaOrigem("SIGBD");
		header.setUnidade("0002");
		header.setIdentificadorOrigem("127.0.0.1");
		header.setDataHora("20160109152436");
		
		consultarBoletoEntradaCorpo.setHeader(header);
		
		consultarBoletoEntradaCorpo.setUrl(getUrlServico());
		
		ConsultaCobrancaBancariaCorpo retornoConsultaBoleto = new ConsultarBoletoWs(consultarBoletoEntradaCorpo).executar();
		
		retornoConsultaBoleto.getUrl();
		
		Assert.assertNotNull(retornoConsultaBoleto.getConsultaCobrancaBancariaDados().getConsultaBoletoSaida().getTitulo().getCodigobarras());
	}
		
	private String getUrlServico() {
		if(this.properties == null){
			
			this.properties = new Properties();
			InputStream in = getClass().getResourceAsStream("Servicos_SOAP.properties");
			
			try {
				this.properties.load(in);
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties.getProperty("URL_CONSULTA_BOLETO");
	}		
	
}
