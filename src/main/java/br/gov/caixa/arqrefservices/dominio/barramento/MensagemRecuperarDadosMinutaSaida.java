package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.sicli.Dados;


@XmlRootElement(name="recuperardadoscontratominuta:SERVICO_SAIDA")
@XmlSeeAlso({SibarHeader.class, Dados.class})
public class MensagemRecuperarDadosMinutaSaida extends MensagemBarramento {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4800881246044560451L;
	
	@XmlAttribute(name = "xmlns:xsi")
	private String xmlns_xsi = "http://www.w3.org/2001/XMLSchema-instance";
	
	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlns_sibar_base = "http://caixa.gov.br/sibar";
	
	@XmlAttribute(name = "xmlns:recuperardadoscontratominuta")
	private String xmlns_nsrm = "http://caixa.gov.br/sifec/recuperardadoscontratominuta";
	
	private DadosMinuta dados;
	
	@XmlElement(name="DADOS")
	public DadosMinuta getDados() {
		return dados;
	}

	public void setDados(DadosMinuta dados) {
		this.dados = dados;
	}
	
}
