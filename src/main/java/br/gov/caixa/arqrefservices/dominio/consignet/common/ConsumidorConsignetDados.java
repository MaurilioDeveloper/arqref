package br.gov.caixa.arqrefservices.dominio.consignet.common;

import java.util.ArrayList;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;

public interface ConsumidorConsignetDados {
	
	public ArrayList<AtributoConsignet> getListaParametros();
	public String getOperacao();
	public String getURL();
			
}
