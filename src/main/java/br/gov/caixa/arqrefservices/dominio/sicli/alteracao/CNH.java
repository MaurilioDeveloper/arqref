package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

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
@XmlRootElement(name="CNH")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"ocorrencia", "tipoOrgaoEmissor", "numero", "uf", "dataPrimeiraHabilitacao", "dataEmissao","flagDocumentoIdendificacaoPrincipal"})
public class CNH  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9103209670604911059L;

	private String ocorrencia;
	
	private String tipoOrgaoEmissor;
	
	private String numero;
	
	private String uf;
	
	private String dataPrimeiraHabilitacao;
	
	private String dataEmissao;
	
	private String flagDocumentoIdendificacaoPrincipal;

	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
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

	@XmlElement(name="UF")
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@XmlElement(name="DT_PRIM_HABILIT")
	public String getDataPrimeiraHabilitacao() {
		return dataPrimeiraHabilitacao;
	}

	public void setDataPrimeiraHabilitacao(String dataPrimeiraHabilitacao) {
		this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
	}


	@XmlElement(name="DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@XmlElement(name="FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoIdendificacaoPrincipal() {
		return flagDocumentoIdendificacaoPrincipal;
	}

	public void setFlagDocumentoIdendificacaoPrincipal(
			String flagDocumentoIdendificacaoPrincipal) {
		this.flagDocumentoIdendificacaoPrincipal = flagDocumentoIdendificacaoPrincipal;
	}
	
	
}
