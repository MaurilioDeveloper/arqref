 	
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DESCRICOES_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DESCRICOES_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REGISTRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBTER_ENVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBTER_VALOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROTESTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESPECIE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACEITE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENDOSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRICOES_TYPE", propOrder = {
    "registro",
    "obterenvio",
    "envio",
    "obtervalor",
    "protesto",
    "especie",
    "aceite",
    "endosso"
})
public class Descricoes {

    @XmlElement(name = "REGISTRO", required = true)
    private String registro;
    
    @XmlElement(name = "OBTER_ENVIO", required = true)
    private String obterenvio;
    
    @XmlElement(name = "ENVIO", required = true)
    private String envio;
    
    @XmlElement(name = "OBTER_VALOR", required = true)
    private String obtervalor;
    
    @XmlElement(name = "PROTESTO", required = true)
    private String protesto;
    
    @XmlElement(name = "ESPECIE", required = true)
    private String especie;
    
    @XmlElement(name = "ACEITE", required = true)
    private String aceite;
    
    @XmlElement(name = "ENDOSSO", required = true)
    private String endosso;

	public String getRegistro() {
		return registro;
	}

	public String getObterenvio() {
		return obterenvio;
	}

	public String getEnvio() {
		return envio;
	}

	public String getObtervalor() {
		return obtervalor;
	}

	public String getProtesto() {
		return protesto;
	}

	public String getEspecie() {
		return especie;
	}

	public String getAceite() {
		return aceite;
	}

	public String getEndosso() {
		return endosso;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public void setObterenvio(String obterenvio) {
		this.obterenvio = obterenvio;
	}

	public void setEnvio(String envio) {
		this.envio = envio;
	}

	public void setObtervalor(String obtervalor) {
		this.obtervalor = obtervalor;
	}

	public void setProtesto(String protesto) {
		this.protesto = protesto;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setAceite(String aceite) {
		this.aceite = aceite;
	}

	public void setEndosso(String endosso) {
		this.endosso = endosso;
	}

}
