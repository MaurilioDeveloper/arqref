
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inclui_boleto_saida_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inclui_boleto_saida_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BARRAS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LINHA_DIGITAVEL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="47"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOSSO_NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="URL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "inclui_boleto_saida_Type", propOrder = {
    "codigobarras",
    "linhadigitavel",
    "nossonumero",
    "url"
})
@XmlSeeAlso({
    INCLUIBOLETOSAIDA.class
})
public class IncluiBoletoSaidaType {

    @XmlElement(name = "CODIGO_BARRAS", required = true)
    protected String codigobarras;
    
    @XmlElement(name = "LINHA_DIGITAVEL", required = true)
    protected String linhadigitavel;
    
    @XmlElement(name = "NOSSO_NUMERO")
    protected long nossonumero;
    
    @XmlElement(name = "URL", required = true)
    protected String url;

    /**
     * Obt�m o valor da propriedade codigobarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOBARRAS() {
        return codigobarras;
    }

    /**
     * Define o valor da propriedade codigobarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOBARRAS(String value) {
        this.codigobarras = value;
    }

    /**
     * Obt�m o valor da propriedade linhadigitavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINHADIGITAVEL() {
        return linhadigitavel;
    }

    /**
     * Define o valor da propriedade linhadigitavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINHADIGITAVEL(String value) {
        this.linhadigitavel = value;
    }

    /**
     * Obt�m o valor da propriedade nossonumero.
     * 
     */
    public long getNOSSONUMERO() {
        return nossonumero;
    }

    /**
     * Define o valor da propriedade nossonumero.
     * 
     */
    public void setNOSSONUMERO(long value) {
        this.nossonumero = value;
    }

    /**
     * Obt�m o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
