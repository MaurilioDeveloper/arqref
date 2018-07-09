package br.gov.caixa.arqrefservices.dominio.consignet.consultaParcelasFolha;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class ConsultaParcelasFolhaDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "CONSULTAR_PARCELAS";
	}
		
	public void setUsuario(String valor){
		addAtributo(TipoConsignet.USUARIO, valor);
	}
	
	public void setSenha(String valor){
		addAtributo(TipoConsignet.SENHA, valor);		
	}
	
	public void setMatricula(String valor){
		addAtributo(TipoConsignet.MATRICULA, valor);		
	}
	
	public void setCpf(String valor){
		addAtributo(TipoConsignet.CPF, valor);		
	}
	
	public void setOrigem(String valor){
		addAtributo(TipoConsignet.ORIGEM, valor);		
	}
	
	public void setFolhaConsulta(String valor){
		addAtributo(TipoConsignet.FOLHA_CONSULTA, valor);		
	}
	
	public void setInstituicao(String valor){
		addAtributo(TipoConsignet.INSTITUICAO, valor);		
	}
	
}
