package br.gov.caixa.arqrefservices.util;

import java.util.logging.Logger;

import javax.ejb.Singleton;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@Singleton
public class ProdutorLog {

	@Produces
	public Logger produceLog(InjectionPoint injectionPoint) {
		if (!injectionPoint.getMember().getDeclaringClass().getName().contains("br.gov.caixa.arqrefservices")) {
			// Cria um logger com o nome do pacote br.gov.caixa.emprestimo.+ o
			// nome da classe com pacote onde o Logger será inserido
			return Logger
					.getLogger("br.gov.caixa.arqrefservices." + injectionPoint.getMember().getDeclaringClass().getName());
		} else {
			// Cria um logger com o nome do pacote e da classe onde o Logger
			// será inserido
			return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
		}
	}

}
