package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;

import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada.IncluirBoletoEntrada;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada.IncluirBoletoEntradaCorpo;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.saida.IncluirBoletoSaida;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.saida.IncluirBoletoSaidaCorpo;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class IncluirBoletoWs {
	
	private static Logger log = Logger.getLogger(IncluirBoletoWs.class.getName());	
	
	private IncluirBoletoEntradaCorpo incluirBoletoEntradaCorpo;

	public IncluirBoletoWs(IncluirBoletoEntradaCorpo incluirBoletoEntradaCorpo) {
		this.incluirBoletoEntradaCorpo = incluirBoletoEntradaCorpo;
	}
	
	
	public IncluirBoletoSaidaCorpo executar() throws IOException, ExcecaoSOAP{
										
		if(isRecuperarXml()){
			ResourceLoader loader = new ResourceLoader();
			String xmlMock = loader.with(getClass()).load("INCLUI_BOLETO_RETORNO.xml").asText();						
			log.info("XML_SAIDA_MOCK: " + xmlMock);									
			return converterBoletoCorpo(xmlMock);						
		}
		
		String xmlRet =  new WSConsumidor(this.incluirBoletoEntradaCorpo.getUrl()).executar(gerarXmlEnvioSoap(), criarConexaoIncluirBoleto());
				
		return converterBoletoCorpo(xmlRet);
	}


	private Boolean isRecuperarXml() {
		String isMockIncluirBoleto = System.getProperty("MOCK_INCLUIR_BOLETO_SIGCB");
		return isMockIncluirBoleto != null && isMockIncluirBoleto.equals("true");
	}


	private IncluirBoletoSaidaCorpo converterBoletoCorpo(String xmlRet) {
		IncluirBoletoSaida ibs = ConverterXML.converterXmlSemSanitizacao(xmlRet, IncluirBoletoSaida.class);		
		return ibs.getBody().getDados();
	}

	private String gerarXmlEnvioSoap() {
		
		IncluirBoletoEntrada incluirBoletoEntrada = new IncluirBoletoEntrada();		
		SOAPCorpo<IncluirBoletoEntradaCorpo> corpoSOAP = new SOAPCorpo<IncluirBoletoEntradaCorpo>();
		incluirBoletoEntrada.setBody(corpoSOAP);						
		corpoSOAP.setDados(this.incluirBoletoEntradaCorpo);
															
		String xmlEnvioSoap = ConverterXML.convertToXml(incluirBoletoEntrada, IncluirBoletoEntrada.class);
		log.info("XML_REQ: " + xmlEnvioSoap);
		
		return retiraCaracteresEspeciais(xmlEnvioSoap);
	}		

	private String retiraCaracteresEspeciais(String stringFonte)	{

	     String passa = stringFonte;

	     passa = passa.replaceAll("[ÂÀÁÄÃ]", "A");

	     passa = passa.replaceAll("[âãàáä]", "a");

	     passa = passa.replaceAll("[ÊÈÉË]", "E");

	     passa = passa.replaceAll("[êèéë]", "e");

	     passa = passa.replaceAll("[ÎÍÌÏ]", "I");

	     passa = passa.replaceAll("[îíìï]", "i");
	     
	     passa = passa.replaceAll("[ÔÕÒÓÖ]", "O");

	     passa = passa.replaceAll("[ôõòóö]", "o");

	     passa = passa.replaceAll("[ÛÙÚÜ]", "U");

	     passa = passa.replaceAll("[ûúùü]", "u");

	     passa = passa.replaceAll("Ç", "C");

	     passa = passa.replaceAll("ç", "c");

	     passa = passa.replaceAll("[ýÿ]", "y");

	     passa = passa.replaceAll("Ý", "Y");

	     passa = passa.replaceAll("ñ", "n");

	     passa = passa.replaceAll("Ñ", "N");

	     return passa;

	   }
	
	private HttpURLConnection criarConexaoIncluirBoleto() throws MalformedURLException, IOException, ProtocolException {
		HttpURLConnection conexao = getHttpURLConnection();													
		conexao.setRequestMethod("POST");
		conexao.setRequestProperty("Content-Type", "text/xml;charset=UTF-8;");
		conexao.setDoOutput(true);					
		conexao.setRequestProperty("SOAPAction", "IncluiBoleto");
		return conexao;
	}
	
	private HttpURLConnection getHttpURLConnection() throws MalformedURLException, IOException {
		
		URL url = new URL(this.incluirBoletoEntradaCorpo.getUrl());

		if(this.incluirBoletoEntradaCorpo.getUrl().contains("https")){
			return (HttpsURLConnection) url.openConnection();
		}else {
			return  (HttpURLConnection) url.openConnection();				
		}		
	}
	
}
