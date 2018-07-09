package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import java.io.Serializable;

import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;

@XmlRootElement(name="bol:SERVICO_ENTRADA")
@XmlType(propOrder={"header","dados"})
public class ConsultarBoletoEntradaCorpo implements Serializable {
	
	private static final long serialVersionUID = -1926042016042795011L;

	private SibarHeader header;
	
	private ConsultarBoletoDadosEntrada dados;

	private String url;
	
	@XmlElement(name="sib:HEADER")
	public SibarHeader getHeader() {
		return header;
	}

	@XmlElement(name="DADOS")
	public ConsultarBoletoDadosEntrada getDados() {
		return dados;
	}

	@XmlTransient
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setHeader(SibarHeader header) {
		this.header = header;
	}
	
	public void setDados(ConsultarBoletoDadosEntrada dados) {
		this.dados = dados;
	}
	
	
	
	
}