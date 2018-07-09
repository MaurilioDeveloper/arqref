
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de altera_boleto_titulo_entrada_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="altera_boleto_titulo_entrada_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOSSO_NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DOCUMENTO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type" minOccurs="0"/>
 *         &lt;element name="TIPO_ESPECIE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_ACEITE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JUROS_MORA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_juros_mora_Type" minOccurs="0"/>
 *         &lt;element name="POS_VENCIMENTO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_pos_vencimento_Type" minOccurs="0"/>
 *         &lt;element name="PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_pagador_Type" minOccurs="0"/>
 *         &lt;element name="SACADOR_AVALISTA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_sacador_avalista_Type" minOccurs="0"/>
 *         &lt;element name="MULTA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_multa_Type" minOccurs="0"/>
 *         &lt;element name="DESCONTOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_descontos_Type" minOccurs="0"/>
 *         &lt;element name="VALOR_IOF" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type" minOccurs="0"/>
 *         &lt;element name="IDENTIFICACAO_EMPRESA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FICHA_COMPENSACAO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_ficha_compensacao_Type" minOccurs="0"/>
 *         &lt;element name="RECIBO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_recibo_pagador_Type" minOccurs="0"/>
 *         &lt;element name="PAGAMENTO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_pagamento_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altera_boleto_titulo_entrada_Type", propOrder = {
    "nossonumero",
    "numerodocumento",
    "datavencimento",
    "valor",
    "tipoespecie",
    "flagaceite",
    "jurosmora",
    "posvencimento",
    "pagador",
    "sacadoravalista",
    "multa",
    "descontos",
    "valoriof",
    "identificacaoempresa",
    "fichacompensacao",
    "recibopagador",
    "pagamento"
})
public class AlteraBoletoTituloEntradaType {

    @XmlElement(name = "NOSSO_NUMERO")
    protected long nossonumero;
    @XmlElement(name = "NUMERO_DOCUMENTO")
    protected String numerodocumento;
    @XmlElement(name = "DATA_VENCIMENTO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datavencimento;
    @XmlElement(name = "VALOR")
    protected BigDecimal valor;
    @XmlElement(name = "TIPO_ESPECIE")
    protected Short tipoespecie;
    @XmlElement(name = "FLAG_ACEITE")
    protected String flagaceite;
    @XmlElement(name = "JUROS_MORA")
    protected AlteraBoletoJurosMoraType jurosmora;
    @XmlElement(name = "POS_VENCIMENTO")
    protected AlteraBoletoPosVencimentoType posvencimento;
    @XmlElement(name = "PAGADOR")
    protected AlteraBoletoPagadorType pagador;
    @XmlElement(name = "SACADOR_AVALISTA")
    protected AlteraBoletoSacadorAvalistaType sacadoravalista;
    @XmlElement(name = "MULTA")
    protected AlteraBoletoMultaType multa;
    @XmlElement(name = "DESCONTOS")
    protected AlteraBoletoDescontosType descontos;
    @XmlElement(name = "VALOR_IOF")
    protected BigDecimal valoriof;
    @XmlElement(name = "IDENTIFICACAO_EMPRESA")
    protected String identificacaoempresa;
    @XmlElement(name = "FICHA_COMPENSACAO")
    protected AlteraBoletoFichaCompensacaoType fichacompensacao;
    @XmlElement(name = "RECIBO_PAGADOR")
    protected AlteraBoletoReciboPagadorType recibopagador;
    @XmlElement(name = "PAGAMENTO")
    protected AlteraBoletoPagamentoType pagamento;

    /**
     * Obt�m o valor da propriedade nossonumero.
     * 
     */
    public long getNOSSONUMERO() {
        return nossonumero;
    }

    /**
     * Define o valor da propriedade nossonumero.
     * 
     */
    public void setNOSSONUMERO(long value) {
        this.nossonumero = value;
    }

    /**
     * Obt�m o valor da propriedade numerodocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOCUMENTO() {
        return numerodocumento;
    }

    /**
     * Define o valor da propriedade numerodocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOCUMENTO(String value) {
        this.numerodocumento = value;
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
     * Obt�m o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALOR() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALOR(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Obt�m o valor da propriedade tipoespecie.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTIPOESPECIE() {
        return tipoespecie;
    }

    /**
     * Define o valor da propriedade tipoespecie.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTIPOESPECIE(Short value) {
        this.tipoespecie = value;
    }

    /**
     * Obt�m o valor da propriedade flagaceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGACEITE() {
        return flagaceite;
    }

    /**
     * Define o valor da propriedade flagaceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGACEITE(String value) {
        this.flagaceite = value;
    }

    /**
     * Obt�m o valor da propriedade jurosmora.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoJurosMoraType }
     *     
     */
    public AlteraBoletoJurosMoraType getJUROSMORA() {
        return jurosmora;
    }

    /**
     * Define o valor da propriedade jurosmora.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoJurosMoraType }
     *     
     */
    public void setJUROSMORA(AlteraBoletoJurosMoraType value) {
        this.jurosmora = value;
    }

    /**
     * Obt�m o valor da propriedade posvencimento.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoPosVencimentoType }
     *     
     */
    public AlteraBoletoPosVencimentoType getPOSVENCIMENTO() {
        return posvencimento;
    }

    /**
     * Define o valor da propriedade posvencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoPosVencimentoType }
     *     
     */
    public void setPOSVENCIMENTO(AlteraBoletoPosVencimentoType value) {
        this.posvencimento = value;
    }

    /**
     * Obt�m o valor da propriedade pagador.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoPagadorType }
     *     
     */
    public AlteraBoletoPagadorType getPAGADOR() {
        return pagador;
    }

    /**
     * Define o valor da propriedade pagador.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoPagadorType }
     *     
     */
    public void setPAGADOR(AlteraBoletoPagadorType value) {
        this.pagador = value;
    }

    /**
     * Obt�m o valor da propriedade sacadoravalista.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoSacadorAvalistaType }
     *     
     */
    public AlteraBoletoSacadorAvalistaType getSACADORAVALISTA() {
        return sacadoravalista;
    }

    /**
     * Define o valor da propriedade sacadoravalista.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoSacadorAvalistaType }
     *     
     */
    public void setSACADORAVALISTA(AlteraBoletoSacadorAvalistaType value) {
        this.sacadoravalista = value;
    }

    /**
     * Obt�m o valor da propriedade multa.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoMultaType }
     *     
     */
    public AlteraBoletoMultaType getMULTA() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoMultaType }
     *     
     */
    public void setMULTA(AlteraBoletoMultaType value) {
        this.multa = value;
    }

    /**
     * Obt�m o valor da propriedade descontos.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoDescontosType }
     *     
     */
    public AlteraBoletoDescontosType getDESCONTOS() {
        return descontos;
    }

    /**
     * Define o valor da propriedade descontos.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoDescontosType }
     *     
     */
    public void setDESCONTOS(AlteraBoletoDescontosType value) {
        this.descontos = value;
    }

    /**
     * Obt�m o valor da propriedade valoriof.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORIOF() {
        return valoriof;
    }

    /**
     * Define o valor da propriedade valoriof.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORIOF(BigDecimal value) {
        this.valoriof = value;
    }

    /**
     * Obt�m o valor da propriedade identificacaoempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICACAOEMPRESA() {
        return identificacaoempresa;
    }

    /**
     * Define o valor da propriedade identificacaoempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICACAOEMPRESA(String value) {
        this.identificacaoempresa = value;
    }

    /**
     * Obt�m o valor da propriedade fichacompensacao.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoFichaCompensacaoType }
     *     
     */
    public AlteraBoletoFichaCompensacaoType getFICHACOMPENSACAO() {
        return fichacompensacao;
    }

    /**
     * Define o valor da propriedade fichacompensacao.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoFichaCompensacaoType }
     *     
     */
    public void setFICHACOMPENSACAO(AlteraBoletoFichaCompensacaoType value) {
        this.fichacompensacao = value;
    }

    /**
     * Obt�m o valor da propriedade recibopagador.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoReciboPagadorType }
     *     
     */
    public AlteraBoletoReciboPagadorType getRECIBOPAGADOR() {
        return recibopagador;
    }

    /**
     * Define o valor da propriedade recibopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoReciboPagadorType }
     *     
     */
    public void setRECIBOPAGADOR(AlteraBoletoReciboPagadorType value) {
        this.recibopagador = value;
    }

    /**
     * Obt�m o valor da propriedade pagamento.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoPagamentoType }
     *     
     */
    public AlteraBoletoPagamentoType getPAGAMENTO() {
        return pagamento;
    }

    /**
     * Define o valor da propriedade pagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoPagamentoType }
     *     
     */
    public void setPAGAMENTO(AlteraBoletoPagamentoType value) {
        this.pagamento = value;
    }

}
