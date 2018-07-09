package br.gov.caixa.arqrefservices.negocio.mq;

import javax.ejb.Singleton;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SICLIMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SIFECMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SIRICMQ;

/**
 * Clase do tipo singleton para fabricar
 * conexoes com o MQ.
 * Cada conexao deve ser anotada
 * 
 * @author c110503
 * @version 1.0.0.1
 */
@Singleton
public class ConexaoFabricaMQ {
	
	//variavel para conexoes com o SIFEC
	@Inject
	private Instance<ConexaoSIFECMQ> conexaoSIFECMQ;
	//variavel para conexoes com o SICLI
	@Inject
	private Instance<ConexaoSICLIMQ> conexaoSICLIMQ;
	//variavel para conexoes com o SRIRC
	@Inject
	private Instance<ConexaoSIRICMQ> conexaoSIRICMQ;
	
	/**
	 * Metodo que produz uma conexao
	 * do tipo da anotacao (SICLI)
	 * @return
	 */
	@Produces
	@SICLIMQ
	public DAOBarramento getConexaoSICLIMQ(){
		return conexaoSICLIMQ.get();
	}
	
	/**
	 * Metodo que produz uma conexao
	 * do tipo da anotacao (SICLI)
	 * @return
	 */
	@Produces
	@SIRICMQ
	public DAOBarramento getConexaoSIRICMQ(){
		return conexaoSIRICMQ.get();
	}

	/**
	 * Metodo que produz uma conexao
	 * do tipo da anotacao (SIFEC)
	 * @return
	 */
	@Produces
	@SIFECMQ
	public DAOBarramento getConexaoSIFECMQ(){
		return conexaoSIRICMQ.get();
	}
	
}
