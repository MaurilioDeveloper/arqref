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
@XmlRootElement(name="CARTEIRA_TRABALHO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CarteiraTrabalho  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3464431797333551866L;

	private String ocorencia;
	
	private Documento documento;
	
	private String flagDocumentoIdentificacaoPrincipal;
	
	private String tipoOrgaoEmissor;

	@XmlElement(name="OCORRENCIA")
	public String getOcorencia() {
		return ocorencia;
	}

	public void setOcorencia(String ocorencia) {
		this.ocorencia = ocorencia;
	}

	@XmlElement(name="DOC")
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
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
		return "CarteiraTrabalho [ocorencia=" + ocorencia + ", documento="
				+ documento + "]";
	}
	
		
	

}
