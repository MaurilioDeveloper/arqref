package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="COMPROVANTE_COMPLEMENTAR_RI")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ComprovanteComplementarRI  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4017735707925315023L;

	private String numeroSequencialRenda;
	
	private String codigoComporvanteComplementarRI;

	@XmlElement(name="NUM_SEQUENCIAL_RENDA")
	public String getNumeroSequencialRenda() {
		return numeroSequencialRenda;
	}

	public void setNumeroSequencialRenda(String numeroSequencialRenda) {
		this.numeroSequencialRenda = numeroSequencialRenda;
	}

	@XmlElement(name="COD_COMPR_COMPLEMENTAR_RI")
	public String getCodigoComporvanteComplementarRI() {
		return codigoComporvanteComplementarRI;
	}

	public void setCodigoComporvanteComplementarRI(
			String codigoComporvanteComplementarRI) {
		this.codigoComporvanteComplementarRI = codigoComporvanteComplementarRI;
	}

	@Override
	public String toString() {
		return "ComprovanteComplementarRI [numeroSequencialRenda="
				+ numeroSequencialRenda + ", codigoComporvanteComplementarRI="
				+ codigoComporvanteComplementarRI + "]";
	}
	
	

}
