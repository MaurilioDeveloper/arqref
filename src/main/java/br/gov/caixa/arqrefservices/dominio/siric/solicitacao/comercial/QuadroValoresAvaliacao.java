package br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.MargemConsignavel;

@XmlRootElement(name="QUADRO_VALORES")
@XmlSeeAlso({ MargemConsignavel.class })
@XmlType(propOrder={"margemConsignavel"})
public class QuadroValoresAvaliacao implements Serializable {

	private static final long serialVersionUID = -8016342648985461377L;
	
	private MargemConsignavel margemConsignavel;

	@XmlElement(name="MARGEM_CONSIGNAVEL")
	public MargemConsignavel getMargemConsignavel() {
		return margemConsignavel;
	}

	public void setMargemConsignavel(MargemConsignavel margemConsignavel) {
		this.margemConsignavel = margemConsignavel;
	}
	
}
