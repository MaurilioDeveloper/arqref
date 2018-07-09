package br.gov.caixa.arqrefservices.dao.unidade;

import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefservices.dao.AbstractDAO;
import br.gov.caixa.arqrefservices.dao.empregado.EmpregadoDAO;
import br.gov.caixa.arqrefservices.dominio.Unidade;
import br.gov.caixa.arqrefservices.dominio.transicao.UnidadeTO;

public class UnidadeDAO extends AbstractDAO<UnidadeTO>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5066438800625974071L;
	
	private final static Logger LOGGER = Logger.getLogger(UnidadeDAO.class.getName());

	public UnidadeTO getUnidadePorNumeroUnidade(Integer nuUnidade) throws PersistenceException {
		LOGGER.entering(EmpregadoDAO.class.getName(), "getUnidadePorNumeroUnidade");

		UnidadeTO unidadeTO = this.findByPrimaryKey(nuUnidade);
		
		LOGGER.exiting(UnidadeDAO.class.getName(), "getUnidadePorNumeroUnidade");

		return unidadeTO;
	}

}
