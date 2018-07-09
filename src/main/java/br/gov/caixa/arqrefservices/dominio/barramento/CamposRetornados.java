package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.Cocli;

/**
 * Classe para montar os campos retornados
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="CAMPOS_RETORNADOS")
public class CamposRetornados implements Serializable {

	private static final long serialVersionUID = 4183842659005585845L;

	private Cocli cocli;
	

	@XmlElement(name="COCLI_ATIVO")
	public Cocli getCocli() {
		return this.cocli;
	}
	public void setCocli(Cocli cocli) {
		this.cocli = cocli;
	}

}
