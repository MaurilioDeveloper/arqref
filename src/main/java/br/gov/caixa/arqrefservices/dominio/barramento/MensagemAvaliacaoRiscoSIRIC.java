package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.siric.Dados;

/**
 * Classe utilizada para montar o cabecalho do
 * SIBAR com variaveis estaticas de consulta no SICLI
 * e a parte variavel formada pela variavel dados
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "avaliacao_risco_credito:SERVICO_ENTRADA")
public class MensagemAvaliacaoRiscoSIRIC extends MensagemBarramento {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3573719715885059971L;

	@XmlAttribute(name = " xmlns:avaliacao_risco_credito")
	private String xmlns_tns = "http://caixa.gov.br/sibar/avaliacao_risco_credito";
	
	@XmlAttribute(name = " xmlns:nsddor")
	private String xmlns_nsddor = "http://caixa.gov.br/sibar/avaliacao_risco_credito";

	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlns_sibar_base = "http://caixa.gov.br/sibar";
	

	private Dados dados;
	
	

	@XmlElement(name = "DADOS")
	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}
	
	

}
