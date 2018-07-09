package br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="urn:consultarVinculoMargemPorCPF")
@XmlType(
		propOrder={
			"cdCia", "cdEmpresa", "cdOrgao", "nrCNPJOrgao", "nrCpfA", 
			"cdConsig", "cdSenhaConsig", "cdIdServ", "cdOrigemTrans",
			"cdSenhaServidor", "inRegHold", "cdTranHoldServ"
		})

public class ConsultarVinculoMargemPorCPFDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String cdCia;
	
	private String cdConsig;
	
	private String cdEmpresa;
	
	private String cdIdServ;
	
	private String cdOrgao;
	
	private String cdOrigemTrans;
	
	private String cdSenhaConsig;
	
	private String cdSenhaServidor;
	
	private String cdTranHoldServ;
	
	private String inRegHold;
	
	private String nrCNPJOrgao;
	
	private String nrCpfA;
	
	
	@XmlElement(name="CD_CIA", type=String.class)
	public String getCdCia() {
		return cdCia;
	}

	@XmlElement(name="CD_CONSIG", type=String.class)
	public String getCdConsig() {
		return cdConsig;
	}

	@XmlElement(name="CD_EMPRESA", type=String.class)
	public String getCdEmpresa() {
		return cdEmpresa;
	}

	@XmlElement(name="CD_ID_SERV", type=String.class)
	public String getCdIdServ() {
		return cdIdServ;
	}

	@XmlElement(name="CD_ORGAO", type=String.class)
	public String getCdOrgao() {
		return cdOrgao;
	}

	@XmlElement(name="CD_ORIGEM_TRANS", type=String.class)
	public String getCdOrigemTrans() {
		return cdOrigemTrans;
	}

	@XmlElement(name="CD_SENHA_CONSIG", type=String.class)
	public String getCdSenhaConsig() {
		return cdSenhaConsig;
	}

	@XmlElement(name="CD_SENHA_SERVIDOR", type=String.class)
	public String getCdSenhaServidor() {
		return cdSenhaServidor;
	}

	@XmlElement(name="CD_TRAN_HOLD_SERV", type=String.class)
	public String getCdTranHoldServ() {
		return cdTranHoldServ;
	}

	@XmlElement(name="IN_REG_HOLD", type=String.class)
	public String getInRegHold() {
		return inRegHold;
	}

	@XmlElement(name="NR_CNPJ_ORGAO", type=String.class)
	public String getNrCNPJOrgao() {
		return nrCNPJOrgao;
	}

	@XmlElement(name="NR_CPF_A", type=String.class)
	public String getNrCpfA() {
		return nrCpfA;
	}

	public void setCdCia(String cdCia) {
		this.cdCia = cdCia;
	}

	public void setCdConsig(String cdConsig) {
		this.cdConsig = cdConsig;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public void setCdIdServ(String cdIdServ) {
		this.cdIdServ = cdIdServ;
	}

	public void setCdOrgao(String cdOrgao) {
		this.cdOrgao = cdOrgao;
	}

	public void setCdOrigemTrans(String cdOrigemTrans) {
		this.cdOrigemTrans = cdOrigemTrans;
	}

	public void setCdSenhaConsig(String cdSenhaConsig) {
		this.cdSenhaConsig = cdSenhaConsig;
	}

	public void setCdSenhaServidor(String cdSenhaServidor) {
		this.cdSenhaServidor = cdSenhaServidor;
	}

	public void setCdTranHoldServ(String cdTranHoldServ) {
		this.cdTranHoldServ = cdTranHoldServ;
	}

	public void setInRegHold(String inRegHold) {
		this.inRegHold = inRegHold;
	}

	public void setNrCNPJOrgao(String nrCNPJOrgao) {
		this.nrCNPJOrgao = nrCNPJOrgao;
	}

	public void setNrCpfA(String nrCpfA) {
		this.nrCpfA = nrCpfA;
	}

}