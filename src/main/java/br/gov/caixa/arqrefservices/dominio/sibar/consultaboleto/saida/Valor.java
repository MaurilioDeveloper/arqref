
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VALOR_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VALOR_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCONTO_ABATIMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MULTA_JUROS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JUROS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IOF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MULTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCONTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ABATIMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CALCULADO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COBRADO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
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
@XmlType(name = "VALOR_TYPE", propOrder = {
    "descontoabatimento",
    "multajuros",
    "juros",
    "iof",
    "multa",
    "desconto",
    "abatimento",
    "calculado",
    "cobrado"
})
public class Valor {

    @XmlElement(name = "DESCONTO_ABATIMENTO", required = true)
    protected BigDecimal descontoabatimento;
    
    @XmlElement(name = "MULTA_JUROS", required = true)
    protected BigDecimal multajuros;
    
    @XmlElement(name = "JUROS", required = true)
    protected BigDecimal juros;
    
    @XmlElement(name = "IOF", required = true)
    protected BigDecimal iof;
    
    @XmlElement(name = "MULTA", required = true)
    protected BigDecimal multa;
    
    @XmlElement(name = "DESCONTO", required = true)
    protected BigDecimal desconto;
    
    @XmlElement(name = "ABATIMENTO", required = true)
    protected BigDecimal abatimento;
    
    @XmlElement(name = "CALCULADO", required = true)
    protected BigDecimal calculado;
    
    @XmlElement(name = "COBRADO", required = true)
    protected BigDecimal cobrado;

    /**
     * Obt�m o valor da propriedade descontoabatimento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDESCONTOABATIMENTO() {
        return descontoabatimento;
    }

    /**
     * Define o valor da propriedade descontoabatimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDESCONTOABATIMENTO(BigDecimal value) {
        this.descontoabatimento = value;
    }

    /**
     * Obt�m o valor da propriedade multajuros.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMULTAJUROS() {
        return multajuros;
    }

    /**
     * Define o valor da propriedade multajuros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMULTAJUROS(BigDecimal value) {
        this.multajuros = value;
    }

    /**
     * Obt�m o valor da propriedade juros.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJUROS() {
        return juros;
    }

    /**
     * Define o valor da propriedade juros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJUROS(BigDecimal value) {
        this.juros = value;
    }

    /**
     * Obt�m o valor da propriedade iof.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIOF() {
        return iof;
    }

    /**
     * Define o valor da propriedade iof.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIOF(BigDecimal value) {
        this.iof = value;
    }

    /**
     * Obt�m o valor da propriedade multa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMULTA() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMULTA(BigDecimal value) {
        this.multa = value;
    }

    /**
     * Obt�m o valor da propriedade desconto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDESCONTO() {
        return desconto;
    }

    /**
     * Define o valor da propriedade desconto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDESCONTO(BigDecimal value) {
        this.desconto = value;
    }

    /**
     * Obt�m o valor da propriedade abatimento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getABATIMENTO() {
        return abatimento;
    }

    /**
     * Define o valor da propriedade abatimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setABATIMENTO(BigDecimal value) {
        this.abatimento = value;
    }

    /**
     * Obt�m o valor da propriedade calculado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCALCULADO() {
        return calculado;
    }

    /**
     * Define o valor da propriedade calculado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCALCULADO(BigDecimal value) {
        this.calculado = value;
    }

    /**
     * Obt�m o valor da propriedade cobrado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOBRADO() {
        return cobrado;
    }

    /**
     * Define o valor da propriedade cobrado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOBRADO(BigDecimal value) {
        this.cobrado = value;
    }

}
