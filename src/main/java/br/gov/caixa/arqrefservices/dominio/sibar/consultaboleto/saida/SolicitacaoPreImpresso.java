
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SOLICITACAO_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SOLICITACAO_PRE_IMPRESSO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_SOLICITACAO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="QUANTIDADE_BOLETOS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOSSO_NUMERO_INICIAL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICAO_TIPO_ENTREGA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICAO_TIPO_BOLETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
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
@XmlType(name = "SOLICITACAO_PRE_IMPRESSO_TYPE", propOrder = {
    "datasolicitacao",
    "quantidadeboletos",
    "nossonumeroinicial",
    "descricaotipoentrega",
    "descricaotipoboleto",
    "situacao"
})
public class SolicitacaoPreImpresso {

    @XmlElement(name = "DATA_SOLICITACAO", required = true)
    @XmlSchemaType(name = "date")
    protected Date datasolicitacao;
    
    @XmlElement(name = "QUANTIDADE_BOLETOS")
    protected int quantidadeboletos;
    
    @XmlElement(name = "NOSSO_NUMERO_INICIAL")
    protected long nossonumeroinicial;
    
    @XmlElement(name = "DESCRICAO_TIPO_ENTREGA", required = true)
    protected String descricaotipoentrega;
    
    @XmlElement(name = "DESCRICAO_TIPO_BOLETO", required = true)
    protected String descricaotipoboleto;
    
    @XmlElement(name = "SITUACAO", required = true)
    protected String situacao;

	public Date getDatasolicitacao() {
		return datasolicitacao;
	}

	public int getQuantidadeboletos() {
		return quantidadeboletos;
	}

	public long getNossonumeroinicial() {
		return nossonumeroinicial;
	}

	public String getDescricaotipoentrega() {
		return descricaotipoentrega;
	}

	public String getDescricaotipoboleto() {
		return descricaotipoboleto;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setDatasolicitacao(Date datasolicitacao) {
		this.datasolicitacao = datasolicitacao;
	}

	public void setQuantidadeboletos(int quantidadeboletos) {
		this.quantidadeboletos = quantidadeboletos;
	}

	public void setNossonumeroinicial(long nossonumeroinicial) {
		this.nossonumeroinicial = nossonumeroinicial;
	}

	public void setDescricaotipoentrega(String descricaotipoentrega) {
		this.descricaotipoentrega = descricaotipoentrega;
	}

	public void setDescricaotipoboleto(String descricaotipoboleto) {
		this.descricaotipoboleto = descricaotipoboleto;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
    
}
