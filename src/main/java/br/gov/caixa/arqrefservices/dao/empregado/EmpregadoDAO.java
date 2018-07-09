package br.gov.caixa.arqrefservices.dao.empregado;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefservices.dao.AbstractDAO;
import br.gov.caixa.arqrefservices.dominio.Empregado;

public class EmpregadoDAO extends AbstractDAO<Empregado> {

	private static final long serialVersionUID = 7225657330332607025L;

	@Inject
	private Logger LOGGER;
	
	public EmpregadoDAO(){
		if(LOGGER == null){
			LOGGER = Logger.getLogger(EmpregadoDAO.class.getName());
		}
	}

	public Empregado getEmpregadoPorMatricula(String nuMatricula) throws PersistenceException {
		LOGGER.entering(EmpregadoDAO.class.getName(), "getEmpregadoPorMatricula");

		if(nuMatricula.contains("C") || nuMatricula.contains("c")){
			nuMatricula = nuMatricula.substring(1);
		}
		Empregado empregado = this.findByPrimaryKey(Integer.valueOf(nuMatricula));
		
		LOGGER.exiting(EmpregadoDAO.class.getName(), "getEmpregadoPorMatricula");

		return empregado;
	}

}
