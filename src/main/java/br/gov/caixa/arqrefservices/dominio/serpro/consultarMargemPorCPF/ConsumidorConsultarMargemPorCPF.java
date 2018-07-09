package br.gov.caixa.arqrefservices.dominio.serpro.consultarMargemPorCPF;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorConsultarMargemPorCPF extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorConsultarMargemPorCPF(String URL, ConsultarMargemPorCPFDadosREQ dadosREQ) {
		super(URL);
		ConsultarMargemPorCPFREQ servicoSOAP = new ConsultarMargemPorCPFREQ();
		SOAPCorpo<ConsultarMargemPorCPFDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarMargemPorCPFDadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, ConsultarMargemPorCPFREQ.class);
	}

	public ConsultarMargemPorCPFSaidaTO executarServico()
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
		ConsultarMargemPorCPFRET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, ConsultarMargemPorCPFRET.class);
		
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
		ConsultarMargemPorCPFSaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, ConsultarMargemPorCPFSaidaTO.class);

		return ret;
	}

}
