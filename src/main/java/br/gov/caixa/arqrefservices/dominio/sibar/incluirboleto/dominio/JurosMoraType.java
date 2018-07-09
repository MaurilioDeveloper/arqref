
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de juros_mora_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="juros_mora_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="VALOR_POR_DIA"/>
 *               &lt;enumeration value="TAXA_MENSAL"/>
 *               &lt;enumeration value="ISENTO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type"/>
 *           &lt;element name="PERCENTUAL" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type"/>
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
@XmlType(name = "juros_mora_Type", propOrder = {
    "tipo",
    "data",
    "valor",
    "percentual"
})
public class JurosMoraType {

    @XmlElement(name = "TIPO", required = true)
    protected String tipo;
    
    @XmlElement(name = "DATA")
    @XmlSchemaType(name = "date")    
    protected Date data;
    
    @XmlElement(name = "VALOR")
    protected String valor;
    
    @XmlElement(name = "PERCENTUAL")
    protected BigDecimal percentual;

	public String getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public String getValor() {
		return valor;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

}
