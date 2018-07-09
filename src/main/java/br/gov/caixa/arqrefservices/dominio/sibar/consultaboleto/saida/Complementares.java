
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de COMPLEMENTARES_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COMPLEMENTARES_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCONTOS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}DESCONTOS_TYPE" minOccurs="0"/>
 *         &lt;element name="MULTA" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}DESCONTO_MULTA_TYPE" minOccurs="0"/>
 *         &lt;element name="JUROS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}JUROS_TYPE" minOccurs="0"/>
 *         &lt;element name="IMPOSTOS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}IMPOSTOS_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPLEMENTARES_TYPE", propOrder = {
    "descontos",
    "multa",
    "juros",
    "impostos"
})
public class Complementares {

    @XmlElement(name = "DESCONTOS")
    protected Descontos descontos;
    
    @XmlElement(name = "MULTA")
    protected DescontoMulta multa;
    
    @XmlElement(name = "JUROS")
    protected Juros juros;
    
    @XmlElement(name = "IMPOSTOS")
    protected Impostos impostos;

    /**
     * Obt�m o valor da propriedade descontos.
     * 
     * @return
     *     possible object is
     *     {@link Descontos }
     *     
     */
    public Descontos getDESCONTOS() {
        return descontos;
    }

    /**
     * Define o valor da propriedade descontos.
     * 
     * @param value
     *     allowed object is
     *     {@link Descontos }
     *     
     */
    public void setDESCONTOS(Descontos value) {
        this.descontos = value;
    }

    /**
     * Obt�m o valor da propriedade multa.
     * 
     * @return
     *     possible object is
     *     {@link DescontoMulta }
     *     
     */
    public DescontoMulta getMULTA() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     * @param value
     *     allowed object is
     *     {@link DescontoMulta }
     *     
     */
    public void setMULTA(DescontoMulta value) {
        this.multa = value;
    }

    /**
     * Obt�m o valor da propriedade juros.
     * 
     * @return
     *     possible object is
     *     {@link Juros }
     *     
     */
    public Juros getJUROS() {
        return juros;
    }

    /**
     * Define o valor da propriedade juros.
     * 
     * @param value
     *     allowed object is
     *     {@link Juros }
     *     
     */
    public void setJUROS(Juros value) {
        this.juros = value;
    }

    /**
     * Obt�m o valor da propriedade impostos.
     * 
     * @return
     *     possible object is
     *     {@link Impostos }
     *     
     */
    public Impostos getIMPOSTOS() {
        return impostos;
    }

    /**
     * Define o valor da propriedade impostos.
     * 
     * @param value
     *     allowed object is
     *     {@link Impostos }
     *     
     */
    public void setIMPOSTOS(Impostos value) {
        this.impostos = value;
    }

}
