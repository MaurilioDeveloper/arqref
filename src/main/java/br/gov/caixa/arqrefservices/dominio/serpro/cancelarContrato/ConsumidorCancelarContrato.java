package br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.serpro.alterarValorPrazoParcelaV1.AlterarValorPrazoParcelaV1RET;
import br.gov.caixa.arqrefservices.dominio.serpro.alterarValorPrazoParcelaV1.AlterarValorPrazoParcelaV1SaidaTO;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorCancelarContrato extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorCancelarContrato(String URL, CancelarContratoDadosREQ dadosREQ) {
		super(URL);
		CancelarContratoREQ servicoSOAP = new CancelarContratoREQ();
		SOAPCorpo<CancelarContratoDadosREQ> corpoSOAP = new SOAPCorpo<CancelarContratoDadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, CancelarContratoREQ.class);
	}

	public CancelarContratoSaidaTO executarServico()
			throws IOException, ExcecaoSOAP {

		String retorno = executar(xmlREQ);
		
		retorno = Codificacao.removerISO88591(retorno);
		
		//Verifica se ocorreu erro no envelope
		if (detectaErroEnvSERPRO(retorno)) {
			RetornoErro erro = new RetornoErro();
			erro.setCdRetCode("9999");
			erro.setDsRetCode(retorno);
			throw new ExcecaoSOAP(erro);
		}
		
		//LENDO O ENVELOPE
		CancelarContratoRET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, CancelarContratoRET.class);
		
		//Obtem o XML de retorno dentro do envelope SOAP
		String resposta = soapRet.getBody().getDados().getRetorno();

		//Verifica se ocorreu erro no conteudo
		if (detectaErroConteudoSERPRO(resposta)) {
			RetornoErro erro = new RetornoErro();
			erro.setCdRetCode("9999");
			erro.setDsRetCode(resposta);
			throw new ExcecaoSOAP(erro);
		}
		//LENDO O CONTEUDO
		//Converte os dados do corpo do envelope para o objeto de retorno
		CancelarContratoSaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, CancelarContratoSaidaTO.class);

		return ret;
	}

}
