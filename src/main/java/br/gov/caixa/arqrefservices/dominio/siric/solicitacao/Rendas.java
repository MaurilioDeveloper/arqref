package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Decimal;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="RENDAS")
@XmlSeeAlso({ Comprovada.class, NaoComprovada.class })

public class Rendas implements Serializable {

	private static final long serialVersionUID = -4913961638642617536L;
	private List<Comprovada> listaComprovadas;
	
	private List<NaoComprovada> listaNaoComprovadas;
	
	private Comprovada comprovada;
	
	private NaoComprovada naoComprovada;
	
	@XmlElement(name="COMPROVADA")
	public List<Comprovada> getListaComprovadas() {
		return listaComprovadas;
	}
	
	public void setListaComprovadas(List<Comprovada> listaComprovadas) {
		this.listaComprovadas = listaComprovadas;
	}
	
	public Comprovada getComprovada() {
		return comprovada;
	}
	public void setComprovada(Comprovada comprovada) {
		this.comprovada = comprovada;
	}
	
	@XmlElement(name="NAO_COMPROVADA")
	public List<NaoComprovada> getListaNaoComprovadas() {
		return listaNaoComprovadas;
	}

	public void setListaNaoComprovadas(List<NaoComprovada> listaNaoComprovadas) {
		this.listaNaoComprovadas = listaNaoComprovadas;
	}
	
	@Tamanho(tamanho = 4)
	private Integer numeroRenda;
	
	@Tamanho(tamanho = 4)
	private Integer ano;
	
	@Tamanho(tamanho = 4)
	private Integer numeroNatureza;
	
	@Tamanho(tamanho = 8)
	private String anoSafra;
	
	@Tamanho(tamanho = 8)
	private String anoSafraAnterior;
	
	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorReceitaAgricola;
	
	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorReceitaPecuaria;
	
	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorDespesaAgricola;
	
	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorDespesaPecuaria;
	
	@Tamanho(tamanho = 4)
	private Integer codTipoRenda;
	
	@Tamanho(tamanho = 50)
	private String descTipoRenda;
	
	@Tamanho(tamanho = 80)
	private String descricao;
	
	@Tamanho(tamanho = 200)
	private String descricaoRenda;
	
	@Tamanho(tamanho = 50)
	private String descricaoNaturezaRenda;
	
	@Tamanho(tamanho = 4)
	private Integer codAtividade;
	
	@Tamanho(tamanho = 50)
	private String descAtividade;
	
	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private BigDecimal areaAplicacao;
	
	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private BigDecimal valor;
	
	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private BigDecimal produtividade;

	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private BigDecimal valorPorHectare;
	
	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private BigDecimal valorTotalPrevisto;
	
	public String getAnoSafra() {
		return anoSafra;
	}

	public void setAnoSafra(String anoSafra) {
		this.anoSafra = anoSafra;
	}

	public BigDecimal getValorReceitaAgricola() {
		return valorReceitaAgricola;
	}

	public void setValorReceitaAgricola(BigDecimal valorReceitaAgricola) {
		this.valorReceitaAgricola = valorReceitaAgricola;
	}

	public BigDecimal getValorReceitaPecuaria() {
		return valorReceitaPecuaria;
	}

	public void setValorReceitaPecuaria(BigDecimal valorReceitaPecuaria) {
		this.valorReceitaPecuaria = valorReceitaPecuaria;
	}

	public BigDecimal getValorDespesaAgricola() {
		return valorDespesaAgricola;
	}

	public void setValorDespesaAgricola(BigDecimal valorDespesaAgricola) {
		this.valorDespesaAgricola = valorDespesaAgricola;
	}

	public BigDecimal getValorDespesaPecuaria() {
		return valorDespesaPecuaria;
	}

	public void setValorDespesaPecuaria(BigDecimal valorDespesaPecuaria) {
		this.valorDespesaPecuaria = valorDespesaPecuaria;
	}

	public Integer getCodTipoRenda() {
		return codTipoRenda;
	}

	public void setCodTipoRenda(Integer codTipoRenda) {
		this.codTipoRenda = codTipoRenda;
	}

	public String getDescTipoRenda() {
		return descTipoRenda;
	}

	public void setDescTipoRenda(String descTipoRenda) {
		this.descTipoRenda = descTipoRenda;
	}

	public Integer getCodAtividade() {
		return codAtividade;
	}

	public void setCodAtividade(Integer codAtividade) {
		this.codAtividade = codAtividade;
	}

	public String getDescAtividade() {
		return descAtividade;
	}

	public void setDescAtividade(String descAtividade) {
		this.descAtividade = descAtividade;
	}

	public BigDecimal getAreaAplicacao() {
		return areaAplicacao;
	}

	public void setAreaAplicacao(BigDecimal areaAplicacao) {
		this.areaAplicacao = areaAplicacao;
	}

	public BigDecimal getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(BigDecimal produtividade) {
		this.produtividade = produtividade;
	}

	public BigDecimal getValorPorHectare() {
		return valorPorHectare;
	}

	public void setValorPorHectare(BigDecimal valorPorHectare) {
		this.valorPorHectare = valorPorHectare;
	}

	public BigDecimal getValorTotalPrevisto() {
		return valorTotalPrevisto;
	}

	public void setValorTotalPrevisto(BigDecimal valorTotalPrevisto) {
		this.valorTotalPrevisto = valorTotalPrevisto;
	}

	public String getAnoSafraAnterior() {
		return anoSafraAnterior;
	}

	public void setAnoSafraAnterior(String anoSafraAnterior) {
		this.anoSafraAnterior = anoSafraAnterior;
	}

	public Integer getNumeroRenda() {
		return numeroRenda;
	}

	public void setNumeroRenda(Integer numeroRenda) {
		this.numeroRenda = numeroRenda;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getNumeroNatureza() {
		return numeroNatureza;
	}

	public void setNumeroNatureza(Integer numeroNatureza) {
		this.numeroNatureza = numeroNatureza;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricaoNaturezaRenda() {
		return descricaoNaturezaRenda;
	}

	public void setDescricaoNaturezaRenda(String descricaoNaturezaRenda) {
		this.descricaoNaturezaRenda = descricaoNaturezaRenda;
	}

	public String getDescricaoRenda() {
		return descricaoRenda;
	}

	public void setDescricaoRenda(String descricaoRenda) {
		this.descricaoRenda = descricaoRenda;
	}


	
	
}
