package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

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
@XmlType
@XmlRootElement(name = "TOMADOR_VALIDA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class TomadorValida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6931733849261261535L;

	private String proposta;

	private String codigoAvaliacao;

	private ClienteSIRIC cliente;

	private String produto;

	private String modalidade;

	private String dataInicioVigencia;

	private String dataFimVigencia;

	private String prazo;

	private String rating;

	private String resultado;

	private String valorCalculado;

	private String valorDisponivel;

	private String motivoReprovacao;
	
	@XmlElement(name = "RESULTADO")
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@XmlElement(name = "VALOR_CALCULADO_TOTAL")
	public String getValorCalculado() {
		return valorCalculado;
	}

	public void setValorCalculado(String valorCalculado) {
		this.valorCalculado = valorCalculado;
	}

	@XmlElement(name = "VALOR_DISPONIVEL")
	public String getValorDisponivel() {
		return valorDisponivel;
	}

	public void setValorDisponivel(String valorDisponivel) {
		this.valorDisponivel = valorDisponivel;
	}

	@XmlElement(name = "PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name = "CODIGO_AVALIACAO")
	public String getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	@XmlElement(name = "CLIENTE")
	public ClienteSIRIC getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSIRIC cliente) {
		this.cliente = cliente;
	}

	@XmlElement(name = "PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name = "MODALIDADE")
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	@XmlElement(name = "DT_INICIO_VIGENCIA")
	public String getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	@XmlElement(name = "DT_FIM_VIGENCIA")
	public String getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(String dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	@XmlElement(name = "PRAZO")
	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	@XmlElement(name = "RATING")
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@XmlElement(name = "MOTIVO_REPROVACAO")
	public String getMotivoReprovacao() {
		return motivoReprovacao;
	}

	public void setMotivoReprovacao(String motivoReprovacao) {
		this.motivoReprovacao = motivoReprovacao;
	}

	@Override
	public String toString() {
		return "TomadorValida [resultado=" + resultado + ", valorCalculado="
				+ valorCalculado + ", valorDisponivel=" + valorDisponivel + "]";
	}

}
