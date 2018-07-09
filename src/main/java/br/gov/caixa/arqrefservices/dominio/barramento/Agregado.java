package br.gov.caixa.arqrefservices.dominio.barramento;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AGREGADO")
@XmlType(propOrder = { "codigo", "ocorrencia", "produto", "numeroContrato", "tipoAgregado", "tipoPessoa", "cpfCnpj",
		"dataNascimento", "razaoSocial", "dataIncio", "dataFim", "quantidade", "tipo" })
public class Agregado implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigo;

	private BigInteger ocorrencia;

	private Integer produto;

	private String numeroContrato;

	private Integer tipoAgregado;

	private Integer tipoPessoa;

	private BigInteger cpfCnpj;

	private String dataNascimento;

	private String razaoSocial;

	private String dataIncio;

	private String dataFim;

	private Integer quantidade;

	private Integer tipo;

	public Agregado() {
	}

	public Agregado(Integer quantidade, Integer tipo) {
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	@XmlElement(name = "CODIGO")
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@XmlElement(name = "OCORRENCIA")
	public BigInteger getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(BigInteger ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@XmlElement(name = "PRODUTO")
	public Integer getProduto() {
		return produto;
	}

	public void setProduto(Integer produto) {
		this.produto = produto;
	}

	@XmlElement(name = "CONTRATO")
	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	@XmlElement(name = "TP_AGREGADO")
	public Integer getTipoAgregado() {
		return tipoAgregado;
	}

	public void setTipoAgregado(Integer tipoAgregado) {
		this.tipoAgregado = tipoAgregado;
	}

	@XmlElement(name = "TP_PESSOA")
	public Integer getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(Integer tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@XmlElement(name = "CPF_CNPJ")
	public BigInteger getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(BigInteger cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	@XmlElement(name = "DT_NASCIMENTO")
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@XmlElement(name = "RAZAO_SOCIAL")
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@XmlElement(name = "DT_INICIO")
	public String getDataIncio() {
		return dataIncio;
	}

	public void setDataIncio(String dataIncio) {
		this.dataIncio = dataIncio;
	}

	@XmlElement(name = "DT_FIM")
	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	@XmlElement(name = "QUANTIDADE")
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@XmlElement(name = "TIPO")
	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

}
