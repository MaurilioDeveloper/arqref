package br.gov.caixa.arqrefservices.dominio.consignet.reservaCompostaConsultaSaldoQuitado;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

/**
 * Retorna a soma do valor quitado das parcelas do contrato informado. XML de
 * Requisição: Todos os atributos são obrigatórios e não devem ser preenchidos
 * com espaços em branco.
 * 
 */

public class ReservaCompostaConsultaSaldoQuitadoDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "RESERVA_COMPOSTA_SALDO_QUITADO";
	}
	
	public void setUsuarioConvenio(String valor){
		addAtributo(TipoConsignet.USUARIO_CONVENIO, valor);		
	}
	
	public void setSenhaConvenio(String valor){
		addAtributo(TipoConsignet.SENHA_CONVENIO, valor);		
	}
	
	public void setContrato(String valor){
		addAtributo(TipoConsignet.CONTRATO, valor);
	}
	
	public void setConvenio(String valor){
		addAtributo(TipoConsignet.CONVENIO, valor);		
	}
	
}
