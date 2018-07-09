package br.gov.caixa.arqrefservices.dominio.siric.transicao;

import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.siric.Dados;

/**
 * Classe de transicao para
 * encapsular obejtos distintos do SIRIC.
 * @author c110503
 *
 */
public class DadosSIRICTO {
	
	private Correlation correlation;
	
	private Empregado empregado;
	
	private Dados dados;
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}

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

	@Override
	public String toString() {
		return "DadosSIRICTO [correlation=" + correlation + ", empregado="
				+ empregado + ", dados=" + dados + ", cpf=" + cpf + "]";
	}
	

}
