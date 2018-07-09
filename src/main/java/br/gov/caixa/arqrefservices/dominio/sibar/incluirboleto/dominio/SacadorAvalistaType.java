
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sacador_avalista_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sacador_avalista_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="CPF" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}cpf_Type"/>
 *           &lt;element name="NOME">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="40"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="CNPJ" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}cnpj_Type"/>
 *           &lt;element name="RAZAO_SOCIAL">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="40"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sacador_avalista_Type", propOrder = {
    "cpf",
    "nome",
    "cnpj",
    "razaosocial"
})
public class SacadorAvalistaType {

    @XmlElement(name = "CPF")
    protected Long cpf;
    
    @XmlElement(name = "NOME")
    protected String nome;
    
    @XmlElement(name = "CNPJ")
    protected Long cnpj;
    
    @XmlElement(name = "RAZAO_SOCIAL")
    protected String razaosocial;

	public Long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

}
