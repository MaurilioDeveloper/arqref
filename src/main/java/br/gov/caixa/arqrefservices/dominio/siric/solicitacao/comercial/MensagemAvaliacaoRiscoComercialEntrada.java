package br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.barramento.MensagemBarramento;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.DadosEnvioSolicitacaoAvaliacaoRisco;

@XmlRootElement(name = "avaliacao_risco_credito:SERVICO_ENTRADA")
@XmlSeeAlso({ SibarHeader.class , DadosEnvioSolicitacaoAvaliacaoRiscoComercial.class})
public class MensagemAvaliacaoRiscoComercialEntrada extends	MensagemBarramento {
	
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "xmlns:avaliacao_risco_credito")
	private String xmlns_avaliacao_risco_credito = "http://caixa.gov.br/sibar/avaliacao_risco_credito";

	@XmlAttribute(name = "xmlns:nsddor")
	private String xmlns_nsddor = "http://caixa.gov.br/sibar/avaliacao_risco_credito";

	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlns_sibar_base = "http://caixa.gov.br/sibar";


	@XmlAttribute(name = "xmlns:xsi")
	private String xmlns_xsi = "http://www.w3.org/2001/XMLSchema-instance";

	@XmlAttribute(name = "xsi:schemaLocation")
	private String xsi_schemaLocation = "http://caixa.gov.br/sibar/avaliacao_risco_credito Avaliacao_Risco_Credito.xsd http://caixa.gov.br/sibar ../MensagensBarramento.xsd  ";

	private DadosEnvioSolicitacaoAvaliacaoRiscoComercial dados;

	@XmlElement(name = "DADOS")
	public DadosEnvioSolicitacaoAvaliacaoRiscoComercial getDados() {
		return dados;
	}

	public void setDados(DadosEnvioSolicitacaoAvaliacaoRiscoComercial dados) {
		this.dados = dados;
	}
}
