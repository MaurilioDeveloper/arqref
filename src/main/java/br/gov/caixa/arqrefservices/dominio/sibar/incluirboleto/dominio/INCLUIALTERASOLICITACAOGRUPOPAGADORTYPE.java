
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE">
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
 *         &lt;element name="TIPO_REGISTRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODIGO_OBTER_ENVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ENVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CODIGO_OBTER_VALOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALOR_TITULO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INDICADOR_PROTESTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
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
 *         &lt;element name="CODIGO_ESPECIE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODIGO_ACEITE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODIGO_ENDOSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPLEMENTARES" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}COMPLEMENTARES_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE", propOrder = {
    "codigobeneficiario",
    "codigogrupo",
    "datasolicitacao",
    "tiporegistro",
    "codigoobterenvio",
    "tipoenvio",
    "datavencimento",
    "codigoobtervalor",
    "valortitulo",
    "indicadorprotesto",
    "prazoprotestodevolucao",
    "codigoespecie",
    "codigoaceite",
    "codigoendosso",
    "complementares"
})
public class INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    @XmlElement(name = "CODIGO_GRUPO")
    protected short codigogrupo;
    @XmlElement(name = "DATA_SOLICITACAO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datasolicitacao;
    @XmlElement(name = "TIPO_REGISTRO")
    protected short tiporegistro;
    @XmlElement(name = "CODIGO_OBTER_ENVIO")
    protected short codigoobterenvio;
    @XmlElement(name = "TIPO_ENVIO")
    protected short tipoenvio;
    @XmlElement(name = "DATA_VENCIMENTO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datavencimento;
    @XmlElement(name = "CODIGO_OBTER_VALOR")
    protected short codigoobtervalor;
    @XmlElement(name = "VALOR_TITULO", required = true)
    protected BigDecimal valortitulo;
    @XmlElement(name = "INDICADOR_PROTESTO", required = true)
    protected String indicadorprotesto;
    @XmlElement(name = "PRAZO_PROTESTO_DEVOLUCAO")
    protected short prazoprotestodevolucao;
    @XmlElement(name = "CODIGO_ESPECIE")
    protected short codigoespecie;
    @XmlElement(name = "CODIGO_ACEITE", required = true)
    protected String codigoaceite;
    @XmlElement(name = "CODIGO_ENDOSSO", required = true)
    protected String codigoendosso;
    @XmlElement(name = "COMPLEMENTARES")
    protected COMPLEMENTARESTYPE complementares;

    /**
     * Obt�m o valor da propriedade codigobeneficiario.
     * 
     */
    public int getCODIGOBENEFICIARIO() {
        return codigobeneficiario;
    }

    /**
     * Define o valor da propriedade codigobeneficiario.
     * 
     */
    public void setCODIGOBENEFICIARIO(int value) {
        this.codigobeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade codigogrupo.
     * 
     */
    public short getCODIGOGRUPO() {
        return codigogrupo;
    }

    /**
     * Define o valor da propriedade codigogrupo.
     * 
     */
    public void setCODIGOGRUPO(short value) {
        this.codigogrupo = value;
    }

    /**
     * Obt�m o valor da propriedade datasolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATASOLICITACAO() {
        return datasolicitacao;
    }

    /**
     * Define o valor da propriedade datasolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATASOLICITACAO(XMLGregorianCalendar value) {
        this.datasolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade tiporegistro.
     * 
     */
    public short getTIPOREGISTRO() {
        return tiporegistro;
    }

    /**
     * Define o valor da propriedade tiporegistro.
     * 
     */
    public void setTIPOREGISTRO(short value) {
        this.tiporegistro = value;
    }

    /**
     * Obt�m o valor da propriedade codigoobterenvio.
     * 
     */
    public short getCODIGOOBTERENVIO() {
        return codigoobterenvio;
    }

    /**
     * Define o valor da propriedade codigoobterenvio.
     * 
     */
    public void setCODIGOOBTERENVIO(short value) {
        this.codigoobterenvio = value;
    }

    /**
     * Obt�m o valor da propriedade tipoenvio.
     * 
     */
    public short getTIPOENVIO() {
        return tipoenvio;
    }

    /**
     * Define o valor da propriedade tipoenvio.
     * 
     */
    public void setTIPOENVIO(short value) {
        this.tipoenvio = value;
    }

    /**
     * Obt�m o valor da propriedade datavencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAVENCIMENTO() {
        return datavencimento;
    }

    /**
     * Define o valor da propriedade datavencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAVENCIMENTO(XMLGregorianCalendar value) {
        this.datavencimento = value;
    }

    /**
     * Obt�m o valor da propriedade codigoobtervalor.
     * 
     */
    public short getCODIGOOBTERVALOR() {
        return codigoobtervalor;
    }

    /**
     * Define o valor da propriedade codigoobtervalor.
     * 
     */
    public void setCODIGOOBTERVALOR(short value) {
        this.codigoobtervalor = value;
    }

    /**
     * Obt�m o valor da propriedade valortitulo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORTITULO() {
        return valortitulo;
    }

    /**
     * Define o valor da propriedade valortitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORTITULO(BigDecimal value) {
        this.valortitulo = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorprotesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORPROTESTO() {
        return indicadorprotesto;
    }

    /**
     * Define o valor da propriedade indicadorprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORPROTESTO(String value) {
        this.indicadorprotesto = value;
    }

    /**
     * Obt�m o valor da propriedade prazoprotestodevolucao.
     * 
     */
    public short getPRAZOPROTESTODEVOLUCAO() {
        return prazoprotestodevolucao;
    }

    /**
     * Define o valor da propriedade prazoprotestodevolucao.
     * 
     */
    public void setPRAZOPROTESTODEVOLUCAO(short value) {
        this.prazoprotestodevolucao = value;
    }

    /**
     * Obt�m o valor da propriedade codigoespecie.
     * 
     */
    public short getCODIGOESPECIE() {
        return codigoespecie;
    }

    /**
     * Define o valor da propriedade codigoespecie.
     * 
     */
    public void setCODIGOESPECIE(short value) {
        this.codigoespecie = value;
    }

    /**
     * Obt�m o valor da propriedade codigoaceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOACEITE() {
        return codigoaceite;
    }

    /**
     * Define o valor da propriedade codigoaceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOACEITE(String value) {
        this.codigoaceite = value;
    }

    /**
     * Obt�m o valor da propriedade codigoendosso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOENDOSSO() {
        return codigoendosso;
    }

    /**
     * Define o valor da propriedade codigoendosso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOENDOSSO(String value) {
        this.codigoendosso = value;
    }

    /**
     * Obt�m o valor da propriedade complementares.
     * 
     * @return
     *     possible object is
     *     {@link COMPLEMENTARESTYPE }
     *     
     */
    public COMPLEMENTARESTYPE getCOMPLEMENTARES() {
        return complementares;
    }

    /**
     * Define o valor da propriedade complementares.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPLEMENTARESTYPE }
     *     
     */
    public void setCOMPLEMENTARES(COMPLEMENTARESTYPE value) {
        this.complementares = value;
    }

}
