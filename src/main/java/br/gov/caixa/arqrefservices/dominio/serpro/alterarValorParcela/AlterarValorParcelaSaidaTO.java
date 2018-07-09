package br.gov.caixa.arqrefservices.dominio.serpro.alterarValorParcela;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class AlterarValorParcelaSaidaTO implements Serializable {


	private static final long serialVersionUID = 925496319863446780L;

	private String cdRetCode;
	private String dsRetCode;

	@XmlElement(name="cd_ret_code")
	public String getCdRetCode() {
		return cdRetCode;
	}
	public void setCdRetCode(String cdRetCode) {
		this.cdRetCode = cdRetCode;
	}
	@XmlElement(name="ds_ret_code")
	public String getDsRetCode() {
		return dsRetCode;
	}
	public void setDsRetCode(String dsRetCode) {
		this.dsRetCode = dsRetCode;
	}
}
