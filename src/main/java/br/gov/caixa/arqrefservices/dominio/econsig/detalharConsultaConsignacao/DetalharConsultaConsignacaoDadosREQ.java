package br.gov.caixa.arqrefservices.dominio.econsig.detalharConsultaConsignacao;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.SituacaoContrato;
import br.gov.caixa.arqrefservices.dominio.econsig.SituacaoServidor;

@XmlRootElement(name="hos:detalharConsultaConsignacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","matricula","cpf","orgaoCodigo","estabelecimentoCodigo",
		"correspondenteCodigo","servicoCodigo","codVerba","sdvSolicitado","sdvSolicitadoNaoCadastrado","sdvSolicitadoCadastrado","sdvNaoSolicitado",
		"periodo","dataInclusaoInicio","dataInclusaoFim","integraFolha","codigoMargem","indice","situacaoContrato","situacaoServidor" })
public class DetalharConsultaConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String adeIdentificador;
	
	private Long adeNumero;
	
	private String cliente; 
	
	private Integer codigoMargem; 
	
	private String codVerba; 
	
	private String convenio;
	
	private String correspondenteCodigo;
	
	private String cpf;
	
	private Date dataInclusaoFim;
	
	private Date dataInclusaoInicio;
	
	private String estabelecimentoCodigo;
	
	private String indice;
	
	private Integer integraFolha;
	
	private String matricula;
	
	private String orgaoCodigo;
	
	private Date periodo;
	
	private Boolean sdvNaoSolicitado;
	
	private Boolean sdvSolicitado;
	
	private Boolean sdvSolicitadoCadastrado;
	
	private Boolean sdvSolicitadoNaoCadastrado;
	
	private String senha;
	
	private String servicoCodigo;
	
	private SituacaoContrato situacaoContrato;
	
	private SituacaoServidor situacaoServidor;
	
	private String usuario;
				
	@XmlElement(name="hos:adeIdentificador")	
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:adeNumero")	
	public Long getAdeNumero() {
		return adeNumero;
	}
	
	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}
	
	@XmlElement(name="hos:codigoMargem")	
	public Integer getCodigoMargem() {
		return codigoMargem;
	}
	
	@XmlElement(name="hos:codVerba")
	public String getCodVerba() {
		return codVerba;
	}

	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
	}

	@XmlElement(name="hos:correspondenteCodigo")
	public String getCorrespondenteCodigo() {
		return correspondenteCodigo;
	}

	@XmlElement(name="hos:cpf")	
	public String getCpf() {
		return cpf;
	}

	@XmlSchemaType(name="date")
	@XmlElement(name="hos:dataInclusaoFim")
	public Date getDataInclusaoFim() {
		return dataInclusaoFim;
	}

	@XmlSchemaType(name="date")
	@XmlElement(name="hos:dataInclusaoInicio")
	public Date getDataInclusaoInicio() {
		return dataInclusaoInicio;
	}

	@XmlElement(name="hos:estabelecimentoCodigo")
	public String getEstabelecimentoCodigo() {
		return estabelecimentoCodigo;
	}

	@XmlElement(name="hos:indice")
	public String getIndice() {
		return indice;
	}
	
	@XmlElement(name="hos:integraFolha")
	public Integer getIntegraFolha() {
		return integraFolha;
	}

	@XmlElement(name="hos:matricula")
	public String getMatricula() {
		return matricula;
	}

	@XmlElement(name="hos:orgaoCodigo")
	public String getOrgaoCodigo() {
		return orgaoCodigo;
	}

	@XmlSchemaType(name="date")
	@XmlElement(name="hos:periodo")
	public Date getPeriodo() {
		return periodo;
	}

	@XmlElement(name="hos:sdvNaoSolicitado")
	public Boolean getSdvNaoSolicitado() {
		return sdvNaoSolicitado;
	}

	@XmlElement(name="hos:sdvSolicitado")
	public Boolean getSdvSolicitado() {
		return sdvSolicitado;
	}
	
	@XmlElement(name="hos:sdvSolicitadoCadastrado")
	public Boolean getSdvSolicitadoCadastrado() {
		return sdvSolicitadoCadastrado;
	}

	@XmlElement(name="hos:sdvSolicitadoNaoCadastrado")
	public Boolean getSdvSolicitadoNaoCadastrado() {
		return sdvSolicitadoNaoCadastrado;
	}

	@XmlElement(name="hos:senha")
	public String getSenha() {
		return senha;
	}

	@XmlElement(name="hos:servicoCodigo")
	public String getServicoCodigo() {
		return servicoCodigo;
	}

	@XmlElement(name="hos:situacaoContrato")
	public SituacaoContrato getSituacaoContrato() {
		return situacaoContrato;
	}

	@XmlElement(name="hos:situacaoServidor")
	public SituacaoServidor getSituacaoServidor() {
		return situacaoServidor;
	}

	@XmlElement(name="hos:usuario")
	public String getUsuario() {
		return usuario;
	}

	public void setAdeIdentificador(String adeIdentificador) {
		this.adeIdentificador = adeIdentificador;
	}

	public void setAdeNumero(Long adeNumero) {
		this.adeNumero = adeNumero;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setCodigoMargem(Integer codigoMargem) {
		this.codigoMargem = codigoMargem;
	}

	public void setCodVerba(String codVerba) {
		this.codVerba = codVerba;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setCorrespondenteCodigo(String correspondenteCodigo) {
		this.correspondenteCodigo = correspondenteCodigo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataInclusaoFim(Date dataInclusaoFim) {
		this.dataInclusaoFim = dataInclusaoFim;
	}

	public void setDataInclusaoInicio(Date dataInclusaoInicio) {
		this.dataInclusaoInicio = dataInclusaoInicio;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public void setIntegraFolha(Integer integraFolha) {
		this.integraFolha = integraFolha;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setOrgaoCodigo(String orgaoCodigo) {
		this.orgaoCodigo = orgaoCodigo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}

	public void setSdvNaoSolicitado(Boolean sdvNaoSolicitado) {
		this.sdvNaoSolicitado = sdvNaoSolicitado;
	}

	public void setSdvSolicitado(Boolean sdvSolicitado) {
		this.sdvSolicitado = sdvSolicitado;
	}

	public void setSdvSolicitadoCadastrado(Boolean sdvSolicitadoCadastrado) {
		this.sdvSolicitadoCadastrado = sdvSolicitadoCadastrado;
	}

	public void setSdvSolicitadoNaoCadastrado(Boolean sdvSolicitadoNaoCadastrado) {
		this.sdvSolicitadoNaoCadastrado = sdvSolicitadoNaoCadastrado;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setServicoCodigo(String servicoCodigo) {
		this.servicoCodigo = servicoCodigo;
	}

	public void setSituacaoContrato(SituacaoContrato situacaoContrato) {
		this.situacaoContrato = situacaoContrato;
	}

	public void setSituacaoServidor(SituacaoServidor situacaoServidor) {
		this.situacaoServidor = situacaoServidor;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
}