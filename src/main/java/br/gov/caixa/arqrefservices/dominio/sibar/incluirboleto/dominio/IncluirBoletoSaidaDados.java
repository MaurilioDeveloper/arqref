
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_saida_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saida_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}DADOS_SAIDA_TYPE">
 *       &lt;choice>
 *         &lt;element name="INCLUI_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}inclui_boleto_saida_Type"/>
 *         &lt;element name="ALTERA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_saida_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_saida_Type", propOrder = {
    "incluiboleto",
    "alteraboleto"
})
public class IncluirBoletoSaidaDados extends DadosSaidaSibar
{

    @XmlElement(name = "INCLUI_BOLETO")
    protected IncluiBoletoSaidaType incluiboleto;
    
    @XmlElement(name = "ALTERA_BOLETO")
    protected AlteraBoletoSaidaType alteraboleto;

	public IncluiBoletoSaidaType getIncluiboleto() {
		return incluiboleto;
	}

	public AlteraBoletoSaidaType getAlteraboleto() {
		return alteraboleto;
	}

	public void setIncluiboleto(IncluiBoletoSaidaType incluiboleto) {
		this.incluiboleto = incluiboleto;
	}

	public void setAlteraboleto(AlteraBoletoSaidaType alteraboleto) {
		this.alteraboleto = alteraboleto;
	}

	@XmlTransient
	public String getUrl() {		
		if (getIncluiboleto() != null) {
			return getIncluiboleto().getURL();			
		}
		return "";
	}

    
}
