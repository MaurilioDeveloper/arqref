
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_pagador_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_pagador_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CPF" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}cpf_Type"/>
 *             &lt;element name="NOME">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;maxLength value="40"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CNPJ" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}cnpj_Type"/>
 *             &lt;element name="RAZAO_SOCIAL">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;maxLength value="40"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="ENDERECO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_endereco_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulta_boleto_pagador_Type", propOrder = {
    "cpf",
    "nome",
    "cnpj",
    "razaosocial",
    "endereco"
})
public class ConsultaBoletoPagador {

    @XmlElement(name = "CPF")
    private Long cpf;
    
    @XmlElement(name = "NOME")
    private String nome;
    
    @XmlElement(name = "CNPJ")
    private Long cnpj;
    
    @XmlElement(name = "RAZAO_SOCIAL")
    private String razaosocial;
    
    @XmlElement(name = "ENDERECO")
    private ConsultaBoletoEndereco endereco;

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

	public ConsultaBoletoEndereco getEndereco() {
		return endereco;
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

	public void setEndereco(ConsultaBoletoEndereco endereco) {
		this.endereco = endereco;
	}

    

}
