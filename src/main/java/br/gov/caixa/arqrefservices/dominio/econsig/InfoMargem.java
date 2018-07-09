package br.gov.caixa.arqrefservices.dominio.econsig;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"estabelecimentoCodigo","estabelecimento","orgaoCodigo","orgao","categoria","servidor","cpf","matricula","dataNascimento","dataAdmissao","prazoServidor","valorMargem","textoMargem","valorMargem2","textoMargem2","valorMargem3","textoMargem3"})
public class InfoMargem  implements Serializable {

	private static final long serialVersionUID = 242613684088582845L;
		
	private String estabelecimentoCodigo;
	
	private String estabelecimento;
	
	private String orgaoCodigo;
	
	private String orgao;
	
	private String categoria;
	
	private String servidor;
		
	private String cpf;
	
	private String matricula;
	
	private Date dataNascimento;
	
	private Date dataAdmissao;
	
	private Integer prazoServidor;
	
	private BigDecimal valorMargem;
	
	private String textoMargem;
	
	private BigDecimal valorMargem2;
	
	private String textoMargem2;
	
	private BigDecimal valorMargem3;
	
	private String textoMargem3;

	@XmlElement(name="ns6:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}

	@XmlElement(name="ns6:estabelecimento")
	public String getEstabelecimento() {
		return estabelecimento;
	}

	@XmlElement(name="ns6:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}

	@XmlElement(name="ns6:orgao")
	public String getOrgao() {
		return orgao;
	}

	@XmlElement(name="ns6:categoria")
	public String getCategoria() {
		return categoria;
	}

	@XmlElement(name="ns6:servidor")
	public String getServidor() {
		return servidor;
	}

	@XmlElement(name="ns6:cpf")
	public String getCpf() {
		return cpf;
	}

	@XmlElement(name="ns6:matricula")
	public String getMatricula() {
		return matricula;
	}

	@XmlSchemaType(name="date")
	@XmlElement(name="ns6:dataNascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	@XmlSchemaType(name="date")
	@XmlElement(name="ns6:dataAdmissao")
	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	@XmlElement(name="ns6:prazoServidor")
	public Integer getPrazoServidor() {
		return prazoServidor;
	}

	@XmlElement(name="ns6:valorMargem")
	public BigDecimal getValorMargem() {
		return valorMargem;
	}

	@XmlElement(name="ns6:textoMargem")
	public String getTextoMargem() {
		return textoMargem;
	}

	@XmlElement(name="ns6:valorMargem2")
	public BigDecimal getValorMargem2() {
		return valorMargem2;
	}

	@XmlElement(name="ns6:textoMargem2")
	public String getTextoMargem2() {
		return textoMargem2;
	}

	@XmlElement(name="ns6:valorMargem3")
	public BigDecimal getValorMargem3() {
		return valorMargem3;
	}

	@XmlElement(name="ns6:textoMargem3")
	public String getTextoMargem3() {
		return textoMargem3;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setPrazoServidor(Integer prazoServidor) {
		this.prazoServidor = prazoServidor;
	}

	public void setValorMargem(BigDecimal valorMargem) {
		this.valorMargem = valorMargem;
	}

	public void setTextoMargem(String textoMargem) {
		this.textoMargem = textoMargem;
	}

	public void setValorMargem2(BigDecimal valorMargem2) {
		this.valorMargem2 = valorMargem2;
	}

	public void setTextoMargem2(String textoMargem2) {
		this.textoMargem2 = textoMargem2;
	}

	public void setValorMargem3(BigDecimal valorMargem3) {
		this.valorMargem3 = valorMargem3;
	}

	public void setTextoMargem3(String textoMargem3) {
		this.textoMargem3 = textoMargem3;
	}

	
	

}
