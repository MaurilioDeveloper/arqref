package br.gov.caixa.arqrefservices.dominio.serpro.consultarContratosPorFuncionarioV1;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato.CancelarContratoRET;
import br.gov.caixa.arqrefservices.dominio.serpro.cancelarContrato.CancelarContratoSaidaTO;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorConsultarContratosPorFuncionarioV1 extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorConsultarContratosPorFuncionarioV1(String URL, ConsultarContratosPorFuncionarioV1DadosREQ dadosREQ) {
		super(URL);
		ConsultarContratosPorFuncionarioV1REQ servicoSOAP = new ConsultarContratosPorFuncionarioV1REQ();
		SOAPCorpo<ConsultarContratosPorFuncionarioV1DadosREQ> corpoSOAP = new SOAPCorpo<ConsultarContratosPorFuncionarioV1DadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, ConsultarContratosPorFuncionarioV1REQ.class);
	}

	public ConsultarContratosPorFuncionarioV1SaidaTO executarServico()
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
		ConsultarContratosPorFuncionarioV1RET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, ConsultarContratosPorFuncionarioV1RET.class);
		
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
		ConsultarContratosPorFuncionarioV1SaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, ConsultarContratosPorFuncionarioV1SaidaTO.class);
		
		return ret;
	}

	/**
	 * Verifica se a resposta eh de erro ou sucesso.
	 * 
	 * @param resposta
	 * @return
	 */
	private boolean detectaErro(String resposta) {
		return resposta.indexOf("cd_ret_code") > -1;
	}
}
