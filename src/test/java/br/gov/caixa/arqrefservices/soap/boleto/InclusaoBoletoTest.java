package br.gov.caixa.arqrefservices.soap.boleto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.SystemProxyFabrica;

public class InclusaoBoletoTest extends SystemProxyFabrica {

	@Test
	public void consultaContratosTest() throws Exception {

		String url = "http://10.192.225.5/sibar/ConsultaCobrancaBancaria/Boleto";
		String xmlREQ = getXML("CONSULTAR_BOLETO_ENTRADA");

		String xmlRET = executar(url, xmlREQ);

		Assert.assertNotNull(xmlRET);
	}

	public String getXML(String nomeXml) {
		ResourceLoader loader = new ResourceLoader();
		return loader.with(getClass()).load(nomeXml + ".xml").asText();
	}

	public String executar(String URL, String xmlEntrada) throws IOException, ExcecaoSOAP {

		HttpURLConnection conexao = null;

		try {

			URL url = new URL(URL);

			conexao = (HttpURLConnection) url.openConnection();

			conexao.setRequestMethod("POST");
			conexao.setRequestProperty("Content-Type", "text/xml;charset=UTF-8;");
			conexao.setDoOutput(true);
			conexao.setRequestProperty("SOAPAction", "http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto/NewOperation");
			conexao.connect();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conexao.getOutputStream()));

			bw.write(xmlEntrada);
			bw.flush();
			bw.close();

			String resposta = getStringConteudoStream(conexao.getInputStream());
		
			return retiraCaracteresEspeciais(resposta);
			
		} catch (Exception e) {
			throw new IOException(e);
		} finally {
			if (conexao != null) {

				if (conexao.getErrorStream() != null) {
					BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getErrorStream()));
					String line = reader.readLine();
					while (line != null) {
						line = reader.readLine();
					}
				}
				conexao.disconnect();
			}
		}
	}

	private String getStringConteudoStream(InputStream stream) throws IOException {
		StringBuilder conteudo = new StringBuilder();

		if (stream != null) {
			BufferedReader br = new BufferedReader(new InputStreamReader(stream, "ISO-8859-1"));

			String linha = "";
			while ((linha = br.readLine()) != null) {
				conteudo.append(linha);
			}

			br.close();
		}

		return conteudo.toString();
	}

	public static String retiraCaracteresEspeciais(String stringFonte) {

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

}
