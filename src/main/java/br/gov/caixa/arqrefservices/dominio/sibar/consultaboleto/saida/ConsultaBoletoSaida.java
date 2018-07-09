
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;



@XmlType(propOrder={"titulo","flagregistro"})
@XmlSeeAlso({ConsultaBoletoTitulo.class})
public class ConsultaBoletoSaida implements Serializable{

	private static final long serialVersionUID = 1012814700415170741L;
	
    private ConsultaBoletoTitulo titulo;
    	
	private String flagregistro;

	
    @XmlElement(name = "TITULO", required = true)
	public ConsultaBoletoTitulo getTitulo() {
		return titulo;
	}

    @XmlElement(name = "FLAG_REGISTRO")
	public String getFlagregistro() {
		return flagregistro;
	}

	public void setTitulo(ConsultaBoletoTitulo titulo) {
		this.titulo = titulo;
	}

	public void setFlagregistro(String flagregistro) {
		this.flagregistro = flagregistro;
	}

	@XmlTransient
	public String getUrl() {
		if (getTitulo() != null) {
			return getTitulo().getUrl();			
		}
		return "";		
	}

    

}
