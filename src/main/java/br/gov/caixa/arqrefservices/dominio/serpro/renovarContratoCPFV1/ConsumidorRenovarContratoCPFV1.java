package br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1.IncluirContratoV1RET;
import br.gov.caixa.arqrefservices.dominio.serpro.incluirContratoV1.IncluirContratoV1SaidaTO;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorRenovarContratoCPFV1 extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorRenovarContratoCPFV1(String URL, RenovarContratoCPFV1DadosREQ dadosREQ) {
		super(URL);
		RenovarContratoCPFV1REQ servicoSOAP = new RenovarContratoCPFV1REQ();
		SOAPCorpo<RenovarContratoCPFV1DadosREQ> corpoSOAP = new SOAPCorpo<RenovarContratoCPFV1DadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, RenovarContratoCPFV1REQ.class);
	}

	public RenovarContratoCPFV1SaidaTO executarServico()
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
		RenovarContratoCPFV1RET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, RenovarContratoCPFV1RET.class);
		
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
		RenovarContratoCPFV1SaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, RenovarContratoCPFV1SaidaTO.class);

		return ret;
	}

}
