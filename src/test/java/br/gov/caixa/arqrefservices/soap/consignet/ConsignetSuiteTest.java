package br.gov.caixa.arqrefservices.soap.consignet;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Suite de testes da demanda Consignet - DB1
 */

@RunWith(Suite.class)
@SuiteClasses({
	ConfirmacaoReservaCompostaTest.class,
	ConfirmacaoReservaPortabilidadeTest.class,
	ConfirmacaoReservasTest.class,
	ConsignarEmprestimoTest.class,
	ConsignarRefinanciamentoTest.class,
	ConsultaContratosTest.class,
	ConsultaMargemFuturaServidorTest.class,
	ConsultaParcelasFolhaTest.class,
	ConsultaSaldoTest.class,
	FluxoContratacaoTest.class,
	QuitacaoContratosTest.class,
	ReservaCompostaConsultaSaldoQuitadoTest.class,
	ReservaCompostaTest.class,
	ReservaMargemEmprestimoTest.class,
	ReservaMargemRefinanciamentoTest.class,
	ReservaPortabilidadeTest.class
	})
public final class ConsignetSuiteTest {

}

