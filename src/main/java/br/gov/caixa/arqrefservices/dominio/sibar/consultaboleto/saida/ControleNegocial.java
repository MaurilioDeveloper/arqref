
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.MensagensControleNegocialType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
    "origemRetonor",
    "coRetorno",
    "mensagens"
})
public class ControleNegocial implements Serializable{
    
	private static final long serialVersionUID = 3110139443921728982L;

	@XmlElement(name = "ORIGEM_RETORNO")    
    private String  origemRetonor;
        
    @XmlElement(name = "COD_RETORNO")
    private String coRetorno;

    @XmlElement(name = "MENSAGENS")
    private MensagensControleNegocialType mensagens;

   
	public String getOrigemRetonor() {
		return origemRetonor;
	}

	public String getCoRetorno() {
		return coRetorno;
	}
	
	public MensagensControleNegocialType getMensagens() {
		return mensagens;
	}

	public void setMensagens(MensagensControleNegocialType mensagens) {
		this.mensagens = mensagens;
	}

	public void setOrigemRetonor(String origemRetonor) {
		this.origemRetonor = origemRetonor;
	}

	public void setCoRetorno(String coRetorno) {
		this.coRetorno = coRetorno;
	}
}
