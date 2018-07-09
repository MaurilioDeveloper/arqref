package br.gov.caixa.arqrefservices.dominio.consignet.confirmacaoReservaPortabilidade;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

/**
 * Esta operação é destinada para a informação da confirmação de portabilidade
 * para um contrato consignado no processo de portabilidade. XML de Requisição:
 * Todos os atributos são obrigatórios e não devem ser preenchidos com espaços
 * em branco.
 * 
 */
public class ConfirmacaoReservaPortabilidadeDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "CONFIRMAR_AG_INF_CONF_PORTABILIDADE";
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
	
	public void setContrato(String valor){
		addAtributo(TipoConsignet.CONTRATO, valor);
	}
	
	/**
	 * @param valor SIM ou NÃO
	 */
	public void setAceito(String valor){
		addAtributo(TipoConsignet.ACEITO, valor);		
	}
	
	public void setMotivoRecusa(String valor){
		addAtributo(TipoConsignet.MOTIVO_RECUSA, valor);		
	}
	
	
}
