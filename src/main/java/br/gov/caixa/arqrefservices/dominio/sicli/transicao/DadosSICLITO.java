package br.gov.caixa.arqrefservices.dominio.sicli.transicao;

import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.barramento.Filtros;

/**
 * Classe de transicao para encapsular obejtos distintos do SICLI.
 * 
 * @author c110503
 * 
 */
public class DadosSICLITO {

	private Correlation correlation;

	private Empregado empregado;

	private String tipoPesquisa;
	
	private String cnpj;
	
	private String cocli;

	private String cpf;
	
	private String cnpjSIISO;

	private Filtros filtros;
	
	private String codigoUsuario;
	
	private String numeroUnidade;

	public Correlation getCorrelation() {
		return correlation;
	}

	public void setCorrelation(Correlation correlation) {
		this.correlation = correlation;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public String getTipoPesquisa() {
		return tipoPesquisa;
	}

	public void setTipoPesquisa(String tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Filtros getFiltros() {
		return filtros;
	}

	public void setFiltros(Filtros filtros) {
		this.filtros = filtros;
	}

	@Override
	public String toString() {
		return "DadosSICLITO [correlation=" + correlation + ", empregado="
				+ empregado + ", tipoPesquisa=" + tipoPesquisa + ", filtros="
				+ filtros + ", cpf=" + cpf + ", cnpj=" + cnpj + ", cocli=" + cocli + ", cnpjSIISO=" + cnpjSIISO +"]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCocli() {
		return cocli;
	}

	public void setCocli(String cocli) {
		this.cocli = cocli;
	}

	public String getCnpjSIISO() {
		return cnpjSIISO;
	}

	public void setCnpjSIISO(String cnpjSIISO) {
		this.cnpjSIISO = cnpjSIISO;
	}

	public String getNumeroUnidade() {
		return numeroUnidade;
	}

	public void setNumeroUnidade(String numeroUnidade) {
		this.numeroUnidade = numeroUnidade;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

}
