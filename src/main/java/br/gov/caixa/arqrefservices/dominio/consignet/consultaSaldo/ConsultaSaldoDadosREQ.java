package br.gov.caixa.arqrefservices.dominio.consignet.consultaSaldo;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class ConsultaSaldoDadosREQ extends ConsignetDadosREQ {
	
	public String getOperacao() {
		return "CONSULTAR_SALDO";
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
	
	public void setMatricula(String valor){		
		addAtributo(TipoConsignet.MATRICULA, valor);
	}
	
	public void setCpf(String valor){		
		addAtributo(TipoConsignet.CPF, valor);
	}
	
	public void setOrigem(String valor){		
		addAtributo(TipoConsignet.ORIGEM, valor);
	}
	
	public void setSenhaServidor(String valor){		
		addAtributo(TipoConsignet.SENHA_SERVIDOR, valor);
	}

	public void setFolha1Desconto(String valor){
		addAtributo(TipoConsignet.FOLHA_1_DESCONTO, valor);
	}

}
