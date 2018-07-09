package br.gov.caixa.arqrefservices.negocio;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemRecuperarDadosMinutaEntrada;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemRecuperarDadosMinutaSaida;


public interface IServicoNegocio {
	
	public Correlation solicitaDadosParaMinuta(MensagemRecuperarDadosMinutaEntrada entrada) throws BusinessException,SystemException;
	
	public MensagemRecuperarDadosMinutaSaida recebeDadosParaMinuta(Correlation correlation) throws BusinessException, SystemException;
	
	public String recebeDadosParaMinutaXML(Correlation correlation) throws BusinessException, SystemException;
	
}
