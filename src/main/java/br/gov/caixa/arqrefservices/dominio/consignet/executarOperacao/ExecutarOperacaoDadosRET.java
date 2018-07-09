package br.gov.caixa.arqrefservices.dominio.consignet.executarOperacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="executarOperacaoResponse")
@XmlSeeAlso({ExecutarOperacaoReturn.class})
public class ExecutarOperacaoDadosRET implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
				
	@XmlAttribute(name = "xmlns")
	private String xmlns = "http://services.consignet.db1.com.br";
	
	private ExecutarOperacaoReturn executarOperacaoReturn;

	@XmlElement(name="executarOperacaoReturn")
	public ExecutarOperacaoReturn getExecutarOperacaoReturn() {
		return executarOperacaoReturn;
	}

	public void setExecutarOperacaoReturn(
			ExecutarOperacaoReturn executarOperacaoReturn) {
		this.executarOperacaoReturn = executarOperacaoReturn;
	}
			
}