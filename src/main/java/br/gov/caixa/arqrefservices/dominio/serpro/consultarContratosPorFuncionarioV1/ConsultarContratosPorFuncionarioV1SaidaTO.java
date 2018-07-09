package br.gov.caixa.arqrefservices.dominio.serpro.consultarContratosPorFuncionarioV1;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.serpro.to.DadosAutorizacao;

@XmlRootElement(name="response")
public class ConsultarContratosPorFuncionarioV1SaidaTO implements Serializable {


	private static final long serialVersionUID = 925496319863446780L;

	@XmlAttribute(name = "soapenv:encodingStyle")
	private String soapenv_encodingStyle = "http://schemas.xmlsoap.org/soap/encoding/";
	
	/**
	 * Código Empresa
	 */
	private String cdEmpresa;
	
	/**
	 * Descrição Empresa
	 */
	private String dsEmpresa;
	
	/**
	 * Código órgão
	 */
	private String cdOrgao;
	
	/**
	 * descrição órgão
	 */
	private String dsOrgao;
	
	/**
	 *  Matricula do servidor
	 */
	private String cdMatricula;
	
	/**
	 * CPF do servidor
	 */
	private String nrCpfServidor;
	
	/**
	 * Nome do Servidor
	 */
	private String nmServidor;
	
	/**
	 * Código Situação servidor
	 */
	private String cdSitServ;
	
	/**
	 * Descrição Situação Servidor
	 */
	private String dsSitServ;
	
	/**
	 * Código classe servidor
	 */
	private String cdClasseServ;
	
	/**
	 * Descrição classe servidor.
	 */
	private String dsClasseServ;
	

	/**
	 * Dados da Autorização
	 */
	private List<DadosAutorizacao> dadosAutorizacao;

	/**
	 * Código de retorno
	 */
	private String cdRetCode;
	
	/**
	 * Mensagem de Retorno.
	 */
	private String dsRetCode;


	@XmlElement(name="cd_empresa")
	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	@XmlElement(name="ds_empresa")
	public String getDsEmpresa() {
		return dsEmpresa;
	}

	public void setDsEmpresa(String dsEmpresa) {
		this.dsEmpresa = dsEmpresa;
	}

	@XmlElement(name="cd_orgao")
	public String getCdOrgao() {
		return cdOrgao;
	}

	public void setCdOrgao(String cdOrgao) {
		this.cdOrgao = cdOrgao;
	}

	@XmlElement(name="ds_orgao")
	public String getDsOrgao() {
		return dsOrgao;
	}

	public void setDsOrgao(String dsOrgao) {
		this.dsOrgao = dsOrgao;
	}

	@XmlElement(name="cd_matricula")
	public String getCdMatricula() {
		return cdMatricula;
	}

	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	@XmlElement(name="nr_cpf_servidor")
	public String getNrCpfServidor() {
		return nrCpfServidor;
	}

	public void setNrCpfServidor(String nrCpfServidor) {
		this.nrCpfServidor = nrCpfServidor;
	}

	@XmlElement(name="nm_servidor")
	public String getNmServidor() {
		return nmServidor;
	}

	public void setNmServidor(String nmServidor) {
		this.nmServidor = nmServidor;
	}

	@XmlElement(name="cd_sit_serv")
	public String getCdSitServ() {
		return cdSitServ;
	}

	public void setCdSitServ(String cdSitServ) {
		this.cdSitServ = cdSitServ;
	}

	@XmlElement(name="ds_sit_serv")
	public String getDsSitServ() {
		return dsSitServ;
	}

	public void setDsSitServ(String dsSitServ) {
		this.dsSitServ = dsSitServ;
	}

	@XmlElement(name="cd_classe_serv")
	public String getCdClasseServ() {
		return cdClasseServ;
	}

	public void setCdClasseServ(String cdClasseServ) {
		this.cdClasseServ = cdClasseServ;
	}

	@XmlElement(name="ds_classe_serv")
	public String getDsClasseServ() {
		return dsClasseServ;
	}

	public void setDsClasseServ(String dsClasseServ) {
		this.dsClasseServ = dsClasseServ;
	}

	@XmlElement(name="dados_autorizacao")
	public List<DadosAutorizacao> getDadosAutorizacao() {
		return dadosAutorizacao;
	}

	public void setDadosAutorizacao(List<DadosAutorizacao> dadosAutorizacao) {
		this.dadosAutorizacao = dadosAutorizacao;
	}


	@XmlElement(name="cd_ret_code")
	public String getCdRetCode() {
		return cdRetCode;
	}

	
	public void setCdRetCode(String cdRetCode) {
		this.cdRetCode = cdRetCode;
	}

	@XmlElement(name="ds_ret_code")
	public String getDsRetCode() {
		return dsRetCode;
	}

	public void setDsRetCode(String dsRetCode) {
		this.dsRetCode = dsRetCode;
	}
	
}
