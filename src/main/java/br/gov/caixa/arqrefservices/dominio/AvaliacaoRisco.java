package br.gov.caixa.arqrefservices.dominio;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada avaliacao de risco de credito (SIRIC). Essa classe contem
 * regras de reenderizacao devido ao XML que eh recebido. Atencao para classes
 * internas
 * 
 * @author c110503
 * @version 1.0.0.1
 * 
 */
public class AvaliacaoRisco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3461077718053365309L;
	
	private String proposta;
	
	private String codigoAvaliacao;
	
	private ClienteSIRIC cliente;
	
	private String produto;
	
	private String modalidade;
	
	private String dataInicioVigencia;
	
	private String dataFimVigencia;
	
	private String prazo;
	
	private String valorLimiteGlobal;
	
	private String valorCPM;
	
	private String valorFinanciamento;
	
	private String rating;
	
	private String flagBloquoAlcada;
	
	private String acaoVenda;	
	
	private String identificadorMensagem;
	
	private List<MensagemRetorno> listaMensagemAvaliacaoNegada;

	// Classe Interna
	private AvaliacaoRiscoAprovada avaliacaoRiscoAprovada = new AvaliacaoRiscoAprovada();
	
	private MensagemRetorno mensagemRetorno = new MensagemRetorno();

	/***
	 * GET/SET via classe interna
	 * Deve ser sempre sincronizado.
	 * 
	 */		
	
	public String getProposta() {
		this.proposta = this.avaliacaoRiscoAprovada.getProposta();
		return proposta;
	}

	public void setProposta(String proposta) {
		this.avaliacaoRiscoAprovada.setProduto(proposta);
		this.proposta = proposta;
	}

	public String getCodigoAvaliacao() {
		this.codigoAvaliacao = this.avaliacaoRiscoAprovada.getCodigoAvaliacao();
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(String codigoAvaliacao) {
		this.avaliacaoRiscoAprovada.setCodigoAvaliacao(codigoAvaliacao);
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public ClienteSIRIC getCliente() {
		this.cliente = this.avaliacaoRiscoAprovada.getCliente();
		return cliente;
	}

	public void setCliente(ClienteSIRIC cliente) {
		this.avaliacaoRiscoAprovada.setCliente(cliente);
		this.cliente = cliente;
	}

	public String getProduto() {
		this.produto = this.avaliacaoRiscoAprovada.getProduto();
		return produto;
	}

	public void setProduto(String produto) {
		this.avaliacaoRiscoAprovada.setProduto(produto);
		this.produto = produto;
	}

	public String getModalidade() {
		this.modalidade = this.avaliacaoRiscoAprovada.getModalidade();
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.avaliacaoRiscoAprovada.setModalidade(modalidade);
		this.modalidade = modalidade;
	}

	public String getDataInicioVigencia() {
		this.dataInicioVigencia = this.avaliacaoRiscoAprovada.getDataInicioVigencia();
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.avaliacaoRiscoAprovada.setDataInicioVigencia(dataInicioVigencia);
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public String getDataFimVigencia() {
		this.dataFimVigencia = this.avaliacaoRiscoAprovada.getDataFimVigencia();
		return dataFimVigencia;
	}

	public void setDataFimVigencia(String dataFimVigencia) {
		this.avaliacaoRiscoAprovada.setDataFimVigencia(dataFimVigencia);
		this.dataFimVigencia = dataFimVigencia;
	}

	public String getPrazo() {
		this.prazo = this.avaliacaoRiscoAprovada.getPrazo();
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.avaliacaoRiscoAprovada.setPrazo(prazo);
		this.prazo = prazo;
	}

	public String getValorLimiteGlobal() {
		this.valorLimiteGlobal = this.avaliacaoRiscoAprovada.getValorLimiteGlobal();
		return valorLimiteGlobal;
	}

	public void setValorLimiteGlobal(String valorLimiteGlobal) {
		this.avaliacaoRiscoAprovada.setValorLimiteGlobal(valorLimiteGlobal);
		this.valorLimiteGlobal = valorLimiteGlobal;
	}

	public String getValorCPM() {
		this.valorCPM = this.avaliacaoRiscoAprovada.getValorCPM();
		return valorCPM;
	}

	public void setValorCPM(String valorCPM) {
		this.avaliacaoRiscoAprovada.setValorCPM(valorCPM);
		this.valorCPM = valorCPM;
	}

	public String getValorFinanciamento() {
		this.valorFinanciamento = this.avaliacaoRiscoAprovada.getValorFinanciamento();
		return valorFinanciamento;
	}

	public void setValorFinanciamento(String valorFinanciamento) {
		this.avaliacaoRiscoAprovada.setValorFinanciamento(valorFinanciamento);
		this.valorFinanciamento = valorFinanciamento;
	}

	public String getRating() {
		this.rating = this.avaliacaoRiscoAprovada.getRating();
		return rating;
	}

	public void setRating(String rating) {
		this.avaliacaoRiscoAprovada.setRating(rating);
		this.rating = rating;
	}

	public String getFlagBloquoAlcada() {
		this.flagBloquoAlcada = this.avaliacaoRiscoAprovada.getFlagBloquoAlcada();
		return flagBloquoAlcada;
	}

	public void setFlagBloquoAlcada(String flagBloquoAlcada) {
		this.avaliacaoRiscoAprovada.setFlagBloquoAlcada(flagBloquoAlcada);
		this.flagBloquoAlcada = flagBloquoAlcada;
	}

	public String getAcaoVenda() {
		this.acaoVenda = this.avaliacaoRiscoAprovada.getAcaoVenda();
		return acaoVenda;
	}

	public void setAcaoVenda(String acaoVenda) {
		this.avaliacaoRiscoAprovada.setAcaoVenda(acaoVenda);
		this.acaoVenda = acaoVenda;
	}
	
	@XmlElement(name="MENSAGEM_RETORNO")
	public List<MensagemRetorno> getListaMensagemAvaliacaoNegada() {
		return listaMensagemAvaliacaoNegada;
	}
	
	public void setListaMensagemAvaliacaoNegada(
			List<MensagemRetorno> listaMensagemAvaliacaoNegada) {
		this.listaMensagemAvaliacaoNegada = listaMensagemAvaliacaoNegada;
	}

	
	/**
	 * Mapeamento do XML com a classe interna
	 *	 
	 */
	
	@XmlElement(name = "APROVADA")
	private AvaliacaoRiscoAprovada getAvaliacaoRiscoAprovada() {
		return avaliacaoRiscoAprovada;
	}
	private void setAvaliacaoRiscoAprovada(AvaliacaoRiscoAprovada avaliacaoRiscoAprovada) {
		this.avaliacaoRiscoAprovada = avaliacaoRiscoAprovada;
	}

	/**
	 * Classe Interna para resolver o problema 
	 * <AVALIACAO> 
	 * 	<APROVADA>ASCQ ZXCV</APROVADA>
	 * </AVALIACAO>
	 */
	@XmlRootElement(name = "MENSAGEM_RETORNO")
	private static class AvaliacaoRiscoAprovada {

		private String proposta;
		
		private String codigoAvaliacao;
		
		private ClienteSIRIC cliente;
		
		private String produto;
		
		private String modalidade;
		
		private String dataInicioVigencia;
		
		private String dataFimVigencia;
		
		private String prazo;
		
		private String valorLimiteGlobal;
		
		private String valorCPM;
		
		private String valorFinanciamento;
		
		private String rating;
		
		private String flagBloquoAlcada;
		
		private String acaoVenda;		

		@XmlElement(name = "PROPOSTA")
		public String getProposta() {
			return proposta;
		}

		public void setProposta(String proposta) {
			this.proposta = proposta;
		}

		@XmlElement(name = "CODIGO_AVALIACAO")
		public String getCodigoAvaliacao() {
			return codigoAvaliacao;
		}

		public void setCodigoAvaliacao(String codigoAvaliacao) {
			this.codigoAvaliacao = codigoAvaliacao;
		}

		@XmlElement(name = "CLIENTE")
		public ClienteSIRIC getCliente() {
			return cliente;
		}

		public void setCliente(ClienteSIRIC cliente) {
			this.cliente = cliente;
		}

		@XmlElement(name = "PRODUTO")
		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		@XmlElement(name = "MODALIDADE")
		public String getModalidade() {
			return modalidade;
		}

		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}

		@XmlElement(name = "DT_INICIO_VIGENCIA")
		public String getDataInicioVigencia() {
			return dataInicioVigencia;
		}

		public void setDataInicioVigencia(String dataInicioVigencia) {
			this.dataInicioVigencia = dataInicioVigencia;
		}

		@XmlElement(name = "DT_FIM_VIGENCIA")
		public String getDataFimVigencia() {
			return dataFimVigencia;
		}

		public void setDataFimVigencia(String dataFimVigencia) {
			this.dataFimVigencia = dataFimVigencia;
		}

		@XmlElement(name = "PRAZO")
		public String getPrazo() {
			return prazo;
		}

		public void setPrazo(String prazo) {
			this.prazo = prazo;
		}

		@XmlElement(name = "VR_LIMITE_GLOBAL")
		public String getValorLimiteGlobal() {
			return valorLimiteGlobal;
		}

		public void setValorLimiteGlobal(String valorLimiteGlobal) {
			this.valorLimiteGlobal = valorLimiteGlobal;
		}

		@XmlElement(name = "VR_CPM")
		public String getValorCPM() {
			return valorCPM;
		}

		public void setValorCPM(String valorCPM) {
			this.valorCPM = valorCPM;
		}

		@XmlElement(name = "VR_FINANCIAMENTO")
		public String getValorFinanciamento() {
			return valorFinanciamento;
		}

		public void setValorFinanciamento(String valorFinanciamento) {
			this.valorFinanciamento = valorFinanciamento;
		}

		@XmlElement(name = "RATING")
		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		@XmlElement(name = "FLAG_BLOQ_ALCADA")
		public String getFlagBloquoAlcada() {
			return flagBloquoAlcada;
		}

		public void setFlagBloquoAlcada(String flagBloquoAlcada) {
			this.flagBloquoAlcada = flagBloquoAlcada;
		}

		@XmlElement(name = "ACAO_VENDA")
		public String getAcaoVenda() {
			return acaoVenda;
		}

		public void setAcaoVenda(String acaoVenda) {
			this.acaoVenda = acaoVenda;
		}
	}

	/**
	 * Classe Interna para resolver o problema 
	 * <AVALIACAO> 
	 * 	<APROVADA>ASCQ ZXCV</APROVADA>
	 * </AVALIACAO>
	 */
	@XmlRootElement(name = "MENSAGEM_RETORNO")
	private static class MensagemRetorno {
		private String proposta;
		
		private ClienteSIRIC cliente;
		
		private String produto;
		
		private String identificadorMensagem;

		@XmlElement(name = "PROPOSTA")
		public String getProposta() {
			return proposta;
		}

		public void setProposta(String proposta) {
			this.proposta = proposta;
		}
		
		@XmlElement(name = "CLIENTE")
		public ClienteSIRIC getCliente() {
			return cliente;
		}

		public void setCliente(ClienteSIRIC cliente) {
			this.cliente = cliente;
		}

		@XmlElement(name = "PRODUTO")
		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		@XmlElement(name = "IDENTIFICADOR_MENSAGEM")
		public String getIdentificadorMensagem() {
			return identificadorMensagem;
		}

		public void setIdentificadorMensagem(String identificadorMensagem) {
			this.identificadorMensagem = identificadorMensagem;
		}
		
		
	}
	@Override
	public String toString() {
		return "AvaliacaoRisco [getProposta()=" + getProposta()
				+ ", getCodigoAvaliacao()=" + getCodigoAvaliacao()
				+ ", getCliente()=" + getCliente() + ", getProduto()="
				+ getProduto() + ", getModalidade()=" + getModalidade()
				+ ", getDataInicioVigencia()=" + getDataInicioVigencia()
				+ ", getDataFimVigencia()=" + getDataFimVigencia()
				+ ", getPrazo()=" + getPrazo() + ", getValorLimiteGlobal()="
				+ getValorLimiteGlobal() + ", getValorCPM()=" + getValorCPM()
				+ ", getValorFinanciamento()=" + getValorFinanciamento()
				+ ", getRating()=" + getRating() + ", getFlagBloquoAlcada()="
				+ getFlagBloquoAlcada() + ", getAcaoVenda()=" + getAcaoVenda()
				+ ", getAvaliacaoRiscoAprovada()="
				+ getAvaliacaoRiscoAprovada() + "]";
	}
	
	

}
