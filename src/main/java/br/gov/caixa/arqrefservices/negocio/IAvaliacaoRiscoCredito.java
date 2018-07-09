package br.gov.caixa.arqrefservices.negocio;

import java.util.List;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.ClientePessoaFisica;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.siric.Avaliacao;
import br.gov.caixa.arqrefservices.dominio.siric.AvaliacaoValiada;
import br.gov.caixa.arqrefservices.dominio.siric.DadosOperacao;
import br.gov.caixa.arqrefservices.dominio.siric.Protocolo;
import br.gov.caixa.arqrefservices.dominio.siric.transicao.DadosSIRICTO;
import br.gov.caixa.arqrefservices.dominio.siric.transicao.MensagemRetornoSIRICTO;

/**
 * Interface que prover servicos de avaliacao de risco
 * de credito no SIRIC
 * 
 * @author c110503
 * 
 * @version 1.0.0.1
 *
 */
public interface IAvaliacaoRiscoCredito {
	
	/**
	 * Metodo que solicita avaliacao de risco (SIRIC).
	 * Efetua a solicitacao na fila de requisicao.	 
	 * 
	 * @param cpf
	 * @param dadosOperacao
	 * @return correlation
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Correlation solicitaAvaliacaoRisco(DadosSIRICTO dadosSIRICTO) throws BusinessException, SystemException;
		
	/**
	 * Metodo que busca o protocolo da avaliacao de risco na fila de protocolo
	 * Fila que informa se consegui enviar a solicitacao de avaliacao de risco
	 * para a fila do SIRIC
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Protocolo consultaProtocoloAvaliacaoRisco(Correlation correlation) throws BusinessException, SystemException;

	/**
	 * Metodo que busca a avaliacao de risco na fila de resposta
	 * pelo correlationid
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Avaliacao recebeAvaliacaoRisco(Correlation correlation, String sigla) throws BusinessException, SystemException;
	
	/**
	 * Metodo que solicita a busca as avaliacoes de risco validadas
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Correlation consultaListaAvaliacaoRisco(DadosSIRICTO dadosSIRICTO) throws BusinessException, SystemException;
	
	/**
	 * Metodo que busca as avaliacoes de risco validadas na fila de resposta
	 * pelo correlationid
	 * 
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public List<AvaliacaoValiada> recebeListaConsultaAvaliacaoRisco(Correlation correlation) throws BusinessException, SystemException;
	
	/**
	 * Metodo que solicita o cancelamento da avaliacao de risco
	 * pelo codigo da avaliacao
	 * 	 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Correlation solicitarCancelarAvaliacaoRiscoCredito(String cpfCliente,
			String matriculaUsuario, String codigoAvaliacao,
			String numeroUnidade) throws BusinessException, SystemException;
	
	/**
	 * Metodo que recebe a confimacao do cancelamento da avaliacao de risco
	 * da fila de resposta pelo correlationid
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public MensagemRetornoSIRICTO receberCancelarAvaliacaoRiscoCredito(Correlation correlation) throws BusinessException, SystemException;

}
