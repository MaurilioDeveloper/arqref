package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

//import br.gov.caixa.emprestimo.dominio.OperacaoSIRIC;
//import br.gov.caixa.emprestimo.dominio.QuadroValores;
//import br.gov.caixa.emprestimo.dominio.Tomador;

@XmlRootElement(name="DADOS")
@XmlSeeAlso({ TomadorSiric.class, OperacaoSIRIC.class, QuadroValores.class, AvaliacaoComAtualizacaoViaSicli.class })
@XmlType(propOrder={"tomador", "operacaoSIRIC" , "quadroValores", "atualizacaoSicli"})
public class DadosEnvioSolicitacaoAvaliacaoRisco implements Serializable{
	
	private static final long serialVersionUID = 648940030414558460L;

	private TomadorSiric tomador;
	
	private OperacaoSIRIC operacaoSIRIC;
	
	private QuadroValores quadroValores;
	
	private AvaliacaoComAtualizacaoViaSicli atualizacaoSicli;

	@XmlElement(name="TOMADOR")
	public TomadorSiric getTomador() {
		return tomador;
	}

	@XmlElement(name="DADOS_OPERACAO")
	public OperacaoSIRIC getOperacaoSIRIC() {
		return operacaoSIRIC;
	}

	@XmlElement(name="QUADRO_VALORES")
	public QuadroValores getQuadroValores() {
		return quadroValores;
	}

	@XmlElement(name="AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
	public AvaliacaoComAtualizacaoViaSicli getAtualizacaoSicli() {
		return atualizacaoSicli;
	}
		
	public void setTomador(TomadorSiric tomador) {
		this.tomador = tomador;
	}
	
	public void setAtualizacaoSicli(AvaliacaoComAtualizacaoViaSicli atualizacaoSicli) {
		this.atualizacaoSicli = atualizacaoSicli;
	}

	public void setOperacaoSIRIC(OperacaoSIRIC operacaoSIRIC) {
		this.operacaoSIRIC = operacaoSIRIC;
	}

	public void setQuadroValores(QuadroValores quadroValores) {
		this.quadroValores = quadroValores;
	}
}
