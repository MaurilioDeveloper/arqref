package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PESSOA_RECIPROCA")
@XmlType(propOrder={"cnpj"})
public class PessoaReciproca implements Serializable {

	private static final long serialVersionUID = -4106755031355750958L;

	private String cnpj;

	@XmlElement(name="CNPJ")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
	
}