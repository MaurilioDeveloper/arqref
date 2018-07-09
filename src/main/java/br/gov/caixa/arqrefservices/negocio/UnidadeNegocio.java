package br.gov.caixa.arqrefservices.negocio;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefservices.dao.unidade.UnidadeDAO;
import br.gov.caixa.arqrefservices.dao.unidade.VinculoUnidadeDAO;
import br.gov.caixa.arqrefservices.dominio.Unidade;
import br.gov.caixa.arqrefservices.dominio.transicao.UnidadeTO;
import br.gov.caixa.arqrefservices.dominio.transicao.VinculoUnidadeTO;

@Stateless
@LocalBean
public class UnidadeNegocio implements IUnidade{

	@Inject
	private UnidadeDAO unidadeDAO;	
	
	@Inject
	private VinculoUnidadeDAO vinculoUnidadeDAO;
	
	private Logger log = Logger.getLogger(UnidadeNegocio.class.getName());
	
	public Unidade consultarUnidadePorNumeroUnidade(Integer nuUnidade)
			throws PersistenceException {
		log.info("UnidadeNegocio - INICIO getUnidadePorNumeroUnidade");
		log.info(nuUnidade.toString());
		UnidadeTO unidadeTO = unidadeDAO.getUnidadePorNumeroUnidade(nuUnidade);
		Unidade unidade  = unidadeTO.getUnidade();
		log.info("UnidadeNegocio - FIM getUnidadePorNumeroUnidade");
		return unidade;
	}
	
	public Unidade consultarUnidadeComSRPorNumeroUnidade(Integer nuUnidade)
			throws PersistenceException {
		log.info("UnidadeNegocio - INICIO getUnidadePorNumeroUnidade");
		log.info(nuUnidade.toString());
		
		UnidadeTO unidadeTO = unidadeDAO.getUnidadePorNumeroUnidade(nuUnidade);
		VinculoUnidadeTO vinculoUnidadeTO =  vinculoUnidadeDAO.getVinculoUnidadePorNumeroUnidade(nuUnidade);
		Unidade unidade  = unidadeTO.getUnidade();
		UnidadeTO srTO = null;
		//so seta superintedencia regional caso tenha retorno da consulta
		//de unidade vinculada
		if(vinculoUnidadeTO != null){
			srTO = unidadeDAO.getUnidadePorNumeroUnidade(vinculoUnidadeTO.getNumeroSR());			
			Unidade sr = srTO.getUnidade();
			unidade.setSuperintendenciaRegional(sr);
		}
		
		
		log.info("UnidadeNegocio - FIM getUnidadePorNumeroUnidade");
		return unidade;
	}

}
