
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_pagamento_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_pagamento_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUANTIDADE_PERMITIDA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO">
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
 *             &lt;element name="VALOR_MINIMO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type"/>
 *             &lt;element name="VALOR_MAXIMO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="PERCENTUAL_MINIMO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}percentual_Type"/>
 *             &lt;element name="PERCENTUAL_MAXIMO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}percentual_Type"/>
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
@XmlType(name = "consulta_boleto_pagamento_Type", propOrder = {
    "quantidadepermitida",
    "tipo",
    "valorminimo",
    "valormaximo",
    "percentualminimo",
    "percentualmaximo"
})
public class ConsultaBoletoPagamento {

    @XmlElement(name = "QUANTIDADE_PERMITIDA")
    private int quantidadepermitida;
    
    @XmlElement(name = "TIPO", required = true)
    private String tipo;
    
    @XmlElement(name = "VALOR_MINIMO")
    private BigDecimal valorminimo;
    
    @XmlElement(name = "VALOR_MAXIMO")
    private BigDecimal valormaximo;
    
    @XmlElement(name = "PERCENTUAL_MINIMO")
    private BigDecimal percentualminimo;
    
    @XmlElement(name = "PERCENTUAL_MAXIMO")
    private BigDecimal percentualmaximo;

	public int getQuantidadepermitida() {
		return quantidadepermitida;
	}

	public String getTipo() {
		return tipo;
	}

	public BigDecimal getValorminimo() {
		return valorminimo;
	}

	public BigDecimal getValormaximo() {
		return valormaximo;
	}

	public BigDecimal getPercentualminimo() {
		return percentualminimo;
	}

	public BigDecimal getPercentualmaximo() {
		return percentualmaximo;
	}

	public void setQuantidadepermitida(int quantidadepermitida) {
		this.quantidadepermitida = quantidadepermitida;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setValorminimo(BigDecimal valorminimo) {
		this.valorminimo = valorminimo;
	}

	public void setValormaximo(BigDecimal valormaximo) {
		this.valormaximo = valormaximo;
	}

	public void setPercentualminimo(BigDecimal percentualminimo) {
		this.percentualminimo = percentualminimo;
	}

	public void setPercentualmaximo(BigDecimal percentualmaximo) {
		this.percentualmaximo = percentualmaximo;
	}

}
