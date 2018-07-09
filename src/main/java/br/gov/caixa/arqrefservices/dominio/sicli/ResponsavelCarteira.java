package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="RESPONSAVEL_CARTEIRA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ResponsavelCarteira  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6966576092252993100L;

	private String matricula;
	
	private String nome;
	
	private String cargo;
	
	private String agencia;
	
	private String carteira;
	
	private String dataInicio;
	
	private String dataTermino;
	
	private String funcao;

	@XmlElement(name="MATRICULA")
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@XmlElement(name="NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@XmlElement(name="CARGO")
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@XmlElement(name="AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name="CARTEIRA")
	public String getCarteira() {
		return carteira;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	@XmlElement(name="DT_INICIO")
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	@XmlElement(name="DT_TERMINO")
	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	@XmlElement(name="FUNCAO")
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "ResponsavelCarteira [matricula=" + matricula + ", nome=" + nome
				+ ", cargo=" + cargo + ", agencia=" + agencia + ", carteira="
				+ carteira + ", dataInicio=" + dataInicio + ", dataTermino="
				+ dataTermino + ", funcao=" + funcao + "]";
	}
	
	
	
	
	
	

}
