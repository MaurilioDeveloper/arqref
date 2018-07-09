
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SOLICITACOES_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SOLICITACOES_PRE_IMPRESSO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOLICITACAO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SOLICITACAO_PRE_IMPRESSO_TYPE" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOLICITACOES_PRE_IMPRESSO_TYPE", propOrder = {
    "solicitacao"
})
public class SolicitacoesPreImpresso {

    @XmlElement(name = "SOLICITACAO")
    protected List<SolicitacaoPreImpresso> solicitacao;

    /**
     * Gets the value of the solicitacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOLICITACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitacaoPreImpresso }
     * 
     * 
     */
    public List<SolicitacaoPreImpresso> getSolicitacao() {
        if (solicitacao == null) {
            solicitacao = new ArrayList<SolicitacaoPreImpresso>();
        }
        return this.solicitacao;
    }

}
