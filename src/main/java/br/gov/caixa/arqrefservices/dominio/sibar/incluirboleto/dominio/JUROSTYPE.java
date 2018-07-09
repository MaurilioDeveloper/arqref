
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de JUROS_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="JUROS_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERCENTUAL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999.99"/>
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
@XmlType(name = "JUROS_TYPE", propOrder = {
    "tipo",
    "percentual"
})
public class JUROSTYPE {

    @XmlElement(name = "TIPO")
    protected short tipo;
    @XmlElement(name = "PERCENTUAL", required = true)
    protected BigDecimal percentual;

    /**
     * Obt�m o valor da propriedade tipo.
     * 
     */
    public short getTIPO() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     */
    public void setTIPO(short value) {
        this.tipo = value;
    }

    /**
     * Obt�m o valor da propriedade percentual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTUAL() {
        return percentual;
    }

    /**
     * Define o valor da propriedade percentual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTUAL(BigDecimal value) {
        this.percentual = value;
    }

}
