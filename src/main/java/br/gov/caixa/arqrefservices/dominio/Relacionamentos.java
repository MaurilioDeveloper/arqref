package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada pela avaliacao de risco SIRIC
 * 
 * @author c110503
 * @version 1.0.0.1
 * 
 */
@XmlRootElement(name = "RELACIONAMENTOS")
@XmlType(propOrder = {"pessoaReciproca","codigoPergunta","dataInicio","dataFim","valorRelacionamento"})
public class Relacionamentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6203709889399083301L;

	private PessoaReciproca pessoaReciproca;
	
	private String codigoPergunta;
	
	private String dataInicio;
	
	private String dataFim;
	
	private String valorRelacionamento;

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

	@Override
	public String toString() {
		return "Relacionamentos [pessoaReciproca=" + pessoaReciproca
				+ ", codigoPergunta=" + codigoPergunta + ", dataInicio="
				+ dataInicio + ", dataFim=" + dataFim
				+ ", valorRelacionamento=" + valorRelacionamento + "]";
	}
	
	

}
