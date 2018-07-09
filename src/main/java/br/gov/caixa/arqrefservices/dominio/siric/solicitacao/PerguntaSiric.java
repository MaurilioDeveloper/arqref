package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "RELACIONAMENTOS")
@XmlSeeAlso({ PessoaReciproca.class })
@XmlType(propOrder={"dataInicio", "pessoaReciproca"})
public class PerguntaSiric implements Serializable {

	private static final long serialVersionUID = -4106755031355750958L;

	private PessoaReciproca pessoaReciproca;
	
	private String dataInicio;

	@XmlElement(name="DATA_INICIO")
	public String getDataInicio() {
		return dataInicio;
	}
	
	@XmlElement(name="PESSOA_RECIPROCA")
	public PessoaReciproca getPessoaReciproca() {
		return pessoaReciproca;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public void setPessoaReciproca(PessoaReciproca pessoaReciproca) {
		this.pessoaReciproca = pessoaReciproca;
	}

	
}