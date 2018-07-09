package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="DADOS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "sistema","codigoIdentificacao","numeroTipoDocumento", "tipoMinuta",
		"numeroParametro","numeroTotalCampos","dadosChaveValor",  "excecao" }) 
public class DadosMinuta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287356216510511758L;
	
	
	private String codigoIdentificacao;

	private String dadosChaveValor;

	private String numeroParametro;
	
	private String numeroTipoDocumento;
	
	private String numeroTotalCampos;
	
	private String tipoMinuta;

	private String sistema;
	
	private String excecao;	

	
	@XmlElement(name="CO_IDENTIFICADOR")
	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	@XmlElement(name="CHAVE_VALOR")
	public String getDadosChaveValor() {
		return dadosChaveValor;
	}

	@XmlElement(name="PARAMETRO")
	public String getNumeroParametro() {
		return numeroParametro;
	}

	@XmlElement(name="TP_DOCUMENTO")
	public String getNumeroTipoDocumento() {
		return numeroTipoDocumento;
	}
	
	@XmlElement(name="TP_MINUTA")
	public String getTipoMinuta() {
		return tipoMinuta;
	}

	@XmlElement(name="TOTAL_CAMPOS")
	public String getNumeroTotalCampos() {
		return numeroTotalCampos;
	}

	@XmlElement(name="SISTEMA")
	public String getSistema() {
		return sistema;
	}

	@XmlElement(name="EXCECAO")
	public String getExcecao() {
		return this.excecao;
	}


	public void setTipoMinuta(String tipoMinuta) {
		this.tipoMinuta = tipoMinuta;
	}
	
	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}		
	
	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	public void setDadosChaveValor(String dadosChaveValor) {
		this.dadosChaveValor = dadosChaveValor;
	}

	public void setNumeroParametro(String numeroParametro) {
		this.numeroParametro = numeroParametro;
	}

	public void setNumeroTipoDocumento(String numeroTipoDocumento) {
		this.numeroTipoDocumento = numeroTipoDocumento;
	}

	public void setNumeroTotalCampos(String numeroTotalCampos) {
		this.numeroTotalCampos = numeroTotalCampos;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

}
