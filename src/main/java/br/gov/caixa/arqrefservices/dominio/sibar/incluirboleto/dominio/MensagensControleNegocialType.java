
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mensagens_controle_negocial_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mensagens_controle_negocial_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RETORNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTITUCIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INFORMATIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MENSAGEM" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensagens_controle_negocial_Type", propOrder = {
    "retorno",
    "institucional",
    "informativa",
    "tela",
    "mensagem"
})
public class MensagensControleNegocialType {

    @XmlElement(name = "RETORNO")
    protected String retorno;
    
    @XmlElement(name = "INSTITUCIONAL")
    protected String institucional;
    
    @XmlElement(name = "INFORMATIVA")
    protected String informativa;
    
    @XmlElement(name = "TELA")    
    protected String tela;
    
    @XmlElement(name = "MENSAGEM")
    protected List<String> mensagem;

	public String getRetorno() {
		return retorno;
	}

	public String getInstitucional() {
		return institucional;
	}

	public String getInformativa() {
		return informativa;
	}

	public String getTela() {
		return tela;
	}

	public List<String> getMensagem() {
		if (mensagem == null) {
			mensagem = new ArrayList<String>();			
		}
		return mensagem;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public void setInstitucional(String institucional) {
		this.institucional = institucional;
	}

	public void setInformativa(String informativa) {
		this.informativa = informativa;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public void setMensagem(List<String> mensagem) {
		this.mensagem = mensagem;
	}

   

}
