
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_recibo_pagador_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_recibo_pagador_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_mensagens_recibo_pagador_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulta_boleto_recibo_pagador_Type", propOrder = {
    "mensagens"
})
public class ConsultaBoletoReciboPagador {

    @XmlElement(name = "MENSAGENS", required = true)
    private ConsultaBoletoMensagensReciboPagador mensagens;

	public ConsultaBoletoMensagensReciboPagador getMensagens() {
		return mensagens;
	}

	public void setMensagens(ConsultaBoletoMensagensReciboPagador mensagens) {
		this.mensagens = mensagens;
	}

   
}
