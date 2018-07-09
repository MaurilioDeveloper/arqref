package br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorIncluirContratoV1 extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorIncluirContratoV1(String URL, IncluirContratoV1DadosREQ dadosREQ) {
		super(URL);
		IncluirContratoV1REQ servicoSOAP = new IncluirContratoV1REQ();
		SOAPCorpo<IncluirContratoV1DadosREQ> corpoSOAP = new SOAPCorpo<IncluirContratoV1DadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, IncluirContratoV1REQ.class);
	}

	public IncluirContratoV1SaidaTO executarServico()
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
		IncluirContratoV1RET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, IncluirContratoV1RET.class);
		
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
		IncluirContratoV1SaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, IncluirContratoV1SaidaTO.class);

		return ret;
	}

}
