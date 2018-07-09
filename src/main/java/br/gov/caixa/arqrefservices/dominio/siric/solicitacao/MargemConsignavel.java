package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MARGEM_CONSIGNAVEL")
@XmlType(propOrder={"valorMargem"})
public class MargemConsignavel implements Serializable {

	private static final long serialVersionUID = -4106755031355750958L;

	private Double valorMargem;

	@XmlElement(name="VALOR")
	public Double getValorMargem() {
		return valorMargem;
	}

	public void setValorMargem(Double valorMargem) {
		this.valorMargem = valorMargem;
	}
	
	
	
}