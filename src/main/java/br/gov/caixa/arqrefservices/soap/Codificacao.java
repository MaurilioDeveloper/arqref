package br.gov.caixa.arqrefservices.soap;

/**
 * Utilitario relacionado a codificacao de caracteres a ser utilizado pelos consumidores. 
 * 
 * @author Indra
 *
 */
public final class Codificacao {

	/**
	 * Construtor privado.
	 */
	private Codificacao() { }
	
	/**
	 * Remove o encoding do XML para não afetar o parser do ConverterXML.
	 * 
	 * @param xml
	 * @return
	 */
	public static String removerISO88591(String xml) {
		return xml.replaceAll("encoding=\"ISO-8859-1\"", "")
				.replaceAll("encoding=\"iso-8859-1\"", "")
				.replaceAll("encoding='ISO-8859-1'", "")
				.replaceAll("encoding='iso-8859-1'", "");
	}
}
