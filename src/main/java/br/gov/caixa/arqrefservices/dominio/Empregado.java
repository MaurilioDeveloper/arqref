package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Classe utilizada pela consulta dados do empregado CAIXA
 * 
 * @author c110503
 * @version 1.0.0.1
 * 
 */
@Entity
@Table(name = "FECVW001_EMPREGADO")
public class Empregado implements Serializable {

	private static final long serialVersionUID = -4987614505768776023L;

	@Id
	@Column(name = "NU_MATRICULA")
	private Integer numeroMatricula;

	@Column(name = "NU_DV_MATRICULA")
	private int numeroDvMatricula;

	@Column(name = "NO_PESSOA")
	private String nomePessoa;

	@Column(name = "DT_PRVSA_DSLGO")
	private Date dataPrevisaoDesligamento;

	@Column(name = "NU_UNIDADE_U24")
	private Integer numeroUnidade;

	@Column(name = "NU_NATURAL_U24")
	private Integer numeroNatural;

	@Column(name = "NU_FUNCAO_H03")
	private Integer numeroFuncao;

	@Column(name = "CO_CARGO_H05")
	private String codigoCargo;

	@Column(name = "NU_CPF_EMPREGADO")
	private BigDecimal numeroCpfEmpregado;

	@Column(name = "NU_UNDDE_ALCCO_U24")
	private Integer numeroUnidadeAlocacao;

	@Column(name = "NU_NTRL_ALCCO_U24")
	private Integer numeroNaturalAlocacao;

	@Transient
	private String numeroIP;

	@Transient
	private Integer numeroPerfilNav;

	@Transient
	private String matriculaUsuario;

	// ATRIBUTOS DE ORIGEM DO LDAP

	@Transient
	private String nis;

	@Transient
	private String cnpj;

	@Transient
	private String dataNascimento;

	@Transient
	private String email;

	@Transient
	private String nomeMae;

	@Transient
	private String cpf;
	
	@Transient
	private String matricula;

	public Integer getNumeroMatricula() {
		return this.numeroMatricula;
	}

	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Integer getNumeroDvMatricula() {
		return this.numeroDvMatricula;
	}

//	public void setNumeroDvMatricula(Integer numeroDvMatricula) {
//		this.numeroDvMatricula = numeroDvMatricula;
//	}

	public String getNomePessoa() {
		return this.nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	@XmlTransient
	public Date getDataPrevisaoDesligamento() {
		return this.dataPrevisaoDesligamento;
	}

	public void setDataPrevisaoDesligamento(Date dataPrevisaoDesligamento) {
		this.dataPrevisaoDesligamento = dataPrevisaoDesligamento;
	}

	public Integer getNumeroUnidade() {
		return this.numeroUnidade;
	}

	public void setNumeroUnidade(Integer numeroUnidade) {
		this.numeroUnidade = numeroUnidade;
	}

	public Integer getNumeroNatural() {
		return this.numeroNatural;
	}

	public void setNumeroNatural(Integer numeroNatural) {
		this.numeroNatural = numeroNatural;
	}

	public Integer getNumeroFuncao() {
		return this.numeroFuncao;
	}

	public void setNumeroFuncao(Integer numeroFuncao) {
		this.numeroFuncao = numeroFuncao;
	}

	public String getCodigoCargo() {
		return this.codigoCargo;
	}

	public void setCodigoCargo(String codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	public BigDecimal getNumeroCpfEmpregado() {
		return this.numeroCpfEmpregado;
	}

	public void setNumeroCpfEmpregado(BigDecimal numeroCpfEmpregado) {
		this.numeroCpfEmpregado = numeroCpfEmpregado;
	}

	@XmlAttribute(name="CO-AGENCIA")
	public Integer getNumeroUnidadeAlocacao() {
		return this.numeroUnidadeAlocacao;
	}

	public void setNumeroUnidadeAlocacao(Integer numeroUnidadeAlocacao) {
		this.numeroUnidadeAlocacao = numeroUnidadeAlocacao;
	}

	public Integer getNumeroNaturalAlocacao() {
		return this.numeroNaturalAlocacao;
	}

	public void setNumeroNaturalAlocacao(Integer numeroNaturalAlocacao) {
		this.numeroNaturalAlocacao = numeroNaturalAlocacao;
	}

	public String getNumeroIP() {
		return this.numeroIP;
	}

	public void setNumeroIP(String numeroIP) {
		this.numeroIP = numeroIP;
	}

	public Integer getNumeroPerfilNav() {
		return this.numeroPerfilNav;
	}

	public void setNumeroPerfilNav(Integer numeroPerfilNav) {
		this.numeroPerfilNav = numeroPerfilNav;
	}

	public void setNumeroDvMatricula(int numeroDvMatricula) {
		this.numeroDvMatricula = numeroDvMatricula;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatriculaUsuario() {
		return matriculaUsuario;
	}

	public void setMatriculaUsuario(String matriculaUsuario) {
		this.matriculaUsuario = matriculaUsuario;
	}

	@XmlAttribute(name="CO-USUARIO")
	public String getMatricula() {
		if(this.numeroMatricula != null){
			String numeroMatriculaTmp = this.numeroMatricula.toString();
			//verifica para caso de 099999
			if(numeroMatriculaTmp.length() < 6){
				//completa matricula com 0
				for(int x = numeroMatriculaTmp.length(); x < 6 ; x++ ){
					numeroMatriculaTmp = "0" + numeroMatriculaTmp;					
				}
				
			}
			return "C" + numeroMatriculaTmp;
		}
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Empregado [numeroMatricula=" + numeroMatricula
				+ ", numeroDvMatricula=" + numeroDvMatricula + ", nomePessoa="
				+ nomePessoa + ", dataPrevisaoDesligamento="
				+ dataPrevisaoDesligamento + ", numeroUnidade=" + numeroUnidade
				+ ", numeroNatural=" + numeroNatural + ", numeroFuncao="
				+ numeroFuncao + ", codigoCargo=" + codigoCargo
				+ ", numeroCpfEmpregado=" + numeroCpfEmpregado
				+ ", numeroUnidadeAlocacao=" + numeroUnidadeAlocacao
				+ ", numeroNaturalAlocacao=" + numeroNaturalAlocacao
				+ ", numeroIP=" + numeroIP + ", numeroPerfilNav="
				+ numeroPerfilNav + ", nis=" + nis + ", cnpj=" + cnpj
				+ ", dataNascimento=" + dataNascimento + ", email=" + email
				+ ", nomeMae=" + nomeMae + ", cpf=" + cpf + ", matricula="
				+ matricula + "]";
	}
	
}
