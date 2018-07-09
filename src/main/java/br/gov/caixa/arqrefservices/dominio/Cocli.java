package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "COCLI_ATIVO")
public class Cocli implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -744778392856097844L;

	
	private String cocli;
	
	private String dadosMinIncompletos;
	
	private String nivelCadastro;

	@XmlElement(name="COCLI_ATIVO")
	public String getCocli() {
		return cocli;
	}

	public void setCocli(String cocli) {
		this.cocli = cocli;
	}

	@XmlElement(name="FLAG_DADOS_MIN_INCOMPL")
	public String getDadosMinIncompletos() {
		return dadosMinIncompletos;
	}

	public void setDadosMinIncompletos(String dadosMinIncompletos) {
		this.dadosMinIncompletos = dadosMinIncompletos;
	}

	@XmlElement(name="NIVEL_CADASTRO")
	public String getNivelCadastro() {
		return nivelCadastro;
	}

	public void setNivelCadastro(String nivelCadastro) {
		this.nivelCadastro = nivelCadastro;
	}
	
	
}
