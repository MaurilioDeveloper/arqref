package br.gov.caixa.arqrefservices.dominio.consignet.consultaContratos;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class ConsultaContratosDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "CONSULTAR_STATUS";
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
	
}
