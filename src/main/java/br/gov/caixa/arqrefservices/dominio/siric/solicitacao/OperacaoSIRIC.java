package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="DADOS_OPERACAO")
@XmlSeeAlso({ VeiculoOperacaoSIRIC.class })
@XmlType(propOrder={"proposta", "agencia", "produto", 
		"valorVeiculo", "valorFinanciamento", "tipoGarantia",
		"prazo", "valorPrestacaoNecessaria",
		"percentualTaxaJuros", "veiculoOperacaoSIRIC"})
public class OperacaoSIRIC implements Serializable {

	private static final long serialVersionUID = -8016342648985461368L;
	
	@Tamanho(tamanho = 8)
	private BigInteger proposta;
	
	@Tamanho(tamanho = 4)
	private String agencia;
	
	@Tamanho(tamanho = 4)
	private String produto;
	
	@Tamanho(tamanho = 11)
	private String valorVeiculo;
	
	@Tamanho(tamanho = 11)
	private String valorFinanciamento;

	private String tipoGarantia;
	
	@Tamanho(tamanho = 4)
	private String prazo;
	
	@Tamanho(tamanho = 11)
	private String valorPrestacaoNecessaria;
	
	@Tamanho(tamanho = 5)
	private String percentualTaxaJuros;
	
	private VeiculoOperacaoSIRIC veiculoOperacaoSIRIC;
	
	
	@XmlElement(name="PROPOSTA")
	public BigInteger getProposta() {
		return proposta;
	}

	public void setProposta(BigInteger proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name="AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name="VR_IMOVEL")
	public String getValorVeiculo() {
		return valorVeiculo;
	}

	public void setValorVeiculo(String valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	@XmlElement(name="VR_FINANCIAMENTO")
	public String getValorFinanciamento() {
		return valorFinanciamento;
	}

	@XmlElement(name="TP_GARANTIA")
	public String getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}
	

	public void setValorFinanciamento(String valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}

	@XmlElement(name="PRAZO")
	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	@XmlElement(name="VR_PRESTACAO_NECESSARIA")
	public String getValorPrestacaoNecessaria() {
		return valorPrestacaoNecessaria;
	}

	public void setValorPrestacaoNecessaria(String valorPrestacaoNecessaria) {
		this.valorPrestacaoNecessaria = valorPrestacaoNecessaria;
	}

	@XmlElement(name="PC_TAXA_JUROS")
	public String getPercentualTaxaJuros() {
		return percentualTaxaJuros;
	}

	public void setPercentualTaxaJuros(String percentualTaxaJuros) {
		this.percentualTaxaJuros = percentualTaxaJuros;
	}

	@XmlElement(name="VEICULO")
	public VeiculoOperacaoSIRIC getVeiculoOperacaoSIRIC() {
		return veiculoOperacaoSIRIC;
	}

	public void setVeiculoOperacaoSIRIC(VeiculoOperacaoSIRIC veiculoOperacaoSIRIC) {
		this.veiculoOperacaoSIRIC = veiculoOperacaoSIRIC;
	}



}
