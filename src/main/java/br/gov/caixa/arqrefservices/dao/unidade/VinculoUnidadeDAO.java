package br.gov.caixa.arqrefservices.dao.unidade;

import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefservices.dao.AbstractDAO;
import br.gov.caixa.arqrefservices.dao.empregado.EmpregadoDAO;
import br.gov.caixa.arqrefservices.dominio.transicao.VinculoUnidadeTO;

public class VinculoUnidadeDAO extends AbstractDAO<VinculoUnidadeTO>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5066438800625974071L;
	
	private final static Logger LOGGER = Logger.getLogger(VinculoUnidadeDAO.class.getName());

	public VinculoUnidadeTO getVinculoUnidadePorNumeroUnidade(Integer nuUnidade) throws PersistenceException {
		LOGGER.entering(EmpregadoDAO.class.getName(), "getUnidadePorNumeroUnidade");

		VinculoUnidadeTO vinculoUnidadeTO = this.findByPrimaryKey(nuUnidade);
		
		LOGGER.exiting(VinculoUnidadeDAO.class.getName(), "getUnidadePorNumeroUnidade");

		return vinculoUnidadeTO;
	}

}
