package br.gov.caixa.arqrefservices.dominio.consignet.confirmacaoReservas;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

/**
 * Esta operação é destinada para a informação da confirmação de deferimento
 * para um contrato consignado no processo de compra. XML de Requisição: Todos
 * os atributos são obrigatórios e não devem ser preenchidos com espaços em
 * branco.
 * 
 */
public class ConfirmacaoReservasDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "CONFIRMAR_AG_INF_DEFERIMENTO";
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
	
	public void setNrContratoConvenio(String valor){
		addAtributo(TipoConsignet.NR_CONTRATO_CONVENIO, valor);		
	}	
	
}
