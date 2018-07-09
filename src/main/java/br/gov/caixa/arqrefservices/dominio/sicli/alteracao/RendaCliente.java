package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="RENDA")
@XmlType(propOrder={"ocorrencia","descricaoTipoRenda",
		"descricaoCodigoOcupacao",  "tipoRenda","caraterRenda", 
		"cocliFP", "tipoFP", "cpfCnpjFP", 
		"dataAdmissao","filler","valorRendaBruta", "valorRendaLiquida",
		 "mesReferencia", "anoReferencia", "quantidadeMes", "quantidadeAno",  "anoDesligamento",
		 "dataApuracao", "participacaEmprestimo", "codigoOcupacao", "valorImpostoRenda",
		"codigoComprovanteComprobatorioRendaFormal", "flagComprovanteRendaInformal","razaoSocial"

})
public class RendaCliente implements Serializable {

	private static final long serialVersionUID = -2173113517989206422L;
	
	private String ocorrencia;
	
	private String descricaoTipoRenda;
	
	private String descricaoCodigoOcupacao;
	
	private String tipoRenda;

	private String caraterRenda;
	
	private String cocliFP;
	
	private String tipoFP;
	
	private String cpfCnpjFP;
	
	private String dataAdmissao;
	
	private String filler;
	
	private String valorRendaBruta;
	
	private String valorRendaLiquida;

	private String mesReferencia;
	
	private String anoReferencia;
	
	private String quantidadeAno;
	
	private String quantidadeMes;
	
	private String anoDesligamento;
	
	private String dataApuracao;
	
	private String participacaEmprestimo;
	
	private String codigoOcupacao;
	
	private String valorImpostoRenda;
	
	private String codigoComprovanteComprobatorioRendaFormal;
	
	private String flagComprovanteRendaInformal;
	
	private String razaoSocial;
	
	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	@XmlElement(name="TP_RENDA")
	public String getTipoRenda() {
		return tipoRenda;
	}
	@XmlElement(name="VR_RENDA_BRUTA")
	public String getValorRendaBruta() {
		return valorRendaBruta;
	}

	@XmlElement(name="VR_RENDA_LIQUIDA")
	public String getValorRendaLiquida() {
		return valorRendaLiquida;
	}

	@XmlElement(name="DESC_TP_RENDA")
	public String getDescricaoTipoRenda() {
		return this.descricaoTipoRenda;
	}

	@XmlElement(name="DESC_COD_OCUP")
	public String getDescricaoCodigoOcupacao() {
		return this.descricaoCodigoOcupacao;
	}

	@XmlElement(name="CARACTER_RENDA")
	public String getCaraterRenda() {
		return this.caraterRenda;
	}

	@XmlElement(name="COCLI_FP")
	public String getCocliFP() {
		return this.cocliFP;
	}

	@XmlElement(name="TP_FP")
	public String getTipoFP() {
		return this.tipoFP;
	}

	@XmlElement(name="CPF_CNPJ_FP")
	public String getCpfCnpjFP() {
		return this.cpfCnpjFP;
	}

	@XmlElement(name="DT_ADMISSAO")
	public String getDataAdmissao() {
		return this.dataAdmissao;
	}

	@XmlElement(name="FILLER")
	public String getFiller() {
		return this.filler;
	}

	@XmlElement(name="MES_REF")
	public String getMesReferencia() {
		return this.mesReferencia;
	}

	@XmlElement(name="ANO_REF")
	public String getAnoReferencia() {
		return this.anoReferencia;
	}

	@XmlElement(name="QT_ANO")
	public String getQuantidadeAno() {
		return this.quantidadeAno;
	}

	@XmlElement(name="QT_MES")
	public String getQuantidadeMes() {
		return this.quantidadeMes;
	}

	@XmlElement(name="ANO_DESLIGAMENTO")
	public String getAnoDesligamento() {
		return this.anoDesligamento;
	}

	@XmlElement(name="DT_APURACAO")
	public String getDataApuracao() {
		return this.dataApuracao;
	}

	@XmlElement(name="PARTICIP_EMP")
	public String getParticipacaEmprestimo() {
		return this.participacaEmprestimo;
	}

	@XmlElement(name="COD_OCUPACAO")
	public String getCodigoOcupacao() {
		return this.codigoOcupacao;
	}

	@XmlElement(name="VR_IRPF")
	public String getValorImpostoRenda() {
		return this.valorImpostoRenda;
	}

	@XmlElement(name="COD_COMPR_COMPROBATORIO_RF")
	public String getCodigoComprovanteComprobatorioRendaFormal() {
		return this.codigoComprovanteComprobatorioRendaFormal;
	}

	@XmlElement(name="FLAG_COMPR_RENDA_RI")
	public String getFlagComprovanteRendaInformal() {
		if(this.flagComprovanteRendaInformal==null||this.flagComprovanteRendaInformal.equals("")||this.flagComprovanteRendaInformal.equalsIgnoreCase("N"))
			return "N";
		return "S";
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public void setDescricaoTipoRenda(String descricaoTipoRenda) {
		this.descricaoTipoRenda = descricaoTipoRenda;
	}

	public void setDescricaoCodigoOcupacao(String descricaoCodigoOcupacao) {
		this.descricaoCodigoOcupacao = descricaoCodigoOcupacao;
	}

	public void setTipoRenda(String tipoRenda) {
		this.tipoRenda = tipoRenda;
	}

	public void setCaraterRenda(String caraterRenda) {
		this.caraterRenda = caraterRenda;
	}

	public void setCocliFP(String cocliFP) {
		this.cocliFP = cocliFP;
	}

	public void setTipoFP(String tipoFP) {
		this.tipoFP = tipoFP;
	}

	public void setCpfCnpjFP(String cpfCnpjFP) {
		this.cpfCnpjFP = cpfCnpjFP;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public void setValorRendaBruta(String valorRendaBruta) {
		this.valorRendaBruta = valorRendaBruta;
	}

	public void setValorRendaLiquida(String valorRendaLiquida) {
		this.valorRendaLiquida = valorRendaLiquida;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	public void setQuantidadeAno(String quantidadeAno) {
		this.quantidadeAno = quantidadeAno;
	}

	public void setQuantidadeMes(String quantidadeMes) {
		this.quantidadeMes = quantidadeMes;
	}

	public void setAnoDesligamento(String anoDesligamento) {
		this.anoDesligamento = anoDesligamento;
	}

	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	public void setParticipacaEmprestimo(String participacaEmprestimo) {
		this.participacaEmprestimo = participacaEmprestimo;
	}

	public void setCodigoOcupacao(String codigoOcupacao) {
		this.codigoOcupacao = codigoOcupacao;
	}

	public void setValorImpostoRenda(String valorImpostoRenda) {
		this.valorImpostoRenda = valorImpostoRenda;
	}

	public void setCodigoComprovanteComprobatorioRendaFormal(String codigoComprovanteComprobatorioRendaFormal) {
		this.codigoComprovanteComprobatorioRendaFormal = codigoComprovanteComprobatorioRendaFormal;
	}

	public void setFlagComprovanteRendaInformal(String flagComprovanteRendaInformal) {
		this.flagComprovanteRendaInformal = flagComprovanteRendaInformal;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
