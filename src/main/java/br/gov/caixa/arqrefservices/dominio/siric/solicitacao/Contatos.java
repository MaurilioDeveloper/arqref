package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;


@XmlRootElement(name="CONTATOS")
@XmlSeeAlso({ Telefone.class })
@XmlType(propOrder={"telefoneCelular", "telefoneResidencial", "telefoneRecados", "email", "telefone", "foneResidencial", "foneComercial", "foneCelular"})
public class Contatos implements Serializable {
	
	private static final long serialVersionUID = -7669919427279541836L;
	
	private Telefone telefone;
	private Telefone telefoneCelular;
	private Telefone telefoneResidencial;
	private Telefone telefoneRecados;
	
	@Tamanho(tamanho = 50)
	private String email;
	
	@Tamanho(tamanho = 15)
	private String foneResidencial;
	
	@Tamanho(tamanho = 15)
	private String foneComercial;
	
	@Tamanho(tamanho = 15)
	private String foneCelular;
	
	
	@XmlElement(name="TELEFONE")
	public Telefone getTelefone() {
		return telefone;
	}
	
	@XmlElement(name="TELEFONE_CELULAR")
	public Telefone getTelefoneCelular() {
		return telefoneCelular;
	}
	
	@XmlElement(name="TELEFONE_RESIDENCIAL")
	public Telefone getTelefoneResidencial() {
		return telefoneResidencial;
	}
	
	@XmlElement(name="TELEFONE_RECADOS")
	public Telefone getTelefoneRecados() {
		return telefoneRecados;
	}

	@XmlElement(name="EMAIL")
	public String getEmail() {
		if(email!=null)
			return email.trim();
		return email;
	}
		
	@XmlElement(name="RESIDENCIAL")
	public String getFoneResidencial() {
		return foneResidencial;
	}

	@XmlElement(name="COMERCIAL")
	public String getFoneComercial() {
		return foneComercial;
	}

	@XmlElement(name="CELULAR")
	public String getFoneCelular() {
		return foneCelular;
	}

	public void setTelefoneCelular(Telefone telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public void setTelefoneResidencial(Telefone telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	
	public void setTelefoneRecados(Telefone telefoneRecados) {
		this.telefoneRecados = telefoneRecados;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFoneResidencial(String foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}

	public void setFoneCelular(String foneCelular) {
		this.foneCelular = foneCelular;
	}

}
