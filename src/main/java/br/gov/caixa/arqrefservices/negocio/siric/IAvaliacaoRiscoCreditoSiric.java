package br.gov.caixa.arqrefservices.negocio.siric;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.ESiglas;
import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;
import br.gov.caixa.arqrefservices.dominio.sicli.Renda;
import br.gov.caixa.arqrefservices.dominio.siric.DadosOperacao;
import br.gov.caixa.arqrefservices.dominio.siric.solicitacao.Avaliacao;

/**
 * Interface que prover servicos de avaliacao de risco
 * de credito no SIRIC
 * 
 * @author c110503
 * 
 * @version 1.0.0.1
 *
 */
public interface IAvaliacaoRiscoCreditoSiric {
	
	public Correlation solicitaAvaliacaoRiscoCliente(CamposRetornados dadosSicli, Empregado empregado, Renda renda, String sigla) throws BusinessException, SystemException;
	
	public Correlation solicitaAvaliacaoRiscoCredito(DadosOperacao dadosOperacao, CamposRetornados dadosSicli, Empregado empregado, Renda renda) throws BusinessException, SystemException;
	
	public Avaliacao retornoDadosAvaliacaoRisco(String correlationId) throws BusinessException, SystemException; 


}
