package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.ErroSICLI;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="RET_CLIENTE_DETALHADO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class RetronoClienteDetalhado implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 112387850314398836L;

	private ProximoCampo proximoCampo;
	
	private CamposRetornados camposRetornados;
	
	private List<ErroSICLI> listaErroSICLI;

	@XmlElement(name="PROXIMO_CAMPO")
	public ProximoCampo getProximoCampo() {
		return proximoCampo;
	}

	public void setProximoCampo(ProximoCampo proximoCampo) {
		this.proximoCampo = proximoCampo;
	}

	@XmlElement(name="CAMPOS_RETORNADOS")
	public CamposRetornados getCamposRetornados() {
		return camposRetornados;
	}

	public void setCamposRetornados(CamposRetornados camposRetornados) {
		this.camposRetornados = camposRetornados;
	}
	
	@XmlElementWrapper(name="LISTA_ERROS")
	@XmlElement(name="DESC_ERRO")
	public List<ErroSICLI> getListaErroSICLI() {
		return listaErroSICLI;
	}
	public void setListaErroSICLI(List<ErroSICLI> listaErroSICLI) {
		this.listaErroSICLI = listaErroSICLI;
	}	
	
	
}
