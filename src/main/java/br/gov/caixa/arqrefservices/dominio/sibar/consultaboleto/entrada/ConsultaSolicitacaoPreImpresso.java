
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BENEFICIARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_SOLICITACAO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TIPO_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
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
@XmlType(name = "CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE", propOrder = {
    "codigobeneficiario",
    "datasolicitacao",
    "tipobloqueto"
})
public class ConsultaSolicitacaoPreImpresso {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    
    @XmlElement(name = "DATA_SOLICITACAO", required = true)
    @XmlSchemaType(name = "date")
    protected Date datasolicitacao;
    
    @XmlElement(name = "TIPO_BLOQUETO")
    protected int tipobloqueto;

	public int getCodigobeneficiario() {
		return codigobeneficiario;
	}

	public Date getDatasolicitacao() {
		return datasolicitacao;
	}

	public int getTipobloqueto() {
		return tipobloqueto;
	}

	public void setTipobloqueto(int tipobloqueto) {
		this.tipobloqueto = tipobloqueto;
	}

	public void setCodigobeneficiario(int codigobeneficiario) {
		this.codigobeneficiario = codigobeneficiario;
	}

	public void setDatasolicitacao(Date datasolicitacao) {
		this.datasolicitacao = datasolicitacao;
	}

}
