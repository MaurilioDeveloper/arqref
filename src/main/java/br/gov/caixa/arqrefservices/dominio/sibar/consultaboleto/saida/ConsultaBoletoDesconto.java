
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_desconto_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_desconto_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type"/>
 *           &lt;element name="PERCENTUAL" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type"/>
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
@XmlType(name = "consulta_boleto_desconto_Type", propOrder = {
    "data",
    "valor",
    "percentual"
})
public class ConsultaBoletoDesconto {

    @XmlElement(name = "DATA")
    @XmlSchemaType(name = "date")
    private Date data;
    
    @XmlElement(name = "VALOR")
    private BigDecimal valor;
    
    @XmlElement(name = "PERCENTUAL")
    private BigDecimal percentual;

	public Date getData() {
		return data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

}
