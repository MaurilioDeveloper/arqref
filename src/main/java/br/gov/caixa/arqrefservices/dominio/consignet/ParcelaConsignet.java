package br.gov.caixa.arqrefservices.dominio.consignet;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"folhaVencimento","numeroParcela","valorParcela","valorDescontado","justificativa","status","nrContrato","codVerbaContrato","nomeConvenio","usuarioUltimaAlteracao"})
public class ParcelaConsignet implements Serializable {

	private static final long serialVersionUID = 8826672068112689462L;
	
	private String folhaVencimento;
	
	private String numeroParcela;
	
	private String valorParcela;
	
	private String valorDescontado;
	
	private String status;
	
	private String usuarioUltimaAlteracao;
	
	private String nrContrato;
	
	private String codVerbaContrato;
	
	private String nomeConvenio;
	
	private String justificativa;

	@XmlElement(name="folhaVencimento")
	public String getFolhaVencimento() {
		return folhaVencimento;
	}

	@XmlElement(name="numeroParcela")
	public String getNumeroParcela() {
		return numeroParcela;
	}

	@XmlElement(name="valorParcela")
	public String getValorParcela() {
		return valorParcela;
	}

	@XmlElement(name="valorDescontado")
	public String getValorDescontado() {
		return valorDescontado;
	}

	@XmlElement(name="status")
	public String getStatus() {
		return status;
	}

	@XmlElement(name="usuarioUltimaAlteracao")
	public String getUsuarioUltimaAlteracao() {
		return usuarioUltimaAlteracao;
	}

	@XmlElement(name="nrContrato")
	public String getNrContrato() {
		return nrContrato;
	}

	@XmlElement(name="codVerbaContrato")
	public String getCodVerbaContrato() {
		return codVerbaContrato;
	}

	@XmlElement(name="nomeConvenio")
	public String getNomeConvenio() {		
		return nomeConvenio;
	}

	@XmlElement(name="justificativa")
	public String getJustificativa() {
		return justificativa;
	}

	public void setNrContrato(String nrContrato) {
		this.nrContrato = nrContrato;
	}

	public void setCodVerbaContrato(String codVerbaContrato) {
		this.codVerbaContrato = codVerbaContrato;
	}

	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public void setFolhaVencimento(String folhaVencimento) {
		this.folhaVencimento = folhaVencimento;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public void setValorParcela(String valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setValorDescontado(String valorDescontado) {
		this.valorDescontado = valorDescontado;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setUsuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
		this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
	}
	
	
}
