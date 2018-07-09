
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TITULO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TITULO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LINHA_DIGITAVEL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="56"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SIGLA_MODALIDADE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOSSO_NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DV_NOSSO_NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOEDA" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}MOEDA_TYPE"/>
 *         &lt;element name="NUMERO_DOCUMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACEITE" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}ACEITE_TYPE"/>
 *         &lt;element name="ESPECIE" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}ESPECIE_TYPE"/>
 *         &lt;element name="DATA_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DATA_PROCESSAMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CODIGO_BARRAS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
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
@XmlType(name = "TITULO_TYPE", propOrder = {
    "linhadigitavel",
    "datavencimento",
    "siglamodalidade",
    "nossonumero",
    "dvnossonumero",
    "moeda",
    "numerodocumento",
    "aceite",
    "especie",
    "datadocumento",
    "dataprocessamento",
    "codigobarras",
    "valor"
})
public class Titulo {

    @XmlElement(name = "LINHA_DIGITAVEL", required = true)
    private String linhadigitavel;
    
    @XmlElement(name = "DATA_VENCIMENTO", required = true)
    @XmlSchemaType(name = "date")
    private Date datavencimento;
    
    @XmlElement(name = "SIGLA_MODALIDADE", required = true)
    private String siglamodalidade;
    
    @XmlElement(name = "NOSSO_NUMERO")
    private long nossonumero;
    
    @XmlElement(name = "DV_NOSSO_NUMERO")
    private int dvnossonumero;
    
    @XmlElement(name = "MOEDA", required = true)
    private Moeda moeda;
    
    @XmlElement(name = "NUMERO_DOCUMENTO", required = true)
    private String numerodocumento;
    
    @XmlElement(name = "ACEITE", required = true)
    private Aceite aceite;
    
    @XmlElement(name = "ESPECIE", required = true)
    private Especie especie;
    
    @XmlElement(name = "DATA_DOCUMENTO", required = true)
    @XmlSchemaType(name = "date")
    private Date datadocumento;
    
    @XmlElement(name = "DATA_PROCESSAMENTO", required = true)
    @XmlSchemaType(name = "date")
    private Date dataprocessamento;
    
    @XmlElement(name = "CODIGO_BARRAS", required = true)
    private String codigobarras;
    
    @XmlElement(name = "VALOR", required = true)
    private BigDecimal valor;

	public String getLinhadigitavel() {
		return linhadigitavel;
	}

	public Date getDatavencimento() {
		return datavencimento;
	}

	public String getSiglamodalidade() {
		return siglamodalidade;
	}

	public long getNossonumero() {
		return nossonumero;
	}

	public int getDvnossonumero() {
		return dvnossonumero;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public Aceite getAceite() {
		return aceite;
	}

	public Especie getEspecie() {
		return especie;
	}

	public Date getDatadocumento() {
		return datadocumento;
	}

	public Date getDataprocessamento() {
		return dataprocessamento;
	}

	public String getCodigobarras() {
		return codigobarras;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setLinhadigitavel(String linhadigitavel) {
		this.linhadigitavel = linhadigitavel;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
	}

	public void setSiglamodalidade(String siglamodalidade) {
		this.siglamodalidade = siglamodalidade;
	}

	public void setNossonumero(long nossonumero) {
		this.nossonumero = nossonumero;
	}

	public void setDvnossonumero(int dvnossonumero) {
		this.dvnossonumero = dvnossonumero;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public void setAceite(Aceite aceite) {
		this.aceite = aceite;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public void setDatadocumento(Date datadocumento) {
		this.datadocumento = datadocumento;
	}

	public void setDataprocessamento(Date dataprocessamento) {
		this.dataprocessamento = dataprocessamento;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
