package br.gov.caixa.arqrefservices.dominio.consignet.confirmacaoReservaComposta;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class ConfirmacaoReservaCompostaDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "CONFIRMAR_RESERVA_COMPOSTA";
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
	
	public void setNrContratoConvenio(String valor){		
		addAtributo(TipoConsignet.NR_CONTRATO_CONVENIO, valor);
	}
	
	public void setVlLiberadoConfirmacao(String valor){		
		addAtributo(TipoConsignet.VL_LIBERADO_CONFIRMACAO, valor);
	}
	
	public void setVlParcelaConfirmacao(String valor){		
		addAtributo(TipoConsignet.VL_PARCELA_CONFIRMACAO, valor);
	}

	public void setJurosConfirmacao(String valor){		
		addAtributo(TipoConsignet.JUROS_CONFIRMACAO, valor);
	}
	
	public void setCetConfirmacao(String valor){		
		addAtributo(TipoConsignet.CET_CONFIRMACAO, valor);
	}
			
}
