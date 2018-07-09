package br.gov.caixa.arqrefservices.dominio.consignet.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.gov.caixa.arqrefservices.dominio.consignet.AtributoConsignet;


public abstract class ConsignetDadosREQ implements ConsumidorConsignetDados {
	
	private String URL;
	
	protected Map<String, AtributoConsignet> atributosMap;
	
	public ConsignetDadosREQ() {
		atributosMap = new HashMap<String, AtributoConsignet>();
	}
	
	public ArrayList<AtributoConsignet> getListaParametros(){
		return new ArrayList<AtributoConsignet>(atributosMap.values());
	}
	
	public String getURL() {
		return URL;
	}
	
	public void addAtributo(TipoConsignet tipoConsignet, String valor){
		this.atributosMap.put(tipoConsignet.getNome(), new AtributoConsignet(tipoConsignet.toString(), valor));	
	}
		
	public void addAtributo(String chave, String valor){
		this.atributosMap.put(chave, new AtributoConsignet(chave, valor));	
	}
	
	public void setURL(String URL) {
		this.URL = URL;
	}
	
}
