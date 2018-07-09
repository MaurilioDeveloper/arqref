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
@XmlRootElement(name="RENDA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "ocorrencia", "descricaoTipoRenda", "descricaoCodigoOcupacao", "tipoRenda",
		"caracteristicaRenda", "cocliFontePagadora", "tipoFontePagadora", "cpfCnpjFontePagadora", "dataAdimissao",
		"filler", "valorRendaBruta", "valorRendaLiquida", "mesReferencia", "anoReferencia", "quatidadeMes",
		"quantidadeAno", "anoDesligamento", "dataApuracao", "paricipacaoEmpregado", "codigoOcupacao", "valorIRPF",
		"codigoComprobatorioRenda", "flagCompracaoRenda" })
public class Renda implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1773407103354588594L;

	private String ocorrencia;
	
	private String descricaoTipoRenda;
	
	private String descricaoCodigoOcupacao;
	
	private String tipoRenda;
	
	private String caracteristicaRenda;
	
	private String cocliFontePagadora;
	
	private String tipoFontePagadora;
	
	private String cpfCnpjFontePagadora;
	
	private String dataAdimissao;
	
	private String filler;
	
	private String valorRendaBruta;
	
	private String valorRendaLiquida;
	
	private String mesReferencia;
	
	private String anoReferencia;
	
	private String quantidadeAno;
	
	private String quatidadeMes;
	
	private String anoDesligamento;
	
	private String dataApuracao;
	
	private String paricipacaoEmpregado;
	
	private String codigoOcupacao;
	
	private String valorIRPF;
	
	private String codigoComprobatorioRenda;
	
	private String flagCompracaoRenda;

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name="DESC_TP_RENDA")
	public String getDescricaoTipoRenda() {
		return descricaoTipoRenda;
	}

	public void setDescricaoTipoRenda(String descricaoTipoRenda) {
		this.descricaoTipoRenda = descricaoTipoRenda;
	}

	@XmlElement(name="DESC_COD_OCUP")
	public String getDescricaoCodigoOcupacao() {
		return descricaoCodigoOcupacao;
	}

	public void setDescricaoCodigoOcupacao(String descricaoCodigoOcupacao) {
		this.descricaoCodigoOcupacao = descricaoCodigoOcupacao;
	}

	@XmlElement(name="TP_RENDA")
	public String getTipoRenda() {
		return tipoRenda;
	}

	public void setTipoRenda(String tipoRenda) {
		this.tipoRenda = tipoRenda;
	}

	@XmlElement(name="CARACTER_RENDA")
	public String getCaracteristicaRenda() {
		return caracteristicaRenda;
	}

	public void setCaracteristicaRenda(String caracteristicaRenda) {
		this.caracteristicaRenda = caracteristicaRenda;
	}

	@XmlElement(name="COCLI_FP")
	public String getCocliFontePagadora() {
		return cocliFontePagadora;
	}

	public void setCocliFontePagadora(String cocliFontePagadora) {
		this.cocliFontePagadora = cocliFontePagadora;
	}

	@XmlElement(name="TP_FP")
	public String getTipoFontePagadora() {
		return tipoFontePagadora;
	}

	public void setTipoFontePagadora(String tipoFontePagadora) {
		this.tipoFontePagadora = tipoFontePagadora;
	}

	@XmlElement(name="CPF_CNPJ_FP")
	public String getCpfCnpjFontePagadora() {
		return cpfCnpjFontePagadora;
	}

	public void setCpfCnpjFontePagadora(String cpfCnpjFontePagadora) {
		this.cpfCnpjFontePagadora = cpfCnpjFontePagadora;
	}

	@XmlElement(name="DT_ADMISSAO")
	public String getDataAdimissao() {
		return dataAdimissao;
	}

	public void setDataAdimissao(String dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}

	@XmlElement(name="FILLER")
	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@XmlElement(name="VR_RENDA_BRUTA")
	public String getValorRendaBruta() {
		return valorRendaBruta;
	}

	public void setValorRendaBruta(String valorRendaBruta) {
		this.valorRendaBruta = valorRendaBruta;
	}

	@XmlElement(name="VR_RENDA_LIQUIDA")
	public String getValorRendaLiquida() {
		return valorRendaLiquida;
	}

	public void setValorRendaLiquida(String valorRendaLiquida) {
		this.valorRendaLiquida = valorRendaLiquida;
	}

	@XmlElement(name="MES_REF")
	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	@XmlElement(name="ANO_REF")
	public String getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	@XmlElement(name="QT_ANO")
	public String getQuantidadeAno() {
		return quantidadeAno;
	}

	public void setQuantidadeAno(String quantidadeAno) {
		this.quantidadeAno = quantidadeAno;
	}

	@XmlElement(name="QT_MES")
	public String getQuatidadeMes() {
		return quatidadeMes;
	}

	public void setQuatidadeMes(String quatidadeMes) {
		this.quatidadeMes = quatidadeMes;
	}

	@XmlElement(name="ANO_DESLIGAMENTO")
	public String getAnoDesligamento() {
		return anoDesligamento;
	}

	public void setAnoDesligamento(String anoDesligamento) {
		this.anoDesligamento = anoDesligamento;
	}

	@XmlElement(name="DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	@XmlElement(name="PARTICIP_EMP")
	public String getParicipacaoEmpregado() {
		return paricipacaoEmpregado;
	}

	public void setParicipacaoEmpregado(String paricipacaoEmpregado) {
		this.paricipacaoEmpregado = paricipacaoEmpregado;
	}

	@XmlElement(name="COD_OCUPACAO")
	public String getCodigoOcupacao() {
		return codigoOcupacao;
	}

	public void setCodigoOcupacao(String codigoOcupacao) {
		this.codigoOcupacao = codigoOcupacao;
	}

	@XmlElement(name="VR_IRPF")
	public String getValorIRPF() {
		return valorIRPF;
	}

	public void setValorIRPF(String valorIRPF) {
		this.valorIRPF = valorIRPF;
	}

	@XmlElement(name="COD_COMPR_COMPROBATORIO_RF")
	public String getCodigoComprobatorioRenda() {
		return codigoComprobatorioRenda;
	}

	public void setCodigoComprobatorioRenda(String codigoComprobatorioRenda) {
		this.codigoComprobatorioRenda = codigoComprobatorioRenda;
	}

	@XmlElement(name="FLAG_COMPR_RENDA_RI")
	public String getFlagCompracaoRenda() {
		return flagCompracaoRenda;
	}

	public void setFlagCompracaoRenda(String flagCompracaoRenda) {
		this.flagCompracaoRenda = flagCompracaoRenda;
	}

	@Override
	public String toString() {
		return "Renda [ocorrencia=" + ocorrencia + ", descricaoTipoRenda="
				+ descricaoTipoRenda + ", descricaoCodigoOcupacao="
				+ descricaoCodigoOcupacao + ", tipoRenda=" + tipoRenda
				+ ", caracteristicaRenda=" + caracteristicaRenda
				+ ", cocliFontePagadora=" + cocliFontePagadora
				+ ", tipoFontePagadora=" + tipoFontePagadora
				+ ", dataAdimissao=" + dataAdimissao + ", filler=" + filler
				+ ", valorRendaBruta=" + valorRendaBruta
				+ ", valorRendaLiquida=" + valorRendaLiquida
				+ ", mesReferencia=" + mesReferencia + ", anoReferencia="
				+ anoReferencia + ", quantidadeAno=" + quantidadeAno
				+ ", quatidadeMes=" + quatidadeMes + ", anoDesligamento="
				+ anoDesligamento + ", dataApuracao=" + dataApuracao
				+ ", paricipacaoEmpregado=" + paricipacaoEmpregado
				+ ", codigoOcupacao=" + codigoOcupacao + ", valorIRPF="
				+ valorIRPF + ", codigoComprobatorioRenda="
				+ codigoComprobatorioRenda + ", flagCompracaoRenda="
				+ flagCompracaoRenda + "]";
	}
	
	

}
