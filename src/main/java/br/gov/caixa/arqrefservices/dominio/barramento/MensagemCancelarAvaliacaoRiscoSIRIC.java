package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.siric.Dados;

/**
 * Classe utilizada para montar o cabecalho do
 * SIBAR com variaveis estaticas de consulta de avaliacao de risco
 * no SIRIC
 * e a parte variavel formada pela variavel dados
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "cancelamento_avaliacao_risco:SERVICO_ENTRADA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class MensagemCancelarAvaliacaoRiscoSIRIC extends MensagemBarramento {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3573719715885059971L;

	@XmlAttribute(name = " xmlns:cancelamento_avaliacao_risco")
	private String xmlns_tns = "http://caixa.gov.br/sibar/cancelamento_avaliacao_risco";
	
	@XmlAttribute(name = " xsi:schemaLocation")
	private String xmlns_nsddor = "http://caixa.gov.br/sibar/cancelamento_avaliacao_risco CANCELAMENTO_XML.xsd http://caixa.gov.br/sibar ../MensagensBarramento.xsd ";

	@XmlAttribute(name = "xmlns:xsi")
	private String xmlns_xsi = "http://www.w3.org/2001/XMLSchema-instance";
	
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
