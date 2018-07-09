
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BENEFICIARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_BOLETO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_INICIO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DATA_FIM" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FLAG_SITUACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAGINA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
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
@XmlType(name = "CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE", propOrder = {
    "codigobeneficiario",
    "tipoboleto",
    "datainicio",
    "datafim",
    "flagsituacao",
    "pagina"
})
public class ConsultaSolicitacoesPreImpresso {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    
    @XmlElement(name = "TIPO_BOLETO")
    protected String tipoboleto;
    
    @XmlElement(name = "DATA_INICIO")
    protected Date datainicio;
    
    @XmlElement(name = "DATA_FIM")
    protected Date datafim;
    
    @XmlElement(name = "FLAG_SITUACAO", required = true)
    protected String flagsituacao;
    
    @XmlElement(name = "PAGINA")
    protected int pagina;

    
	public String getTipoboleto() {
		return tipoboleto;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public Date getDatafim() {
		return datafim;
	}

	public String getFlagsituacao() {
		return flagsituacao;
	}

	public int getPagina() {
		return pagina;
	}

	public int getCodigobeneficiario() {
		return codigobeneficiario;
	}

	public void setCodigobeneficiario(int codigobeneficiario) {
		this.codigobeneficiario = codigobeneficiario;
	}

	public void setTipoboleto(String tipoboleto) {
		this.tipoboleto = tipoboleto;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public void setFlagsituacao(String flagsituacao) {
		this.flagsituacao = flagsituacao;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

    
}
