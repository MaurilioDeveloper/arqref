package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="EMPREGO_ANTERIOR")
@XmlType(propOrder={"quantidadeAnos", "quantidadeMeses"})
public class EmpregoAnterior implements Serializable {
	
	private static final long serialVersionUID = 7468689084665116955L;
	
	@Tamanho(tamanho = 2)
	private String quantidadeAnos;
	
	@Tamanho(tamanho = 2)
	private String quantidadeMeses;
	
	@XmlElement(name="QT_ANOS")
	public String getQuantidadeAnos() {
		return quantidadeAnos;
	}
	public void setQuantidadeAnos(String quantidadeAnos) {
		this.quantidadeAnos = quantidadeAnos;
	}
	@XmlElement(name="QT_MESES")
	public String getQuantidadeMeses() {
		return quantidadeMeses;
	}
	public void setQuantidadeMeses(String quantidadeMeses) {
		this.quantidadeMeses = quantidadeMeses;
	}
}
