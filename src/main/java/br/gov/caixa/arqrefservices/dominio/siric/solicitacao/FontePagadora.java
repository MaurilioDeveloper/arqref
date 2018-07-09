package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;
//import br.gov.caixa.emprestimo.util.UtilStringSiemp;

@XmlRootElement(name="FONTE_PAGADORA")
@XmlSeeAlso({ Endereco.class, Contatos.class })

@XmlType(propOrder={"tipoPessoa", "numeroCPF", "numeroCNPJ", "nome", "endereco", "contatos"})
public class FontePagadora implements Serializable {
	
	private static final long serialVersionUID = 1995909462125474494L;
	
	@Tamanho(tamanho = 1)
	private String tipoPessoa;
	
	@Tamanho(tamanho = 14)
	private String numeroCNPJ;
	
	@Tamanho(tamanho = 14)
	private String numeroCPF;
	
	@Tamanho(tamanho = 50)
	private String nome;
	
	private Endereco endereco; 
	
	private Contatos contatos;
	
	
	@XmlElement(name="TP_PESSOA_FONTE_PAGADORA")
	public String getTipoPessoa() {
		if(tipoPessoa!=null)
			return tipoPessoa.trim();
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	@XmlElement(name="CNPJ")
	public String getNumeroCNPJ() {
		if(numeroCNPJ!=null)
			return StringUtils.removeAll(numeroCNPJ, " ");
		return numeroCNPJ;
	}
	public void setNumeroCNPJ(String numeroCNPJ) {
		this.numeroCNPJ = numeroCNPJ;
	}
	@XmlElement(name="NOME")
	public String getNome() {
		if(nome!=null)
			return nome.trim();
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@XmlElement(name="ENDERECO")
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@XmlElement(name="CONTATOS")
	public Contatos getContatos() {
		return contatos;
	}
	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}
	
	@XmlElement(name="CPF")
	public String getNumeroCPF() {
		if(numeroCPF!=null)
			return StringUtils.removeAll(numeroCPF, " ");
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	
	

}
