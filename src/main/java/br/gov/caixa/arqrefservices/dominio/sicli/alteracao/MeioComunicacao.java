package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="MEIO_COMUNICACAO")
@XmlType(propOrder={"ocorrencia", "meioComunicacao", "prefixoDiscagem", "codigoComunicacao", "nomeContato", "finalidadeTelefone"})
public class MeioComunicacao implements Serializable {
	
	private static final long serialVersionUID = -3832333313876431240L;
	
	private String ocorrencia;
	
	private String meioComunicacao;
	
	private String prefixoDiscagem;
	
	private String codigoComunicacao;
	
	private String nomeContato;

	private String finalidadeTelefone;

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	@XmlElement(name="MEIO_COMUNICACAO")
	public String getMeioComunicacao() {
		return meioComunicacao;
	}

	@XmlElement(name="PREFIXO_DISCAGEM")
	public String getPrefixoDiscagem(){
		return prefixoDiscagem;
	}


	@XmlElement(name="COD_COMUNICACAO")
	public String getCodigoComunicacao() {
		return codigoComunicacao;
	}

	@XmlElement(name="NOME_CONTATO")
	public String getNomeContato() {
		return nomeContato;
	}

	@XmlElement(name="FINALIDADE")
	public String getFinalidadeTelefone() {
		return finalidadeTelefone;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public void setMeioComunicacao(String meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

	public void setPrefixoDiscagem(String prefixoDiscagem) {
		this.prefixoDiscagem = prefixoDiscagem;
	}

	public void setCodigoComunicacao(String codigoComunicacao) {
		this.codigoComunicacao = codigoComunicacao;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public void setFinalidadeTelefone(String finalidadeTelefone) {
		this.finalidadeTelefone = finalidadeTelefone;
	}

	
	
	
}
