package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -7111083308947178542L;


	@Tamanho(tamanho = 70)
	private String nome;

	@Tamanho(tamanho = 8)
	private String codigoUsuario;

	@Tamanho(tamanho = 20)
	private String codigoUsuarioExterno;
	
	@Tamanho(tamanho = 4)
	private String codigoFuncaoRH;

	@Tamanho(tamanho = 3)
	private String codigoPerfilAplicacao;

	@Tamanho(tamanho = 4)
	private Integer numeroUnidadeLogado;

	@Tamanho(tamanho = 9)
	private Integer numeroNaturalLogado;

	@Tamanho(tamanho = 4)
	private Integer numeroNaturalLogado2;

	@Tamanho(tamanho = 4)
	private Integer numeroUnidadeOrigem;

	@Tamanho(tamanho = 9)
	private Integer numeroNaturalOrigem;

	@Tamanho(tamanho = 15)
	private String codigoTerminal;

	@Tamanho(tamanho = 13)
	private String matriculaEmpregado;

	@Tamanho(tamanho = 7)
	private String matricula;

	@Tamanho(tamanho = 8)
	private String codigoAplicacao;
	
	@Tamanho(tamanho = 1)
	private String indicadorUsuario;

	private Boolean perfilGestor;

	private Boolean perfilGestorSistema = false;

	private Boolean perfilGestorVeiculos = false;
	
	private Boolean perfilGerencialVeiculos = false;

	private Boolean perfilGestorCustomizada = false;

	private Boolean perfilGestorMatrizTaxas = false;
	
	private Boolean perfilGestorAgro = false;

	private Boolean usuarioExterno = false;
	
	private Boolean perfilGestorProdutoOperacional = false;
	
	private Boolean perfilGestorProdutoGerencial = false;
	
	private Boolean perfilGestorContabil = false;
	
	private Boolean perfilGerenteContabil = false;
	
	private Boolean perfilBasicoContabil = false;
	
	@Tamanho(tamanho = 11)
	private BigInteger cpfUsuario;

	private String cnpj;

	private String cpf;
	
	public Usuario() {

	}

	public Usuario(Integer numeroUnidadeLogado) {
		this.numeroUnidadeLogado = numeroUnidadeLogado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoUsuario() {
		if(codigoUsuario != null && codigoUsuario.indexOf("@") > 0){
			int str = codigoUsuario.trim().indexOf("@");
			if(str > 7){
				return codigoUsuario.trim().substring(0, 8);
			} else {
				return codigoUsuario.trim().substring(0, str);
			}
		}
			
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getCodigoUsuarioExterno() {
		return codigoUsuario;
	}

	public void setCodigoUsuarioExterno(String codigoUsuarioExterno) {
		this.codigoUsuario = codigoUsuarioExterno;
	}

	public String getCodigoFuncaoRH() {
		return codigoFuncaoRH;
	}

	public void setCodigoFuncaoRH(String codigoFuncaoRH) {
		this.codigoFuncaoRH = codigoFuncaoRH;
	}

	public String getCodigoPerfilAplicacao() {
		return codigoPerfilAplicacao;
	}

	public void setCodigoPerfilAplicacao(String codigoPerfilAplicacao) {
		this.codigoPerfilAplicacao = codigoPerfilAplicacao;
	}

	public Integer getNumeroUnidadeLogado() {
		return numeroUnidadeLogado;
	}

	public void setNumeroUnidadeLogado(Integer numeroUnidadeLogado) {
		this.numeroUnidadeLogado = numeroUnidadeLogado;
	}

	public Integer getNumeroNaturalLogado() {
		return numeroNaturalLogado;
	}

	public void setNumeroNaturalLogado(Integer numeroNaturalLogado) {
		this.numeroNaturalLogado = numeroNaturalLogado;
	}

	public Integer getNumeroUnidadeOrigem() {
		return numeroUnidadeOrigem;
	}

	public void setNumeroUnidadeOrigem(Integer numeroUnidadeOrigem) {
		this.numeroUnidadeOrigem = numeroUnidadeOrigem;
	}

	public Integer getNumeroNaturalOrigem() {
		return numeroNaturalOrigem;
	}

	public void setNumeroNaturalOrigem(Integer numeroNaturalOrigem) {
		this.numeroNaturalOrigem = numeroNaturalOrigem;
	}

	public String getCodigoTerminal() {
		return codigoTerminal;
	}

	public void setCodigoTerminal(String codigoTerminal) {
		this.codigoTerminal = codigoTerminal;
	}

	public Integer getNumeroNaturalLogado2() {
		return numeroNaturalLogado2;
	}

	public void setNumeroNaturalLogado2(Integer numeroNaturalLogado2) {
		this.numeroNaturalLogado2 = numeroNaturalLogado2;
	}

	public String getMatriculaEmpregado() {
		return matriculaEmpregado;
	}

	public void setMatriculaEmpregado(String matriculaEmpregado) {
		this.matriculaEmpregado = matriculaEmpregado;
	}

	public Boolean getPerfilGestor() {
		return perfilGestor;
	}

	public void setPerfilGestor(Boolean perfilGestor) {
		this.perfilGestor = perfilGestor;
	}

	public String getCodigoAplicacao() {
		return codigoAplicacao;
	}

	public void setCodigoAplicacao(String codigoAplicacao) {
		this.codigoAplicacao = codigoAplicacao;
	}

	public BigInteger getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(BigInteger cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Boolean getPerfilGestorCustomizada() {
		return perfilGestorCustomizada;
	}

	public void setPerfilGestorCustomizada(Boolean perfilGestorCustomizada) {
		this.perfilGestorCustomizada = perfilGestorCustomizada;
	}

	public Boolean getPerfilGestorMatrizTaxas() {
		return perfilGestorMatrizTaxas;
	}

	public void setPerfilGestorMatrizTaxas(Boolean perfilGestorMatrizTaxas) {
		this.perfilGestorMatrizTaxas = perfilGestorMatrizTaxas;
	}

	public Boolean getUsuarioExterno() {
		return usuarioExterno;
	}

	public void setUsuarioExterno(Boolean usuarioExterno) {
		this.usuarioExterno = usuarioExterno;
	}
	
	public Boolean getPerfilGestorProdutoOperacional() {
		return this.perfilGestorProdutoOperacional;
	}

	public void setPerfilGestorProdutoOperacional(Boolean perfilGestorProdutoOperacional) {
		this.perfilGestorProdutoOperacional = perfilGestorProdutoOperacional;
	}

	public Boolean getPerfilGestorProdutoGerencial() {
		return this.perfilGestorProdutoGerencial;
	}

	public void setPerfilGestorProdutoGerencial(Boolean perfilGestorProdutoGerencial) {
		this.perfilGestorProdutoGerencial = perfilGestorProdutoGerencial;
	}

	public Boolean getPerfilGestorSistema() {
		return perfilGestorSistema;
	}

	public void setPerfilGestorSistema(Boolean perfilGestorSistema) {
		this.perfilGestorSistema = perfilGestorSistema;
	}

	public Boolean getPerfilGerencialVeiculos() {
		return perfilGerencialVeiculos;
	}

	public void setPerfilGerencialVeiculos(Boolean perfilGerencialVeiculos) {
		this.perfilGerencialVeiculos = perfilGerencialVeiculos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getPerfilGestorAgro() {
		return perfilGestorAgro;
	}

	public void setPerfilGestorAgro(Boolean perfilGestorAgro) {
		this.perfilGestorAgro = perfilGestorAgro;
	}

	public Boolean getPerfilGestorVeiculos() {
		return perfilGestorVeiculos;
	}

	public void setPerfilGestorVeiculos(Boolean perfilGestorVeiculos) {
		this.perfilGestorVeiculos = perfilGestorVeiculos;
	}
	
	public String getIndicadorUsuario() {
		return indicadorUsuario;
	}

	public void setIndicadorUsuario(String indicadorUsuario) {
		this.indicadorUsuario = indicadorUsuario;
	}

	public Boolean getPerfilGestorContabil() {
		return perfilGestorContabil;
	}

	public void setPerfilGestorContabil(Boolean perfilGestorContabil) {
		this.perfilGestorContabil = perfilGestorContabil;
	}

	public Boolean getPerfilGerenteContabil() {
		return perfilGerenteContabil;
	}

	public void setPerfilGerenteContabil(Boolean perfilGerenteContabil) {
		this.perfilGerenteContabil = perfilGerenteContabil;
	}

	public Boolean getPerfilBasicoContabil() {
		return perfilBasicoContabil;
	}

	public void setPerfilBasicoContabil(Boolean perfilBasicoContabil) {
		this.perfilBasicoContabil = perfilBasicoContabil;
	}
}
