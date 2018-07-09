package br.gov.caixa.arqrefservices.dominio.siric.solicitacao.comercial;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.PerguntaSiric;

@XmlRootElement(name = "RELACIONAMENTOS")
@XmlSeeAlso({ PerguntaSiric.class })
@XmlType(propOrder={"perguntaSiric"})
public class Relacionamentos implements Serializable {

	private static final long serialVersionUID = -4106755031355750958L;

	private PerguntaSiric perguntaSiric;

	@XmlElement(name="PERGUNTA_259")
	public PerguntaSiric getPerguntaSiric() {
		return perguntaSiric;
	}

	public void setPerguntaSiric(PerguntaSiric perguntaSiric) {
		this.perguntaSiric = perguntaSiric;
	}
	
	
}