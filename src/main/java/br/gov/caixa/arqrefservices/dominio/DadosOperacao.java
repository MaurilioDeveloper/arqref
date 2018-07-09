package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada avaliacao de risco de credito.
 * Classe utilizada para operacao de consulta de avaliacoes validas
 * (SIRIC)
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "DADOS_OPERACAO")
@XmlType(propOrder = { "proposta", "codAgencia", "codProduto", "valorImovel",
		"valorFinanciamento", "prazo", "valorPrestacao", "taxaJuros", "veiculo","avaliacaoValida" })
public class DadosOperacao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7859862766546330730L;

	private String proposta;
	
	private String codAgencia;
	
	private String codProduto;
	
	private String valorImovel;
	
	private String valorFinanciamento;
	
	private String prazo;
	
	private String valorPrestacao;
	
	private String taxaJuros;
	
	private Veiculo veiculo;
	
	private AvaliacaoValiada avaliacaoValida;

	@XmlElement(name="PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}	

	@XmlElement(name="AGENCIA")
	public String getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(String codAgencia) {
		this.codAgencia = codAgencia;
	}

	@XmlElement(name="PRODUTO")
	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	@XmlElement(name="VR_IMOVEL")
	public String getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(String valorImovel) {
		this.valorImovel = valorImovel;
	}

	@XmlElement(name="VR_FINANCIAMENTO")
	public String getValorFinanciamento() {
		return valorFinanciamento;
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
	public String getValorPrestacao() {
		return valorPrestacao;
	}

	public void setValorPrestacao(String valorPrestacao) {
		this.valorPrestacao = valorPrestacao;
	}
	
	@XmlElement(name="PC_TAXA_JUROS")
	public String getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(String taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@XmlElement(name="VEICULO")
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	@XmlElement(name="AVALIACOES_VALIDAS")
	public AvaliacaoValiada getAvaliacaoValida() {
		return avaliacaoValida;
	}
	public void setAvaliacaoValida(AvaliacaoValiada avaliacaoValida) {
		this.avaliacaoValida = avaliacaoValida;
	}
	
	

}
