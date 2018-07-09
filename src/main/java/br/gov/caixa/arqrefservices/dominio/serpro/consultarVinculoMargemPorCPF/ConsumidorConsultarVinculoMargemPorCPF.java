package br.gov.caixa.arqrefservices.dominio.serpro.consultarVinculoMargemPorCPF;

import java.io.IOException;

import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.serpro.consultarMargemPorCPF.ConsultarMargemPorCPFRET;
import br.gov.caixa.arqrefservices.dominio.serpro.consultarMargemPorCPF.ConsultarMargemPorCPFSaidaTO;
import br.gov.caixa.arqrefservices.soap.Codificacao;
import br.gov.caixa.arqrefservices.soap.ExcecaoSOAP;
import br.gov.caixa.arqrefservices.soap.RetornoErro;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import br.gov.caixa.arqrefservices.soap.WSConsumidor;

public class ConsumidorConsultarVinculoMargemPorCPF extends WSConsumidor{
	
	private String xmlREQ;

	public ConsumidorConsultarVinculoMargemPorCPF(String URL, ConsultarVinculoMargemPorCPFDadosREQ dadosREQ) {
		super(URL);
		ConsultarVinculoMargemPorCPFREQ servicoSOAP = new ConsultarVinculoMargemPorCPFREQ();
		SOAPCorpo<ConsultarVinculoMargemPorCPFDadosREQ> corpoSOAP = new SOAPCorpo<ConsultarVinculoMargemPorCPFDadosREQ>();
		servicoSOAP.setBody(corpoSOAP);
		corpoSOAP.setDados(dadosREQ);
		this.xmlREQ = ConverterXML.convertToXml(servicoSOAP, ConsultarVinculoMargemPorCPFREQ.class);
	}

	public ConsultarVinculoMargemPorCPFSaidaTO executarServico()
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
		ConsultarVinculoMargemPorCPFRET soapRet = ConverterXML.converterXmlSemSanitizacao(
				retorno, ConsultarVinculoMargemPorCPFRET.class);
		
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
		ConsultarVinculoMargemPorCPFSaidaTO ret = ConverterXML
				.converterXmlSemSanitizacao(resposta, ConsultarVinculoMargemPorCPFSaidaTO.class);

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
