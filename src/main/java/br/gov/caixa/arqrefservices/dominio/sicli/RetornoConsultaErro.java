package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name="RET_CONSULTA_ERRO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class RetornoConsultaErro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3797572863636106634L;
	
	private List<DescricaoErro> descricaoErro;

	@XmlElementWrapper(name="LISTA_ERROS")
	@XmlElement(name = "DESC_ERRO")
	public List<DescricaoErro> getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(List<DescricaoErro> descricaoErro) {
		this.descricaoErro = descricaoErro;
	}

	@Override
	public String toString() {
		return "RetornoConsultaErro [descricaoErro=" + descricaoErro + "]";
	}
	
	

}
