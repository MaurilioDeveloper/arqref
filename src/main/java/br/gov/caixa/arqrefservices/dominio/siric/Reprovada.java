package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="REPROVADA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Reprovada implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5122184298162410106L;

	private String proposta;

	private String codigoAvaliacao;

	private ClienteSIRIC cliente;

	private String produto;

	private String motivo;

	private String valorFinancimanetoPossivel;

	private String prazoPossivel;

	private String valorPrestacaoPossivel;
	
	@XmlElement(name="PROPOSTA")
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	@XmlElement(name="CODIGO_AVALIACAO")
	public String getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	@XmlElement(name="CLIENTE")
	public ClienteSIRIC getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSIRIC cliente) {
		this.cliente = cliente;
	}

	@XmlElement(name="PRODUTO")
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@XmlElement(name="MOTIVO")
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@XmlElement(name="VR_FINANCIAMENTO_POSSIVEL")
	public String getValorFinancimanetoPossivel() {
		return valorFinancimanetoPossivel;
	}

	public void setValorFinancimanetoPossivel(String valorFinancimanetoPossivel) {
		this.valorFinancimanetoPossivel = valorFinancimanetoPossivel;
	}

	@XmlElement(name="PRAZO_POSSIVEL")
	public String getPrazoPossivel() {
		return prazoPossivel;
	}

	public void setPrazoPossivel(String prazoPossivel) {
		this.prazoPossivel = prazoPossivel;
	}

	@XmlElement(name="VR_PRESTACAO_POSSIVEL")
	public String getValorPrestacaoPossivel() {
		return valorPrestacaoPossivel;
	}

	public void setValorPrestacaoPossivel(String valorPrestacaoPossivel) {
		this.valorPrestacaoPossivel = valorPrestacaoPossivel;
	}

	@Override
	public String toString() {
		return "Reprovada [proposta=" + proposta + ", codigoAvaliacao="
				+ codigoAvaliacao + ", cliente=" + cliente + ", produto="
				+ produto + ", motivo=" + motivo
				+ ", valorFinancimanetoPossivel=" + valorFinancimanetoPossivel
				+ ", prazoPossivel=" + prazoPossivel
				+ ", valorPrestacaoPossivel=" + valorPrestacaoPossivel + "]";
	}

	
}
