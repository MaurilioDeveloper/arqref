package br.gov.caixa.arqrefservices.dominio.consignet.consultaMargemFuturaServidor;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

/**
 * Retorna a margem calculada para a folha e matrícula solicitados. XML de
 * Requisição: Todos os atributos são obrigatórios e não devem ser preenchidos
 * com espaços em branco.
 * 
 */

public class ConsultaMargemFuturaServidorDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "CONSULTAR_MARGEM_FUTURA";
	}
	
	public void setUsuarioConvenio(String valor){
		addAtributo(TipoConsignet.USUARIO_CONVENIO, valor);		
	}
		
	public void setSenhaConvenio(String valor){
		addAtributo(TipoConsignet.SENHA_CONVENIO, valor);		
	}
	
	public void setConvenio(String valor){		
		addAtributo(TipoConsignet.CONVENIO, valor);
	}
	
	public void setAnoMesFolhaPagamento(String valor){		
		addAtributo(TipoConsignet.ANO_MES_FOLHA_PAGAMENTO, valor);
	}
	
	public void setMatricula(String valor){
		addAtributo(TipoConsignet.MATRICULA, valor);		
	}
	
	public void setIdFolhaPagamento(String valor){
		addAtributo(TipoConsignet.ID_FOLHA_PAGAMENTO, valor);		
	}
}
