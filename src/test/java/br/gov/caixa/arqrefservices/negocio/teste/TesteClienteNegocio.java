package br.gov.caixa.arqrefservices.negocio.teste;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.negocio.ClienteNegocio;

/**
 * Teste dos métodos AlteraDadosClientePFRequest e AlteraDadosClientePFResponse
 * @author: c127295
 */

@RunWith(Arquillian.class)
public class TesteClienteNegocio {
	//Cria o logger baseado no nome da classe com o pacote incluso
	private static Logger logger = Logger.getLogger(TesteClienteNegocio.class.getName());

	@Inject
	private ClienteNegocio clienteNegocio;
	
	/**
	 * Método para a realização do deploy no servidor iniciado.
	 * @return
	 */
	@Deployment
	public static Archive<?> createDeployment() {
		//Para resolução de dependências do maven
		
		//Cria e retorna o arquivo war para deploy
		//Precisa ser WebArchive devido às libs que o apx-ejb.jar depende
		//As libs poderiam ser incluidas como módulo no servidor, mas isto pode ser mais trabalhoso para o desenvolvedor
		return null;
	}
	
	/**
	 * Teste do método solicitaDadosClientePF
	 */
	@Test
	public void solicitaDadosClientePF() {
		ClienteNegocio cliente = new ClienteNegocio();
		Empregado empregado = new Empregado();
		empregado.setNumeroMatricula(127295);
		
		try {
			cliente.solicitaDadosClientePF("66586666104", "CPF", empregado);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
