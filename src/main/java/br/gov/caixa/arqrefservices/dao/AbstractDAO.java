package br.gov.caixa.arqrefservices.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.gov.caixa.arqrefservices.qualificador.ArqrefServiceEntityManager;

/**
 * 
 * @author gotardo.soares - Indra Company
 * 
 *         Classe DAO Abstrata
 * 
 * @param <T>
 */
public abstract class AbstractDAO<T> implements Serializable {

	private static final long serialVersionUID = -3322428248036391985L;

	@Inject
	private Logger LOGGER;

	public Class<T> entityClass;
	
	public AbstractDAO(){
		if(LOGGER == null){
			LOGGER = Logger.getLogger(getClass().getName());
		}
	}

	@Inject
	@ArqrefServiceEntityManager
	protected EntityManager entityManager;

	/**
	 * @author gotardo.soares - Indra Company
	 * 
	 * @param id
	 *            - Campo primario da tabela
	 * @return
	 */
	public T findByPrimaryKey(Integer id) throws PersistenceException {
		T result = null;
			LOGGER.entering(AbstractDAO.class.getName(), "findByPrimaryKey");
			result = entityManager.find(getEntityClass(), id);
		
		return result;
	}

	/**
	 * @author gotardo.soares - Indra Company
	 * 
	 *         Procura todos os registros
	 * 
	 * @param clazz
	 *            - Classe utilizada para busca.
	 * @param query
	 *            - Query a ser realizada.
	 * @param values
	 *            - Parametros da query.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> clazz, String query) throws PersistenceException {
		LOGGER.entering(AbstractDAO.class.getName(), "findAll");
		Query qr = this.prepareQuery(query, null);
		LOGGER.exiting(AbstractDAO.class.getName(), "findAll");
		return qr.getResultList();
	}

	/**
	 * @author gotardo.soares - Indra Company
	 * 
	 *         Procura todos os registros
	 * 
	 * @param clazz
	 *            - Classe utilizada para busca.
	 * @param query
	 *            - Query a ser realizada.
	 * @param values
	 *            - Parametros da query.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T findSingleResult(Class<T> clazz, String query, Object... values) throws PersistenceException {
		LOGGER.entering(AbstractDAO.class.getName(), "findSingleResult");
		Query qr = this.prepareQuery(query, values);
		LOGGER.exiting(AbstractDAO.class.getName(), "findSingleResult");
		return (T) qr.getSingleResult();
	}

	/**
	 * @author gotardo.soares - Indra Company
	 * 
	 *         Usado para preparar a query para executar a listagem ou inclusão
	 * 
	 * @param query
	 * @param values
	 * @param em
	 * @return
	 */
	private Query prepareQuery(String query, Object[] values) throws IllegalArgumentException {
		LOGGER.entering(AbstractDAO.class.getName(), "prepareQuery");
		Query qr = null;
		if (values != null) {
			qr = entityManager.createQuery(query);
			for (int i = 0; i < values.length; i++) {
				Object object = values[i];
				qr.setParameter(i + 1, object);
			}
		} else {
			qr = entityManager.createQuery(query);
		}
		LOGGER.exiting(AbstractDAO.class.getName(), "prepareQuery");
		return qr;
	}

	/**
	 * @author Eduardo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass() {
		if (entityClass == null) {
			Type type = getClass().getGenericSuperclass();
			if (type instanceof ParameterizedType) {
				ParameterizedType paramType = (ParameterizedType) type;
				entityClass = (Class<T>) paramType.getActualTypeArguments()[0];
			} else {
				throw new IllegalArgumentException("Erro ao tentar obter o tipo de classe da entidade");
			}
		}

		return entityClass;
	}

}
