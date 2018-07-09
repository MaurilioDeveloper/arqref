package br.gov.caixa.arqrefservices.dominio.serpro.alterarValorParcela;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorAlterarValorParcela extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorAlterarValorParcela(String URL, AlterarValorParcelaDadosREQ dadosREQ) {
		super(URL);
		AlterarValorParcelaREQ servicoSOAP = new AlterarValorParcelaREQ();
		SOAPCorpo<AlterarValorParcelaDadosREQ> corpoSOAP = new SOAPCorpo<AlterarValorParcelaDadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, AlterarValorParcelaREQ.class);
	}

	public AlterarValorParcelaSaidaTO executarServico()
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
		AlterarValorParcelaRET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, AlterarValorParcelaRET.class);
		
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
		AlterarValorParcelaSaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, AlterarValorParcelaSaidaTO.class);

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
