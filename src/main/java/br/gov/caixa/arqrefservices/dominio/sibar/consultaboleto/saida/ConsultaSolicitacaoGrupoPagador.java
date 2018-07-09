
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VALOR_TITULO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRAZO_PROTESTO_DEVOLUCAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICOES" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}DESCRICOES_TYPE"/>
 *         &lt;element name="COMPLEMENTARES" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}COMPLEMENTARES_TYPE" minOccurs="0"/>
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
@XmlType(name = "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE", propOrder = {
    "datavencimento",
    "valortitulo",
    "prazoprotestodevolucao",
    "descricoes",
    "complementares",
    "situacao"
})
public class ConsultaSolicitacaoGrupoPagador implements Serializable{
    
	private static final long serialVersionUID = 3110139443921728982L;

	@XmlElement(name = "DATA_VENCIMENTO", required = true)
    @XmlSchemaType(name = "date")
    private Date datavencimento;
    
    @XmlElement(name = "VALOR_TITULO", required = true)
    private BigDecimal valortitulo;
    
    @XmlElement(name = "PRAZO_PROTESTO_DEVOLUCAO")
    private int prazoprotestodevolucao;
    
    @XmlElement(name = "DESCRICOES", required = true)
    private Descricoes descricoes;
    
    @XmlElement(name = "COMPLEMENTARES")
    private Complementares complementares;
    
    @XmlElement(name = "SITUACAO", required = true)
    private String situacao;

	public Date getDatavencimento() {
		return datavencimento;
	}

	public BigDecimal getValortitulo() {
		return valortitulo;
	}

	public int getPrazoprotestodevolucao() {
		return prazoprotestodevolucao;
	}

	public Descricoes getDescricoes() {
		return descricoes;
	}

	public Complementares getComplementares() {
		return complementares;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
	}

	public void setValortitulo(BigDecimal valortitulo) {
		this.valortitulo = valortitulo;
	}

	public void setPrazoprotestodevolucao(int prazoprotestodevolucao) {
		this.prazoprotestodevolucao = prazoprotestodevolucao;
	}

	public void setDescricoes(Descricoes descricoes) {
		this.descricoes = descricoes;
	}

	public void setComplementares(Complementares complementares) {
		this.complementares = complementares;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
