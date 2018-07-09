package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ENDERECO_NACIONAL_COMP")
@XmlType(propOrder={"ocorrencia", "numeroProduto","contrato", "indicadorComprovacao", 
		"indicadorPostagem", "tipoEndereco", "indicadorSimplificado", 
		"indicadorDevolvido", "tipoDevolucao","flagUnico", "sequencial", "mesReferencia", "anoReferencia","dataApuracao","filler", "tipoImovel"})
public class EnderecoNacionalComplemento implements Serializable {

	private static final long serialVersionUID = -2173113517989206422L;
	

	private String ocorrencia;
	
	private String numeroProduto;
	
	private String contrato;

	private String indicadorComprovacao;
	
	private String indicadorPostagem;
	
	private String tipoEndereco;
	
	private String indicadorSimplificado;
	
	private String indicadorDevolvido;
	
	private String tipoDevolucao;
	
	private String flagUnico;
	
	private String sequencial;
	
	private String mesReferencia;
	
	private String anoReferencia;

	private String dataApuracao;
	
	private String tipoImovel;
	
	private String filler;


	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	@XmlElement(name="PRODUTO")
	public String getNumeroProduto() {
		return numeroProduto;
	}
	
	@XmlElement(name="CONTRATO")
	public String getContrato() {
		return contrato;
	}
	

	@XmlElement(name="FLAG_COMPROVACAO")
	public String getIndicadorComprovacao() {
		return indicadorComprovacao;
	}

	@XmlElement(name="FLAG_POSTAGEM")
	public String getIndicadorPostagem() {
		return indicadorPostagem;
	}

	@XmlElement(name="TP_ENDERECO")
	public String getTipoEndereco() {
		return tipoEndereco;
	}

	@XmlElement(name="FLAG_SIMPLIFICADO")
	public String getIndicadorSimplificado() {
		return indicadorSimplificado;
	}

	@XmlElement(name="FLAG_DEVOLVIDO")
	public String getIndicadorDevolvido() {
		return indicadorDevolvido;
	}

	@XmlElement(name="TP_DEVOLUCAO")
	public String getTipoDevolucao() {
		return tipoDevolucao;
	}

	@XmlElement(name="FLAG_UNICO")
	public String getFlagUnico() {
		return flagUnico;
	}
	
	@XmlElement(name="SEQUENCIAL")
	public String getSequencial() {
		return sequencial;
	}

	@XmlElement(name="MES_REFER")
	public String getMesReferencia() {
		return mesReferencia;
	}

	@XmlElement(name="ANO_REFER")
	public String getAnoReferencia() {
		return anoReferencia;
	}

	@XmlElement(name="DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	@XmlElement(name="FILLER")
	public String getFiller() {
		return filler;
	}

	@XmlElement(name="TP_IMOVEL")
	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public void setNumeroProduto(String numeroProduto) {
		this.numeroProduto = numeroProduto;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	
	public void setIndicadorComprovacao(String indicadorComprovacao) {
		this.indicadorComprovacao = indicadorComprovacao;
	}

	public void setIndicadorPostagem(String indicadorPostagem) {
		this.indicadorPostagem = indicadorPostagem;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public void setIndicadorSimplificado(String indicadorSimplificado) {
		this.indicadorSimplificado = indicadorSimplificado;
	}

	public void setIndicadorDevolvido(String indicadorDevolvido) {
		this.indicadorDevolvido = indicadorDevolvido;
	}

	public void setTipoDevolucao(String tipoDevolucao) {
		this.tipoDevolucao = tipoDevolucao;
	}

	public void setFlagUnico(String flagUnico) {
		this.flagUnico = flagUnico;
	}

	public void setSequencial(String sequencial) {
		this.sequencial = sequencial;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}
	
	public void setFiller(String filler) {
		this.filler = filler;
	}
	
	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	
}
