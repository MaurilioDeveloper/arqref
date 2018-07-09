package br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.serpro.to.DadosMatricula;

@XmlRootElement(name="response")
@XmlSeeAlso({DadosMatricula.class})
public class ConsultarVinculoMargemPorCPFSaidaTO implements Serializable {


	private static final long serialVersionUID = 925496319863446780L;

	private List<DadosMatricula> listaDadosMatricula;
	
	private String cdRetCode;
	
	private String dsRetCode;

	@XmlElement(name="dados_matricula")
	public List<DadosMatricula> getListaDadosMatricula() {
		return listaDadosMatricula;
	}

	public void setListaDadosMatricula(List<DadosMatricula> listaDadosMatricula) {
		this.listaDadosMatricula = listaDadosMatricula;
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
