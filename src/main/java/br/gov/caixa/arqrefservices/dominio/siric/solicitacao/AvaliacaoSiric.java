package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.siric.MensagemRetorno;
import br.gov.caixa.arqrefservices.dominio.siric.TomadorValida;

@XmlRootElement(name = "AVALIACAO")
@XmlSeeAlso({ MensagemRetorno.class, TomadorValida.class })
@XmlType(propOrder={"mensagemRetorno", "tomadorValida"})
public class AvaliacaoSiric implements Serializable {

	private static final long serialVersionUID = -4106755031355750958L;

	private MensagemRetorno mensagemRetorno;
	
	private List<TomadorValida> tomadorValida;

	@XmlElement(name="MENSAGEM_RETORNO")
	public MensagemRetorno getMensagemRetorno() {
		return mensagemRetorno;
	}
	
	public void setMensagemRetorno(MensagemRetorno mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	@XmlElement(name="TOMADOR_VALIDA")
	public List<TomadorValida> getTomadorValida() {
		return tomadorValida;
	}

	public void setTomadorValida(List<TomadorValida> tomadorValida) {
		this.tomadorValida = tomadorValida;
	}
	
	


	
}