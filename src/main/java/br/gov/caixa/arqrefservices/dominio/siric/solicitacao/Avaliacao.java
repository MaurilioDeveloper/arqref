package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Data;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Decimal;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Lista;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name = "AVALIACAO")
@XmlSeeAlso({ Aprovacao.class,  Produto.class, Aprovacao.class })
public class Avaliacao implements Serializable {

	private static final long serialVersionUID = -4106755031355750958L;

	//private Cliente cliente;

	private Produto produto;

	private Aprovacao aprovacao;

	private Aprovacao reprovacao;

	private Aprovacao rejeitada;

	@Tamanho(tamanho = 16)
	private BigInteger proposta;

	private String agencia;

	private String produtoAvaliacao;
	
	private String modalidadeAvaliacao;
	
	private String resultadoAvaliacao;
	
	private Double valorCalculoTotal;
	
	private Double valorDisponivel;

	private String codigoAvaliacaoDeRisco;

	private String rating;

	private String behaviorScore;

	@Tamanho(tamanho = 1)
	private String indicativoAvaliacao;

	private String codigoRetornoMensagem;

	private String descricaoRetornoMensagem;

	@Tamanho(tamanho = 10)
	private BigInteger codigo;

	@Tamanho(tamanho = 9)
	private BigInteger codigoAR;

	@Tamanho(tamanho = 4)
	private BigInteger codigoOperacao;

	@Tamanho(tamanho = 3)
	private String codigoConceito;

	@Tamanho(tamanho = 16)
	private BigInteger numeroProposta;

	@Tamanho(tamanho = 2)
	private String numeroErro;

	@Tamanho(tamanho = 2)
	private String numeroSituacao;

	@Tamanho(tamanho = 8)
	private String codigoUsuario;

	@Tamanho(tamanho = 3)
	private String codigoPerfil;

	@Tamanho(tamanho = 1)
	private String flagBloqueioAlcada;

	@Tamanho(tamanho = 1)
	private String indicadorFilaSiric;

	@Tamanho(tamanho = 80)
	private String codigoProtocolo;

	@Tamanho(tamanho = 4)
	private Integer prazoMaximo;

	@Tamanho(tamanho = 50)
	private String situacao;

	@Tamanho(tamanho = 50)
	private String mensagemCriticaSiric;

	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private Double valorComprometido;

	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private Double valorMaximo;

	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private Double valorCapacidadeComprometimento;

	@Decimal(mantissaTamanho = 12, decimalTamanho = 2)
	private Double valorMaximoEmprestimo;

	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorPagamentoMensal;

	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorMaximoAvaliacao;

	@Data(padrao = "dd.MM.yyyy")
	private Date dataInicio;

	@Data(padrao = "dd.MM.yyyy")
	private Date dataFim;

	@Data(padrao = "dd.MM.yyyy")
	private Date dataGeracao;

	@Tamanho(tamanho = 1)
	private String indicadorSolicitacao;

	@Tamanho(tamanho = 1)
	private String indicadorCancelar;

	@Tamanho(tamanho = 1)
	private String indicadorConsulta;

	@Tamanho(tamanho = 11)
	private BigInteger numeroAvaliacao;

	@Tamanho(tamanho = 70)
	private String nomeErro;

	@Tamanho(tamanho = 500)
	private String descricaoMensagemSiric;
	
	@Tamanho(tamanho = 1000)
	private String descricaoMsgSiric;

	@Tamanho(tamanho = 100)
	private String nomeSituacao;

	@Tamanho(tamanho = 10)
	private String codigoAvaliacao;

	@Tamanho(tamanho = 1)
	private String indicadorMsgQuadroValor;

	@Tamanho(tamanho = 1)
	private String indicadorMsgNovaSolicitacao;

	@Lista(itemTipo = GarantiaContrato.class)
	private List<GarantiaContrato> listaGarantias;
	
	@Tamanho(tamanho = 1)
	private String indicadorAvaliacaoBarramento;
	
	@Tamanho(tamanho = 50)
	private String parecerAvaliacao;

	public BigInteger getCodigo() {
		return codigo;
	}

	@XmlElement(name = "APROVADA")
	public Aprovacao getAprovacao() {
		return aprovacao;
	}

	@XmlElement(name = "REPROVADA")
	public Aprovacao getReprovacao() {
		return reprovacao;
	}

	public void setAprovacao(Aprovacao aprovacao) {
		this.aprovacao = aprovacao;
	}

	public void setReprovacao(Aprovacao reprovacao) {
		this.reprovacao = reprovacao;
	}

	@XmlElement(name = "PROPOSTA")
	public BigInteger getProposta() {
		return proposta;
	}

	public void setProposta(BigInteger proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name = "AGENCIA")
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	@XmlElement(name = "PRODUTO")
	public String getProdutoAvaliacao() {
		return produtoAvaliacao;
	}

	public void setProdutoAvaliacao(String produtoAvaliacao) {
		this.produtoAvaliacao = produtoAvaliacao;
	}

	public BigInteger getCodigoOperacao() {
		return codigoOperacao;
	}

	public String getCodigoConceito() {
		return codigoConceito;
	}

	public Integer getPrazoMaximo() {
		return prazoMaximo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public Date getDataGeracao() {
		return dataGeracao;
	}

	public Double getValorComprometido() {
		return valorComprometido;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

	public void setCodigo(BigInteger codigo) {
		this.codigo = codigo;
	}

	public void setCodigoOperacao(BigInteger codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}

	public void setCodigoConceito(String codigoConceito) {
		this.codigoConceito = codigoConceito;
	}

	public void setPrazoMaximo(Integer prazoMaximo) {
		this.prazoMaximo = prazoMaximo;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public void setValorComprometido(Double valorComprometido) {
		this.valorComprometido = valorComprometido;
	}

	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	/*public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}*/

	public Produto getProduto() {
		if (produto == null) {
			produto = new Produto();
		}
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getIndicativoAvaliacao() {
		return indicativoAvaliacao;
	}

	public void setIndicativoAvaliacao(String indicativoAvaliacao) {
		this.indicativoAvaliacao = indicativoAvaliacao;
	}

	public Double getValorCapacidadeComprometimento() {
		return valorCapacidadeComprometimento;
	}

	public void setValorCapacidadeComprometimento(
			Double valorCapacidadeComprometimento) {
		this.valorCapacidadeComprometimento = valorCapacidadeComprometimento;
	}

	public Double getValorMaximoEmprestimo() {
		return valorMaximoEmprestimo;
	}

	public void setValorMaximoEmprestimo(Double valorMaximoEmprestimo) {
		this.valorMaximoEmprestimo = valorMaximoEmprestimo;
	}

	public String getCodigoRetornoMensagem() {
		return codigoRetornoMensagem;
	}

	public void setCodigoRetornoMensagem(String codigoRetornoMensagem) {
		this.codigoRetornoMensagem = codigoRetornoMensagem;
	}

	public String getDescricaoRetornoMensagem() {
		return descricaoRetornoMensagem;
	}

	public void setDescricaoRetornoMensagem(String descricaoRetornoMensagem) {
		this.descricaoRetornoMensagem = descricaoRetornoMensagem;
	}

	public String getCodigoProtocolo() {
		return codigoProtocolo;
	}

	public void setCodigoProtocolo(String codigoProtocolo) {
		this.codigoProtocolo = codigoProtocolo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getIndicadorSolicitacao() {
		return indicadorSolicitacao;
	}

	public void setIndicadorSolicitacao(String indicadorSolicitacao) {
		this.indicadorSolicitacao = indicadorSolicitacao;
	}

	public String getIndicadorCancelar() {
		return indicadorCancelar;
	}

	public void setIndicadorCancelar(String indicadorCancelar) {
		this.indicadorCancelar = indicadorCancelar;
	}

	public String getIndicadorConsulta() {
		return indicadorConsulta;
	}

	public void setIndicadorConsulta(String indicadorConsulta) {
		this.indicadorConsulta = indicadorConsulta;
	}

	public BigInteger getNumeroAvaliacao() {
		return numeroAvaliacao;
	}

	public void setNumeroAvaliacao(BigInteger numeroAvaliacao) {
		this.numeroAvaliacao = numeroAvaliacao;
	}

	public String getFlagBloqueioAlcada() {
		return flagBloqueioAlcada;
	}

	public void setFlagBloqueioAlcada(String flagBloqueioAlcada) {
		this.flagBloqueioAlcada = flagBloqueioAlcada;
	}

	public String getIndicadorFilaSiric() {
		return indicadorFilaSiric;
	}

	public void setIndicadorFilaSiric(String indicadorFilaSiric) {
		this.indicadorFilaSiric = indicadorFilaSiric;
	}

	@XmlElement(name = "MENSAGEM_RETORNO")
	public Aprovacao getRejeitada() {
		return rejeitada;
	}

	public void setRejeitada(Aprovacao rejeitada) {
		this.rejeitada = rejeitada;
	}

	public String getMensagemCriticaSiric() {
		return mensagemCriticaSiric;
	}

	public void setMensagemCriticaSiric(String mensagemCriticaSiric) {
		this.mensagemCriticaSiric = mensagemCriticaSiric;
	}

	public String getNomeErro() {
		return nomeErro;
	}

	public void setNomeErro(String nomeErro) {
		this.nomeErro = nomeErro;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public BigInteger getNumeroProposta() {
		return numeroProposta;
	}

	public void setNumeroProposta(BigInteger numeroProposta) {
		this.numeroProposta = numeroProposta;
	}

	public String getNumeroErro() {
		return numeroErro;
	}

	public void setNumeroErro(String numeroErro) {
		this.numeroErro = numeroErro;
	}

	public String getNumeroSituacao() {
		return numeroSituacao;
	}

	public void setNumeroSituacao(String numeroSituacao) {
		this.numeroSituacao = numeroSituacao;
	}

	public String getDescricaoMensagemSiric() {
		return descricaoMensagemSiric;
	}

	public void setDescricaoMensagemSiric(String descricaoMensagemSiric) {
		this.descricaoMensagemSiric = descricaoMensagemSiric;
	}

	public String getCodigoPerfil() {
		return codigoPerfil;
	}

	public void setCodigoPerfil(String codigoPerfil) {
		this.codigoPerfil = codigoPerfil;
	}

	public BigInteger getCodigoAR() {
		return codigoAR;
	}

	public void setCodigoAR(BigInteger codigoAR) {
		this.codigoAR = codigoAR;
	}

	public BigDecimal getValorPagamentoMensal() {
		return valorPagamentoMensal;
	}

	public void setValorPagamentoMensal(BigDecimal valorPagamentoMensal) {
		this.valorPagamentoMensal = valorPagamentoMensal;
	}

	public BigDecimal getValorMaximoAvaliacao() {
		return valorMaximoAvaliacao;
	}

	public void setValorMaximoAvaliacao(BigDecimal valorMaximoAvaliacao) {
		this.valorMaximoAvaliacao = valorMaximoAvaliacao;
	}

	public String getNomeSituacao() {
		return nomeSituacao;
	}

	public void setNomeSituacao(String nomeSituacao) {
		this.nomeSituacao = nomeSituacao;
	}

	public List<GarantiaContrato> getListaGarantias() {
		return listaGarantias;
	}

	public void setListaGarantias(List<GarantiaContrato> listaGarantias) {
		this.listaGarantias = listaGarantias;
	}

	public String getCodigoAvaliacaoDeRisco() {
		return codigoAvaliacaoDeRisco;
	}

	public void setCodigoAvaliacaoDeRisco(String codigoAvaliacaoDeRisco) {
		this.codigoAvaliacaoDeRisco = codigoAvaliacaoDeRisco;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getBehaviorScore() {
		return behaviorScore;
	}

	public void setBehaviorScore(String behaviorScore) {
		this.behaviorScore = behaviorScore;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public String getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public String getIndicadorMsgQuadroValor() {
		return indicadorMsgQuadroValor;
	}

	public void setIndicadorMsgQuadroValor(String indicadorMsgQuadroValor) {
		this.indicadorMsgQuadroValor = indicadorMsgQuadroValor;
	}

	public String getIndicadorMsgNovaSolicitacao() {
		return indicadorMsgNovaSolicitacao;
	}

	public void setIndicadorMsgNovaSolicitacao(
			String indicadorMsgNovaSolicitacao) {
		this.indicadorMsgNovaSolicitacao = indicadorMsgNovaSolicitacao;
	}

	public String getDescricaoMsgSiric() {
		return descricaoMsgSiric;
	}

	public void setDescricaoMsgSiric(String descricaoMsgSiric) {
		this.descricaoMsgSiric = descricaoMsgSiric;
	}

		public String getModalidadeAvaliacao() {
		return modalidadeAvaliacao;
	}

	public void setModalidadeAvaliacao(String modalidadeAvaliacao) {
		this.modalidadeAvaliacao = modalidadeAvaliacao;
	}

	public String getResultadoAvaliacao() {
		return resultadoAvaliacao;
	}

	public void setResultadoAvaliacao(String resultadoAvaliacao) {
		this.resultadoAvaliacao = resultadoAvaliacao;
	}

	public Double getValorCalculoTotal() {
		return valorCalculoTotal;
	}

	public void setValorCalculoTotal(Double valorCalculoTotal) {
		this.valorCalculoTotal = valorCalculoTotal;
	}

	public Double getValorDisponivel() {
		return valorDisponivel;
	}

	public void setValorDisponivel(Double valorDisponivel) {
		this.valorDisponivel = valorDisponivel;
	}

	public String getIndicadorAvaliacaoBarramento() {
		return indicadorAvaliacaoBarramento;
	}

	public void setIndicadorAvaliacaoBarramento(String indicadorAvaliacaoBarramento) {
		this.indicadorAvaliacaoBarramento = indicadorAvaliacaoBarramento;
	}

	public String getParecerAvaliacao() {
		return parecerAvaliacao;
	}

	public void setParecerAvaliacao(String parecerAvaliacao) {
		this.parecerAvaliacao = parecerAvaliacao;
	}
}