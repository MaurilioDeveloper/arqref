package br.gov.caixa.arqrefservices.soap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;

public class WSConsumidor {

	private static Logger log = Logger.getLogger(WSConsumidor.class.getName());

	private final String url;

	public WSConsumidor(final String URL) {
		url = URL;
	}

	public String executar(final String soap) throws IOException, ExcecaoSOAP {

		log.info("XML_ENTRADA: " + soap);

		final HttpURLConnection conexao = getHttpURLConnection();
		conexao.setRequestMethod("POST");
		conexao.setRequestProperty("Content-Type", "text/xml;charset=UTF-8;");
		conexao.setDoOutput(true);
		conexao.setRequestProperty("SOAPAction", "");
		conexao.connect();

		return this.executar(soap, conexao);

	}

	public String executar(final String soap, final HttpURLConnection conexao) throws IOException {

		try {

			conexao.connect();

			final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conexao.getOutputStream()));

			bw.write(soap);
			bw.flush();
			bw.close();

			final String resposta = getStringConteudoStream(conexao.getInputStream());
			log.info("XML_SAIDA: " + resposta);

			return resposta;
		} catch (final Exception e) {
			log.info("URL UTILIZADA:  " + url);
			log.info("ERRO NO WSConsumidor:  " + e.getMessage() + " <> Com os parametros de entrada: " + soap);
			throw new IOException(e);
		} finally {
			if (conexao != null) {
				log.info("VALIDANDO O RESPONSECODE:  " + conexao.getResponseCode());
				if (conexao.getErrorStream() != null) {
					final BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getErrorStream()));
					String line = reader.readLine();
					while (line != null) {
						log.info("URL UTILIZADA:  " + url);
						log.info(">>> DESCRICAO DO ERRO NO RESPONSE:  " + line);
						line = reader.readLine();
					}
				}
				conexao.disconnect();
			}
		}
	}

	// public String executar(String soap) throws IOException, ExcecaoSOAP {
	// log.info("XML_ENTRADA: " + soap);
	//
	// HttpURLConnection conexao = null;
	//
	// try {
	//
	// conexao = getHttpURLConnection();
	//
	// conexao.setRequestMethod("POST");
	// conexao.setRequestProperty("Content-Type", "text/xml;charset=UTF-8;");
	// conexao.setDoOutput(true);
	// conexao.setRequestProperty("SOAPAction", "IncluiBoleto");
	// conexao.connect();
	//
	// BufferedWriter bw = new BufferedWriter(new
	// OutputStreamWriter(conexao.getOutputStream()));
	//
	// bw.write(soap);
	// bw.flush();
	// bw.close();
	//
	// String resposta = getStringConteudoStream(conexao.getInputStream());
	// log.info("XML_SAIDA: " + resposta);
	//
	//// resposta = Codificacao.removerISO88591(resposta);
	//
	// return resposta;
	// } catch (Exception e) {
	// log.info("URL UTILIZADA: " + url);
	// log.info("ERRO NO WSConsumidor: "+ e.getMessage() + " <> Com os parametros de
	// entrada: " + soap );
	// throw new IOException(e);
	// } finally {
	// if (conexao != null) {
	// log.info("VALIDANDO O RESPONSECODE: " + conexao.getResponseCode());
	// if(conexao.getErrorStream()!=null){
	// BufferedReader reader = new BufferedReader(new
	// InputStreamReader(conexao.getErrorStream()));
	// String line = reader.readLine();
	// while( line != null ) {
	// log.info("URL UTILIZADA: " + url);
	// log.info(">>> DESCRICAO DO ERRO NO RESPONSE: " + line);
	// line = reader.readLine();
	// }
	// }
	// conexao.disconnect();
	// }
	// }
	// }

	private HttpURLConnection getHttpURLConnection() throws MalformedURLException, IOException {

		final URL url = new URL(this.url);

		if (this.url.contains("https")) {
			return (HttpsURLConnection) url.openConnection();
		} else {
			return (HttpURLConnection) url.openConnection();
		}
	}

	private String getStringConteudoStream(final InputStream stream) throws IOException {
		final StringBuilder conteudo = new StringBuilder();

		if (stream != null) {
			final BufferedReader br = new BufferedReader(new InputStreamReader(stream, "ISO-8859-1"));

			String linha = "";
			while ((linha = br.readLine()) != null) {
				conteudo.append(linha);
			}

			br.close();
		}

		return conteudo.toString();
	}

	public boolean detectaErroEnvSERPRO(final String resposta) {
		return resposta.indexOf("soap:Fault") > -1;
	}

	public boolean detectaErroConteudoSERPRO(final String conteudo) {
		return conteudo.indexOf("response") < 0;
	}

}
