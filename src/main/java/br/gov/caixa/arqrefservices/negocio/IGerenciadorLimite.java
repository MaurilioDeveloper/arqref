package br.gov.caixa.arqrefservices.negocio;

import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefservices.dominio.limite.GerenciadorLimitesRequest;
import br.gov.caixa.arqrefservices.dominio.limite.GerenciadorLimitesResponse;

public interface IGerenciadorLimite {
	
	public GerenciadorLimitesResponse manterLimites(GerenciadorLimitesRequest limiteRequest) throws PersistenceException;
	

}
