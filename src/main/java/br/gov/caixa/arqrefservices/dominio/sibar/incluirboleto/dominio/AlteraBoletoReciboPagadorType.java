
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de altera_boleto_recibo_pagador_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="altera_boleto_recibo_pagador_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_mensagens_recibo_pagador_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altera_boleto_recibo_pagador_Type", propOrder = {
    "mensagens"
})
public class AlteraBoletoReciboPagadorType {

    @XmlElement(name = "MENSAGENS", required = true)
    protected AlteraBoletoMensagensReciboPagadorType mensagens;

    /**
     * Obt�m o valor da propriedade mensagens.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoMensagensReciboPagadorType }
     *     
     */
    public AlteraBoletoMensagensReciboPagadorType getMENSAGENS() {
        return mensagens;
    }

    /**
     * Define o valor da propriedade mensagens.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoMensagensReciboPagadorType }
     *     
     */
    public void setMENSAGENS(AlteraBoletoMensagensReciboPagadorType value) {
        this.mensagens = value;
    }

}
