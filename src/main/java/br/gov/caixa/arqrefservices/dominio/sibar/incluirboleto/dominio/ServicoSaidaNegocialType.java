
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de servico_saida_negocial_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="servico_saida_negocial_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}SERVICO_SAIDA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="DADOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}dados_saida_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servico_saida_negocial_Type", propOrder = {
    "dados"
})
public class ServicoSaidaNegocialType extends SERVICOSAIDA
{

    @XmlElement(name = "DADOS")
    protected IncluirBoletoSaidaDados dados;

    /**
     * Obt�m o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link IncluirBoletoSaidaDados }
     *     
     */
    public IncluirBoletoSaidaDados getDADOS() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link IncluirBoletoSaidaDados }
     *     
     */
    public void setDADOS(IncluirBoletoSaidaDados value) {
        this.dados = value;
    }

}
