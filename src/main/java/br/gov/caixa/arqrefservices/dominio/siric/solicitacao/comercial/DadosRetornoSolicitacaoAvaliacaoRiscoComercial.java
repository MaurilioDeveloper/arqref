package br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.AvaliacaoSiric;

@XmlRootElement(name="DADOS")
@XmlSeeAlso({ AvaliacaoSiric.class })
@XmlType(propOrder={"avaliacao"})
public class DadosRetornoSolicitacaoAvaliacaoRiscoComercial implements Serializable{
	
	private static final long serialVersionUID = 648940030414558460L;

	private AvaliacaoSiric avaliacao;

	@XmlElement(name="AVALIACAO")
	public AvaliacaoSiric getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoSiric avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
