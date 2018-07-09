package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;

/**
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 *          Unidade da Caixa Economica Federal objeto de dominio. Usado com
 *          objeto de transicao para consulta FECVW002_UNIDADE
 * 
 */
public class TipoUnidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6253098490769811773L;

	private Integer codigo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer numeroTipoUnidade) {
		this.codigo = numeroTipoUnidade;
	}

	@Override
	public String toString() {
		return "TipoUnidade [codigo=" + codigo + "]";
	}

}
