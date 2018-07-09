
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SOLICITACAO_GRUPO_PAGADOR_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SOLICITACAO_GRUPO_PAGADOR_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_SOLICITACAO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CODIGO_GRUPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOME_GRUPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICAO_ESPECIE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VALOR_TITULO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
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
@XmlType(name = "SOLICITACAO_GRUPO_PAGADOR_TYPE", propOrder = {
    "datasolicitacao",
    "codigogrupo",
    "nomegrupo",
    "descricaoespecie",
    "datavencimento",
    "valortitulo",
    "situacao"
})
public class SolicitacaoGrupoPagador {

    @XmlElement(name = "DATA_SOLICITACAO", required = true)
    @XmlSchemaType(name = "date")
    protected Date datasolicitacao;
    
    @XmlElement(name = "CODIGO_GRUPO")
    protected int codigogrupo;
    
    @XmlElement(name = "NOME_GRUPO", required = true)
    protected String nomegrupo;
    
    @XmlElement(name = "DESCRICAO_ESPECIE", required = true)
    protected String descricaoespecie;
    
    @XmlElement(name = "DATA_VENCIMENTO", required = true)
    @XmlSchemaType(name = "date")
    protected Date datavencimento;
    
    @XmlElement(name = "VALOR_TITULO", required = true)
    protected BigDecimal valortitulo;
    
    @XmlElement(name = "SITUACAO", required = true)
    protected String situacao;

	public Date getDatasolicitacao() {
		return datasolicitacao;
	}

	public int getCodigogrupo() {
		return codigogrupo;
	}

	public String getNomegrupo() {
		return nomegrupo;
	}

	public String getDescricaoespecie() {
		return descricaoespecie;
	}

	public Date getDatavencimento() {
		return datavencimento;
	}

	public BigDecimal getValortitulo() {
		return valortitulo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setDatasolicitacao(Date datasolicitacao) {
		this.datasolicitacao = datasolicitacao;
	}

	public void setCodigogrupo(int codigogrupo) {
		this.codigogrupo = codigogrupo;
	}

	public void setNomegrupo(String nomegrupo) {
		this.nomegrupo = nomegrupo;
	}

	public void setDescricaoespecie(String descricaoespecie) {
		this.descricaoespecie = descricaoespecie;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
	}

	public void setValortitulo(BigDecimal valortitulo) {
		this.valortitulo = valortitulo;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
    
}