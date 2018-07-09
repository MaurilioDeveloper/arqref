package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Decimal;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;


/**
 * Classe utilizada pela consulta dados SICLI e COBOL
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "CONTRATO")
public class Contrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8333805892645802766L;

	@Tamanho(tamanho = 16)
	private BigInteger codigo;
	
	private Produto produto;
	
	private Modalidade modalidade;		
	
	@Tamanho(tamanho = 2)
	private Integer diaVencimentoPrestacao;
	
	private String valorIOF;
	
	private String valorJurosAcerto;
	
	private String taxaJuro;
	
	private String dataContratacao;
	
	private String prazo;
	
	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorContrato;
	
	private String valorLiquido;	
	
	private TipoPagamento tipoPagamento;
	
	private Cliente cliente;	

	
	@XmlElement(name = "CONTRATO")
	public BigInteger getCodigo() {
		return codigo;
	}

	public void setCodigo(BigInteger codigo) {
		this.codigo = codigo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	
	public Integer getDiaVencimentoPrestacao() {
		return diaVencimentoPrestacao;
	}

	public void setDiaVencimentoPrestacao(Integer diaVencimentoPrestacao) {
		this.diaVencimentoPrestacao = diaVencimentoPrestacao;
	}

	public String getValorIOF() {
		return valorIOF;
	}

	public void setValorIOF(String valorIOF) {
		this.valorIOF = valorIOF;
	}

	public String getValorJurosAcerto() {
		return valorJurosAcerto;
	}

	public void setValorJurosAcerto(String valorJurosAcerto) {
		this.valorJurosAcerto = valorJurosAcerto;
	}

	public String getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(String taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public BigDecimal getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(BigDecimal valorContrato) {
		this.valorContrato = valorContrato;
	}

	public String getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(String valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
