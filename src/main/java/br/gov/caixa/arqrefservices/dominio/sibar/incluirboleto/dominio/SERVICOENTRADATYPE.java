
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada.IncluirBoletoEntradaCorpo;


/**
 * <p>Classe Java de SERVICO_ENTRADA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SERVICO_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://caixa.gov.br/sibar}HEADER"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICO_ENTRADA_TYPE", propOrder = {
    "header"
})
@XmlSeeAlso({
    SERVICOENTRADANEGOCIALTYPE.class,
    IncluirBoletoEntradaCorpo.class
})
public class SERVICOENTRADATYPE {

    @XmlElement(name = "HEADER")
    protected HEADERBARRAMENTOTYPE header;

    /**
     * Obt�m o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link HEADERBARRAMENTOTYPE }
     *     
     */
    public HEADERBARRAMENTOTYPE getHEADER() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERBARRAMENTOTYPE }
     *     
     */
    public void setHEADER(HEADERBARRAMENTOTYPE value) {
        this.header = value;
    }

}
