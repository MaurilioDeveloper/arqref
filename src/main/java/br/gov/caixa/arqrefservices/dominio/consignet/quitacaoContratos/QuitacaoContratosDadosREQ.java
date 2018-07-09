package br.gov.caixa.arqrefservices.dominio.consignet.quitacaoContratos;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class QuitacaoContratosDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "QUITAR_CONSIGNACAO";
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
	
	public void setNrContratoConvenio(String valor){
		addAtributo(TipoConsignet.NR_CONTRATO_CONVENIO, valor);		
	}	
	
	public void setVlCobradoQuitacao(String valor){		
		addAtributo(TipoConsignet.VL_COBRADO_QUITACAO, valor);
	}
	
	public void setJustificativa(String valor){		
		addAtributo(TipoConsignet.JUSTIFICATIVA, valor);
	}
	
}
