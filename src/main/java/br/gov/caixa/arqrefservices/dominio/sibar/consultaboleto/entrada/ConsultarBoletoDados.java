package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"coBeneficiario", "nuNossoNumero"})
public class ConsultarBoletoDados implements Serializable {
	
	private static final long serialVersionUID = -1926042016042795011L;
	
	@XmlElement(name="CODIGO_BENEFICIARIO")
	private String coBeneficiario;	                                
	
	@XmlElement(name="NOSSO_NUMERO")
	private String nuNossoNumero;

	public String getCoBeneficiario() {
		return coBeneficiario;
	}
	
	public String getNuNossoNumero() {
		return nuNossoNumero;
	}

	public void setNuNossoNumero(String nuNossoNumero) {
		this.nuNossoNumero = nuNossoNumero;
	}

	public void setCoBeneficiario(String coBeneficiario) {
		this.coBeneficiario = coBeneficiario;
	}

	
	
}