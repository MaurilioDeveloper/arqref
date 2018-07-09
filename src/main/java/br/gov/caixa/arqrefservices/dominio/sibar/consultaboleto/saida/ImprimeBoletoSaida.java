
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IMPRIME_BOLETO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IMPRIME_BOLETO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CEDENTE" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CEDENTE_TYPE"/>
 *         &lt;element name="SACADO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SACADO_TYPE"/>
 *         &lt;element name="SACADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SACADOR_TYPE"/>
 *         &lt;element name="TITULO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}TITULO_TYPE"/>
 *         &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}VALOR_TYPE"/>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}MENSAGENS_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMPRIME_BOLETO_TYPE", propOrder = {
    "cedente",
    "sacado",
    "sacador",
    "titulo",
    "valor",
    "mensagens"
})
public class ImprimeBoletoSaida {

    @XmlElement(name = "CEDENTE", required = true)
    protected Cedente cedente;
    
    @XmlElement(name = "SACADO", required = true)
    protected Sacado sacado;
    
    @XmlElement(name = "SACADOR", required = true)
    protected Sacador sacador;
    
    @XmlElement(name = "TITULO", required = true)
    protected Titulo titulo;
    
    @XmlElement(name = "VALOR", required = true)
    protected Valor valor;
    
    @XmlElement(name = "MENSAGENS")
    protected Mensagens mensagens;

    /**
     * Obt�m o valor da propriedade cedente.
     * 
     * @return
     *     possible object is
     *     {@link Cedente }
     *     
     */
    public Cedente getCEDENTE() {
        return cedente;
    }

    /**
     * Define o valor da propriedade cedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cedente }
     *     
     */
    public void setCEDENTE(Cedente value) {
        this.cedente = value;
    }

    /**
     * Obt�m o valor da propriedade sacado.
     * 
     * @return
     *     possible object is
     *     {@link Sacado }
     *     
     */
    public Sacado getSACADO() {
        return sacado;
    }

    /**
     * Define o valor da propriedade sacado.
     * 
     * @param value
     *     allowed object is
     *     {@link Sacado }
     *     
     */
    public void setSACADO(Sacado value) {
        this.sacado = value;
    }

    /**
     * Obt�m o valor da propriedade sacador.
     * 
     * @return
     *     possible object is
     *     {@link Sacador }
     *     
     */
    public Sacador getSACADOR() {
        return sacador;
    }

    /**
     * Define o valor da propriedade sacador.
     * 
     * @param value
     *     allowed object is
     *     {@link Sacador }
     *     
     */
    public void setSACADOR(Sacador value) {
        this.sacador = value;
    }

    /**
     * Obt�m o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link Titulo }
     *     
     */
    public Titulo getTITULO() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Titulo }
     *     
     */
    public void setTITULO(Titulo value) {
        this.titulo = value;
    }

    /**
     * Obt�m o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Valor }
     *     
     */
    public Valor getVALOR() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Valor }
     *     
     */
    public void setVALOR(Valor value) {
        this.valor = value;
    }

    /**
     * Obt�m o valor da propriedade mensagens.
     * 
     * @return
     *     possible object is
     *     {@link Mensagens }
     *     
     */
    public Mensagens getMENSAGENS() {
        return mensagens;
    }

    /**
     * Define o valor da propriedade mensagens.
     * 
     * @param value
     *     allowed object is
     *     {@link Mensagens }
     *     
     */
    public void setMENSAGENS(Mensagens value) {
        this.mensagens = value;
    }

}
