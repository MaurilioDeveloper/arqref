package br.gov.caixa.arqrefservices.dominio.sicli;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefservices.dominio.barramento.Agregado;

/**
 * Classe utilizada para dados do cliente (SICLI).
 * 
 * @author c110503
 * @version 2.0.0.1
 * 
 */
@XmlRootElement(name = "CAMPOS_RETORNADOS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CamposRetornados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6597280310125409417L;

	private CocliAtivo cocliAtivo;

	private NomeCliente nomeCliente;

	private DataNascimento dataNascimento;

	private NomePai nomePai;

	private NomeMae nomeMae;

	private Sexo sexo;

	private CPF cpf;

	private EstadoCivil estadoCivil;

	private List<MeioComunicacao> meioComunicacao;

	private List<EnderecoNacional> enderecoNacional;

	private List<EnderecoNacionalComplemento> enderecoNacionalComplemento;

	private Naturalidade naturalidade;

	private TipoPessoa tipoPessoa;

	private List<ResponsavelCarteira> responsavelCarteira;

	private List<CarteiraCliente> carteiraCliente;

	private GrauInstrucao grauInstrucao;

	private ProfissaoSiric profissaoSiric;

	private List<Renda> renda;

	private List<CarteiraGRC> carteiraGRC;

	private List<ProdutoCaixa> produtoCaixa;

	private DocumentoIdentificacao documentoIdentificacao;

	private CarteiraTrabalho carteiraTrabalho;

	private CNH cnh;

	private Passaporte passaporte;

	private Identidade identidade;

	private Nacionalidade nacionalidade;

	private List<CadastroPadrao> cadastroPadrao;

	private IdentificacaoPorte identificacaoPorte;

	private NaturezaJuridica naturezaJuridica;

	private RamoAtividadeCNAE ramoAtividadeCNAE;

	private Agregado agregado;

	private RazaoSocial razaoSocial;

	private NomeFantasia nomeFantasia;

	private PaisOrigem paisOrigem;

	private DataConstituicao dataConstituicao;

	private FaturamentoAnual faturamentoAnual;
	
	private DadosCadastraisSocio dadosCadastraisSocio;

	@XmlElement(name = "COCLI_ATIVO")
	public CocliAtivo getCocliAtivo() {
		return cocliAtivo;
	}

	public void setCocliAtivo(CocliAtivo cocliAtivo) {
		this.cocliAtivo = cocliAtivo;
	}

	@XmlElement(name = "NOME_CLIENTE")
	public NomeCliente getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(NomeCliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@XmlElement(name = "DT_NASCIMENTO")
	public DataNascimento getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(DataNascimento dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@XmlElement(name = "NOME_PAI")
	public NomePai getNomePai() {
		return nomePai;
	}

	public void setNomePai(NomePai nomePai) {
		this.nomePai = nomePai;
	}

	@XmlElement(name = "NOME_MAE")
	public NomeMae getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(NomeMae nomeMae) {
		this.nomeMae = nomeMae;
	}

	@XmlElement(name = "SEXO")
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@XmlElement(name = "CPF")
	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	@XmlElement(name = "ESTADO_CIVIL")
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@XmlElement(name = "MEIO_COMUNICACAO")
	public List<MeioComunicacao> getMeioComunicacao() {
		return meioComunicacao;
	}

	public void setMeioComunicacao(List<MeioComunicacao> meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

	@XmlElement(name = "ENDERECO_NACIONAL")
	public List<EnderecoNacional> getEnderecoNacional() {
		return enderecoNacional;
	}

	public void setEnderecoNacional(List<EnderecoNacional> enderecoNacional) {
		this.enderecoNacional = enderecoNacional;
	}

	@XmlElement(name = "ENDERECO_NACIONAL_COMP")
	public List<EnderecoNacionalComplemento> getEnderecoNacionalComplemento() {
		return enderecoNacionalComplemento;
	}

	public void setEnderecoNacionalComplemento(List<EnderecoNacionalComplemento> enderecoNacionalComplemento) {
		this.enderecoNacionalComplemento = enderecoNacionalComplemento;
	}

	@XmlElement(name = "NATURALIDADE")
	public Naturalidade getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(Naturalidade naturalidade) {
		this.naturalidade = naturalidade;
	}

	@XmlElement(name = "TP_PESSOA")
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name = "RESPONSAVEL_CARTEIRA")
	public List<ResponsavelCarteira> getResponsavelCarteira() {
		return responsavelCarteira;
	}

	public void setResponsavelCarteira(List<ResponsavelCarteira> responsavelCarteira) {
		this.responsavelCarteira = responsavelCarteira;
	}

	@XmlElement(name = "CARTEIRA_CLIENTE")
	public List<CarteiraCliente> getCarteiraCliente() {
		return carteiraCliente;
	}

	public void setCarteiraCliente(List<CarteiraCliente> carteiraCliente) {
		this.carteiraCliente = carteiraCliente;
	}

	@XmlElement(name = "GRAU_INSTRUCAO")
	public GrauInstrucao getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(GrauInstrucao grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	@XmlElement(name = "PROFISSAO_SIRIC")
	public ProfissaoSiric getProfissaoSiric() {
		return profissaoSiric;
	}

	public void setProfissaoSiric(ProfissaoSiric profissaoSiric) {
		this.profissaoSiric = profissaoSiric;
	}

	@XmlElement(name = "RENDA")
	public List<Renda> getRenda() {
		return renda;
	}

	public void setRenda(List<Renda> renda) {
		this.renda = renda;
	}

	@XmlElement(name = "CARTEIRA_GRC")
	public List<CarteiraGRC> getCarteiraGRC() {
		return carteiraGRC;
	}

	public void setCarteiraGRC(List<CarteiraGRC> carteiraGRC) {
		this.carteiraGRC = carteiraGRC;
	}

	@XmlElement(name = "PRODUTO_CAIXA")
	public List<ProdutoCaixa> getProdutoCaixa() {
		return produtoCaixa;
	}

	public void setProdutoCaixa(List<ProdutoCaixa> produtoCaixa) {
		this.produtoCaixa = produtoCaixa;
	}

	@XmlElement(name = "DOCUMENTO_IDENTIFICACAO")
	public DocumentoIdentificacao getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}

	public void setDocumentoIdentificacao(DocumentoIdentificacao documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}

	@XmlElement(name = "CARTEIRA_TRABALHO")
	public CarteiraTrabalho getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(CarteiraTrabalho carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@XmlElement(name = "CNH")
	public CNH getCnh() {
		return cnh;
	}

	public void setCnh(CNH cnh) {
		this.cnh = cnh;
	}

	@XmlElement(name = "PASSAPORTE")
	public Passaporte getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(Passaporte passaporte) {
		this.passaporte = passaporte;
	}

	@XmlElement(name = "IDENTIDADE")
	public Identidade getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Identidade identidade) {
		this.identidade = identidade;
	}

	@XmlElement(name = "NACIONALIDADE")
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@XmlElement(name = "CADASTRO_PADRAO")
	public List<CadastroPadrao> getCadastroPadrao() {
		return cadastroPadrao;
	}

	public void setCadastroPadrao(List<CadastroPadrao> cadastroPadrao) {
		this.cadastroPadrao = cadastroPadrao;
	}

	@XmlElement(name = "IDENTIFICACAO_PORTE")
	public IdentificacaoPorte getIdentificacaoPorte() {
		return identificacaoPorte;
	}

	public void setIdentificacaoPorte(IdentificacaoPorte identificacaoPorte) {
		this.identificacaoPorte = identificacaoPorte;
	}

	@XmlElement(name = "RAMO_ATIVIDADE_CNAE")
	public RamoAtividadeCNAE getRamoAtividadeCNAE() {
		return ramoAtividadeCNAE;
	}

	public void setRamoAtividadeCNAE(RamoAtividadeCNAE ramoAtividadeCNAE) {
		this.ramoAtividadeCNAE = ramoAtividadeCNAE;
	}

	@XmlElement(name = "AGREGADO")
	public Agregado getAgregado() {
		return agregado;
	}

	public void setAgregado(Agregado agregado) {
		this.agregado = agregado;
	}

	/**
	 * Recupera o valor de naturezaJuridica.
	 *
	 * @return o valor atual de naturezaJuridica
	 */
	@XmlElement(name = "NATUREZA_JURIDICA")
	public NaturezaJuridica getNaturezaJuridica() {
		return naturezaJuridica;
	}

	/**
	 * Atribuiu um valor a naturezaJuridica.
	 *
	 * @param naturezaJuridica o novo valor de naturezaJuridica
	 */
	public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}
	

	@XmlElement(name = "RAZAO_SOCIAL")
	public RazaoSocial getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(RazaoSocial razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@XmlElement(name = "PAIS_ORIGEM")
	public PaisOrigem getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(PaisOrigem paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	@XmlElement(name = "NOME_FANTASIA")
	public NomeFantasia getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(NomeFantasia nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * @return the dataConstituicao
	 */
	@XmlElement(name = "DT_CONST_EMPRESA")
	public DataConstituicao getDataConstituicao() {
		return dataConstituicao;
	}

	/**
	 * @param dataConstituicao
	 *            the dataConstituicao to set
	 */
	public void setDataConstituicao(DataConstituicao dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}

	/**
	 * 
	 * @return
	 */
	
	@XmlElement(name = "FATURAMENTO_ANUAL")
	public FaturamentoAnual getFaturamentoAnual() {
		return faturamentoAnual;
	}

	public void setFaturamentoAnual(FaturamentoAnual faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	}

	/**
	 * @return the dadosCadastraisSocio
	 */
	@XmlElement(name = "DADOS_CADASTRAIS_SOCIO")
	public DadosCadastraisSocio getDadosCadastraisSocio() {
		return dadosCadastraisSocio;
	}

	/**
	 * @param dadosCadastraisSocio the dadosCadastraisSocio to set
	 */
	public void setDadosCadastraisSocio(DadosCadastraisSocio dadosCadastraisSocio) {
		this.dadosCadastraisSocio = dadosCadastraisSocio;
	}

	
	
	

	

}
