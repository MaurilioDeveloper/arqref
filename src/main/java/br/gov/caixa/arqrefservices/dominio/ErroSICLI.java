package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */

public class ErroSICLI implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6677133086967796494L;

    private String codigoErro;
	
	private String sqlErro;
	
	private String IPSErro;
	
	private String mensagemErro;

	//Classe Interna
	private DescricaoErro descricaoErro= new DescricaoErro();
	
	@XmlElement(name = "DESC_ERRO")
	private DescricaoErro getDescricaoErro() {
		return descricaoErro;
	}
	private void setDescricaoErro(DescricaoErro descricaoErro) {
		this.descricaoErro = descricaoErro;
	}
		
	public String getCodigoErro() {
		this.codigoErro = this.descricaoErro.getCodigoErro();
		return codigoErro;
	}

	public void setCodigoErro(String codigoErro) {
		this.descricaoErro.setCodigoErro(codigoErro);
		this.codigoErro = codigoErro;
	}

	
	public String getSqlErro() {
		this.sqlErro = this.descricaoErro.getSqlErro();
		return sqlErro;
	}

	public void setSqlErro(String sqlErro) {
		this.descricaoErro.setSqlErro(sqlErro);
		this.sqlErro = sqlErro;
	}

	
	public String getIPSErro() {
		this.IPSErro = this.descricaoErro.getIPSErro();
		return IPSErro;
	}

	public void setIPSErro(String iPSErro) {
		this.descricaoErro.setIPSErro(iPSErro);
		IPSErro = iPSErro;
	}

	
	public String getMensagemErro() {
		this.mensagemErro = this.descricaoErro.getMensagemErro();
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.descricaoErro.setMensagemErro(mensagemErro);
		this.mensagemErro = mensagemErro;
	}
	
	/**
	 * Classe Interna para resolver o problema 
	 * <NOME_CLIENTE> 
	 * 		<NOME>ASCQ ZXCV</NOME>
	 * </NOME_CLIENTE>
	 */
	@XmlRootElement(name = "DESC_ERRO")
	private static class DescricaoErro {

		private String codigoErro;
		
		private String sqlErro;
		
		private String IPSErro;
		
		private String mensagemErro;

		@XmlElement(name = "COD_ERR")
		public String getCodigoErro() {
			return codigoErro;
		}

		public void setCodigoErro(String codigoErro) {
			this.codigoErro = codigoErro;
		}

		@XmlElement(name = "SQL_ERR")
		public String getSqlErro() {
			return sqlErro;
		}

		public void setSqlErro(String sqlErro) {
			this.sqlErro = sqlErro;
		}

		@XmlElement(name = "IPS")
		public String getIPSErro() {
			return IPSErro;
		}

		public void setIPSErro(String iPSErro) {
			IPSErro = iPSErro;
		}

		@XmlElement(name = "MSG_ERR")
		public String getMensagemErro() {
			return mensagemErro;
		}

		public void setMensagemErro(String mensagemErro) {
			this.mensagemErro = mensagemErro;
		}
	}

	@Override
	public String toString() {
		return "ErroSICLI [CodigoErro=" + getCodigoErro() + ", SqlErro="
				+ getSqlErro() + ", IPS=" + getIPSErro()
				+ ", MensagemErro=" + getMensagemErro() + "]";
	}
	
	
	
	
	
	

}
