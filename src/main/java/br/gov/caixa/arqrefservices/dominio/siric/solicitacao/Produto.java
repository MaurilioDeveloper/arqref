package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Data;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Decimal;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name = "PRODUTO")
public class Produto implements Serializable {

	private static final long serialVersionUID = -7155777485419429174L;

	@Tamanho(tamanho = 4)
	private Integer codigo;

	@Tamanho(tamanho = 4)
	private String codigoStr;

	@Tamanho(tamanho = 4)
	private Integer codigoModalidade;

	@Tamanho(tamanho = 4)
	private String codigoModalidadeStr;

	@Tamanho(tamanho = 50)
	private String descricao;

	@Tamanho(tamanho = 100)
	private String descricaoProdutoModalidade;
	
	@Tamanho(tamanho = 70)
	private String nome;

	@Tamanho(tamanho = 4)
	private Integer prazoMaximo;

	@Tamanho(tamanho = 26)
	private String ultimaAtualizacao;

	@Decimal(mantissaTamanho = 17, decimalTamanho = 2)
	private BigDecimal valorAfiancadoMinimo;

	@Decimal(mantissaTamanho = 17, decimalTamanho = 2)
	private BigDecimal valorAfiancadoMaximo;

	@Tamanho(tamanho = 4)
	private Integer tipoJuro;

	@Tamanho(tamanho = 4)
	private Integer indicadorCarencia;

	@Tamanho(tamanho = 4)
	private Integer tipoPagamento;
	
	@Tamanho(tamanho = 4)
	private Integer formaAmortizacao;

	@Tamanho(tamanho = 4)
	private Integer tipoCarencia;

	@Tamanho(tamanho = 30)
	private String periodo;

	@Tamanho(tamanho = 30)
	private String periodoVigencia;

	@Tamanho(tamanho = 20)
	private String status;

	@Tamanho(tamanho = 4)
	private Integer qtdeDiasMinimo;

	@Tamanho(tamanho = 4)
	private Integer qtdeDiasMaximo;

	@Tamanho(tamanho = 1)
	private String codigoStatus;

	@Tamanho(tamanho = 1)
	private String indicadorDestinacao;
	
	@Data(padrao = "dd.MM.yyyy")
	private Date inicioVigencia;

	@Data(padrao = "dd.MM.yyyy")
	private Date terminoVigencia;

	// @Logic(False = " ", True = "S")
	@Tamanho(tamanho = 1)
	private String renegociarIsoladamente;

	/*private Sistema sistema;

	private Modalidade modalidade;

	private Juros juros;

	private Juros amortizacao;
	
	private MatrizTaxaVeiculo matrizTaxaVeiculo;*/

	@Tamanho(tamanho = 1)
	private String correlacao;

	@Tamanho(tamanho = 9)
	private BigInteger numSequencial;
	
	@Tamanho(tamanho = 1)
	private Integer tipoValorRenegociar;
	
	//estorno
	@Tamanho(tamanho = 12)
	private BigInteger numeroGrupoFase;

	@XmlElement(name = "CODIGO")
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@XmlElement(name = "CODIGO_MODALIDADE")
	public Integer getCodigoModalidade() {
		return codigoModalidade;
	}

	public void setCodigoModalidade(Integer codigoModalidade) {
		this.codigoModalidade = codigoModalidade;
	}

	@XmlElement(name = "DESCRICAO")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@XmlElement(name = "PRAZOMAXIMO")
	public Integer getPrazoMaximo() {
		return prazoMaximo;
	}

	public void setPrazoMaximo(Integer prazoMaximo) {
		this.prazoMaximo = prazoMaximo;
	}

	public BigDecimal getValorAfiancadoMinimo() {
		return valorAfiancadoMinimo;
	}

	public void setValorAfiancadoMinimo(BigDecimal valorAfiancadoMinimo) {
		this.valorAfiancadoMinimo = valorAfiancadoMinimo;
	}

	public BigDecimal getValorAfiancadoMaximo() {
		return valorAfiancadoMaximo;
	}

	public void setValorAfiancadoMaximo(BigDecimal valorAfiancadoMaximo) {
		this.valorAfiancadoMaximo = valorAfiancadoMaximo;
	}

	public Integer getTipoJuro() {
		return tipoJuro;
	}

	public void setTipoJuro(Integer tipoJuro) {
		this.tipoJuro = tipoJuro;
	}

	public Integer getIndicadorCarencia() {
		return indicadorCarencia;
	}

	public void setIndicadorCarencia(Integer indicadorCarencia) {
		this.indicadorCarencia = indicadorCarencia;
	}

	public Integer getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(Integer tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Integer getFormaAmortizacao() {
		return formaAmortizacao;
	}

	public void setFormaAmortizacao(Integer formaAmortizacao) {
		this.formaAmortizacao = formaAmortizacao;
	}

	public Integer getTipoCarencia() {
		return tipoCarencia;
	}

	public void setTipoCarencia(Integer tipoCarencia) {
		this.tipoCarencia = tipoCarencia;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}*/

	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public String getPeriodoVigencia() {
		return periodoVigencia;
	}

	public void setPeriodoVigencia(String periodoVigencia) {
		this.periodoVigencia = periodoVigencia;
	}

	public Integer getQtdeDiasMinimo() {
		return qtdeDiasMinimo;
	}

	public void setQtdeDiasMinimo(Integer qtdeDiasMinimo) {
		this.qtdeDiasMinimo = qtdeDiasMinimo;
	}

	public Integer getQtdeDiasMaximo() {
		return qtdeDiasMaximo;
	}

	public void setQtdeDiasMaximo(Integer qtdeDiasMaximo) {
		this.qtdeDiasMaximo = qtdeDiasMaximo;
	}

	public String getCodigoStatus() {
		return codigoStatus;
	}

	public void setCodigoStatus(String codigoStatus) {
		this.codigoStatus = codigoStatus;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getTerminoVigencia() {
		return terminoVigencia;
	}

	public void setTerminoVigencia(Date terminoVigencia) {
		this.terminoVigencia = terminoVigencia;
	}

	/*
	 * public Boolean getRenegociarIsoladamente() { return
	 * renegociarIsoladamente; }
	 * 
	 * public void setRenegociarIsoladamente(Boolean renegociarIsoladamente) {
	 * this.renegociarIsoladamente = renegociarIsoladamente; }
	 */

	public String getRenegociarIsoladamente() {
		return renegociarIsoladamente;
	}

	public void setRenegociarIsoladamente(String renegociarIsoladamente) {
		this.renegociarIsoladamente = renegociarIsoladamente;
	}

	/*public Juros getJuros() {
		if (juros == null) {
			this.juros = new Juros();
		}
		return juros;
	}

	public void setJuros(Juros juros) {
		this.juros = juros;
	}

	public Juros getAmortizacao() {
		if (this.amortizacao == null) {
			this.amortizacao = new Juros();
		}
		return amortizacao;
	}

	public void setAmortizacao(Juros amortizacao) {
		this.amortizacao = amortizacao;
	}*/

	public String getCorrelacao() {
		return correlacao;
	}

	public void setCorrelacao(String correlacao) {
		this.correlacao = correlacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoStr() {
		return codigoStr;
	}

	public void setCodigoStr(String codigoStr) {
		this.codigoStr = codigoStr;
	}

	public BigInteger getNumSequencial() {
		return numSequencial;
	}

	public void setNumSequencial(BigInteger numSequencial) {
		this.numSequencial = numSequencial;
	}

	public String getCodigoModalidadeStr() {
		return codigoModalidadeStr;
	}

	public void setCodigoModalidadeStr(String codigoModalidadeStr) {
		this.codigoModalidadeStr = codigoModalidadeStr;
	}

	/*public MatrizTaxaVeiculo getMatrizTaxaVeiculo() {
		return matrizTaxaVeiculo;
	}

	public void setMatrizTaxaVeiculo(MatrizTaxaVeiculo matrizTaxaVeiculo) {
		this.matrizTaxaVeiculo = matrizTaxaVeiculo;
	}*/

	public String getDescricaoProdutoModalidade() {
		return descricaoProdutoModalidade;
	}

	public void setDescricaoProdutoModalidade(String descricaoProdutoModalidade) {
		this.descricaoProdutoModalidade = descricaoProdutoModalidade;
	}

	public Integer getTipoValorRenegociar() {
		return tipoValorRenegociar;
	}

	public void setTipoValorRenegociar(Integer tipoValorRenegociar) {
		this.tipoValorRenegociar = tipoValorRenegociar;
	}

	public String getIndicadorDestinacao() {
		return indicadorDestinacao;
	}

	public void setIndicadorDestinacao(String indicadorDestinacao) {
		this.indicadorDestinacao = indicadorDestinacao;
	}

	public BigInteger getNumeroGrupoFase() {
		return numeroGrupoFase;
	}

	public void setNumeroGrupoFase(BigInteger numeroGrupoFase) {
		this.numeroGrupoFase = numeroGrupoFase;
	}
	
	
}
