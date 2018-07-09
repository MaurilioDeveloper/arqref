package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "COCLI_ATIVO")
public class CocliAtivo implements Serializable {

	private static final long serialVersionUID = 2500595795335126160L;

	private String cocliAtivo;
	
	private String flagDadoMinimosIncompletos;
	
	private String nivelCadastro;

	@XmlElement(name="COCLI_ATIVO")
	public String getCocliAtivo() {
		return this.cocliAtivo;
	}

	@XmlElement(name="FLAG_DADOS_MIN_INCOMPL")
	public String getFlagDadoMinimosIncompletos() {
		return this.flagDadoMinimosIncompletos;
	}

	@XmlElement(name="NIVEL_CADASTRO")
	public String getNivelCadastro() {
		return this.nivelCadastro;
	}

	public void setCocliAtivo(String cocliAtivo) {
		this.cocliAtivo = cocliAtivo;
	}

	public void setFlagDadoMinimosIncompletos(String flagDadoMinimosIncompletos) {
		this.flagDadoMinimosIncompletos = flagDadoMinimosIncompletos;
	}

	public void setNivelCadastro(String nivelCadastro) {
		this.nivelCadastro = nivelCadastro;
	}
	
	
	
	

}
