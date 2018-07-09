package br.gov.caixa.arqrefservices.dominio.barramento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefcore.util.Dater;

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
@XmlRootElement(name = "nsrm:SERVICO_ENTRADA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class MensagemRecuperarDadosMinutaEntrada extends MensagemBarramento {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3573719715885059971L;

	@XmlAttribute(name = " xmlns:credito_base")
	private String xmlns_tns = "http://caixa.gov.br/sifec/biblioteca";
	
	@XmlAttribute(name = "xmlns:nsrm")
	private String xmlns_nsrm = "http://caixa.gov.br/sifec/recuperardadoscontratominuta";
	
	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlns_sibar_base = "http://caixa.gov.br/sibar";
	
	@XmlAttribute(name = "xmlns:xsi")
	private String xmlns_xsi = "http://www.w3.org/2001/XMLSchema-instance";
	
	@XmlAttribute(name = " xsi:schemaLocation")
	private String xmlns_nsddor = "http://caixa.gov.br/sifec/recuperardadoscontratominuta RECUPERA_DADOS_CONTRATO_MINUTA.xsd";
	
	public MensagemRecuperarDadosMinutaEntrada() {
		
	}
	
	public MensagemRecuperarDadosMinutaEntrada(String ip, String usuario) {
		SibarHeader header = getSibarHeader();
		header.setVersao("1.0");
		header.setUsuarioServico(System.getProperty("SIFEC_USUARIO"));
		header.setUsuario(usuario);
		header.setOperacao("RECUPERAR_DADOS_CONTRATO_MINUTA");
		header.setSistemaOrigem("SIFEC");
		header.setDataHora(new Dater().withToday().asString("yyyy-MM-dd"));
		header.setIdentificadorOrigem(ip);
		header.setIdProcesso("ID_PROCESSO");
	}

	private DadosMinuta dados;
	

	@XmlElement(name = "DADOS")
	public DadosMinuta getDados() {
		if (dados == null) {
			dados = new DadosMinuta();
		}
		return dados;
	}

	public void setDados(DadosMinuta dados) {
		this.dados = dados;
	}
	
	

}
