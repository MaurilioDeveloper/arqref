package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "ENDERECO_NACIONAL_COMP")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "ocorrencia", "produto", "contrato", "flagComprovacao", "flagPostagem", "tipoEndereco",
		"flagSimplificado", "flagDevolvido", "tipoDevolucao", "flagUnico", "sequencial", "mesReferencia",
		"anoReferencia", "dataApuracao", "filler", "tipoImovel" })
public class EnderecoNacionalComplemento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3836712591327785198L;

	private String ocorrencia;

	private String produto;

	private String contrato;

	private String flagComprovacao;

	private String flagPostagem;

	private String tipoEndereco;

	private String flagSimplificado;

	private String flagDevolvido;

	private String tipoDevolucao;

	private String flagUnico;

	private String sequencial;

	private String mesReferencia;

	private String anoReferencia;

	private String dataApuracao;

	private String filler;

	private String tipoImovel;

	@XmlElement(name = "OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name = "PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name = "CONTRATO")
	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@XmlElement(name = "FLAG_COMPROVACAO")
	public String getFlagComprovacao() {
		return flagComprovacao;
	}

	public void setFlagComprovacao(String flagComprovacao) {
		this.flagComprovacao = flagComprovacao;
	}

	@XmlElement(name = "FLAG_POSTAGEM")
	public String getFlagPostagem() {
		return flagPostagem;
	}

	public void setFlagPostagem(String flagPostagem) {
		this.flagPostagem = flagPostagem;
	}

	@XmlElement(name = "TP_ENDERECO")
	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	@XmlElement(name = "FLAG_SIMPLIFICADO")
	public String getFlagSimplificado() {
		return flagSimplificado;
	}

	public void setFlagSimplificado(String flagSimplificado) {
		this.flagSimplificado = flagSimplificado;
	}

	@XmlElement(name = "FLAG_DEVOLVIDO")
	public String getFlagDevolvido() {
		return flagDevolvido;
	}

	public void setFlagDevolvido(String flagDevolvido) {
		this.flagDevolvido = flagDevolvido;
	}

	@XmlElement(name = "TP_DEVOLUCAO")
	public String getTipoDevolucao() {
		return tipoDevolucao;
	}

	public void setTipoDevolucao(String tipoDevolucao) {
		this.tipoDevolucao = tipoDevolucao;
	}

	@XmlElement(name = "FLAG_UNICO")
	public String getFlagUnico() {
		return flagUnico;
	}

	public void setFlagUnico(String flagUnico) {
		this.flagUnico = flagUnico;
	}

	@XmlElement(name = "SEQUENCIAL")
	public String getSequencial() {
		return sequencial;
	}

	public void setSequencial(String sequencial) {
		this.sequencial = sequencial;
	}

	@XmlElement(name = "MES_REFER")
	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	@XmlElement(name = "ANO_REFER")
	public String getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	@XmlElement(name = "DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	@XmlElement(name = "FILLER")
	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@XmlElement(name = "TP_IMOVEL")
	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	@Override
	public String toString() {
		return "EnderecoNacionalComplemento [ocorrencia=" + ocorrencia + ", produto=" + produto + ", contrato="
				+ contrato + ", flagComprovacao=" + flagComprovacao + ", flagPostagem=" + flagPostagem
				+ ", tipoEndereco=" + tipoEndereco + ", flagSimplificado=" + flagSimplificado + ", flagDevolvido="
				+ flagDevolvido + ", tipoDevolucao=" + tipoDevolucao + ", flagUnico=" + flagUnico + ", sequencial="
				+ sequencial + ", mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia
				+ ", dataApuracao=" + dataApuracao + ", filler=" + filler + ", tipoImovel=" + tipoImovel + "]";
	}

}
