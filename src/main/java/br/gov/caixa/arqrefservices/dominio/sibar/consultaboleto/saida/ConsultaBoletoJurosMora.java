
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlType(propOrder = {"tipo","data","valor","percentual"})
public class ConsultaBoletoJurosMora implements Serializable {
    
	private static final long serialVersionUID = -3310057183774193606L;
	
    private String tipo;
        
    private Date data;
        
    private BigDecimal valor;
        
    private BigDecimal percentual;

    @XmlElement(name = "TIPO", required = true)
	public String getTipo() {
		return tipo;
	}

    @XmlElement(name = "DATA")
    @XmlSchemaType(name = "date")
	public Date getData() {
		return data;
	}

    @XmlElement(name = "VALOR")
	public BigDecimal getValor() {
		return valor;
	}

    @XmlElement(name = "PERCENTUAL")
	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

}
