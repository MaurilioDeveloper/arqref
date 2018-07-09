package br.gov.caixa.arqrefservices.dominio.econsig.incluirAnexoConsignacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefservices.dominio.econsig.Anexo;

@XmlRootElement(name="hos:incluirAnexoConsignacao")
@XmlType(propOrder={"cliente","convenio","usuario","senha","adeNumero","adeIdentificador","anexo","descricaoAnexo"})
public class IncluirAnexoConsignacaoDadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	private String adeIdentificador;
	
	private Long adeNumero;
	
	private Anexo anexo;
	
	private String cliente;
	
	private String convenio;
	
	private String descricaoAnexo;
	
	private String senha;
	
	private String usuario;
	
	
	@XmlElement(name="hos:adeIdentificador")
	public String getAdeIdentificador() {
		return adeIdentificador;
	}

	@XmlElement(name="hos:adeNumero")
	public Long getAdeNumero() {
		return adeNumero;
	}

	@XmlElement(name="hos:anexo")
	public Anexo getAnexo() {
		return anexo;
	}

	@XmlElement(name="hos:cliente")
	public String getCliente() {
		return cliente;
	}

	@XmlElement(name="hos:convenio")
	public String getConvenio() {
		return convenio;
	}

	@XmlElement(name="hos:descricaoAnexo")
	public String getDescricaoAnexo() {
		return descricaoAnexo;
	}

	@XmlElement(name="hos:senha")
	public String getSenha() {
		return senha;
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


	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setDescricaoAnexo(String descricaoAnexo) {
		this.descricaoAnexo = descricaoAnexo;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


}