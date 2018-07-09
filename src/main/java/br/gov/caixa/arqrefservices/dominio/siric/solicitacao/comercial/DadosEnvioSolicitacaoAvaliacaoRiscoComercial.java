package br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.AvaliacaoComAtualizacaoViaSicli;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.OperacaoSIRIC;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.TomadorSiric;

@XmlRootElement(name="DADOS")
@XmlSeeAlso({ TomadorSiric.class, OperacaoSIRIC.class, QuadroValoresAvaliacao.class, AvaliacaoComAtualizacaoViaSicli.class })
@XmlType(propOrder={"quadroValores", "relacionamentos", "atualizacaoSicli"})
public class DadosEnvioSolicitacaoAvaliacaoRiscoComercial implements Serializable{
	
	private static final long serialVersionUID = 648940030414558460L;
	
	private QuadroValoresAvaliacao quadroValores;

	private Relacionamentos relacionamentos;
	
	private AvaliacaoComAtualizacaoViaSicli atualizacaoSicli;


	@XmlElement(name="QUADRO_VALORES")
	public QuadroValoresAvaliacao getQuadroValores() {
		return quadroValores;
	}
	
	@XmlElement(name="RELACIONAMENTOS")
	public Relacionamentos getRelacionamentos() {
		return relacionamentos;
	}

	@XmlElement(name="AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
	public AvaliacaoComAtualizacaoViaSicli getAtualizacaoSicli() {
		return atualizacaoSicli;
	}
			
	public void setAtualizacaoSicli(AvaliacaoComAtualizacaoViaSicli atualizacaoSicli) {
		this.atualizacaoSicli = atualizacaoSicli;
	}
	
	public void setQuadroValores(QuadroValoresAvaliacao quadroValores) {
		this.quadroValores = quadroValores;
	}
	
	public void setRelacionamentos(Relacionamentos relacionamentos) {
		this.relacionamentos = relacionamentos;
	}

}
