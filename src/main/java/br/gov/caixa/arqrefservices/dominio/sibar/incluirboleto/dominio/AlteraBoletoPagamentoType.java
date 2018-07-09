
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de altera_boleto_pagamento_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="altera_boleto_pagamento_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUANTIDADE_PERMITIDA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ACEITA_QUALQUER_VALOR"/>
 *               &lt;enumeration value="ACEITA_VALORES_ENTRE_MINIMO_MAXIMO"/>
 *               &lt;enumeration value="NAO_ACEITA_VALOR_DIVERGENTE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="VALOR_MINIMO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type" minOccurs="0"/>
 *             &lt;element name="VALOR_MAXIMO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="PERCENTUAL_MINIMO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}percentual_Type" minOccurs="0"/>
 *             &lt;element name="PERCENTUAL_MAXIMO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}percentual_Type" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altera_boleto_pagamento_Type", propOrder = {
    "quantidadepermitida",
    "tipo",
    "valorminimo",
    "valormaximo",
    "percentualminimo",
    "percentualmaximo"
})
public class AlteraBoletoPagamentoType {

    @XmlElement(name = "QUANTIDADE_PERMITIDA")
    protected Short quantidadepermitida;
    @XmlElement(name = "TIPO")
    protected String tipo;
    @XmlElement(name = "VALOR_MINIMO")
    protected BigDecimal valorminimo;
    @XmlElement(name = "VALOR_MAXIMO")
    protected BigDecimal valormaximo;
    @XmlElement(name = "PERCENTUAL_MINIMO")
    protected BigDecimal percentualminimo;
    @XmlElement(name = "PERCENTUAL_MAXIMO")
    protected BigDecimal percentualmaximo;

    /**
     * Obt�m o valor da propriedade quantidadepermitida.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQUANTIDADEPERMITIDA() {
        return quantidadepermitida;
    }

    /**
     * Define o valor da propriedade quantidadepermitida.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQUANTIDADEPERMITIDA(Short value) {
        this.quantidadepermitida = value;
    }

    /**
     * Obt�m o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Obt�m o valor da propriedade valorminimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORMINIMO() {
        return valorminimo;
    }

    /**
     * Define o valor da propriedade valorminimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORMINIMO(BigDecimal value) {
        this.valorminimo = value;
    }

    /**
     * Obt�m o valor da propriedade valormaximo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORMAXIMO() {
        return valormaximo;
    }

    /**
     * Define o valor da propriedade valormaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORMAXIMO(BigDecimal value) {
        this.valormaximo = value;
    }

    /**
     * Obt�m o valor da propriedade percentualminimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTUALMINIMO() {
        return percentualminimo;
    }

    /**
     * Define o valor da propriedade percentualminimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTUALMINIMO(BigDecimal value) {
        this.percentualminimo = value;
    }

    /**
     * Obt�m o valor da propriedade percentualmaximo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTUALMAXIMO() {
        return percentualmaximo;
    }

    /**
     * Define o valor da propriedade percentualmaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTUALMAXIMO(BigDecimal value) {
        this.percentualmaximo = value;
    }

}
