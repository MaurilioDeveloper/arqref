package br.gov.caixa.arqrefservices.dominio.econsig;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"servidor","cpf","sexo","dataNascimento" ,"estadoCivil","identidade","pai","mae","endereco","numero","complemento","bairro","cidade","uf","cep","telefone","matricula","dataAdmissao" ,"prazoServidor",
		"categoria","estabelecimento","orgao","estabelecimentoCodigo","orgaoCodigo","orgaoEndereco","orgaoNumero","orgaoComplemento","orgaoBairro","orgaoCidade","orgaoUf","orgaoCep","orgaoTelefone",
		"consignataria","codVerba","ranking","servico","valorLiberado","dataReserva","dataInicial" ,"dataFinal" ,"valorParcela","adeNumero","adeIdentificador","indice","prazo","pagas","taxaJuros","situacao",
		"servicoCodigo","statusCodigo","consignatariaCodigo","responsavel"})
public class Boleto  implements java.io.Serializable {
	
	private static final long serialVersionUID = -7526235913556435559L;

	private String servidor;

    private String cpf;

    private String sexo;

    private Date dataNascimento;

    private String estadoCivil;

    private String identidade;

    private String pai;

    private String mae;

    private String endereco;

    private Integer numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;

    private String telefone;

    private String matricula;

    private Date dataAdmissao;

    private Integer prazoServidor;

    private String categoria;

    private String estabelecimento;

    private String orgao;

    private String estabelecimentoCodigo;

    private String orgaoCodigo;

    private String orgaoEndereco;

    private Integer orgaoNumero;

    private String orgaoComplemento;

    private String orgaoBairro;

    private String orgaoCidade;

    private String orgaoUf;

    private String orgaoCep;

    private String orgaoTelefone;

    private String consignataria;

    private String codVerba;

    private java.lang.Short ranking;

    private String servico;

    private java.lang.Double valorLiberado;

    private Date dataReserva;

    private Date dataInicial;

    private Date dataFinal;

    private double valorParcela;

    private Long adeNumero;;

    private String adeIdentificador;

    private String indice;

    private int prazo;

    private int pagas;

    private java.lang.Double taxaJuros;

    private String situacao;

    private String servicoCodigo;

    private String statusCodigo;

    private String consignatariaCodigo;

    private String responsavel;

    public Boleto() {
    }

    @XmlElement(name="ns1:servidor")
	public String getServidor() {
		return servidor;
	}

    @XmlElement(name="ns1:cpf")
	public String getCpf() {
		return cpf;
	}

    @XmlElement(name="ns1:sexo")
	public String getSexo() {
		return sexo;
	}

    @XmlSchemaType(name="date")
    @XmlElement(name="ns1:dataNascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}

    @XmlElement(name="ns1:estadoCivil")
	public String getEstadoCivil() {
		return estadoCivil;
	}

    @XmlElement(name="ns1:identidade")
	public String getIdentidade() {
		return identidade;
	}

    @XmlElement(name="ns1:pai")
	public String getPai() {
		return pai;
	}

    @XmlElement(name="ns1:mae")
	public String getMae() {
		return mae;
	}

    @XmlElement(name="ns1:endereco")
	public String getEndereco() {
		return endereco;
	}

    @XmlElement(name="ns1:numero")
	public Integer getNumero() {
		return numero;
	}

    @XmlElement(name="ns1:complemento")
	public String getComplemento() {
		return complemento;
	}

    @XmlElement(name="ns1:bairro")
	public String getBairro() {
		return bairro;
	}

    @XmlElement(name="ns1:cidade")
	public String getCidade() {
		return cidade;
	}

    @XmlElement(name="ns1:uf")
	public String getUf() {
		return uf;
	}

    @XmlElement(name="ns1:cep")
	public String getCep() {
		return cep;
	}

    @XmlElement(name="ns1:telefone")
	public String getTelefone() {
		return telefone;
	}

    @XmlElement(name="ns1:matricula")
	public String getMatricula() {
		return matricula;
	}

    @XmlSchemaType(name="date")
    @XmlElement(name="ns1:dataAdmissao")
	public Date getDataAdmissao() {
		return dataAdmissao;
	}

    @XmlElement(name="ns1:prazoServidor")
	public Integer getPrazoServidor() {
		return prazoServidor;
	}

    @XmlElement(name="ns1:categoria")
	public String getCategoria() {
		return categoria;
	}

    @XmlElement(name="ns1:estabelecimento")
	public String getEstabelecimento() {
		return estabelecimento;
	}

    @XmlElement(name="ns1:orgao")
	public String getOrgao() {
		return orgao;
	}

    @XmlElement(name="ns1:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}

    @XmlElement(name="ns1:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}

    @XmlElement(name="ns1:orgaoEndereco")
	public String getOrgaoEndereco() {
		return orgaoEndereco;
	}

    @XmlElement(name="ns1:orgaoNumero")
	public Integer getOrgaoNumero() {
		return orgaoNumero;
	}

    @XmlElement(name="ns1:orgaoComplemento")
	public String getOrgaoComplemento() {
		return orgaoComplemento;
	}

    @XmlElement(name="ns1:orgaoBairro")
	public String getOrgaoBairro() {
		return orgaoBairro;
	}

    @XmlElement(name="ns1:orgaoCidade")
	public String getOrgaoCidade() {
		return orgaoCidade;
	}

    @XmlElement(name="ns1:orgaoUf")
	public String getOrgaoUf() {
		return orgaoUf;
	}

    @XmlElement(name="ns1:orgaoCep")
	public String getOrgaoCep() {
		return orgaoCep;
	}

    @XmlElement(name="ns1:orgaoTelefone")
	public String getOrgaoTelefone() {
		return orgaoTelefone;
	}

    @XmlElement(name="ns1:consignataria")
	public String getConsignataria() {
		return consignataria;
	}

    @XmlElement(name="ns1:codVerba")
	public String getCodVerba() {
		return codVerba;
	}

    @XmlElement(name="ns1:ranking")
	public java.lang.Short getRanking() {
		return ranking;
	}

    @XmlElement(name="ns1:servico")
	public String getServico() {
		return servico;
	}

    @XmlElement(name="ns1:valorLiberado")
	public java.lang.Double getValorLiberado() {
		return valorLiberado;
	}

    @XmlSchemaType(name="dateTime")
    @XmlElement(name="ns1:dataReserva")
	public Date getDataReserva() {
		return dataReserva;
	}

    @XmlSchemaType(name="date")
    @XmlElement(name="ns1:dataInicial")
	public Date getDataInicial() {
		return dataInicial;
	}

    @XmlSchemaType(name="date")
    @XmlElement(name="ns1:dataFinal")
	public Date getDataFinal() {
		return dataFinal;
	}

    @XmlElement(name="ns1:valorParcela")
	public double getValorParcela() {
		return valorParcela;
	}

    @XmlElement(name="ns1:adeNumero")
	public long getAdeNumero() {
		return adeNumero;
	}

    @XmlElement(name="ns1:adeIdentificador")
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

    @XmlElement(name="ns1:indice")
	public String getIndice() {
		return indice;
	}

    @XmlElement(name="ns1:prazo")
	public int getPrazo() {
		return prazo;
	}

    @XmlElement(name="ns1:pagas")
	public int getPagas() {
		return pagas;
	}

    @XmlElement(name="ns1:taxaJuros")
	public java.lang.Double getTaxaJuros() {
		return taxaJuros;
	}

    @XmlElement(name="ns1:situacao")
	public String getSituacao() {
		return situacao;
	}

    @XmlElement(name="ns1:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

    @XmlElement(name="ns1:statusCodigo")
	public String getStatusCodigo() {
		return statusCodigo;
	}

    @XmlElement(name="ns1:consignatariaCodigo")
	public String getConsignatariaCodigo() {
		return consignatariaCodigo;
	}

    @XmlElement(name="ns1:responsavel")
	public String getResponsavel() {
		return responsavel;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public void setPrazoServidor(Integer prazoServidor) {
		this.prazoServidor = prazoServidor;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}

	public void setOrgaoEndereco(String orgaoEndereco) {
		this.orgaoEndereco = orgaoEndereco;
	}

	public void setOrgaoNumero(Integer orgaoNumero) {
		this.orgaoNumero = orgaoNumero;
	}

	public void setOrgaoComplemento(String orgaoComplemento) {
		this.orgaoComplemento = orgaoComplemento;
	}

	public void setOrgaoBairro(String orgaoBairro) {
		this.orgaoBairro = orgaoBairro;
	}

	public void setOrgaoCidade(String orgaoCidade) {
		this.orgaoCidade = orgaoCidade;
	}

	public void setOrgaoUf(String orgaoUf) {
		this.orgaoUf = orgaoUf;
	}

	public void setOrgaoCep(String orgaoCep) {
		this.orgaoCep = orgaoCep;
	}

	public void setOrgaoTelefone(String orgaoTelefone) {
		this.orgaoTelefone = orgaoTelefone;
	}

	public void setConsignataria(String consignataria) {
		this.consignataria = consignataria;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}

	public void setRanking(java.lang.Short ranking) {
		this.ranking = ranking;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setValorLiberado(java.lang.Double valorLiberado) {
		this.valorLiberado = valorLiberado;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setAdeNumero(Long adeNumero) {
		this.adeNumero = adeNumero;
	}

	public void setAdeIdentificador(String adeIdentificador) {
		this.adeIdentificador = adeIdentificador;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public void setPagas(int pagas) {
		this.pagas = pagas;
	}

	public void setTaxaJuros(java.lang.Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setStatusCodigo(String statusCodigo) {
		this.statusCodigo = statusCodigo;
	}

	public void setConsignatariaCodigo(String consignatariaCodigo) {
		this.consignatariaCodigo = consignatariaCodigo;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


    
    
    
}
