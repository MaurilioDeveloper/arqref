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
@XmlRootElement(name="CARTEIRA_TRABALHO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"ocorrencia", "documento", "flagDocumentoIdentificacaoPrincipal", "tipoOrgaoEmissor"})
public class CarteiraTrabalho  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3464431797333551866L;

	private String ocorrencia;
	
	private DocumentoCarteiraTrabalho documento;
	
	private String flagDocumentoIdentificacaoPrincipal;
	
	private String tipoOrgaoEmissor;


	@XmlElement(name="OCORRENCIA")
	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name="DOC")
	public DocumentoCarteiraTrabalho getDocumento() {
		return documento;
	}

	public void setDocumento(DocumentoCarteiraTrabalho documento) {
		this.documento = documento;
	}
	
	@XmlElement(name="FLAG_DOC_IDENTIFICACAO_PRINCIPAL")
	public String getFlagDocumentoIdentificacaoPrincipal() {
		return flagDocumentoIdentificacaoPrincipal;
	}

	public void setFlagDocumentoIdentificacaoPrincipal(
			String flagDocumentoIdentificacaoPrincipal) {
		this.flagDocumentoIdentificacaoPrincipal = flagDocumentoIdentificacaoPrincipal;
	}

	@XmlElement(name="TIPO_ORGAO_EMISSOR")
	public String getTipoOrgaoEmissor() {
		return tipoOrgaoEmissor;
	}

	public void setTipoOrgaoEmissor(String tipoOrgaoEmissor) {
		this.tipoOrgaoEmissor = tipoOrgaoEmissor;
	}

	@Override
	public String toString() {
		return "CarteiraTrabalho [ocorrencia=" + ocorrencia + ", documento="
				+ documento + "]";
	}
	
		
	

}
