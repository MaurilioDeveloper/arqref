
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de INCLUI_BOLETO_ENTRADA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="INCLUI_BOLETO_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}inclui_boleto_entrada_Type">
 *       &lt;sequence>
 *         &lt;element name="FLAG_REGISTRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCLUI_BOLETO_ENTRADA_TYPE", propOrder = {"flagregistro"})
public class IncluiBoletoEntrada extends IncluiBoletoEntradaType {

    @XmlElement(name = "FLAG_REGISTRO", required = true)
    protected String flagregistro;

	public String getFlagregistro() {
		return flagregistro;
	}

	public void setFlagregistro(String flagregistro) {
		this.flagregistro = flagregistro;
	}
}
