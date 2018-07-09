package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RAMO_ATIVIDADE_CNAE")
public class RamoAtividadeCNAE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CNAE cnae;

	@XmlElement(name = "CNAE")
	public CNAE getCnae() {
		return cnae;
	}

	public void setCnae(CNAE cnae) {
		this.cnae = cnae;
	}

	

	

	

	
	
	

}
