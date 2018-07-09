package br.gov.caixa.arqrefservices.negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import br.gov.caixa.arqrefcore.barramento.DAOBarramento;
import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefcore.excecao.enumerador.ECategoriaErro;
import br.gov.caixa.arqrefcore.excecao.enumerador.ESeveridadeErro;
import br.gov.caixa.arqrefcore.excecao.mensagem.MessageDefault;
import br.gov.caixa.arqrefcore.excecao.mensagem.Messages;
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefcore.io.ResourceLoader;
import br.gov.caixa.arqrefcore.jaxb.conversor.ConverterXML;
import br.gov.caixa.arqrefcore.jms.Correlation;
import br.gov.caixa.arqrefcore.util.Dater;
import br.gov.caixa.arqrefcore.util.Stringer;
import br.gov.caixa.arqrefcore.util.UtilString;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.ErroSICLI;
import br.gov.caixa.arqrefservices.dominio.barramento.Chave;
import br.gov.caixa.arqrefservices.dominio.barramento.DadosConsultaSicli;
import br.gov.caixa.arqrefservices.dominio.barramento.Filtros;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemConsultaDadosSicliSaida;
import br.gov.caixa.arqrefservices.dominio.barramento.MensagemConsultaSICLI;
import br.gov.caixa.arqrefservices.dominio.barramento.SibarHeader;
import br.gov.caixa.arqrefservices.dominio.barramento.anotacao.SICLIMQ;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.EFilasMQ;
import br.gov.caixa.arqrefservices.dominio.enumerador.EMensagensArqrefServiceErro;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPequisaDocumentoIdentidade;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaConta;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaEnderecoNacional;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaSistema;
import br.gov.caixa.arqrefservices.dominio.limite.GerenciadorLimitesRequest;
import br.gov.caixa.arqrefservices.dominio.limite.GerenciadorLimitesResponse;
import br.gov.caixa.arqrefservices.dominio.sicli.CamposRetornados;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.CNH;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.CamposSicli;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.CarteiraTrabalho;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.DocumentoCarteiraTrabalho;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.DocumentoIdentidade;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.EnderecoNacional;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.EnderecoNacionalComplemento;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.EnvioDadosAlteracaoSicli;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Identidade;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MantemDadosCliente;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.ManutencaoErro;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MeioComunicacao;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MensagemDadosAlteracaoSicliEntrada;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MensagemSicliRetorno;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.MensagemSiemp;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Passaporte;
import br.gov.caixa.arqrefservices.dominio.sicli.alteracao.Usuario;
import br.gov.caixa.arqrefservices.dominio.sicli.transicao.DadosSICLITO;
import br.gov.caixa.arqrefservices.util.MensagemArqrefService;

/**
 * Classe que implemeta {@link IClienteNegocio}
 *
 * @author c110503
 *
 * @version 1.0.0.1
 *
 */
public class GerenciadorLimite implements IGerenciadorLimite {

	@Inject
	private Logger log;

	private final static String TIPO_PESSOA = "TIPO_PESSOA";
	private final static String CPF_CNPJ = "CPF_CNPJ";
	private final static String OPERACAO = "OPERACAO";
	private final static String USUARIO = "USUARIO";
	private final static String VL_CPM = "VL_CPM";
	private final static String DESC_PRODUTO = "DESC_PRODUTO";

	@Override
	public GerenciadorLimitesResponse manterLimites(GerenciadorLimitesRequest limiteRequest)
			throws PersistenceException {
		
		log.info("manterLimites -- INICIO");
		try {

			if (limiteRequest.getTipoPessoa() == null || limiteRequest.getCpfCnpj().isEmpty()
					|| limiteRequest.getOperacao() == null) {
				log.info("Dados invalidos");
			}

			String request = "?" + TIPO_PESSOA + "=" + limiteRequest.getTipoPessoa().getCodigo();
			request += "&" + CPF_CNPJ + "=" + limiteRequest.getCpfCnpj();
			request += "&" + OPERACAO + "=" + limiteRequest.getOperacao().getCodigo();
			request += "&" + USUARIO + "=" + limiteRequest.getUsuario();
			request += "&" + VL_CPM + "=" + limiteRequest.getVlCPM();
			request += "&" + DESC_PRODUTO + "=" + limiteRequest.getDescProduto();
			String urlRequest;
			if(!limiteRequest.getUrlServidor().isEmpty()){
				 urlRequest=limiteRequest.getUrlServidor() + "/sicdc/gerenciadorLimites" + request;
			}else{
				 urlRequest=System.getProperty("URL_SICDC") + "/sicdc/gerenciadorLimites" + request;
			}
			
			log.info("url request --"+ urlRequest);
			URL url = new URL(urlRequest);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String response;
			Gson gson = new Gson();
			GerenciadorLimitesResponse gerenciadorLimitesResponse = new GerenciadorLimitesResponse();
			while ((response = in.readLine()) != null) {
				gerenciadorLimitesResponse = gson.fromJson(response, GerenciadorLimitesResponse.class);

			}
			in.close();
			return gerenciadorLimitesResponse;
		} catch (MalformedURLException ex) {
			log.warning(ex.getMessage());
		} catch (IOException ex) {
			log.warning(ex.getMessage());
		} catch (Exception ex) {
			log.warning(ex.getMessage());
		}
		return null;
	}

}
