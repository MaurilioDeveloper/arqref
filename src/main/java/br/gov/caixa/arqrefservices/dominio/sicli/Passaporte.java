package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="PASSAPORTE")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Passaporte  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8057614815472608307L;

	private String ocorrencia;
	
	private String descircaoTipoOrgaoEmissor;
	
	private String tipoOrgaoEmissor;
	
	private String numero;
	
	private String ufEmissor;
	
	private String dataEmissao;
	
	private String dataValidade;
	
	private String paisOrigem;
	
	private String flagDocumentoIdentificacaoPrincipal;

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name="DESC_TP_ORGAO_EMISSOR")
	public String getDescircaoTipoOrgaoEmissor() {
		return descircaoTipoOrgaoEmissor;
	}

	public void setDescircaoTipoOrgaoEmissor(String descircaoTipoOrgaoEmissor) {
		this.descircaoTipoOrgaoEmissor = descircaoTipoOrgaoEmissor;
	}

	@XmlElement(name="TP_ORGAO_EMISSOR")
	public String getTipoOrgaoEmissor() {
		return tipoOrgaoEmissor;
	}

	public void setTipoOrgaoEmissor(String tipoOrgaoEmissor) {
		this.tipoOrgaoEmissor = tipoOrgaoEmissor;
	}

	@XmlElement(name="NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@XmlElement(name="UF_EMISSAO")
	public String getUfEmissor() {
		return ufEmissor;
	}

	public void setUfEmissor(String ufEmissor) {
		this.ufEmissor = ufEmissor;
	}

	@XmlElement(name="DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@XmlElement(name="DT_VALIDADE")
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@XmlElement(name="PAIS_ORIGEM")
	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	@XmlElement(name="FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoIdentificacaoPrincipal() {
		return flagDocumentoIdentificacaoPrincipal;
	}

	public void setFlagDocumentoIdentificacaoPrincipal(
			String flagDocumentoIdentificacaoPrincipal) {
		this.flagDocumentoIdentificacaoPrincipal = flagDocumentoIdentificacaoPrincipal;
	}

	@Override
	public String toString() {
		return "Passaporte [ocorrencia=" + ocorrencia
				+ ", descircaoTipoOrgaoEmissor=" + descircaoTipoOrgaoEmissor
				+ ", tipoOrgaoEmissor=" + tipoOrgaoEmissor + ", numero="
				+ numero + ", ufEmissor=" + ufEmissor + ", dataEmissao="
				+ dataEmissao + ", dataValidade=" + dataValidade
				+ ", paisOrigem=" + paisOrigem
				+ ", flagDocumentoIdentificacaoPrincipal="
				+ flagDocumentoIdentificacaoPrincipal + "]";
	}
	
	
	

}
