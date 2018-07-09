package br.gov.caixa.arqrefservices.dominio.serpro.encerrarContrato;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="urn:encerrarContrato")
@XmlType(
		propOrder={
			"cdCia", "cdEmpresa", "cdOrgao", "cdMatricula", "orgMatInst", 
			"nrCpfA", "cdConsigA", "cdSenhaConsig", "cdUsuario", 
			"nrContrato", "dsLivre"
		})
public class EncerrarContratoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cdCia;
	
	private String cdConsigA;
	
	private String cdEmpresa;
	
	private String cdMatricula;
	
	private String cdOrgao;
	
	private String cdSenhaConsig;
	
	private String cdUsuario;
	
	private String dsLivre;
	
	private String nrContrato;
	
	private String nrCpfA;
	
	private String orgMatInst;
	
	@XmlElement(name="CD_CIA", type=String.class)
	public String getCdCia() {
		return cdCia;
	}

	@XmlElement(name="CD_CONSIG_A", type=String.class)
	public String getCdConsigA() {
		return cdConsigA;
	}

	@XmlElement(name="CD_EMPRESA", type=String.class)
	public String getCdEmpresa() {
		return cdEmpresa;
	}

	@XmlElement(name="CD_MATRICULA", type=String.class)
	public String getCdMatricula() {
		return cdMatricula;
	}

	@XmlElement(name="CD_ORGAO", type=String.class)
	public String getCdOrgao() {
		return cdOrgao;
	}

	@XmlElement(name="CD_SENHA_CONSIG", type=String.class)
	public String getCdSenhaConsig() {
		return cdSenhaConsig;
	}

 	@XmlElement(name="CD_USUARIO", type=String.class)
	public String getCdUsuario() {
		return cdUsuario;
	}

	@XmlElement(name="DS_LIVRE", type=String.class)
	public String getDsLivre() {
		return dsLivre;
	}

	@XmlElement(name="NR_CONTRATO", type=String.class)
	public String getNrContrato() {
		return nrContrato;
	}

	@XmlElement(name="NR_CPF_A", type=String.class)
	public String getNrCpfA() {
		return nrCpfA;
	}

	@XmlElement(name="ORG_MAT_INST", type=String.class)
	public String getOrgMatInst() {
		return orgMatInst;
	}

	public void setCdCia(String cdCia) {
		this.cdCia = cdCia;
	}

	public void setCdConsigA(String cdConsigA) {
		this.cdConsigA = cdConsigA;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	public void setCdOrgao(String cdOrgao) {
		this.cdOrgao = cdOrgao;
	}

	public void setCdSenhaConsig(String cdSenhaConsig) {
		this.cdSenhaConsig = cdSenhaConsig;
	}

	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public void setDsLivre(String dsLivre) {
		this.dsLivre = dsLivre;
	}
	
	public void setNrContrato(String nrContrato) {
		this.nrContrato = nrContrato;
	}

	public void setNrCpfA(String nrCpfA) {
		this.nrCpfA = nrCpfA;
	}

	public void setOrgMatInst(String orgMatInst) {
		this.orgMatInst = orgMatInst;
	}

}