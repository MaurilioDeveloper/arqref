package br.gov.caixa.arqrefservices.dominio.consignet.consignarRefinanciamento;

import br.gov.caixa.arqrefservices.dominio.consignet.common.ConsignetDadosREQ;
import br.gov.caixa.arqrefservices.dominio.consignet.common.TipoConsignet;

public class ConsignarRefinanciamentoDadosREQ extends ConsignetDadosREQ {

	public String getOperacao() {
		return "REFIN_EMPRESTIMO";
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
	
	public void setContratoConvenio(String valor){
		addAtributo(TipoConsignet.CONTRATO_CONVENIO, valor);
	}
	
	public void setVlParcela(String valor){
		addAtributo(TipoConsignet.VL_PARCELA, valor);
	}
	
	public void setQtdeParcela(String valor){
		addAtributo(TipoConsignet.QTDE_PARCELA, valor);
	}
	
	public void setJurosMensal(String valor){
		addAtributo(TipoConsignet.JUROS_MENSAL, valor);
	}
	
	public void setVlLiquidoLiberado(String valor){
		addAtributo(TipoConsignet.VL_LIQUIDO_LIBERADO, valor);
	}
	
	public void setDtLiberacaoCredito(String valor){
		addAtributo(TipoConsignet.DT_LIBERACAO_CREDITO, valor);
	}
	
	public void setFolha1Desconto(String valor){
		addAtributo(TipoConsignet.FOLHA_1_DESCONTO, valor);
	}
	
	public void setContratos(String valor){
		addAtributo(TipoConsignet.CONTRATOS, valor);
	}
	
}
