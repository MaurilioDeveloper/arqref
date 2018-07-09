
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DADOS_SAIDA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DADOS_SAIDA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTROLE_NEGOCIAL" type="{http://caixa.gov.br/sibar}CONTROLE_NEGOCIAL_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EXCECAO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADOS_SAIDA_TYPE", propOrder = {
    "controlenegocial",
    "excecao"
})
@XmlSeeAlso({
    DadosSaidaSibar.class,
    IncluirBoletoSaidaDados.class
})
public class DadosSaidaSibar {

    @XmlElement(name = "CONTROLE_NEGOCIAL")
    protected ControleNegocialType controlenegocial;
    
    @XmlElement(name = "EXCECAO")
    protected String excecao;

	public ControleNegocialType getControlenegocial() {
		return controlenegocial;
	}

	public String getExcecao() {
		return excecao;
	}

	public void setControlenegocial(ControleNegocialType controlenegocial) {
		this.controlenegocial = controlenegocial;
	}

	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}
}
