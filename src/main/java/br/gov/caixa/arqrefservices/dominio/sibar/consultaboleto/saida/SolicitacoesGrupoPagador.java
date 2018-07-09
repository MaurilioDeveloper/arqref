
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SOLICITACOES_GRUPO_PAGADOR_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SOLICITACOES_GRUPO_PAGADOR_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOLICITACAO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SOLICITACAO_GRUPO_PAGADOR_TYPE" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOLICITACOES_GRUPO_PAGADOR_TYPE", propOrder = {
    "solicitacao"
})
public class SolicitacoesGrupoPagador {

    @XmlElement(name = "SOLICITACAO")
    protected List<SolicitacaoGrupoPagador> solicitacao;

    public List<SolicitacaoGrupoPagador> getSolicitacao() {
        if (solicitacao == null) {
            solicitacao = new ArrayList<SolicitacaoGrupoPagador>();
        }
        return this.solicitacao;
    }

}
