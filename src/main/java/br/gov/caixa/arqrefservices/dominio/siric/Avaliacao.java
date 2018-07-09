package br.gov.caixa.arqrefservices.dominio.siric;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
/**
 * Classe utilizada avaliacao de risco de credito (SIRIC). Essa classe contem
 * regras de reenderizacao devido ao XML que eh recebido. Atencao para classes
 * internas
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlType
@XmlRootElement(name="AVALIACAO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Avaliacao implements Serializable{
	
	private Aprovada aprovada;
	
	private Condicionada condicionada;
	
	private Reprovada reprovada;
	
	private List<MensagemRetorno> mensagemRetorno;
	
	private TomadorValida tomadorValida;
	
	//criado para facilitar a manipucacao
	private List<ErrosValidacao> errosValidacao;

	@XmlElement(name="APROVADA")
	public Aprovada getAprovada() {
		return aprovada;
	}

	public void setAprovada(Aprovada aprovada) {
		this.aprovada = aprovada;
	}

	@XmlElement(name="CONDICIONADA")
	public Condicionada getCondicionada() {
		return condicionada;
	}

	public void setCondicionada(Condicionada condicionada) {
		this.condicionada = condicionada;
	}

	@XmlElement(name="REPROVADA")
	public Reprovada getReprovada() {
		return reprovada;
	}

	public void setReprovada(Reprovada reprovada) {
		this.reprovada = reprovada;
	}

	@XmlElement(name="MENSAGEM_RETORNO")
	public List<MensagemRetorno> getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(List<MensagemRetorno> mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	@XmlElement(name="TOMADOR_VALIDA")
	public TomadorValida getTomadorValida() {
		return tomadorValida;
	}
	
	
	//Anotacao para ignorar o campo na conversao 
	//para xml
	@XmlTransient
	public List<ErrosValidacao> getErrosValidacao() {
		return errosValidacao;
	}

	public void setErrosValidacao(List<ErrosValidacao> errosValidacao) {
		this.errosValidacao = errosValidacao;
	}

	@Override
	public String toString() {
		return "Avaliacao [aprovada=" + aprovada + ", condicionada="
				+ condicionada + ", reprovada=" + reprovada
				+ ", mensagemRetorno=" + mensagemRetorno + ", tomadorValida="
				+ tomadorValida + "]";
	}

	public void setTomadorValida(TomadorValida tomadorValida) {
		this.tomadorValida = tomadorValida;
	}
	
	
	
	

}
