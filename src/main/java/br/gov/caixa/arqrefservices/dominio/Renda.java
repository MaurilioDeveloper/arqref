package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Renda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -766780292706421773L;

	private String ocorrencia;
	
	private String descricao;
	
	private TipoRenda tipoRenda = new TipoRenda();
	
	private String cnpjcpf;
	
	private String dataAdmissao;
	
	private String filler;
	
	private String vrRendaBruta;
	
	private String vrRendaLiquida;
	
	private String mesReferencia;
	
	private String anoReferencia;
	
	private String qtMes;
	
	private String qtAno;
	
	private String anoDesligamento;
	
	private String dataApuracao;
	
	private Profissao profissao = new Profissao();
	
	private String participaEmpresa;
	
	private String vrImpostoRenda;
	
	private ComprobatorioRenda comprobatorioRenda = new ComprobatorioRenda();
	
	private String flagComprovanteRendaRI;
	
	private String caracteristicaRenda;
	
	private String cocliFontePagadora;
	
	private String comprovanteRendaInformal;	
	

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoRenda getTipoRenda() {
		return tipoRenda;
	}

	public void setTipoRenda(TipoRenda tipoRenda) {
		this.tipoRenda = tipoRenda;
	}
	
	@XmlElement(name = "DESC_TP_RENDA")
	private String getTipoRendaDescricao() {
		return this.tipoRenda.getDescricao();
	}
	private void setTipoRendaDescricao(String codigo) {
		this.tipoRenda.setDescricao(codigo);
	}
	
	
	@XmlElement(name = "TP_RENDA")
	private String getTipoRendaSigla() {
		return this.tipoRenda.getSigla();
	}
	private void setTipoRendaSigla(String sigla) {
		this.tipoRenda.setSigla(sigla);
	}
	
	@XmlElement(name = "TP_FP")
	private String getTipoRendaCodigo() {
		return this.tipoRenda.getCodigo();
	}
	private void setTipoRendaCodigo(String codigo) {
		this.tipoRenda.setCodigo(codigo);
	}

	@XmlElement(name = "CPF_CNPJ_FP")
	public String getCnpjcpf() {
		return cnpjcpf;
	}

	public void setCnpjcpf(String cnpjcpf) {
		this.cnpjcpf = cnpjcpf;
	}

	@XmlElement(name = "DT_ADMISSAO")
	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@XmlElement(name = "FILLER")
	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	@XmlElement(name = "VR_RENDA_BRUTA")
	public String getVrRendaBruta() {
		return vrRendaBruta;
	}

	public void setVrRendaBruta(String vrRendaBruta) {
		this.vrRendaBruta = vrRendaBruta;
	}

	@XmlElement(name = "VR_RENDA_LIQUIDA")
	public String getVrRendaLiquida() {
		return vrRendaLiquida;
	}

	public void setVrRendaLiquida(String vrRendaLiquida) {
		this.vrRendaLiquida = vrRendaLiquida;
	}

	@XmlElement(name = "MES_REF")
	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	@XmlElement(name = "ANO_REF")
	public String getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	@XmlElement(name = "QT_MES")
	public String getQtMes() {
		return qtMes;
	}

	public void setQtMes(String qtMes) {
		this.qtMes = qtMes;
	}
	
	@XmlElement(name = "QT_ANO")
	public String getQtAno() {
		return qtAno;
	}

	public void setQtAno(String qtAno) {
		this.qtAno = qtAno;
	}

	@XmlElement(name = "ANO_DESLIGAMENTO")
	public String getAnoDesligamento() {
		return anoDesligamento;
	}

	public void setAnoDesligamento(String anoDesligamento) {
		this.anoDesligamento = anoDesligamento;
	}

	@XmlElement(name = "DT_APURACAO")
	public String getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	@XmlElement(name = "DESC_COD_OCUP")
	private String getProfissaoDescricao() {
		return this.profissao.getDescricao();
	}
	private void setProfissaoDescricao(String descricao) {
		this.profissao.setDescricao(descricao);
	}
	
	@XmlElement(name = "COD_OCUPACAO")
	private String getProfissaoCodigo() {
		return this.profissao.getCodigo();
	}
	private void setProfissaoCodigo(String codigo) {
		this.profissao.setCodigo(codigo);
	}

	@XmlElement(name = "PARTICIP_EMP")
	public String getParticipaEmpresa() {
		return participaEmpresa;
	}

	public void setParticipaEmpresa(String participaEmpresa) {
		this.participaEmpresa = participaEmpresa;
	}

	@XmlElement(name = "VR_IRPF")
	public String getVrImpostoRenda() {
		return vrImpostoRenda;
	}

	public void setVrImpostoRenda(String vrImpostoRenda) {
		this.vrImpostoRenda = vrImpostoRenda;
	}

	public ComprobatorioRenda getComprobatorioRenda() {
		return comprobatorioRenda;
	}
	public void setComprobatorioRenda(ComprobatorioRenda comprobatorioRenda) {
		this.comprobatorioRenda = comprobatorioRenda;
	}
	
	@XmlElement(name = "COD_COMPR_COMPROBATORIO_RF")
	private String getCodComprovanteComprobatorio() {
		return this.comprobatorioRenda.getCodigo();
	}
	private void setCodComprovanteComprobatorio(String codigo) {
		this.comprobatorioRenda.setCodigo(codigo);
	}
	
	@XmlElement(name = "FLAG_COMPR_RENDA_RI")
	public String getFlagComprovanteRendaRI() {
		return flagComprovanteRendaRI;
	}
	public void setFlagComprovanteRendaRI(String flagComprovanteRendaRI) {
		this.flagComprovanteRendaRI = flagComprovanteRendaRI;
	}
	
	@XmlElement(name = "CARACTER_RENDA")
	public String getCaracteristicaRenda() {
		return caracteristicaRenda;
	}
	public void setCaracteristicaRenda(String caracteristicaRenda) {
		this.caracteristicaRenda = caracteristicaRenda;
	}
	
	@XmlElement(name = "COCLI_FP")
	public String getCocliFontePagadora() {
		return cocliFontePagadora;
	}
	public void setCocliFontePagadora(String cocliFontePagadora) {
		this.cocliFontePagadora = cocliFontePagadora;
	}
	

	public String getComprovanteRendaInformal() {
		return comprovanteRendaInformal;
	}

	public void setComprovanteRendaInformal(String comprovanteRendaInformal) {
		this.comprovanteRendaInformal = comprovanteRendaInformal;
	}
	
	
}
