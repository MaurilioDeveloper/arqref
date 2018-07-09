package br.gov.caixa.arqrefservices.dominio.econsig.alterarConsignacao;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.Boleto;
import br.gov.caixa.arqrefservices.dominio.econsig.Historico;
import br.gov.caixa.arqrefservices.dominio.econsig.Resumo;

@XmlRootElement(name="ns10:alterarConsignacaoResponse")
@XmlType(propOrder={"sucesso","codRetorno","mensagem","boleto","historicos","resumos"})
@XmlSeeAlso({Boleto.class,Historico.class,Resumo.class})
public class AlterarConsignacaoDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
			
	private Integer codRetorno;
		
	private String mensagem;
	
	private Boleto boleto;			
	
	private List<Historico> historicos;
		
	private List<Resumo> resumos;
	
	private Boolean sucesso;
	
	@XmlAttribute(name = "xmlns:ns10")
	private String xmlns_soapenv = "HostaHostService";
	
	@XmlElement(name="ns1:boleto")
	public Boleto getBoleto() {
		return boleto;
	}

	@XmlElement(name="ns10:codRetorno")
	public Integer getCodRetorno() {
		return codRetorno;
	}

	@XmlElement(name="ns4:historicos")
	public List<Historico> getHistoricos() {
		return historicos;
	}
		
	@XmlElement(name="ns10:mensagem")
	public String getMensagem() {
		return mensagem;
	}

	@XmlElement(name="ns5:resumos")
	public List<Resumo> getResumos() {
		return resumos;
	}

	@XmlElement(name="ns10:sucesso")
	public Boolean getSucesso() {
		return sucesso;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	public void setCodRetorno(Integer codRetorno) {
		this.codRetorno = codRetorno;
	}

	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setResumos(List<Resumo> resumos) {
		this.resumos = resumos;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}
	
	
	
	
}