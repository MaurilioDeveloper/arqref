package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.saida;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.IncluirBoletoSaidaDados;

@XmlRootElement(name="manutencaocobrancabancaria:SERVICO_SAIDA")
@XmlType(propOrder={"header","coRetorno","deOrigemRetorno","deMsgRetorno","dadosSaida"})
@XmlSeeAlso({SibarHeader.class, IncluirBoletoSaidaDados.class})
public class IncluirBoletoSaidaCorpo implements Serializable {
	
	private static final long serialVersionUID = -5133278577669512636L;

	@XmlAttribute(name = "xmlns:manutencaocobrancabancaria")
	private String xmlnsconsultacobrancabancaria = "http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto";
	
	@XmlAttribute(name = "xmlns:sibar_base")
	private String xmlnssibar_base = "http://caixa.gov.br/sibar";
	
	private Integer coRetorno;
	
	private String deOrigemRetorno;
	
	private String deMsgRetorno;

	private SibarHeader header;  
		
	private IncluirBoletoSaidaDados dadosSaida;
	
	@XmlElement(name="COD_RETORNO")
	public Integer getCoRetorno() {
		return coRetorno;
	}
	
	@XmlElement(name="sibar_base:HEADER")
	public SibarHeader getHeader() {
		return header;
	}
	
	@XmlElement(name="DADOS")	
	public IncluirBoletoSaidaDados getDadosSaida() {
		return dadosSaida;
	}
		
	@XmlElement(name="ORIGEM_RETORNO")
	public String getDeOrigemRetorno() {
		return deOrigemRetorno;
	}

	@XmlElement(name="MSG_RETORN")
	public String getDeMsgRetorno() {
		return deMsgRetorno;
	}

	@XmlTransient
	public String getUrl(){
		if (getDadosSaida() != null) {
			return getDadosSaida().getUrl(); 			
		}		
		return "";
	}
	
	public void setDeOrigemRetorno(String deOrigemRetorno) {
		this.deOrigemRetorno = deOrigemRetorno;
	}

	public void setDeMsgRetorno(String deMsgRetorno) {
		this.deMsgRetorno = deMsgRetorno;
	}

	public void setHeader(SibarHeader header) {
		this.header = header;
	}


	public void setDadosSaida(IncluirBoletoSaidaDados dadosSaida) {
		this.dadosSaida = dadosSaida;
	}

	public void setCoRetorno(Integer coRetorno) {
		this.coRetorno = coRetorno;
	}

}
