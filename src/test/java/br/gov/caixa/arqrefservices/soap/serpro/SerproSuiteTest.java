package br.gov.caixa.arqrefservices.soap.serpro;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Suite de testes da demanda SERPRO
 */

@RunWith(Suite.class)
@SuiteClasses({ 
	AlterarValorParcelaTest.class, 
	AlterarValorPrazoParcelaV1Test.class, 
	CancelarContratoTest.class, 
	ConsultarContratosPorFuncionarioTest.class, 
	ConsultarContratosPorFuncionarioV1Test.class, 
	ConsultarMargemPorCPFTest.class, 
	ConsultarVinculoMargemPorCPFTest.class, 
	EncerrarContratoTest.class, 
	IncluirContratoTest.class, 
	IncluirContratoV1Test.class, 
	RenovarContratoCPFV1Test.class,
	RenovarContratoV1Test.class
	})
public final class SerproSuiteTest {

}
