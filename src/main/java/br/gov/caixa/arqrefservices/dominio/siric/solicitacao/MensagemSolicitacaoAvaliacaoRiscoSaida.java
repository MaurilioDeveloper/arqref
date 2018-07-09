package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.barramento.MensagemBarramento;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;


@XmlRootElement(name="consultaespecificacontrato:SERVICO_SAIDA")
@XmlSeeAlso({SibarHeader.class, DadosRecebeProtocoloSiric.class})
public class MensagemSolicitacaoAvaliacaoRiscoSaida extends MensagemBarramento {
	
	private static final long serialVersionUID = -6045424942156552067L;

	private DadosRecebeProtocoloSiric dados;

	@XmlElement(name="DADOS")
	public DadosRecebeProtocoloSiric getDados() {
		return dados;
	}

	public void setDados(DadosRecebeProtocoloSiric dados) {
		this.dados = dados;
	}
	
}
