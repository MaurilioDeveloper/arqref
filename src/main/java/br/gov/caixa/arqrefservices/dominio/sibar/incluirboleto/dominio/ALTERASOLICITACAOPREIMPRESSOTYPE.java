
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ALTERA_SOLICITACAO_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ALTERA_SOLICITACAO_PRE_IMPRESSO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BENEFICIARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOSSO_NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ENTREGA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QUANTIDADE_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_COBRANCA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "ALTERA_SOLICITACAO_PRE_IMPRESSO_TYPE", propOrder = {
    "codigobeneficiario",
    "nossonumero",
    "tipoentrega",
    "quantidadebloqueto",
    "tipobloqueto",
    "tipocobranca"
})
public class ALTERASOLICITACAOPREIMPRESSOTYPE {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    @XmlElement(name = "NOSSO_NUMERO")
    protected long nossonumero;
    @XmlElement(name = "TIPO_ENTREGA")
    protected short tipoentrega;
    @XmlElement(name = "QUANTIDADE_BLOQUETO")
    protected int quantidadebloqueto;
    @XmlElement(name = "TIPO_BLOQUETO")
    protected short tipobloqueto;
    @XmlElement(name = "TIPO_COBRANCA", required = true)
    protected String tipocobranca;

    /**
     * Obt�m o valor da propriedade codigobeneficiario.
     * 
     */
    public int getCODIGOBENEFICIARIO() {
        return codigobeneficiario;
    }

    /**
     * Define o valor da propriedade codigobeneficiario.
     * 
     */
    public void setCODIGOBENEFICIARIO(int value) {
        this.codigobeneficiario = value;
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
     * Obt�m o valor da propriedade tipoentrega.
     * 
     */
    public short getTIPOENTREGA() {
        return tipoentrega;
    }

    /**
     * Define o valor da propriedade tipoentrega.
     * 
     */
    public void setTIPOENTREGA(short value) {
        this.tipoentrega = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadebloqueto.
     * 
     */
    public int getQUANTIDADEBLOQUETO() {
        return quantidadebloqueto;
    }

    /**
     * Define o valor da propriedade quantidadebloqueto.
     * 
     */
    public void setQUANTIDADEBLOQUETO(int value) {
        this.quantidadebloqueto = value;
    }

    /**
     * Obt�m o valor da propriedade tipobloqueto.
     * 
     */
    public short getTIPOBLOQUETO() {
        return tipobloqueto;
    }

    /**
     * Define o valor da propriedade tipobloqueto.
     * 
     */
    public void setTIPOBLOQUETO(short value) {
        this.tipobloqueto = value;
    }

    /**
     * Obt�m o valor da propriedade tipocobranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCOBRANCA() {
        return tipocobranca;
    }

    /**
     * Define o valor da propriedade tipocobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCOBRANCA(String value) {
        this.tipocobranca = value;
    }

}
