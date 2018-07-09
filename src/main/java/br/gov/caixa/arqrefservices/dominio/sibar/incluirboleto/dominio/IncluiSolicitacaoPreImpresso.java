
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE">
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
 *         &lt;element name="NOSSO_NUMERO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ENTREGA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QUANTIDADE_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_COBRANCA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE", propOrder = {
    "codigobeneficiario",
    "nossonumero",
    "tipoentrega",
    "quantidadebloqueto",
    "tipobloqueto",
    "tipocobranca"
})
public class IncluiSolicitacaoPreImpresso {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    
    @XmlElement(name = "NOSSO_NUMERO")
    protected Long nossonumero;
    
    @XmlElement(name = "TIPO_ENTREGA")
    protected short tipoentrega;
    
    @XmlElement(name = "QUANTIDADE_BLOQUETO")
    protected int quantidadebloqueto;
    
    @XmlElement(name = "TIPO_BLOQUETO")
    protected short tipobloqueto;
    
    @XmlElement(name = "TIPO_COBRANCA", required = true)
    protected String tipocobranca;

	public int getCodigobeneficiario() {
		return codigobeneficiario;
	}

	public Long getNossonumero() {
		return nossonumero;
	}

	public short getTipoentrega() {
		return tipoentrega;
	}

	public int getQuantidadebloqueto() {
		return quantidadebloqueto;
	}

	public short getTipobloqueto() {
		return tipobloqueto;
	}

	public String getTipocobranca() {
		return tipocobranca;
	}

	public void setCodigobeneficiario(int codigobeneficiario) {
		this.codigobeneficiario = codigobeneficiario;
	}

	public void setNossonumero(Long nossonumero) {
		this.nossonumero = nossonumero;
	}

	public void setTipoentrega(short tipoentrega) {
		this.tipoentrega = tipoentrega;
	}

	public void setQuantidadebloqueto(int quantidadebloqueto) {
		this.quantidadebloqueto = quantidadebloqueto;
	}

	public void setTipobloqueto(short tipobloqueto) {
		this.tipobloqueto = tipobloqueto;
	}

	public void setTipocobranca(String tipocobranca) {
		this.tipocobranca = tipocobranca;
	}

}
