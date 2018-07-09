package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
@XmlType(propOrder={"tipoPessoa", "numeroCPF", "modeloValidacao", "modeloAvaliacao"})
public class AvaliacaoComAtualizacaoViaSicli implements Serializable {

	private static final long serialVersionUID = 2447923610969807089L;
	
	@Tamanho(tamanho = 1)
	private String tipoPessoa;
	
	@Tamanho(tamanho = 11)
	private String numeroCPF;

	@Tamanho(tamanho = 1)
	private String modeloValidacao;
	
	private String modeloAvaliacao;
	
	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	
	@XmlElement(name="CPF")
	public String getNumeroCPF() {
		return numeroCPF;
	}
	
	@XmlElement(name="MODELO_VALIDACAO")
	public String getModeloValidacao() {
		return modeloValidacao;
	}
	
	@XmlElement(name="MODELO_AVALIACAO")
	public String getModeloAvaliacao() {
		return modeloAvaliacao;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public void setModeloValidacao(String modeloValidacao) {
		this.modeloValidacao = modeloValidacao;
	}

	public void setModeloAvaliacao(String modeloAvaliacao) {
		this.modeloAvaliacao = modeloAvaliacao;
	}

	
}
