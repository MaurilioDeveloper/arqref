package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;

@XmlRootElement(name="consultacobrancabancaria:SERVICO_SAIDA")
@XmlType(propOrder={"header","coRetorno","consultaCobrancaBancariaDados"})
@XmlSeeAlso({SibarHeader.class, ConsultaCobrancaBancariaDados.class})
public class ConsultaCobrancaBancariaCorpo implements Serializable {
	
	private static final long serialVersionUID = -5133278577669512636L;

	@XmlAttribute(name = "xmlns:consultacobrancabancaria")
	private String xmlnsconsultacobrancabancaria = "http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto";
	
	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlnssibar_base = "http://caixa.gov.br/sibar";
	
	private Integer coRetorno;

	private SibarHeader header;  

	private ConsultaCobrancaBancariaDados consultaCobrancaBancariaDados; 
	
	@XmlElement(name="COD_RETORNO")
	public Integer getCoRetorno() {
		return coRetorno;
	}
	
	@XmlElement(name="sibar_base:HEADER")
	public SibarHeader getHeader() {
		return header;
	}
	
	@XmlElement(name="DADOS")
	public ConsultaCobrancaBancariaDados getConsultaCobrancaBancariaDados() {
		return consultaCobrancaBancariaDados;
	}

	public void setConsultaCobrancaBancariaDados(ConsultaCobrancaBancariaDados consultaCobrancaBancariaDados) {
		this.consultaCobrancaBancariaDados = consultaCobrancaBancariaDados;
	}

	public void setHeader(SibarHeader header) {
		this.header = header;
	}

	public void setCoRetorno(Integer coRetorno) {
		this.coRetorno = coRetorno;
	}
	
	@XmlTransient
	public String getUrl() {
		if (getConsultaCobrancaBancariaDados() != null) {
			return getConsultaCobrancaBancariaDados().getUrl();			
		}
		return "";		
	}

}
