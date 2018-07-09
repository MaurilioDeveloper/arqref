package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class FuncaoEmpregado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5597132005954326485L;

	private String codigo;
	
	private String descricao;
	
	private String sigla;
	
	private String dataInicio;
	
	private String dataFim;
	
	private TipoFuncaoEmpregado tipoFuncaoEmpregado;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public TipoFuncaoEmpregado getTipoFuncaoEmpregado() {
		return tipoFuncaoEmpregado;
	}

	public void setTipoFuncaoEmpregado(TipoFuncaoEmpregado tipoFuncaoEmpregado) {
		this.tipoFuncaoEmpregado = tipoFuncaoEmpregado;
	}
	
	
}
