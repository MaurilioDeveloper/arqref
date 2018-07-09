package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="FILIACAO")
@XmlType(propOrder={"nomePai", "nomeMae"})
public class Filiacao implements Serializable {


	private static final long serialVersionUID = 6276603845474031945L;
	
	@Tamanho(tamanho = 40)
	private String nomePai;
	
	@Tamanho(tamanho = 40)
	private String nomeMae;
	
	@XmlElement(name="PAI")
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	@XmlElement(name="MAE")
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	
}
