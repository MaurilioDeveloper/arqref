
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CONTROLE_NEGOCIAL_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONTROLE_NEGOCIAL_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIGEM_RETORNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COD_RETORNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSG_RETORNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar}mensagens_controle_negocial_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTROLE_NEGOCIAL_TYPE", propOrder = {
    "origemretorno",
    "codretorno",
    "msgretorno",
    "nsu",
    "mensagens"
})
public class ControleNegocialType {

    @XmlElement(name = "ORIGEM_RETORNO")
    protected String origemretorno;
    
    @XmlElement(name = "COD_RETORNO")
    protected String codretorno;
    
    @XmlElement(name = "MSG_RETORNO")
    protected String msgretorno;
    
    @XmlElement(name = "NSU")
    protected String nsu;
    
    @XmlElement(name = "MENSAGENS")
    protected MensagensControleNegocialType mensagens;

	public String getOrigemretorno() {
		return origemretorno;
	}

	public String getCodretorno() {
		return codretorno;
	}

	public String getMsgretorno() {
		return msgretorno;
	}

	public String getNsu() {
		return nsu;
	}

	public MensagensControleNegocialType getMensagens() {
		return mensagens;
	}

	public void setOrigemretorno(String origemretorno) {
		this.origemretorno = origemretorno;
	}

	public void setCodretorno(String codretorno) {
		this.codretorno = codretorno;
	}

	public void setMsgretorno(String msgretorno) {
		this.msgretorno = msgretorno;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	public void setMensagens(MensagensControleNegocialType mensagens) {
		this.mensagens = mensagens;
	}

    
    

}
