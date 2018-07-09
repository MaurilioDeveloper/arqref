package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.AvaliacaoRisco;
import br.gov.caixa.arqrefservices.dominio.AvaliacaoRiscoSICLI;
import br.gov.caixa.arqrefservices.dominio.DadosOperacao;
import br.gov.caixa.arqrefservices.dominio.ErroSIRIC;
import br.gov.caixa.arqrefservices.dominio.ProtocoloAvaliacaoRisco;
import br.gov.caixa.arqrefservices.dominio.QuadroValores;
import br.gov.caixa.arqrefservices.dominio.Relacionamentos;
/**
 * Classe que traz o dados da mensagem do SIRIC
 * @author c110503
 *
 */
@XmlRootElement(name="DADOS")
@XmlType(propOrder = { "dadosOperacao","quadroValores","relacionamentos", "avaliacaoRiscoSICLI",
		"protocoloAvaliacaoRisco", "excecao", "avaliacaoRisco",
		"listaErroValidacao","dadosOperacaoConsulta","dadosOperacaoRelatorio","cpfCliente","matriculaUsuario","codigoAvaliacao" })
public class DadosSIRIC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6450013416842354388L;
	
	private DadosOperacao dadosOperacao;
	
	private QuadroValores quadroValores;
	
	private Relacionamentos relacionamentos;
	
	private DadosOperacao dadosOperacaoConsulta;
	
	private DadosOperacao dadosOperacaoRelatorio;
	
	//AVALICAO DE RISCO COM ATUALIZACAO DO SICLI
	private AvaliacaoRiscoSICLI avaliacaoRiscoSICLI;
	
	private ProtocoloAvaliacaoRisco  protocoloAvaliacaoRisco;
	
	private AvaliacaoRisco avaliacaoRisco;
	
	private String excecao;
	
	private List<ErroSIRIC> listaErroValidacao;
	
	//Atributos utilizados para cancelar 
	//avaliacao de risco de credito
	
	private String cpfCliente;
	
	private String matriculaUsuario;
	
	private String codigoAvaliacao;

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

	@XmlElement(name="AVALIACAO_COM_ATUALIZACAO_VIA_SICLI")
	public AvaliacaoRiscoSICLI getAvaliacaoRiscoSICLI() {
		return avaliacaoRiscoSICLI;
	}

	public void setAvaliacaoRiscoSICLI(AvaliacaoRiscoSICLI avaliacaoRiscoSICLI) {
		this.avaliacaoRiscoSICLI = avaliacaoRiscoSICLI;
	}
	
	@XmlElement(name = "PROTOCOLO")
	public ProtocoloAvaliacaoRisco getProtocoloAvaliacaoRisco() {
		return protocoloAvaliacaoRisco;
	}
	public void setProtocoloAvaliacaoRisco(
			ProtocoloAvaliacaoRisco protocoloAvaliacaoRisco) {
		this.protocoloAvaliacaoRisco = protocoloAvaliacaoRisco;
	}
	
	@XmlElement(name="EXCECAO")
	public String getExcecao() {
		return this.excecao;
	}
	
	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}	
	
	@XmlElement(name="AVALIACAO")
	public AvaliacaoRisco getAvaliacaoRisco() {
		return avaliacaoRisco;
	}
	public void setAvaliacaoRisco(AvaliacaoRisco avaliacaoRisco) {
		this.avaliacaoRisco = avaliacaoRisco;
	}
	
	@XmlElement(name="ERROS_VALIDACAO")
	public List<ErroSIRIC> getListaErroValidacao() {
		return listaErroValidacao;
	}
	public void setListaErroValidacao(List<ErroSIRIC> listaErroValidacao) {
		this.listaErroValidacao = listaErroValidacao;
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
		return "DadosSIRIC [dadosOperacao=" + dadosOperacao
				+ ", quadroValores=" + quadroValores + ", relacionamentos="
				+ relacionamentos + ", dadosOperacaoConsulta="
				+ dadosOperacaoConsulta + ", dadosOperacaoRelatorio="
				+ dadosOperacaoRelatorio + ", avaliacaoRiscoSICLI="
				+ avaliacaoRiscoSICLI + ", protocoloAvaliacaoRisco="
				+ protocoloAvaliacaoRisco + ", avaliacaoRisco="
				+ avaliacaoRisco + ", excecao=" + excecao
				+ ", listaErroValidacao=" + listaErroValidacao
				+ ", cpfCliente=" + cpfCliente + ", matriculaUsuario="
				+ matriculaUsuario + ", codigoAvaliacao=" + codigoAvaliacao
				+ "]";
	}
	
	
	
	
	
	

}
