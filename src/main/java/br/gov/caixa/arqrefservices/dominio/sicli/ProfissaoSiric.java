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
@XmlRootElement(name="PROFISSAO_SIRIC")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ProfissaoSiric  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5773401995663232370L;

	private String descricaoProfissao;
	
	private String profissao;
	
	private String dataInicio;
	
	private String dataTermino;
	
	private String profissaoPrincipal;

	@XmlElement(name="DESCRICAO_PROFISSAO")
	public String getDescricaoProfissao() {
		return descricaoProfissao;
	}

	public void setDescricaoProfissao(String descricaoProfissao) {
		this.descricaoProfissao = descricaoProfissao;
	}

	@XmlElement(name="PROFISSAO")
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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

	@XmlElement(name="PROF_PRINCIPAL")
	public String getProfissaoPrincipal() {
		return profissaoPrincipal;
	}

	public void setProfissaoPrincipal(String profissaoPrincipal) {
		this.profissaoPrincipal = profissaoPrincipal;
	}

	@Override
	public String toString() {
		return "ProfissaoSiric [descricaoProfissao=" + descricaoProfissao
				+ ", profissao=" + profissao + ", dataInicio=" + dataInicio
				+ ", dataTermino=" + dataTermino + ", profissaoPrincipal="
				+ profissaoPrincipal + "]";
	}
	
	
	

}
