package br.gov.caixa.arqrefservices.stub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


/***
 * Classe usada para simular respostas do SIRIC
 * SEMPRE EH LIDO ARQUIVOS XML
 * @author c110503
 *
 */

public class StubSIRIC {

	
	public static String consultaAvaliacaoRiscoXML(){
		BufferedReader br = null;
		String xml = "";
		try { 	
			String linhaAtual; 
			
			String arquivo = "CONSULTA_AV_RISCO_SAIDA.xml";
//			Thread.currentThread().getContextClassLoader()
			InputStream in = StubSIRIC.class.getResourceAsStream(arquivo);
			Reader fr = new InputStreamReader(in, "utf-8");
			br = new BufferedReader(fr);
			
//			br = new BufferedReader(new FileReader("WS_CONSULTA_MARGEM_RETORNO.xml")); 
			while ((linhaAtual = br.readLine()) != null) {
				xml = xml + linhaAtual;
			} 			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return xml.replaceAll("	", "");
	}
	
	
	public static String recebeAvaliacaoRiscoXML(){
		BufferedReader br = null;
		String xml = "";
		try { 	
			String linhaAtual; 
			
			String arquivo = "AV_RISCO_APROVADA_SAIDA.xml";
//			Thread.currentThread().getContextClassLoader()
			InputStream in = StubSIRIC.class.getResourceAsStream(arquivo);
			Reader fr = new InputStreamReader(in, "utf-8");
			br = new BufferedReader(fr);
			
//			br = new BufferedReader(new FileReader("WS_CONSULTA_MARGEM_RETORNO.xml")); 
			while ((linhaAtual = br.readLine()) != null) {
				xml = xml + linhaAtual;
			} 			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return xml.replaceAll("	", "");
	}
}
