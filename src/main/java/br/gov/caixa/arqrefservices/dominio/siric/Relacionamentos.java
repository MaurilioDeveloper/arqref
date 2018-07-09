package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

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
@XmlRootElement(name="RELACIONAMENTOS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = {"pessoaReciproca","codigoPergunta","dataInicio","dataFim","valorRelacionamento","quadroValores" })
public class Relacionamentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3492158470474008147L;
	
	private PessoaReciproca pessoaReciproca;
	
	private String codigoPergunta;
	
	private String dataInicio;
	
	private String dataFim;
	
	private String valorRelacionamento;
	
	private QuadroValores quadroValores;

	@XmlElement(name="PESSOA_RECIPROCA")
	public PessoaReciproca getPessoaReciproca() {
		return pessoaReciproca;
	}

	public void setPessoaReciproca(PessoaReciproca pessoaReciproca) {
		this.pessoaReciproca = pessoaReciproca;
	}

	@XmlElement(name="CODIGO_PERGUNTA")
	public String getCodigoPergunta() {
		return codigoPergunta;
	}

	public void setCodigoPergunta(String codigoPergunta) {
		this.codigoPergunta = codigoPergunta;
	}

	@XmlElement(name="DATA_INICIO")
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	@XmlElement(name="DATA_FIM")
	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	@XmlElement(name="VALOR_RELACIONAMENTO")
	public String getValorRelacionamento() {
		return valorRelacionamento;
	}

	public void setValorRelacionamento(String valorRelacionamento) {
		this.valorRelacionamento = valorRelacionamento;
	}

	@XmlElement(name="QUADRO_VALORES")
	public QuadroValores getQuadroValores() {
		return quadroValores;
	}

	public void setQuadroValores(QuadroValores quadroValores) {
		this.quadroValores = quadroValores;
	}

	@Override
	public String toString() {
		return "Relacionamentos [pessoaReciproca=" + pessoaReciproca
				+ ", codigoPergunta=" + codigoPergunta + ", dataInicio="
				+ dataInicio + ", dataFim=" + dataFim
				+ ", valorRelacionamento=" + valorRelacionamento
				+ ", quadroValores=" + quadroValores + "]";
	}
	
	
	

}
