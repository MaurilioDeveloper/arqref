package br.gov.caixa.arqrefservices.negocio;

import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefservices.dominio.Unidade;

public interface IUnidade {
	
	public Unidade consultarUnidadePorNumeroUnidade(Integer nuUnidade) throws PersistenceException;
	
	public Unidade consultarUnidadeComSRPorNumeroUnidade(Integer nuUnidade) throws PersistenceException;

}
