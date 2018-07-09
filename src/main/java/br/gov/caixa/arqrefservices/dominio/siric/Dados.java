package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.TomadorSiric;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="DADOS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = { "tomador","coobrigado","dadosOperacao","quadroValores","relacionamentos", "avalicaoComAtualizacaoViaSICLI",
		"protocolo", "excecao", "avaliacao",
		"errosValidacao","dadosOperacaoConsulta","dadosOperacaoRelatorio","cpfCliente","matriculaUsuario","codigoAvaliacao" })
public class Dados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287356216510511758L;
	
	private List<ErrosValidacao> errosValidacao;
	
	private Avaliacao avaliacao;
	
	private String excecao;
	
	private Protocolo protocolo;
	
	private TomadorSiric tomador;
	
	private Coobrigado coobrigado;
	
	private DadosOperacao dadosOperacao;
	
	private DadosOperacao dadosOperacaoConsulta;
	
	private DadosOperacao dadosOperacaoRelatorio;
	
	private QuadroValores quadroValores;
	
	private Relacionamentos relacionamentos;
	
	private AvalicaoComAtualizacaoViaSICLI avalicaoComAtualizacaoViaSICLI;
	
	//Atributos utilizados para cancelar 
		//avaliacao de risco de credito
		
	private String cpfCliente;

	private String matriculaUsuario;

	private String codigoAvaliacao;

	@XmlElement(name="ERROS_VALIDACAO")
	public List<ErrosValidacao> getErrosValidacao() {
		return errosValidacao;
	}

	public void setErrosValidacao(List<ErrosValidacao> errosValidacao) {
		this.errosValidacao = errosValidacao;
	}

	@XmlElement(name="AVALIACAO")
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	@XmlElement(name="EXCECAO")
	public String getExcecao() {
		return excecao;
	}

	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}

	@XmlElement(name="PROTOCOLO")
	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}	

	@XmlElement(name="TOMADOR")
	public TomadorSiric getTomador() {
		return tomador;
	}

	public void setTomador(TomadorSiric tomador) {
		this.tomador = tomador;
	}

	@XmlElement(name="COOBRIGADO")
	public Coobrigado getCoobrigado() {
		return coobrigado;
	}

	public void setCoobrigado(Coobrigado coobrigado) {
		this.coobrigado = coobrigado;
	}	

	@XmlElement(name="DADOS_OPERACAO")
	public DadosOperacao getDadosOperacao() {
		return dadosOperacao;
	}

	public void setDadosOperacao(DadosOperacao dadosOperacao) {
		this.dadosOperacao = dadosOperacao;
	}	

	@XmlElement(name="CONSULTA")
	public DadosOperacao getDadosOperacaoConsulta() {
		return dadosOperacaoConsulta;
	}

	public void setDadosOperacaoConsulta(DadosOperacao dadosOperacaoConsulta) {
		this.dadosOperacaoConsulta = dadosOperacaoConsulta;
	}

	@XmlElement(name="RELATORIO_AVALIACAO")
	public DadosOperacao getDadosOperacaoRelatorio() {
		return dadosOperacaoRelatorio;
	}

	public void setDadosOperacaoRelatorio(DadosOperacao dadosOperacaoRelatorio) {
		this.dadosOperacaoRelatorio = dadosOperacaoRelatorio;
	}

	@XmlElement(name="QUADRO_VALORES")
	public QuadroValores getQuadroValores() {
		return quadroValores;
	}

	public void setQuadroValores(QuadroValores quadroValores) {
		this.quadroValores = quadroValores;
	}

	@XmlElement(name="RELACIONAMENTOS")
	public Relacionamentos getRelacionamentos() {
		return relacionamentos;
	}

	public void setRelacionamentos(Relacionamentos relacionamentos) {
		this.relacionamentos = relacionamentos;
	}

	@XmlElement(name="AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
	public AvalicaoComAtualizacaoViaSICLI getAvalicaoComAtualizacaoViaSICLI() {
		return avalicaoComAtualizacaoViaSICLI;
	}

	public void setAvalicaoComAtualizacaoViaSICLI(
			AvalicaoComAtualizacaoViaSICLI avalicaoComAtualizacaoViaSICLI) {
		this.avalicaoComAtualizacaoViaSICLI = avalicaoComAtualizacaoViaSICLI;
	}
	
	@XmlElement(name="CPF")
	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	@XmlElement(name="CODIGO_USUARIO")
	public String getMatriculaUsuario() {
		return matriculaUsuario;
	}

	public void setMatriculaUsuario(String matriculaUsuario) {
		this.matriculaUsuario = matriculaUsuario;
	}

	@XmlElement(name="CODIGO_AVALIACAO")
	public String getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	@Override
	public String toString() {
		return "Dados [errosValidacao=" + errosValidacao + ", avaliacao="
				+ avaliacao + ", excecao=" + excecao + ", protocolo="
				+ protocolo + ", tomador=" + tomador + ", coobrigado="
				+ coobrigado + ", dadosOperacao=" + dadosOperacao
				+ ", dadosOperacaoConsulta=" + dadosOperacaoConsulta
				+ ", dadosOperacaoRelatorio=" + dadosOperacaoRelatorio
				+ ", quadroValores=" + quadroValores + ", relacionamentos="
				+ relacionamentos + ", avalicaoComAtualizacaoViaSICLI="
				+ avalicaoComAtualizacaoViaSICLI + ", cpfCliente=" + cpfCliente
				+ ", matriculaUsuario=" + matriculaUsuario
				+ ", codigoAvaliacao=" + codigoAvaliacao + "]";
	}
	
	

	

}
