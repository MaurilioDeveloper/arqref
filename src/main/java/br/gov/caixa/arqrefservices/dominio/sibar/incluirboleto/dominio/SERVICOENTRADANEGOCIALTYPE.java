
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SERVICO_ENTRADA_NEGOCIAL_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SERVICO_ENTRADA_NEGOCIAL_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}SERVICO_ENTRADA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="DADOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}DADOS_ENTRADA_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICO_ENTRADA_NEGOCIAL_TYPE", propOrder = {
    "dados"
})
public class SERVICOENTRADANEGOCIALTYPE
    extends SERVICOENTRADATYPE
{

    @XmlElement(name = "DADOS", required = true)
    protected IncluirBoletoEntradaDados dados;

    /**
     * Obt�m o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link IncluirBoletoEntradaDados }
     *     
     */
    public IncluirBoletoEntradaDados getDADOS() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link IncluirBoletoEntradaDados }
     *     
     */
    public void setDADOS(IncluirBoletoEntradaDados value) {
        this.dados = value;
    }

}
