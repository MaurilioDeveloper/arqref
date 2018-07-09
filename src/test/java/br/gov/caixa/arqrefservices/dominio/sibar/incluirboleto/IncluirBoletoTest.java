package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.ControleNegocialType;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.IncluiBoletoEntrada;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.IncluirBoletoEntradaDados;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.IncluirBoletoSaidaDados;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.JurosMoraType;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.MensagensControleNegocialType;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio.TituloEntradaType;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada.IncluirBoletoEntrada;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.entrada.IncluirBoletoEntradaCorpo;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.saida.IncluirBoletoSaida;
import br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.saida.IncluirBoletoSaidaCorpo;
import br.gov.caixa.arqrefservices.soap.SOAPCorpo;
import junit.framework.Assert;

public class IncluirBoletoTest {

	private Properties properties;
	
	@Test
	public void consultaBoletoTest() throws Exception {
		
		String xmlEntrada = getXML("INCLUIR_BOLETO_ENTRADA");
			
		IncluirBoletoEntrada ibexml = ConverterXML.converterXmlSemSanitizacao(xmlEntrada, IncluirBoletoEntrada.class);
		ibexml.getBody().getDados().setUrl(getUrlServico());
		
		IncluirBoletoSaidaCorpo ibsc = new IncluirBoletoWs(ibexml.getBody().getDados()).executar();
				
		ibsc.getUrl();
		Assert.assertNotNull(ibsc.getDadosSaida().getControlenegocial());
		
	}
		
	@Test
	public void consultaBoletoEntradaTest() throws Exception {
				
		IncluirBoletoEntrada incluirBoletoEntrada = new IncluirBoletoEntrada();
		SOAPCorpo<IncluirBoletoEntradaCorpo> servicoEntrada = new SOAPCorpo<IncluirBoletoEntradaCorpo>();
		
		incluirBoletoEntrada.setBody(servicoEntrada);
		
		IncluirBoletoEntradaCorpo servicoentradatype = new IncluirBoletoEntradaCorpo();
				
		servicoentradatype.setHeader(getSibarHeader());
		
		
		IncluirBoletoEntradaDados incluirBoletoEntradaDados = new IncluirBoletoEntradaDados();
		
		IncluiBoletoEntrada incluiboletoentradatype = new IncluiBoletoEntrada();
		incluiboletoentradatype.setCodigobeneficiario("820001");
		incluiboletoentradatype.setFlagregistro("S");
		
		TituloEntradaType tituloEntradaType = new TituloEntradaType();
		tituloEntradaType.setNossonumero("14800500000113701");
		tituloEntradaType.setNumerodocumento("1100000619");
		tituloEntradaType.setDatavencimento("2017-01-21");
		tituloEntradaType.setValor("234.56");
		
		JurosMoraType jurosMoraType = new JurosMoraType();
		jurosMoraType.setTipo("ISENTO");
		jurosMoraType.setValor("1.99");
//		jurosMoraType.setData(new Date());
		
		tituloEntradaType.setJurosmora(jurosMoraType);
		incluiboletoentradatype.setTitulo(tituloEntradaType);
		
		incluirBoletoEntradaDados.setIncluiboleto(incluiboletoentradatype);
		
		servicoentradatype.setDados(incluirBoletoEntradaDados);
		
		servicoEntrada.setDados(servicoentradatype);
		
		
		String xmlEnvioSoap = ConverterXML.convertToXml(incluirBoletoEntrada, IncluirBoletoEntrada.class);
		
		System.out.println(xmlEnvioSoap);
		
		IncluirBoletoEntrada ibe = ConverterXML.converterXmlSemSanitizacao(xmlEnvioSoap, IncluirBoletoEntrada.class);
				
		Assert.assertNotNull(ibe.getBody());
		
	}

	@Test
	public void consultaBoletoSaidaTest() throws Exception {
		
		IncluirBoletoSaida incluirBoletoSaida = new IncluirBoletoSaida();
		
		SOAPCorpo<IncluirBoletoSaidaCorpo> soapCorpo = new SOAPCorpo<IncluirBoletoSaidaCorpo>();				
		incluirBoletoSaida.setBody(soapCorpo);
		
		IncluirBoletoSaidaCorpo incluirBoletoSaidaCorpo = new IncluirBoletoSaidaCorpo();		
		soapCorpo.setDados(incluirBoletoSaidaCorpo);
		
		incluirBoletoSaidaCorpo.setCoRetorno(1);
		incluirBoletoSaidaCorpo.setDeOrigemRetorno("MANUTENCAO_COBRANCA_BANCARIA");
		incluirBoletoSaidaCorpo.setDeMsgRetorno("");
		
				
		incluirBoletoSaidaCorpo.setHeader(getSibarHeader());
		incluirBoletoSaidaCorpo.getHeader().setOperacao("INCLUI_BOLETO");
		
		
		IncluirBoletoSaidaDados incluirBoletoSaidaDados = new IncluirBoletoSaidaDados();
		incluirBoletoSaidaCorpo.setDadosSaida(incluirBoletoSaidaDados);
		
		ControleNegocialType controleNegocialType = new ControleNegocialType();
		controleNegocialType.setOrigemretorno("SIGCB");
		controleNegocialType.setCodretorno("1");
		
		MensagensControleNegocialType mensagensControleNegocialType = new MensagensControleNegocialType();
		controleNegocialType.setMensagens(mensagensControleNegocialType);
		
		mensagensControleNegocialType.setRetorno("(38) NOSSO NUMERO JA CADASTRADO PARA O BENEFICIARIO");
		
		
		incluirBoletoSaidaDados.setControlenegocial(controleNegocialType);
		
		String xmlEnvioSoap = ConverterXML.convertToXml(incluirBoletoSaida, IncluirBoletoSaida.class);
		
		System.out.println(xmlEnvioSoap);
		
		IncluirBoletoSaida ibs = ConverterXML.converterXmlSemSanitizacao(xmlEnvioSoap, IncluirBoletoSaida.class);
				
		Assert.assertNotNull(ibs.getBody().getDados().getDadosSaida().getControlenegocial());
		
	}

	private SibarHeader getSibarHeader() {
		SibarHeader header = new SibarHeader();
		header.setVersao("1.0");
		header.setAutenticacao("uZZ0lO87BCnVUm3KEGc/a6EMZssQ2Y72ACA0PudwLTk=");
		header.setUsuarioServico("SCNLFECD");
		header.setOperacao("INCLUI_BOLETO");
		header.setSistemaOrigem("SIGBD");
		header.setUnidade("0002");
		header.setIdentificadorOrigem("127.0.0.1");
		header.setDataHora("20160109152436");
		return header;
	}

	public String getXML(String nomeXml) {
		ResourceLoader loader = new ResourceLoader();
		return loader.with(getClass()).load(nomeXml + ".xml").asText();
	}
	
	private String getUrlServico() {
		if(this.properties == null){
			
			this.properties = new Properties();
			InputStream in = getClass().getResourceAsStream("Servicos_SOAP.properties");
			
			try {
				this.properties.load(in);
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties.getProperty("URL_MANUTENCAO_BOLETO");
	}	
	
	
}
