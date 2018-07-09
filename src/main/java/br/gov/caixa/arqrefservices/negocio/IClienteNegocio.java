package br.gov.caixa.arqrefservices.negocio;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MantemDadosCliente;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Usuario;
import br.gov.caixa.arqrefservices.dominio.sicli.transicao.DadosSICLITO;


/**
 * 
 * @author c110503
 * 
 * Interface que prover servicos de busca,
 * altercao e cadastro no SICLI
 * 
 * @version 1.0.0.1
 *
 */
public interface IClienteNegocio {
	
	/**
	 * Metodo que solicita os dados do cliente pessoa fisica (SICLI).
	 * Efetua a solicitacao na fila de requisicao.	 
	 * 
	 * @param cpf
	 * @param tipoPesquisa
	 * @param empregado
	 * @return correlation
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Correlation solicitaDadosClientePF(String cpf,
			String tipoPesquisa, Empregado empregado) throws BusinessException,
			SystemException;
	
	/**
	 * Metodo que solicita os dados do cliente pessoa fisica (SICLI).
	 * Efetua a solicitacao na fila de requisicao.	 
	 * 
	 * @param cpf
	 * @param tipoPesquisa
	 * @param empregado
	 * @return correlation
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Correlation solicitaDadosClientePF(DadosSICLITO dadosSICLITO) throws BusinessException,
			SystemException;

	/**
	 * Metodo que busca os dados do cliente pessoa fisica da fila de resposta
	 * pelo correlationid
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaFisica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public CamposRetornados recebeDadosClientePF(Correlation correlation) throws BusinessException, SystemException;
	
	/**
	 * Metodo que solicita os dados do cliente pessoa juridica (SICLI).
	 * Efetua a solicitacao na fila de requisicao
	 * 
	 * @param cnpj
	 * @param tipoPesquisa
	 * @param empregado
	 * @return correlation
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Correlation solicitaDadosCliente(DadosSICLITO dadosSICLITO) throws BusinessException,
			SystemException;

	/**
	 * Metodo que busca os dados do cliente pessoa juridica da fila de resposta
	 * pelo correlationid
	 * 
	 * @param correlation
	 * @param empregado
	 * @return clientePessoaJuridica
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public CamposRetornados recebeDadosCliente(Correlation correlation) throws BusinessException, SystemException;

	public MantemDadosCliente atualizaDadosClienteSicli(CamposRetornados camposRetornados, Usuario usuarioCompleto) throws BusinessException;

}
