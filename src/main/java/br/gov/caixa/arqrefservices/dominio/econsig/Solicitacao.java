package br.gov.caixa.arqrefservices.dominio.econsig;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"dataReserva","adeNumero","servidor","telefone","cpf","matricula","valorParcela","prazo","servico","codVerba","valorLiberado","taxaJuros","estabelecimento",
					"orgao","estabelecimentoCodigo","orgaoCodigo","servicoCodigo"})
public class Solicitacao  implements java.io.Serializable {
	    
	private static final long serialVersionUID = 775913570193122517L;

	private Integer adeNumero;

    private String codVerba;

    private String cpf;

    private String dataReserva;

    private String estabelecimento;

    private String estabelecimentoCodigo;

    private String matricula;

    private String orgao;

    private String orgaoCodigo;

    private Integer prazo;

    private String servico;

    private String servicoCodigo;

    private String servidor;

    private Double taxaJuros;

    private String telefone;

    private Double valorLiberado;

    private Double valorParcela;

    public Solicitacao() {
    	
    }

    @XmlElement(name="ns8:adeNumero")
	public Integer getAdeNumero() {
		return adeNumero;
	}

    @XmlElement(name="ns8:codVerba")
	public String getCodVerba() {
		return codVerba;
	}

    @XmlElement(name="ns8:cpf")
	public String getCpf() {
		return cpf;
	}

    @XmlSchemaType(name="dateTime")
    @XmlElement(name="ns8:dataReserva")
	public String getDataReserva() {
		return dataReserva;
	}

    @XmlElement(name="ns8:estabelecimento")
	public String getEstabelecimento() {
		return estabelecimento;
	}

    @XmlElement(name="ns8:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}

    @XmlElement(name="ns8:matricula")
	public String getMatricula() {
		return matricula;
	}

    @XmlElement(name="ns8:orgao")
	public String getOrgao() {
		return orgao;
	}

    @XmlElement(name="ns8:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}

    @XmlElement(name="ns8:prazo")
	public Integer getPrazo() {
		return prazo;
	}

    @XmlElement(name="ns8:servico")
	public String getServico() {
		return servico;
	}

    @XmlElement(name="ns8:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

    @XmlElement(name="ns8:servidor")
	public String getServidor() {
		return servidor;
	}

    @XmlElement(name="ns8:taxaJuros")
	public Double getTaxaJuros() {
		return taxaJuros;
	}

    @XmlElement(name="ns8:telefone")
	public String getTelefone() {
		return telefone;
	}

    @XmlElement(name="ns8:valorLiberado")
	public Double getValorLiberado() {
		return valorLiberado;
	}

    @XmlElement(name="ns8:valorParcela")
	public Double getValorParcela() {
		return valorParcela;
	}

	public void setAdeNumero(Integer adeNumero) {
		this.adeNumero = adeNumero;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setValorLiberado(Double valorLiberado) {
		this.valorLiberado = valorLiberado;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

  }
