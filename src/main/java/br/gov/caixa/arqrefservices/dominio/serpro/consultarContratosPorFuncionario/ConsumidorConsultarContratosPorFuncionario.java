package br.gov.caixa.arqrefservices.dominio.serpro.consultarContratosPorFuncionario;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorConsultarContratosPorFuncionario extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorConsultarContratosPorFuncionario(String URL, ConsultarContratosPorFuncionarioDadosREQ dadosREQ) {
		super(URL);
		ConsultarContratosPorFuncionarioREQ servicoSOAP = new ConsultarContratosPorFuncionarioREQ();
		SOAPCorpo<ConsultarContratosPorFuncionarioDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarContratosPorFuncionarioDadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, ConsultarContratosPorFuncionarioREQ.class);
	}

	public ConsultarContratosPorFuncionarioSaidaTO executarServico()
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
		ConsultarContratosPorFuncionarioRET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, ConsultarContratosPorFuncionarioRET.class);
		
		//Obtem o XML de retorno dentro do envelope SOAP
		String resposta = Codificacao.removerISO88591(
				soapRet.getBody().getDados().getRetorno()
				);

		//Verifica se ocorreu erro no conteudo
		if (detectaErroConteudoSERPRO(resposta)) {
			RetornoErro erro = new RetornoErro();
			erro.setCdRetCode("9999");
			erro.setDsRetCode(resposta);
			throw new ExcecaoSOAP(erro);
		}
		//LENDO O CONTEUDO
		//Converte os dados do corpo do envelope para o objeto de retorno
		ConsultarContratosPorFuncionarioSaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, ConsultarContratosPorFuncionarioSaidaTO.class);

		return ret;
	}

}
