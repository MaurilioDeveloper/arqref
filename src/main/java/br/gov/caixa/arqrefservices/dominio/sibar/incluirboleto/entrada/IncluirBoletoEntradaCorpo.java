
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.IncluirBoletoEntradaDados;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.HEADERBARRAMENTOTYPE;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="bol:SERVICO_ENTRADA")
@XmlType(propOrder = {"header","dados"})
public class IncluirBoletoEntradaCorpo implements Serializable{
	
	private static final long serialVersionUID = 943511475816160489L;
	
	@XmlElement(name = "sib:HEADER")
	private SibarHeader header;

    @XmlElement(name = "DADOS", required = true)
    private IncluirBoletoEntradaDados dados;

    @XmlTransient
    private String url;
    
	public SibarHeader getHeader() {
		return header;
	}

	public IncluirBoletoEntradaDados getDados() {
		return dados;
	}

	public void setHeader(SibarHeader header) {
		this.header = header;
	}

	public void setDados(IncluirBoletoEntradaDados dados) {
		this.dados = dados;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
}