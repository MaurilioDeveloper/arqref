
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE">
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
 *         &lt;element name="CODIGO_GRUPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_SOLICITACAO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE", propOrder = {
    "codigobeneficiario",
    "codigogrupo",
    "datasolicitacao"
})
public class ConsultaSolicitacaoGrupoPagador {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    private int codigobeneficiario;
    
    @XmlElement(name = "CODIGO_GRUPO")
    private int codigogrupo;
    
    @XmlElement(name = "DATA_SOLICITACAO", required = true)
    @XmlSchemaType(name = "date")
    private Date datasolicitacao;

	public int getCodigobeneficiario() {
		return codigobeneficiario;
	}

	public int getCodigogrupo() {
		return codigogrupo;
	}

	public Date getDatasolicitacao() {
		return datasolicitacao;
	}

	public void setCodigobeneficiario(int codigobeneficiario) {
		this.codigobeneficiario = codigobeneficiario;
	}

	public void setCodigogrupo(int codigogrupo) {
		this.codigogrupo = codigogrupo;
	}

	public void setDatasolicitacao(Date datasolicitacao) {
		this.datasolicitacao = datasolicitacao;
	}

}
