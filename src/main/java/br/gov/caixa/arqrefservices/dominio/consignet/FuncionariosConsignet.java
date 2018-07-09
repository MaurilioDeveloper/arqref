package br.gov.caixa.arqrefservices.dominio.consignet;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"convenio","origem","matricula","folhaPagamento","dataCorte","margemDisponivel"})
public class FuncionariosConsignet implements Serializable {

	private static final long serialVersionUID = 8826672068112689462L;
	
	private String convenio;
	
	private String origem;
	
	private String matricula;
	
	private String folhaPagamento;
	
	private String dataCorte;
	
	private String margemDisponivel;
	

	@XmlElement(name="convenio")
	public String getConvenio() {
		return convenio;
	}

	@XmlElement(name="dataCorte")
	public String getDataCorte() {
		return dataCorte;
	}

	@XmlElement(name="folhaPagamento")
	public String getFolhaPagamento() {
		return folhaPagamento;
	}

	@XmlElement(name="margemDisponivel")
	public String getMargemDisponivel() {
		return margemDisponivel;
	}

	@XmlElement(name="matricula")
	public String getMatricula() {
		return matricula;
	}

	@XmlElement(name="origem")
	public String getOrigem() {
		return origem;
	}


	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}


	public void setDataCorte(String dataCorte) {
		this.dataCorte = dataCorte;
	}


	public void setFolhaPagamento(String folhaPagamento) {
		this.folhaPagamento = folhaPagamento;
	}


	public void setMargemDisponivel(String margemDisponivel) {
		this.margemDisponivel = margemDisponivel;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}

	
}
