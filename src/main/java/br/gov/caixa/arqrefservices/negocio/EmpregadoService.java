package br.gov.caixa.arqrefservices.negocio;

import java.io.IOException;

import javax.ejb.Local;
import javax.naming.NamingException;
import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefservices.dominio.Empregado;

@Local
public interface EmpregadoService {

	 Empregado getEmpregadoPorMatricula(String nuMatricula) throws PersistenceException;
	 
	 Empregado getEmpregado(String login) throws BusinessException;
}
