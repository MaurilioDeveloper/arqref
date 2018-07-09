
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_descontos_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_descontos_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCONTO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_desconto_Type" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulta_boleto_descontos_Type", propOrder = {
    "desconto"
})
public class ConsultaBoletoDescontos {

    @XmlElement(name = "DESCONTO", required = true)
    private List<ConsultaBoletoDesconto> desconto;

    /**
     * Gets the value of the desconto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desconto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDESCONTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaBoletoDesconto }
     * 
     * 
     */
    public List<ConsultaBoletoDesconto> getDesconto() {
        if (desconto == null) {
            desconto = new ArrayList<ConsultaBoletoDesconto>();
        }
        return this.desconto;
    }

}
