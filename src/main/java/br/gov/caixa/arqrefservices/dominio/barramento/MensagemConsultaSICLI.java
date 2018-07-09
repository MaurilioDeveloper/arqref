package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para montar o cabecalho do
 * SIBAR com variaveis estaticas de consulta no SICLI
 * e a parte variavel formada pela variavel dados
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "tns:SERVICO_ENTRADA")
public class MensagemConsultaSICLI extends MensagemBarramento {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3573719715885059971L;

	@XmlAttribute(name = " xmlns:tns")
	private String xmlns_tns = "http://caixa.gov.br/sibar/consultacliente";

	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlns_sibar_base = "http://caixa.gov.br/sibar";
	

	private DadosConsultaSicli dados;

	@XmlElement(name = "DADOS")
	public DadosConsultaSicli getDados() {
		return dados;
	}

	public void setDados(DadosConsultaSicli dados) {
		this.dados = dados;
	}

}
