package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ERROS_VALIDACAO")
public class ErrosValidacaoAvaliacao implements Serializable{
	
	
	private static final long serialVersionUID = -3651815816610713615L;

	private String descricaoTipo;

	private String descricaoItem;
	
	private String descricaoErro;

	@XmlElement(name="TIPO")
	public String getDescricaoTipo() {
		return descricaoTipo;
	}

	public void setDescricaoTipo(String descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
	}

	@XmlElement(name="ITEM")
	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	@XmlElement(name="ERRO")
	public String getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}
	
}
