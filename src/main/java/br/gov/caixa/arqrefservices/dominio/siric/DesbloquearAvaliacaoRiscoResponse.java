package br.gov.caixa.arqrefservices.dominio.siric;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.barramento.MensagemBarramento;

@XmlRootElement(name = "desbloqueioalcada:SERVICO_SAIDA")
@XmlAccessorType(XmlAccessType.FIELD)
public class DesbloquearAvaliacaoRiscoResponse extends MensagemBarramento {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "DADOS")
	private RetornoDadosDesbloqueioAvaliacaoRisco dados;

	public DesbloquearAvaliacaoRiscoResponse() {

	}

	public DesbloquearAvaliacaoRiscoResponse(final RetornoDadosDesbloqueioAvaliacaoRisco dados) {
		this.dados = dados;
	}

	public RetornoDadosDesbloqueioAvaliacaoRisco getDados() {
		return dados;
	}

}
