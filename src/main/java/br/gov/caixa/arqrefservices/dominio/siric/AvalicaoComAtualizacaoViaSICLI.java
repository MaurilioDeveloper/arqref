package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = {"tipoPessoa","cpf","cnpj","modeloAvaliacao"})
public class AvalicaoComAtualizacaoViaSICLI implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1840896687701950286L;
	
	private String tipoPessoa;
	
	private String cpf;
	
	private String cnpj;
	
	private List<String> modeloAvaliacao;

	

	@XmlElement(name="MODELO_VALIDACAO")
	public List<String> getModeloAvaliacao() {
		return modeloAvaliacao;
	}

	public void setModeloAvaliacao(List<String> modeloAvaliacao) {
		this.modeloAvaliacao = modeloAvaliacao;
	}
	
	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@XmlElement(name="CNPJ")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "AvalicaoComAtualizacaoViaSICLI [modeloAvaliacao="
				+ modeloAvaliacao + "]";
	}
	
	
	

}
