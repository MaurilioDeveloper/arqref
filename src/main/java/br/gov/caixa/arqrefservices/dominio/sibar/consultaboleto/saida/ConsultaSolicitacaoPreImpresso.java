package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOSSO_NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999999"/>
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
 *         &lt;element name="TIPO_COBRANCA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SITUACAO">
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
@XmlType(name = "CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE", propOrder = {
    "nossonumero",
    "tipoentrega",
    "quantidadebloqueto",
    "tipocobranca",
    "situacao"
})
public class ConsultaSolicitacaoPreImpresso {

    @XmlElement(name = "NOSSO_NUMERO")
    protected long nossonumero;
    
    @XmlElement(name = "TIPO_ENTREGA")
    protected int tipoentrega;
    
    @XmlElement(name = "QUANTIDADE_BLOQUETO")
    protected int quantidadebloqueto;
    
    @XmlElement(name = "TIPO_COBRANCA", required = true)
    protected String tipocobranca;
    
    @XmlElement(name = "SITUACAO", required = true)
    protected String situacao;

	public long getNossonumero() {
		return nossonumero;
	}

	public int getTipoentrega() {
		return tipoentrega;
	}

	public int getQuantidadebloqueto() {
		return quantidadebloqueto;
	}

	public String getTipocobranca() {
		return tipocobranca;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setNossonumero(long nossonumero) {
		this.nossonumero = nossonumero;
	}

	public void setTipoentrega(int tipoentrega) {
		this.tipoentrega = tipoentrega;
	}

	public void setQuantidadebloqueto(int quantidadebloqueto) {
		this.quantidadebloqueto = quantidadebloqueto;
	}

	public void setTipocobranca(String tipocobranca) {
		this.tipocobranca = tipocobranca;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

    
}
