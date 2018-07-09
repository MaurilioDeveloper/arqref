package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="IDENTIDADE")
@XmlType(propOrder={"numeroIdentidade", "orgaoEmissor", "ufEmissor", "dataEmissao"})
public class Identidade implements Serializable {

	private static final long serialVersionUID = -4382195603061094049L;
	
	@Tamanho(tamanho = 15)
	private String numeroIdentidade;
	
	@Tamanho(tamanho = 10)
	private String orgaoEmissor;
	
	@Tamanho(tamanho = 2)
	private String ufEmissor;
	
	@Tamanho(tamanho = 8)
	private String dataEmissao;
	
	@XmlElement(name="NUMERO")
	public String getNumeroIdentidade() {
		return numeroIdentidade;
	}

	public void setNumeroIdentidade(String numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}
	
	@XmlElement(name="ORGAO_EMISSOR")
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	
	@XmlElement(name="UF")
	public String getUfEmissor() {
		return ufEmissor;
	}
	
	public void setUfEmissor(String ufEmissor) {
		this.ufEmissor = ufEmissor;
	}
	
	@XmlElement(name="DT_EMISSAO")
	public String getDataEmissao() {
		return dataEmissao;
	}
	
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	
}
