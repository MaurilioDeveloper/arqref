
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pos_vencimento_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pos_vencimento_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PROTESTAR"/>
 *               &lt;enumeration value="DEVOLVER"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DIAS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
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
@XmlType(name = "pos_vencimento_Type", propOrder = {
    "acao",
    "numerodias"
})
public class PosVencimentoType {

    @XmlElement(name = "ACAO", required = true)
    protected String acao;
  
    @XmlElement(name = "NUMERO_DIAS")
    protected String numerodias;

	public String getAcao() {
		return acao;
	}

	public String getNumerodias() {
		return numerodias;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public void setNumerodias(String numerodias) {
		this.numerodias = numerodias;
	}

}
