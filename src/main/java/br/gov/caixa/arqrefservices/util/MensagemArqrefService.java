package br.gov.caixa.arqrefservices.util;

import java.util.List;

import br.gov.caixa.arqrefcore.excecao.mensagem.Message;

public class MensagemArqrefService implements Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5652614338095843183L;
	private String sistema = "ARQREF SERVICE";
	
	private String origemErro;
	private String paragrafoErro;
	private String categoriaErro;
	private String codigoErro;
	private List<String> mensagemNegocial;
	private List<String> mensagemErro;
	private int severidade;
	private String severidadeDescricao;
	private String informacoesAdicionais;
	
	public String getSistema() {
		return sistema;
	}

	public String getOrigemErro() {
		return origemErro;
	}

	public String getParagrafoErro() {
		return paragrafoErro;
	}

	public String getCategoriaErro() {
		return categoriaErro;
	}

	public String getCodigoErro() {
		return codigoErro;
	}

	public List<String> getMensagemNegocial() {
		return mensagemNegocial;
	}

	public List<String> getMensagemErro() {
		return mensagemErro;
	}

	public int getSeveridade() {
		return severidade;
	}

	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}
	
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public void setOrigemErro(String origemErro) {
		this.origemErro = origemErro;
	}

	public void setParagrafoErro(String paragrafoErro) {
		this.paragrafoErro = paragrafoErro;
	}

	public void setCategoriaErro(String categoriaErro) {
		this.categoriaErro = categoriaErro;
	}

	public void setCodigoErro(String codigoErro) {
		this.codigoErro = codigoErro;
	}

	public void setMensagemNegocial(List<String> mensagemNegocial) {
		this.mensagemNegocial = mensagemNegocial;
	}

	public void setMensagemErro(List<String> mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public void setSeveridade(int severidade) {
		this.severidade = severidade;
	}
	
	public String getSeveridadeDescricao() {
		return this.severidadeDescricao;
	}
	public void setSeveridadeDescricao(String severidadeDescricao) {
		this.severidadeDescricao = severidadeDescricao;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	@Override
	public String toString() {
		return "MensagemArqrefService [origemErro=" + origemErro
				+ ", paragrafoErro=" + paragrafoErro + ", categoriaErro="
				+ categoriaErro + ", codigoErro=" + codigoErro
				+ ", mensagemNegocial=" + mensagemNegocial + ", mensagemErro="
				+ mensagemErro + ", severidade=" + severidade
				+ ", informacoesAdicionais=" + informacoesAdicionais + "]";
	}
	
	
	
	

}
