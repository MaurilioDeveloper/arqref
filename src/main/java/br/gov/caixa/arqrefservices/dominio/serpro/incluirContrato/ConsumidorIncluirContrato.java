package br.gov.caixa.arqrefservices.dominio.serpro.incluirContrato;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorIncluirContrato extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorIncluirContrato(String URL, IncluirContratoDadosREQ dadosREQ) {
		super(URL);
		IncluirContratoREQ servicoSOAP = new IncluirContratoREQ();
		SOAPCorpo<IncluirContratoDadosREQ> corpoSOAP = new SOAPCorpo<IncluirContratoDadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, IncluirContratoREQ.class);
	}

	public IncluirContratoSaidaTO executarServico()
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
		IncluirContratoRET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, IncluirContratoRET.class);
		
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
		IncluirContratoSaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, IncluirContratoSaidaTO.class);

		return ret;
	}

}
