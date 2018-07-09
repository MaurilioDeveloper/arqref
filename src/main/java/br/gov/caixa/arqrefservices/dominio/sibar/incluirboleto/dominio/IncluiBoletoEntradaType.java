
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inclui_boleto_entrada_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inclui_boleto_entrada_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BENEFICIARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TITULO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}titulo_entrada_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inclui_boleto_entrada_Type", propOrder = {
    "codigobeneficiario",
    "titulo"
})
@XmlSeeAlso({
    IncluiBoletoEntrada.class
})
public class IncluiBoletoEntradaType {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected String codigobeneficiario;
    
    @XmlElement(name = "TITULO", required = true)
    protected TituloEntradaType titulo;

	public String getCodigobeneficiario() {
		return codigobeneficiario;
	}

	public TituloEntradaType getTitulo() {
		return titulo;
	}

	public void setCodigobeneficiario(String codigobeneficiario) {
		this.codigobeneficiario = codigobeneficiario;
	}

	public void setTitulo(TituloEntradaType titulo) {
		this.titulo = titulo;
	}
    
}
