package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;
//import br.gov.caixa.emprestimo.util.UtilStringSiemp;

@XmlRootElement(name = "TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = -3832333313876431240L;

	@Tamanho(tamanho = 2)
	private String numeroDDD;

	@Tamanho(tamanho = 9)
	private String numeroTelefone;

	@Tamanho(tamanho = 4)
	private String numeroMeioTelefone;

	@Tamanho(tamanho = 4)
	private String numeroTipoMeioTelefone;

	@Tamanho(tamanho = 4)
	private String tipoUso;

	@Tamanho(tamanho = 5)
	private String numeroPrefixoTelefone;

	@Tamanho(tamanho = 20)
	private String codigoTelefone;

	@Tamanho(tamanho = 4)
	private String numeroFinalidadeTelefone;

	@Tamanho(tamanho = 50)
	private String finalidadeTelefone;

	@Tamanho(tamanho = 10)
	private String numeroTelefone2;

	@Tamanho(tamanho = 2)
	private Integer numeroDDD2;

	@Tamanho(tamanho = 9)
	private String numeroTel;

	@XmlElement(name = "DDD")
	public String getNumeroDDD() {
		if (numeroDDD != null)
			return StringUtils.removeAll(numeroDDD, " ");
		return numeroDDD;
	}

	@XmlElement(name = "NUMERO")
	public String getNumeroTelefone() {
		if (numeroTelefone != null)
			return StringUtils.removeAll(numeroTelefone, " ");
		return numeroTelefone;
	}

	public void setNumeroDDD(String numeroDDD) {
		this.numeroDDD = numeroDDD;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getNumeroMeioTelefone() {
		if (numeroMeioTelefone != null)
			return numeroMeioTelefone.trim();
		return numeroMeioTelefone;
	}

	public void setNumeroMeioTelefone(String numeroMeioTelefone) {
		this.numeroMeioTelefone = numeroMeioTelefone;
	}

	public String getNumeroPrefixoTelefone() {
		if (numeroPrefixoTelefone != null)
			return numeroPrefixoTelefone.trim();
		return numeroPrefixoTelefone;
	}

	public void setNumeroPrefixoTelefone(String numeroPrefixoTelefone) {
		this.numeroPrefixoTelefone = numeroPrefixoTelefone;
	}

	public String getCodigoTelefone() {
		if (codigoTelefone != null)
			return codigoTelefone.trim();
		return codigoTelefone;
	}

	public void setCodigoTelefone(String codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}

	public String getFinalidadeTelefone() {
		if (finalidadeTelefone != null)
			return finalidadeTelefone.trim();
		return finalidadeTelefone;
	}

	public void setFinalidadeTelefone(String finalidadeTelefone) {
		this.finalidadeTelefone = finalidadeTelefone;
	}

	public String getNumeroFinalidadeTelefone() {
		if (numeroFinalidadeTelefone != null)
			return numeroFinalidadeTelefone.trim();
		return numeroFinalidadeTelefone;
	}

	public void setNumeroFinalidadeTelefone(String numeroFinalidadeTelefone) {
		this.numeroFinalidadeTelefone = numeroFinalidadeTelefone;
	}

	public String getNumeroTipoMeioTelefone() {
		return numeroTipoMeioTelefone;
	}

	public void setNumeroTipoMeioTelefone(String numeroTipoMeioTelefone) {
		this.numeroTipoMeioTelefone = numeroTipoMeioTelefone;
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}

	public String getNumeroTelefone2() {
		return numeroTelefone2;
	}

	public void setNumeroTelefone2(String numeroTelefone2) {
		this.numeroTelefone2 = numeroTelefone2;
	}

	public Integer getNumeroDDD2() {
		return numeroDDD2;
	}

	public void setNumeroDDD2(Integer numeroDDD2) {
		this.numeroDDD2 = numeroDDD2;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

}
