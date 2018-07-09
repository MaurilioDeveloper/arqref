package br.gov.caixa.arqrefservices.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.gov.caixa.arqrefservices.qualificador.ArqrefServiceEntityManager;

/**
 * 
 * @author gotardo.soares
 * 
 * Responsavel por criar o Producer do EntityFactory
 *
 */
@ApplicationScoped
public class EntityManagerProducer {

	/*@Produces
	@PersistenceUnit(unitName="fecDS")
	EntityManagerFactory entityManagerFactory;*/
	@ArqrefServiceEntityManager
	@Produces
	@PersistenceContext(unitName="fecDS")
	EntityManager entityManager;
}
