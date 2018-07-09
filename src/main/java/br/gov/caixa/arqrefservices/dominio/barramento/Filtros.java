package br.gov.caixa.arqrefservices.dominio.barramento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPequisaDocumentoIdentidade;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaConta;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaEnderecoNacional;
import br.gov.caixa.arqrefservices.dominio.enumerador.ETipoPesquisaSistema;

/**
 * Classe utilizada para montar os filtros de pesquisa na
 * entrada da consulta no SICLI 
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "FILTROS")
@XmlType(propOrder = { "nomeCliente", "dataNascimento", "nomePai", "nomeMae",
		"sexo", "cpf", "identidade", "estadoCivil", "meioComunicacao",
		"enderecoNacionalFiltro", "enderecoNacionalComplemento", "nacionalidade",
		"naturalidade", "tipoPessoa", "responsavelCarteira", "carteiraCliente",
		"grauInstrucao", "profissaoSIRIC", "razaoSocial", "faturamentoAnual","naturezaJuridica", "renda",
		"carteiraGRC", "residencia","listaProduto","documentoIdentificacaoFiltro","cadastroPadrao",
		"documentoCNH", "documentoPassaporte","carteiraTrabalho", "certidaoNascimento",  "paisOrigem",
		"nomeFantasia", "identificacaoPorte", "optanteSimples", "ramoAtividadeCNAE", "documentoPrincipal",
		"agregado" })



public class Filtros {

	private String nomeCliente;

	private String dataNascimento;

	private String nomePai;

	private String nomeMae;

	private String sexo;

	private String cpf;

	private String identidade;

	private String estadoCivil;

	private String meioComunicacao;

	private EnderecoNacionalFiltro enderecoNacionalFiltro;

	private String enderecoNacionalComplemento;

	private String nacionalidade;

	private String naturalidade;

	private String tipoPessoa;

	private String responsavelCarteira;

	private String carteiraCliente;

	private String grauInstrucao;

	private String profissaoSIRIC;

	private String razaoSocial;
	
	private String faturamentoAnual;
	
	private String naturezaJuridica;

	private String renda;

	private String carteiraGRC;

	private String residencia;
	
	private DocumentoIdentificacaoFiltro documentoIdentificacaoFiltro;
	
	private List<ProdutoCaixaFiltro> listaProduto;
	
	private String cadastroPadrao;

	private String documentoCNH;

	private String documentoPassaporte;

	private String carteiraTrabalho;

	private String certidaoNascimento;

	// private String profissaoSIRIC;
	private String paisOrigem;

	private String nomeFantasia;

	private String identificacaoPorte;
	
	private String optanteSimples;

	private String ramoAtividadeCNAE;

	private Agregado agregado;
	
	private DocumentoPrincipal documentoPrincipal;
	
	
	@XmlElement(name = "NOME_CLIENTE")
	public String getNomeCliente() {
		return this.nomeCliente;
	}

	@XmlElement(name = "MEIO_COMUNICACAO")
	public String getMeioComunicacao() {
		return this.meioComunicacao;
	}

	@XmlElement(name = "ENDERECO_NACIONAL")
	public EnderecoNacionalFiltro getEnderecoNacionalFiltro() {
		return this.enderecoNacionalFiltro;
	}
	
	@XmlElement(name = "DOCUMENTO_IDENTIFICACAO")
	public DocumentoIdentificacaoFiltro getDocumentoIdentificacaoFiltro() {
		return documentoIdentificacaoFiltro;
	}
	public void setDocumentoIdentificacaoFiltro(
			DocumentoIdentificacaoFiltro documentoIdentificacaoFiltro) {
		this.documentoIdentificacaoFiltro = documentoIdentificacaoFiltro;
	}

	@XmlElement(name = "CPF")
	public String getCpf() {
		return this.cpf;
	}

	@XmlElement(name = "RENDA")
	public String getRenda() {
		return this.renda;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setMeioComunicacao(String meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

	public void setEnderecoNacionalFiltro(EnderecoNacionalFiltro enderecoNacionalFiltro) {
		this.enderecoNacionalFiltro = enderecoNacionalFiltro;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}

	@XmlElement(name = "DATA_NASCIMENTO")
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@XmlElement(name = "NOME_PAI")
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@XmlElement(name = "NOME_MAE")
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@XmlElement(name = "SEXO")
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@XmlElement(name = "IDENTIDADE")
	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	@XmlElement(name = "ESTADO_CIVIL")
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@XmlElement(name = "NACIONALIDADE")
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@XmlElement(name = "NATURALIDADE")
	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	@XmlElement(name = "TIPO_PESSOA")
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name = "RESPONSAVEL_CARTEIRA")
	public String getResponsavelCarteira() {
		return responsavelCarteira;
	}

	public void setResponsavelCarteira(String responsavelCarteira) {
		this.responsavelCarteira = responsavelCarteira;
	}

	@XmlElement(name = "CART_CLIENTE_CAIXA")
	public String getCarteiraCliente() {
		return carteiraCliente;
	}

	public void setCarteiraCliente(String carteiraCliente) {
		this.carteiraCliente = carteiraCliente;
	}

	@XmlElement(name = "GRAU_INSTRUCAO")
	public String getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	@XmlElement(name = "PROFISSAO_SIRIC")
	public String getProfissaoSIRIC() {
		return profissaoSIRIC;
	}

	public void setProfissaoSIRIC(String profissaoSIRIC) {
		this.profissaoSIRIC = profissaoSIRIC;
	}

	@XmlElement(name = "CARTEIRA_GRC")
	public String getCarteiraGRC() {
		return carteiraGRC;
	}

	public void setCarteiraGRC(String carteiraGRC) {
		this.carteiraGRC = carteiraGRC;
	}

	@XmlElement(name = "RESIDENCIA")
	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	@XmlElement(name = "RAZAO_SOCIAL")
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@XmlElement(name = "ENDERECO_NACIONAL_COMP")
	public String getEnderecoNacionalComplemento() {
		return enderecoNacionalComplemento;
	}

	public void setEnderecoNacionalComplemento(
			String enderecoNacionalComplemento) {
		this.enderecoNacionalComplemento = enderecoNacionalComplemento;
	}
	
	@XmlElement(name = "PRODUTO_CAIXA")
	public List<ProdutoCaixaFiltro> getListaProduto() {
		return listaProduto;
	}
	
	public void setListaProduto(List<ProdutoCaixaFiltro> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	public void setTipoPesquisaEnderecoNacional(
			ETipoPesquisaEnderecoNacional tipoPesquisaEnderecoNacional) {
			this.enderecoNacionalFiltro = new EnderecoNacionalFiltro();
			switch (tipoPesquisaEnderecoNacional) {
				case GENERICO:
					this.enderecoNacionalFiltro.setTipo(tipoPesquisaEnderecoNacional.GENERICO.getValor());
					break;
				default:
					break;
			}
		
		
	}
	
	public void setTipoPesquisaProdutoCaixa(
			ETipoPesquisaConta tipoPesquisaConta,
			ETipoPesquisaSistema tipoPesquisaSistema) {
		//Verifica se a lista de produtos caixa esta vazia
		// se estiver inicia
		if(listaProduto == null){
			listaProduto = new ArrayList<Filtros.ProdutoCaixaFiltro>();
		}
		//Cria o produto caixa com os parametros da pesquisa
		ProdutoCaixaFiltro produto = new ProdutoCaixaFiltro();
		produto.setProduto(Integer.toString(tipoPesquisaConta.getValor()));
		produto.setSistema(tipoPesquisaSistema.getValor());
		
		//adiciona na lista de produtos a serem pesquisados
		//pelos paremetros passados
		listaProduto.add(produto);
		
	}
	
	public void setTipoPesquisaProdutoTodasContasSIDEC() {
		//Verifica se a lista de produtos caixa esta vazia
		// se estiver inicia
		if(listaProduto == null){
			listaProduto = new ArrayList<Filtros.ProdutoCaixaFiltro>();
		}
		//Cria o produto caixa com os parametros da pesquisa
		ProdutoCaixaFiltro produto; 
		
		List<ETipoPesquisaConta> listaContas = Arrays.asList(ETipoPesquisaConta.values());

		for (Iterator iterator = listaContas.iterator(); iterator.hasNext();) {
			ETipoPesquisaConta eTipoPesquisaConta = (ETipoPesquisaConta) iterator
					.next();
			produto = new ProdutoCaixaFiltro();
			produto.setProduto(Integer.toString(eTipoPesquisaConta.getValor()));
			produto.setSistema("SIDEC");
			listaProduto.add(produto);
		}
	}
	
	public void setTipoPesquisaDocumentoIdentidade(
			ETipoPequisaDocumentoIdentidade tipo,
			ETipoPequisaDocumentoIdentidade quantidade) {
		this.documentoIdentificacaoFiltro = new DocumentoIdentificacaoFiltro();
		this.documentoIdentificacaoFiltro.setTipo(tipo.getValor());
		this.documentoIdentificacaoFiltro.setQuantidade(quantidade.getValor());		
	}

	/**
	 * Metodo utilizado para setar uma pesquisa basica 
	 * com os atributos que nao possuem parametros.
	 */
	public void setTodasInformacoesBasica() {
		this.nomeCliente = "";
		this.dataNascimento = "";
		this.nomePai = "";
		this.nomeMae = "";
		this.sexo = "";
		this.cpf = "";
		this.estadoCivil = "";
		this.meioComunicacao = "";
		this.nacionalidade = "";
		this.naturalidade = "";
		this.tipoPessoa = "";
		this.responsavelCarteira = "";
		this.carteiraCliente = "";
		this.grauInstrucao = "";
		this.profissaoSIRIC = "";
		this.renda = "";
		this.faturamentoAnual = "";
		this.naturezaJuridica = "";
		this.carteiraGRC = "";
		this.residencia = "";	
		this.paisOrigem = "";
		this.cadastroPadrao= "";
	}

	public void setConsultaCNPJ() {
		this.tipoPessoa = "";
		this.razaoSocial = "";
		this.nomeFantasia= "";
		this.meioComunicacao = "";
		this.enderecoNacionalFiltro = new EnderecoNacionalFiltro();
		this.nacionalidade = "";
		this.naturalidade = "";
		this.ramoAtividadeCNAE = "";
		this.identificacaoPorte = "";
	}
	
	public void setAllEmpresa() {
		this.razaoSocial = "";
	}

	public void setRazoSocialSIICO() {
		this.razaoSocial = "";
	}

	/***
	 * Classes Internnas para uso de consultas no SICLI com passagem de
	 * parametros
	 */

	/**
	 * Classe Interna para resolver o problema 
	 * <ENDERECO_NACIONAL>
	 * 		<TIPO>PARAMETRO</TIPO> 
	 * </ENDERECO_NACIONAL>
	 */
	@XmlRootElement(name = "ENDERECO_NACIONAL")
	@XmlType(propOrder = { "tipo"})
	protected static class EnderecoNacionalFiltro {

		//Sempre pesguisa pelo tipo GENERICO;
		private String tipo /*= "G"*/;	

		@XmlElement(name = "TIPO")
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * Classe Interna para resolver o problema 
	 * <DOCUMENTO_IDENTIFICACAO>
	 *		<QUANTIDADE>PARAMETRO</QUANTIDADE>
	 *		<TIPO>PARAMETRO</TIPO>
	 * </DOCUMENTO_IDENTIFICACAO>
	 */
	@XmlRootElement(name = "DOCUMENTO_IDENTIFICACAO")
	@XmlType(propOrder = { "quantidade","tipo"})
	private static class DocumentoIdentificacaoFiltro {

		//Sempre pesguisa pelo documento principal e por unico;
		private String quantidade = "01";	
		private String tipo = "P";	

		@XmlElement(name = "QUANTIDADE")
		public String getQuantidade() {
			return quantidade;
		}
		
		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}
		
		@XmlElement(name = "TIPO")
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * Classe Interna para resolver o problema 
	 * <PRODUTO_CAIXA>				
	 *		<SISTEMA>PARAMETRO</SISTEMA>
	 *		<PRODUTO>PARAMETRO</PRODUTO>					
	 * </PRODUTO_CAIXA>
	 */
	@XmlRootElement(name = "PRODUTO_CAIXA")
	@XmlType(propOrder = { "sistema","produto"})
	private static class ProdutoCaixaFiltro {

		//Sempre pesguisa pelo documento principal e por unico;
		private String sistema;	
		private String produto;	

		@XmlElement(name = "SISTEMA")
		public String getSistema() {
			return sistema;
		}
		
		public void setSistema(String sistema) {
			this.sistema = sistema;
		}
		
		@XmlElement(name = "PRODUTO")
		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}
	}

	@XmlElement(name = "CADASTRO_PADRAO")
	public String getCadastroPadrao() {
		return cadastroPadrao;
	}

	public void setCadastroPadrao(String cadastroPadrao) {
		this.cadastroPadrao = cadastroPadrao;
	}
	
	@XmlElement(name = "CNH")
	public String getDocumentoCNH() {
		return documentoCNH;
	}

	public void setDocumentoCNH(String documentoCNH) {
		this.documentoCNH = documentoCNH;
	}
	
	@XmlElement(name = "PASSAPORTE")
	public String getDocumentoPassaporte() {
		return documentoPassaporte;
	}

	public void setDocumentoPassaporte(String documentoPassaporte) {
		this.documentoPassaporte = documentoPassaporte;
	}

	@XmlElement(name = "CARTEIRA_TRABALHO")
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@XmlElement(name = "CERTIDAO_NASCIMENTO")
	public String getCertidaoNascimento() {
		return certidaoNascimento;
	}

	public void setCertidaoNascimento(String certidaoNascimento) {
		this.certidaoNascimento = certidaoNascimento;
	}

	@XmlElement(name = "PAIS_ORIGEM")
	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	@XmlElement(name = "NOME_FANTASIA")
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@XmlElement(name = "IDENTIFICACAO_PORTE")
	public String getIdentificacaoPorte() {
		return identificacaoPorte;
	}

	public void setIdentificacaoPorte(String identificacaoPorte) {
		this.identificacaoPorte = identificacaoPorte;
	}

	@XmlElement(name = "RAMO_ATIVIDADE_CNAE")
	public String getRamoAtividadeCNAE() {
		return ramoAtividadeCNAE;
	}
	
	public void setRamoAtividadeCNAE(String ramoAtividadeCNAE) {
		this.ramoAtividadeCNAE = ramoAtividadeCNAE;
	}

	@XmlElement(name = "AGREGADO")
	public Agregado getAgregado() {
		return agregado;
	}

	public void setAgregado(Agregado agregado) {
		this.agregado = agregado;
	}

	@XmlElement(name = "OPCAO_SIMPLES")
	public String getOptanteSimples() {
		return optanteSimples;
	}

	public void setOptanteSimples(String optanteSimples) {
		this.optanteSimples = optanteSimples;
	}
	
	@XmlElement(name = "DOCUMENTO_IDENTIFICACAO")
	public DocumentoPrincipal getDocumentoPrincipal() {
		return documentoPrincipal;
	}

	public void setDocumentoPrincipal(DocumentoPrincipal documentoPrincipal) {
		this.documentoPrincipal = documentoPrincipal;
	}

	/**
	 * Recupera o valor de faturamentoAnual.
	 *
	 * @return o valor atual de faturamentoAnual
	 */
	@XmlElement(name = "FATURAMENTO_ANUAL")
	public String getFaturamentoAnual() {
		return faturamentoAnual;
	}

	/**
	 * Atribuiu um valor a faturamentoAnual.
	 *
	 * @param faturamentoAnual o novo valor de faturamentoAnual
	 */
	public void setFaturamentoAnual(String faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	}

	/**
	 * Recupera o valor de naturezaJuridica.
	 *
	 * @return o valor atual de naturezaJuridica
	 */
	@XmlElement(name = "NATUREZA_JURIDICA")
	public String getNaturezaJuridica() {
		return naturezaJuridica;
	}

	/**
	 * Atribuiu um valor a naturezaJuridica.
	 *
	 * @param naturezaJuridica o novo valor de naturezaJuridica
	 */
	public void setNaturezaJuridica(String naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}

}
