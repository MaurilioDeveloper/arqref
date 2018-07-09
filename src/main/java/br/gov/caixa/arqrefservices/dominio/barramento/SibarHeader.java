package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;

import javax.inject.Inject;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.util.Dater;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.ESiglas;
import br.gov.caixa.arqrefservices.dominio.enumerador.EtipoOperacaoBarramento;

/**
 * Classe utilizada para montar o cabecalho do
 * SIBAR
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name="sibar_base:HEADER")
@XmlType(propOrder={ 
	"versao", 
	"autenticacao", 
	"usuarioServico", 
	"usuario",
	"operacao", 
	"indice", 
	"sistemaOrigem", 
	"unidade",
	"identificadorOrigem", 
	"dataHora", 
	"idProcesso" 
})
public class SibarHeader implements Serializable {

	private static final long serialVersionUID = 3824474321857146405L;
	
	

	private String versao;

	@XmlElement(name = "AUTENTICACAO")
	private String autenticacao = "MA==";

	private String usuarioServico;

	private String usuario;

	private String operacao;

	@XmlElement(name = "INDICE")
	private String indice = "0";

	private String sistemaOrigem;

	private String unidade;

	private String identificadorOrigem;

	private String dataHora;

	private String idProcesso;

	@XmlElement(name = "VERSAO")
	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	@XmlElement(name = "USUARIO_SERVICO")
	public String getUsuarioServico() {
		return usuarioServico;
	}

	public void setUsuarioServico(String usuarioServico) {
		this.usuarioServico = usuarioServico;
	}

	@XmlElement(name = "OPERACAO")
	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	@XmlElement(name = "SISTEMA_ORIGEM")
	public String getSistemaOrigem() {
		return sistemaOrigem;
	}

	public void setSistemaOrigem(String sistemaOrigem) {
		this.sistemaOrigem = sistemaOrigem;
	}

	@XmlElement(name = "UNIDADE")
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@XmlElement(name = "IDENTIFICADOR_ORIGEM")
	public String getIdentificadorOrigem() {
		return identificadorOrigem;
	}

	public void setIdentificadorOrigem(String identificadorOrigem) {
		this.identificadorOrigem = identificadorOrigem;
	}

	@XmlElement(name = "DATA_HORA")
	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	@XmlElement(name = "ID_PROCESSO")
	public String getIdProcesso() {
		return idProcesso;
	}

	public void setIdProcesso(String idProcesso) {
		this.idProcesso = idProcesso;
	}

	@XmlElement(name = "USUARIO")
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setAutenticacao(String autenticacao) {
		this.autenticacao = autenticacao;
	}
	
	/**
	 * Metodo que cria o cabecalho da mensagem que sera postada na fila
	 * @param empregado
	 * @param tipoPesquisa
	 * @return
	 */
	public void criarSibarHeader(Empregado empregado,
			String tipoPesquisa) {		
		this.setVersao("1.0");
		this.setUsuarioServico(System.getProperty("SIFEC_USUARIO"));
		this.setUsuario(System.getProperty("SIEMP_USUARIO"));
		if (empregado.getNumeroMatricula() != null && !empregado.getNumeroMatricula().equals("")) {
			String numeroMatriculaTmp = empregado.getNumeroMatricula().toString();
			if(numeroMatriculaTmp.length() < 6){
				//completa matricula com 0
				for(int x = numeroMatriculaTmp.length(); x < 6 ; x++ ){
					numeroMatriculaTmp = "0" + numeroMatriculaTmp;					
				}
				
			}
			this.setUsuario("C" + numeroMatriculaTmp);
		}
		this.setOperacao(tipoPesquisa);
		this.setSistemaOrigem("SIFEC");
		this.setUnidade(String.valueOf(empregado.getNumeroUnidade()));
		Dater dater = new Dater();
		if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CPF.getDescricao()) || 
				tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CNPJ.getDescricao())){
			this.setDataHora(dater.withToday().asString("yyyy-MM-dd")
					+ "T16:57:00-03:00");			
		}else if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CONSULTARISCOCREDITO.getDescricao())  ||
				tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CANCELARISCOCREDITO.getDescricao())){
			this.autenticacao = null;
			this.setDataHora(dater.withToday().asString("yyyyMMdd"));
		}else if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.AVALIACAORISCOCREDITO.getDescricao())){
			this.setVersao("2.6");
			this.setSistemaOrigem("SIAPX");
			this.autenticacao = null;
			this.setDataHora(dater.withToday().asString("ddMMyyyyhhmmss"));
	
		}
		else{
			this.setDataHora(dater.withToday().asString("yyyyMMdd"));

		}
		this.setIdProcesso(tipoPesquisa);

		
	}
	
	public void criarSibarHeader(String codigoUsuario, String numeroUnidade, String tipoPesquisa) {		
		if(codigoUsuario==null)
			codigoUsuario="SFECEMPD";
		this.setVersao("1.0");
		this.setUsuarioServico("SFECEMPD");
		this.setUsuario(codigoUsuario);
		this.setOperacao(tipoPesquisa);
		this.setSistemaOrigem("SIFEC");
		this.setUnidade(numeroUnidade);
		Dater dater = new Dater();
		if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CPF.getDescricao()) || 
				tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CNPJ.getDescricao())){
			this.setDataHora(dater.withToday().asString("yyyy-MM-dd")
					+ "T16:57:00-03:00");			
		}else if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CONSULTARISCOCREDITO.getDescricao())  ||
				tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CANCELARISCOCREDITO.getDescricao())){
			this.autenticacao = null;
			this.setDataHora(dater.withToday().asString("yyyyMMdd"));
		}
		else{
			this.setDataHora(dater.withToday().asString("yyyyMMdd"));
			
		}
		this.setIdProcesso(tipoPesquisa);
		
		
	}
	
	public void criarSibarHeaderAvaliacao(String codigoUsuario, String numeroUnidade, String tipoPesquisa, String sigla) {		
		if(codigoUsuario==null)
			codigoUsuario="SCNLFECD";
		this.setVersao("3.4");
		this.setUsuarioServico("SCNLFECD");
		this.setUsuario(codigoUsuario);
		this.setOperacao(tipoPesquisa);
		this.setSistemaOrigem(sigla);
		this.setUnidade(numeroUnidade);
		Dater dater = new Dater();
		if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CPF.getDescricao()) || 
				tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CNPJ.getDescricao())){
			this.setDataHora(dater.withToday().asString("yyyy-MM-dd")
					+ "T16:57:00-03:00");			
		}else if(tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CONSULTARISCOCREDITO.getDescricao())  ||
				tipoPesquisa.equalsIgnoreCase(EtipoOperacaoBarramento.CANCELARISCOCREDITO.getDescricao())){
			this.autenticacao = null;
			this.setDataHora(dater.withToday().asString("yyyyMMdd"));
		}
		else{
			this.setDataHora(dater.withToday().asString("yyyyMMdd"));
			
		}
		this.setIdProcesso(tipoPesquisa);
		
		
	}
}
