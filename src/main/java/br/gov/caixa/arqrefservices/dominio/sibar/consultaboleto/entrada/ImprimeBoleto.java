
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IMPRIME_BOLETO_INPUT_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IMPRIME_BOLETO_INPUT_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CODIGO_BENEFICIARIO">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="999999"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="NOSSO_NUMERO">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="99999999999999999"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="LINHA_DIGITAVEL">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;length value="47"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
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
@XmlType(name = "IMPRIME_BOLETO_INPUT_TYPE", propOrder = {
    "codigobeneficiario",
    "nossonumero",
    "linhadigitavel"
})
public class ImprimeBoleto {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    private Integer codigobeneficiario;
    
    @XmlElement(name = "NOSSO_NUMERO")    
    private Long nossonumero;
    
    @XmlElement(name = "LINHA_DIGITAVEL")
    private String linhadigitavel;

	public Integer getCodigobeneficiario() {
		return codigobeneficiario;
	}

	public Long getNossonumero() {
		return nossonumero;
	}

	public String getLinhadigitavel() {
		return linhadigitavel;
	}

	public void setCodigobeneficiario(Integer codigobeneficiario) {
		this.codigobeneficiario = codigobeneficiario;
	}

	public void setNossonumero(Long nossonumero) {
		this.nossonumero = nossonumero;
	}

	public void setLinhadigitavel(String linhadigitavel) {
		this.linhadigitavel = linhadigitavel;
	}
}
