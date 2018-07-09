package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="PROTOCOLO")
@XmlSeeAlso({ Avaliacao.class })
public class ProtocoloAvaliacao implements Serializable {

	private static final long serialVersionUID = -8016342648985461368L;
	
	@Tamanho(tamanho = 50)
	private String idProtocolo;
	
	private String tipoPessoa;
	
	private String cpf;
	
	private Avaliacao avaliacao;
	
	private boolean isProtocoloComErro = false;
	
	private String descricaoErro;

	@XmlElement(name="ID_PROTOCOLO")
	public String getIdProtocolo() {
		return idProtocolo;
	}

	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return this.tipoPessoa;
	}

	@XmlElement(name="CPF")
	public String getCpf() {
		return this.cpf;
	}

	@XmlElement(name="AVALIACAO")
	public Avaliacao getAvaliacao() {
		return this.avaliacao;
	}

	public void setIdProtocolo(String idProtocolo) {
		this.idProtocolo = idProtocolo;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public boolean isProtocoloComErro() {
		return isProtocoloComErro;
	}

	public void setProtocoloComErro(boolean isProtocoloComErro) {
		this.isProtocoloComErro = isProtocoloComErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}
	
	
	

}
