package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Documento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 426826268217197209L;
	
	private String codigoOrgaoEmissor;
	
	private String numero;
	
	private String serie;
	
	private UF uf = new UF();
	
	private String dataEmissao;

	@XmlElement(name = "ORGAO_EMISSOR")
	public String getCodigoOrgaoEmissor() {
		return codigoOrgaoEmissor;
	}

	public void setCodigoOrgaoEmissor(String codigoOrgaoEmissor) {
		this.codigoOrgaoEmissor = codigoOrgaoEmissor;
	}

	@XmlElement(name = "NUMERO")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
//	@XmlElement(name = "UF")
//	private String getUfCodigo() {
//		return this.uf.getCodigo();
//	}
//
//	private void setUfCodigo(String uf) {
//		this.uf.setCodigo(uf);
//	}

	@XmlElement(name = "DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	@XmlElement(name = "SERIE")
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	

}
