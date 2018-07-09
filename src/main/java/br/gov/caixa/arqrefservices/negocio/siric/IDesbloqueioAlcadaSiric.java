package br.gov.caixa.arqrefservices.negocio.siric;

import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Usuario;
import br.gov.caixa.arqrefservices.dominio.siric.DesbloquearAvaliacaoRiscoRequest;
import br.gov.caixa.arqrefservices.dominio.siric.DesbloquearAvaliacaoRiscoResponse;

/**
 * Interface que prover servicos de avaliacao de risco
 * de credito no SIRIC
 * 
 * @author c110503
 * 
 * @version 1.0.0.1
 *
 */
public interface IDesbloqueioAlcadaSiric {
	
	
	public DesbloquearAvaliacaoRiscoResponse desbloquear(final DesbloquearAvaliacaoRiscoRequest solicitacao) ;

}
