package br.gov.caixa.arqrefservices.dao.barramento;

import javax.ejb.Singleton;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
//import br.gov.caixa.emprestimo.qualifier.Siemp;
import br.gov.caixa.arqrefservices.qualificador.Siemp;

/**
 * Factory das DAO's para comunicacao com o Barramento.
 * 
 * @author eduardo
 *
 */
@Singleton
public class DAOBarramentoFactory {
	
	@Inject
	private Instance<SiempDaoBarramento> sourceSiempDAOBarramento;
	
	@Inject
	private Instance<ConexaoSIRICMQ> conexaoSIRICMQ;
	
	
	@Produces
	@Siemp
	public DAOBarramento getSiempDAOBarramento() {
		return sourceSiempDAOBarramento.get();
	}
	
	/**
	 * Metodo que produz uma conexao
	 * do tipo da anotacao (SIRIC)
	 * @return
	 */
	@Produces
	@SIRICMQ
	public DAOBarramento getConexaoSIRICMQ(){
		return conexaoSIRICMQ.get();
	}
	
}
