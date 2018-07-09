
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CEDENTE_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CEDENTE_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="CPF">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="99999999999"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="CNPJ">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="99999999999999"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="AGENCIA_VINCULACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENDERECO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}ENDERECO_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CEDENTE_TYPE", propOrder = {
    "numero",
    "nome",
    "cpf",
    "cnpj",
    "agenciavinculacao",
    "endereco"
})
public class Cedente {

    @XmlElement(name = "NUMERO")
    private int numero;
    
    @XmlElement(name = "NOME", required = true)
    private String nome;
    
    @XmlElement(name = "CPF")
    private Long cpf;
    
    @XmlElement(name = "CNPJ")
    private Long cnpj;
    
    @XmlElement(name = "AGENCIA_VINCULACAO")
    private int agenciavinculacao;
    
    @XmlElement(name = "ENDERECO", required = true)
    private Endereco endereco;

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public int getAgenciavinculacao() {
		return agenciavinculacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public void setAgenciavinculacao(int agenciavinculacao) {
		this.agenciavinculacao = agenciavinculacao;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
}