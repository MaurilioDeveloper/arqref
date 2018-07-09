package br.gov.caixa.arqrefservices.dominio.consignet.common;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.consignet.WebServiceConsignet;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao.ExecutarOperacaoRET;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsignetConsumidor {
	
	private static Logger log = Logger.getLogger(ConsignetConsumidor.class.getName());	
	
	private ConsumidorConsignetDados consignetDados;
	
	
	public ConsignetConsumidor(ConsumidorConsignetDados consignetDados) {
		this.consignetDados = consignetDados;
	}
	
	
	public ExecutarOperacaoRET executar() throws IOException, ExcecaoSOAP{
		
		ExecutarOperacaoREQ mensagemREQ = new ExecutarOperacaoREQ();
		SOAPCorpo<ExecutarOperacaoDadosREQ> corpoSOAP = new SOAPCorpo<ExecutarOperacaoDadosREQ>();
		mensagemREQ.setBody(corpoSOAP);
						
		corpoSOAP.setDados(new ExecutarOperacaoDadosREQ(xmlParam()));
															
		return ConverterXML.converterXmlSemSanitizacao(xmlRET(mensagemREQ), ExecutarOperacaoRET.class);		
	}

	private String xmlParam() {
		WebServiceConsignet wsc = new WebServiceConsignet();		
		wsc.setOperacao(consignetDados.getOperacao());		
		wsc.setAtributos(consignetDados.getListaParametros());		
		return ConverterXML.convertToXml(wsc, WebServiceConsignet.class);		
	}

	private String xmlREQ(ExecutarOperacaoREQ mensagemREQ) {
		String xmlREQ = ConverterXML.convertToXml(mensagemREQ, ExecutarOperacaoREQ.class);				
		String xmlREQEnconde = StringEscapeUtils.unescapeHtml4(xmlREQ);		
		log.info("xmlREQ: " + xmlREQEnconde);
		return xmlREQEnconde;
	}

	private String xmlRET(ExecutarOperacaoREQ mensagemREQ) throws IOException,ExcecaoSOAP {		
		String xmlRET =  new WSConsumidor(getUrl()).executar(xmlREQ(mensagemREQ));		

		//MOCK MOCK MOCK
//		String xmlRET = getTesteRetornoXML();
		//MOCK MOCK MOCK
		
		xmlRET = StringEscapeUtils.unescapeHtml4(xmlRET);
		
		xmlRET = Codificacao.removerISO88591(xmlRET);	
		
		xmlRET = retiraCaracteresEspeciais(xmlRET);
		
		return trataXmlEntrada(xmlRET);
	}

	private String trataXmlEntrada(String xmlRetEncode){
			
		if(xmlRetEncode.contains("xmlEntrada")){
			xmlRetEncode = StringEscapeUtils.unescapeHtml4(xmlRetEncode);
			xmlRetEncode = xmlRetEncode.replace("<xmlEntrada><?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "<xmlEntrada>");
		}
		
		log.info("xmlRET: " + xmlRetEncode);
		return xmlRetEncode;
	}
	
	private String getUrl(){				
		if(StringUtils.isEmpty(consignetDados.getURL())){
			throw new SystemException("URL do serviço não informada!");
		}		
		return consignetDados.getURL();
	}
	
	public static String retiraCaracteresEspeciais(String stringFonte)	{

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
	
	public String getTesteRetornoXML(){
		 ResourceLoader loader = new ResourceLoader();
		 return loader.with(getClass()).load("retorno_consulta_margem_DB1.xml").asText();
	 }


}
