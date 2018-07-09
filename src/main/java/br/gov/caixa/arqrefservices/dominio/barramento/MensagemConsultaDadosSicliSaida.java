package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.sicli.Dados;


/**
 * Classe utilizada para montar o cabecalho do
 * SIBAR com variaveis estaticas de saida de consulta no SICLI
 * e a parte variavel formada pela variavel dados
 * 
 * @author c110503
 * @version 2.0.0.1
 *
 */
@XmlRootElement(name="consulta_avaliacao_risco:SERVICO_SAIDA")
@XmlSeeAlso({SibarHeader.class, Dados.class})
public class MensagemConsultaDadosSicliSaida extends MensagemBarramento {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4800881246044560451L;
	
	private Dados dados;

	@XmlElement(name="DADOS")
	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}
	
}
