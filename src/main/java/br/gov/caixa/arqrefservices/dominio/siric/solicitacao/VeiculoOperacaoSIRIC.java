package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="VEICULO")
public class VeiculoOperacaoSIRIC implements Serializable {
	
	private static final long serialVersionUID = -3461583376284651640L;
	
	@Tamanho(tamanho = 4)
	private String anoFabricacao;

	@XmlElement(name="ANO")
	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
}
