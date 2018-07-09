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
@XmlRootElement(name="DESC_ERRO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class DescricaoErro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3996981043195682988L;
	
	private String codigoErro;
	
	private String sqlErro;
	
	private String ips;
	
	private String mensagemErro;

	@XmlElement(name="COD_ERR")
	public String getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(String codigoErro) {
		this.codigoErro = codigoErro;
	}

	@XmlElement(name="SQL_ERR")
	public String getSqlErro() {
		return sqlErro;
	}

	public void setSqlErro(String sqlErro) {
		this.sqlErro = sqlErro;
	}

	@XmlElement(name="IPS")
	public String getIps() {
		return ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
	}

	@XmlElement(name="MSG_ERR")
	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	@Override
	public String toString() {
		return "DescricaoErro [codigoErro=" + codigoErro + ", sqlErro="
				+ sqlErro + ", ips=" + ips + ", mensagemErro=" + mensagemErro
				+ "]";
	}
	
	

}
