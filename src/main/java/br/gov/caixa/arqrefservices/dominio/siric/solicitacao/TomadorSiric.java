package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="TOMADOR")
@XmlSeeAlso({ Filiacao.class, Identidade.class, Endereco.class,
	Rendas.class })

@XmlType(propOrder={"tipoPessoa", "numeroCPF", "nomeTomador", "dataNascimento", "indicativoSexo", 
		"numeroNacionalidade", "numeroNaturalidade", "filiacao", "identidade", 
		"numeroEstadoCivil", "numeroGrauInstrucao", "codigoCarteira", "endereco", "rendas"})
public class TomadorSiric implements Serializable {


	private static final long serialVersionUID = 8398012302699000756L;

	@Tamanho(tamanho = 1)
	private String tipoPessoa;
	
	@Tamanho(tamanho = 11)
	private String numeroCPF;
	
	@Tamanho(tamanho = 50)
	private String nomeTomador;
	
	@Tamanho(tamanho = 8)
	private String dataNascimento;
	
	@Tamanho(tamanho = 1)
	private String indicativoSexo;
	
	@Tamanho(tamanho = 1)
	private String numeroNacionalidade;
	
	@Tamanho(tamanho = 6)
	private String numeroNaturalidade;
	
	private Filiacao filiacao;
	
	private Identidade identidade;
	
	@Tamanho(tamanho = 1)
	private String numeroEstadoCivil;
	
	@Tamanho(tamanho = 2)
	private String numeroGrauInstrucao;
	
	@Tamanho(tamanho = 4)
	private String codigoCarteira;
	
	private Endereco endereco;
	
	private Rendas rendas;
	
	@XmlElement(name="TP_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	@XmlElement(name="CPF")
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	@XmlElement(name="NOME")
	public String getNomeTomador() {
		return nomeTomador;
	}
	public void setNomeTomador(String nomeTomador) {
		this.nomeTomador = nomeTomador;
	}
	@XmlElement(name="DT_NASCIMENTO")
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@XmlElement(name="SEXO")
	public String getIndicativoSexo() {
		return indicativoSexo;
	}
	public void setIndicativoSexo(String indicativoSexo) {
		this.indicativoSexo = indicativoSexo;
	}
	@XmlElement(name="NACIONALIDADE")
	public String getNumeroNacionalidade() {
		return numeroNacionalidade;
	}
	public void setNumeroNacionalidade(String numeroNacionalidade) {
		this.numeroNacionalidade = numeroNacionalidade;
	}
	@XmlElement(name="NATURALIDADE")
	public String getNumeroNaturalidade() {
		return numeroNaturalidade;
	}
	public void setNumeroNaturalidade(String numeroNaturalidade) {
		this.numeroNaturalidade = numeroNaturalidade;
	}
	@XmlElement(name="FILIACAO")
	public Filiacao getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(Filiacao filiacao) {
		this.filiacao = filiacao;
	}
	@XmlElement(name="IDENTIDADE")
	public Identidade getIdentidade() {
		return identidade;
	}
	public void setIdentidade(Identidade identidade) {
		this.identidade = identidade;
	}
	@XmlElement(name="ESTADO_CIVIL")
	public String getNumeroEstadoCivil() {
		return numeroEstadoCivil;
	}
	public void setNumeroEstadoCivil(String numeroEstadoCivil) {
		this.numeroEstadoCivil = numeroEstadoCivil;
	}
	@XmlElement(name="GRAU_INSTRUCAO")
	public String getNumeroGrauInstrucao() {
		return numeroGrauInstrucao;
	}
	public void setNumeroGrauInstrucao(String numeroGrauInstrucao) {
		this.numeroGrauInstrucao = numeroGrauInstrucao;
	}
	@XmlElement(name="CARTEIRA")
	public String getCodigoCarteira() {
		return codigoCarteira;
	}
	public void setCodigoCarteira(String codigoCarteira) {
		this.codigoCarteira = codigoCarteira;
	}
	@XmlElement(name="ENDERECO")
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@XmlElement(name="RENDAS")
	public Rendas getRendas() {
		return rendas;
	}
	public void setRendas(Rendas rendas) {
		this.rendas = rendas;
	}
	
	
}
