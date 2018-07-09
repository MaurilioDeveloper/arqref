package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="DADOS_OPERACAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = {"proposta","agencia","origemRecurso","produto","percentualComprometimentoRenda",
		"valorImovel","valorFinanciamento","tipoGarantia","modalidade","prazo","valorPrestacaoNecessaria",
		"aluguel","flagConvenio","correspondente","valorMargemConsignavel","pcTaxaJuros","convenenteSIRIC",
		"veiculoSIRIC","modeloValidacao","avaliacoesValidas"})
public class DadosOperacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3524729259215984568L;
	
	private String proposta;
	
	private String agencia;
	
	private String origemRecurso;
	
	private String produto;
	
	private String percentualComprometimentoRenda;
	
	private String valorImovel;
	
	private String valorFinanciamento;
	
	private String tipoGarantia;
	
	private String modalidade;
	
	private String prazo;	
	
	private String valorPrestacaoNecessaria;
	
	private Aluguel aluguel;
	
	private String flagConvenio;
	
	private Correspondente correspondente;
	
	private String valorMargemConsignavel;
	
	private String pcTaxaJuros;
	
	private ConvenenteSIRIC convenenteSIRIC;
	
	private VeiculoSIRIC veiculoSIRIC;
	
	private List<String> modeloValidacao;
	
	private List<AvaliacaoValiada> avaliacoesValidas;

	@XmlElement(name="PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name="AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name="ORIGEM_RECURSO")
	public String getOrigemRecurso() {
		return origemRecurso;
	}

	public void setOrigemRecurso(String origemRecurso) {
		this.origemRecurso = origemRecurso;
	}

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name="PERCENTUAL_COMPROMETIMENTO_RENDA")
	public String getPercentualComprometimentoRenda() {
		return percentualComprometimentoRenda;
	}

	public void setPercentualComprometimentoRenda(
			String percentualComprometimentoRenda) {
		this.percentualComprometimentoRenda = percentualComprometimentoRenda;
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

	@XmlElement(name="TP_GARANTIA")
	public String getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}

	@XmlElement(name="MODALIDADE")
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
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

	@XmlElement(name="ALUGUEL")
	public Aluguel getAluguel() {
		return aluguel;
	}

	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}

	@XmlElement(name="FLAG_CONVENIO")
	public String getFlagConvenio() {
		return flagConvenio;
	}

	public void setFlagConvenio(String flagConvenio) {
		this.flagConvenio = flagConvenio;
	}

	@XmlElement(name="CORRESPONDENTE")
	public Correspondente getCorrespondente() {
		return correspondente;
	}

	public void setCorrespondente(Correspondente correspondente) {
		this.correspondente = correspondente;
	}

	@XmlElement(name="VR_MARGEM_CONSIGNAVEL")
	public String getValorMargemConsignavel() {
		return valorMargemConsignavel;
	}

	public void setValorMargemConsignavel(String valorMargemConsignavel) {
		this.valorMargemConsignavel = valorMargemConsignavel;
	}

	@XmlElement(name="PC_TAXA_JUROS")
	public String getPcTaxaJuros() {
		return pcTaxaJuros;
	}

	public void setPcTaxaJuros(String pcTaxaJuros) {
		this.pcTaxaJuros = pcTaxaJuros;
	}

	@XmlElement(name="CONVENENTE")
	public ConvenenteSIRIC getConvenenteSIRIC() {
		return convenenteSIRIC;
	}

	public void setConvenenteSIRIC(ConvenenteSIRIC convenenteSIRIC) {
		this.convenenteSIRIC = convenenteSIRIC;
	}

	@XmlElement(name="VEICULO")
	public VeiculoSIRIC getVeiculoSIRIC() {
		return veiculoSIRIC;
	}

	public void setVeiculoSIRIC(VeiculoSIRIC veiculoSIRIC) {
		this.veiculoSIRIC = veiculoSIRIC;
	}

	@XmlElement(name="MODELO_AVALIACAO")
	public List<String> getModeloValidacao() {
		return modeloValidacao;
	}

	public void setModeloValidacao(List<String> modeloValidacao) {
		this.modeloValidacao = modeloValidacao;
	}

	@XmlElement(name="AVALIACOES_VALIDAS")
	public List<AvaliacaoValiada> getAvaliacoesValidas() {
		return avaliacoesValidas;
	}

	public void setAvaliacoesValidas(List<AvaliacaoValiada> avaliacoesValidas) {
		this.avaliacoesValidas = avaliacoesValidas;
	}

	@Override
	public String toString() {
		return "DadosOperacao [proposta=" + proposta + ", agencia=" + agencia
				+ ", origemRecurso=" + origemRecurso + ", produto=" + produto
				+ ", percentualComprometimentoRenda="
				+ percentualComprometimentoRenda + ", valorImovel="
				+ valorImovel + ", valorFinanciamento=" + valorFinanciamento
				+ ", tipoGarantia=" + tipoGarantia + ", modalidade="
				+ modalidade + ", prazo=" + prazo
				+ ", valorPrestacaoNecessaria=" + valorPrestacaoNecessaria
				+ ", aluguel=" + aluguel + ", flagConvenio=" + flagConvenio
				+ ", correspondente=" + correspondente
				+ ", valorMargemConsignavel=" + valorMargemConsignavel
				+ ", pcTaxaJuros=" + pcTaxaJuros + ", convenenteSIRIC="
				+ convenenteSIRIC + ", veiculoSIRIC=" + veiculoSIRIC
				+ ", modeloValidacao=" + modeloValidacao
				+ ", avaliacoesValidas=" + avaliacoesValidas + "]";
	}
	
	
	
	
	
	
	
	

}
