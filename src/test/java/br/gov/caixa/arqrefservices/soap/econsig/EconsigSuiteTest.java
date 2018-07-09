package br.gov.caixa.arqrefservices.soap.econsig;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Suite de testes da demanda eCosing - Zetrasoft
 */

@RunWith(Suite.class)
@SuiteClasses({ 
	AlongarConsignacaoTest.class, 
	AlterarConsignacaoTest.class, 
	AutorizarReservaTest.class,
	CancelarConsignacaoTest.class,
	CancelarRenegociacaoTest.class,
	CancelarReservaTest.class,
	ConfirmarReservaTest.class,
	ConfirmarSolicitacaoTest.class,
	ConsultarConsignacaoTest.class, 
	ConsultarMargemTest.class,
	ConsultarParametrosTest.class,
	DetalharConsultarConsignacaoTest.class,
	IncluirAnexoConsignacaoTest.class,
	InserirSolicitacaoTest.class,
	LiquidarConsignacaoTest.class,
	ListarSolicitacaoTest.class,
	ReativarConsignacaoTest.class,
	RenegociarConsignacaoTest.class,
	ReservarMargemTest.class,
	SimularConsignacaoTest.class,
	SuspenderConsignacaoTest.class,
	ValidarAcessoTest.class
	})
public final class EconsigSuiteTest {

}
