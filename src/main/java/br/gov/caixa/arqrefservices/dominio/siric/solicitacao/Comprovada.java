package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="COMPROVADA")
@XmlSeeAlso({ FontePagadora.class, Comprovante.class, EmpregoAnterior.class })
@XmlType(propOrder={"fontePagadora", "numeroCodigoOcupacao", "dataInicio", "valorRendaBruta", "valorRendaLiquida", 
		"comprovante", "valorImpostoRetido", "empregoAnterior"})
public class Comprovada  implements Serializable {
	
	private static final long serialVersionUID = 5217662071158415493L;
	
	
	private FontePagadora fontePagadora;
	
	@Tamanho(tamanho = 4)
	private String numeroCodigoOcupacao;
	
	@Tamanho(tamanho = 8)
	private String dataInicio;
	
	@Tamanho(tamanho = 11)
	private String valorRendaBruta;
	
	@Tamanho(tamanho = 11)
	private String valorRendaLiquida;
	
	private Comprovante comprovante;
	
	@Tamanho(tamanho = 11)
	private String valorImpostoRetido;
	
	private EmpregoAnterior empregoAnterior;
	
	@XmlElement(name="FONTE_PAGADORA")
	public FontePagadora getFontePagadora() {
		return fontePagadora;
	}
	public void setFontePagadora(FontePagadora fontePagadora) {
		this.fontePagadora = fontePagadora;
	}
	@XmlElement(name="COD_OCUPACAO")
	public String getNumeroCodigoOcupacao() {
		return numeroCodigoOcupacao;
	}
	public void setNumeroCodigoOcupacao(String numeroCodigoOcupacao) {
		this.numeroCodigoOcupacao = numeroCodigoOcupacao;
	}
	@XmlElement(name="DT_INICIO")
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	@XmlElement(name="VR_RENDA_BRUTA")
	public String getValorRendaBruta() {
		return valorRendaBruta;
	}
	public void setValorRendaBruta(String valorRendaBruta) {
		this.valorRendaBruta = valorRendaBruta;
	}
	@XmlElement(name="VR_RENDA_LIQUIDA")
	public String getValorRendaLiquida() {
		return valorRendaLiquida;
	}
	public void setValorRendaLiquida(String valorRendaLiquida) {
		this.valorRendaLiquida = valorRendaLiquida;
	}
	@XmlElement(name="COMPROVANTE")
	public Comprovante getComprovante() {
		return comprovante;
	}
	public void setComprovante(Comprovante comprovante) {
		this.comprovante = comprovante;
	}
	@XmlElement(name="VR_IMPOSTO_RETIDO")
	public String getValorImpostoRetido() {
		return valorImpostoRetido;
	}
	public void setValorImpostoRetido(String valorImpostoRetido) {
		this.valorImpostoRetido = valorImpostoRetido;
	}
	@XmlElement(name="EMPREGO_ANTERIOR")
	public EmpregoAnterior getEmpregoAnterior() {
		return empregoAnterior;
	}
	public void setEmpregoAnterior(EmpregoAnterior empregoAnterior) {
		this.empregoAnterior = empregoAnterior;
	}
}
