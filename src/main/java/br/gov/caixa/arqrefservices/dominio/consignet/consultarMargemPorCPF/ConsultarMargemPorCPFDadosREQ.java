package br.gov.caixa.arqrefservices.dominio.consignet.consultarMargemPorCPF;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class ConsultarMargemPorCPFDadosREQ extends ConsignetDadosREQ {
	
	public String getOperacao() {
		return "CONSULTAR_MARGEM_CPF";
	}

	public void setUsuarioConvenio(String valor){
		addAtributo(TipoConsignet.USUARIO_CONVENIO, valor);		
	}
	
	public void setSenhaConvenio(String valor){
		addAtributo(TipoConsignet.SENHA_CONVENIO, valor);		
	}
		
	public void setCNPJConvenente(String valor){		
		addAtributo(TipoConsignet.CNPJ_CONVENENTE, valor);
	}
	
	public void setCpf(String valor){		
		addAtributo(TipoConsignet.CPF, valor);
	}
	
}
