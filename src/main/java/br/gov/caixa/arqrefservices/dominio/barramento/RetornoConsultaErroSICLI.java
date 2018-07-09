package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import br.gov.caixa.arqrefservices.dominio.ErroSICLI;

public class RetornoConsultaErroSICLI implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6629239182695261540L;
	
	private List<ErroSICLI> listaErroSICLI;

	@XmlElement(name = "LISTA_ERROS")
	public List<ErroSICLI> getListaErroSICLI() {
		return listaErroSICLI;
	}

	public void setListaErroSICLI(List<ErroSICLI> listaErroSICLI) {
		this.listaErroSICLI = listaErroSICLI;
	}
	
	

	
}
