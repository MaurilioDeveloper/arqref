
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
    "versao",
    "autenticacao",
    "usuarioservico",
    "usuario",
    "operacao",
    "indice",
    "sistemaorigem",
    "unidade",
    "identificadororigem",
    "datahora",
    "idprocesso"
})
public class HEADERBARRAMENTOTYPE implements Serializable {

	private static final long serialVersionUID = -8518409458025123163L;

	@XmlElement(name = "VERSAO", required = true)
    protected String versao;
    
    @XmlElement(name = "AUTENTICACAO")
    protected String autenticacao;
    
    @XmlElement(name = "USUARIO_SERVICO")
    protected String usuarioservico;
    
    @XmlElement(name = "USUARIO")
    protected String usuario;
    
    @XmlElement(name = "OPERACAO", required = true)
    protected String operacao;
    
    @XmlElement(name = "INDICE")
    protected Integer indice;
    
    @XmlElement(name = "SISTEMA_ORIGEM")
    protected String sistemaorigem;
    
    @XmlElement(name = "UNIDADE")
    protected String unidade;
    
    @XmlElement(name = "IDENTIFICADOR_ORIGEM")
    protected String identificadororigem;
    
    @XmlElement(name = "DATA_HORA", required = true)
    protected String datahora;
    
    @XmlElement(name = "ID_PROCESSO")
    protected String idprocesso;

	public String getVersao() {
		return versao;
	}

	public String getAutenticacao() {
		return autenticacao;
	}

	public String getUsuarioservico() {
		return usuarioservico;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getOperacao() {
		return operacao;
	}

	public Integer getIndice() {
		return indice;
	}

	public String getSistemaorigem() {
		return sistemaorigem;
	}

	public String getUnidade() {
		return unidade;
	}

	public String getIdentificadororigem() {
		return identificadororigem;
	}

	public String getDatahora() {
		return datahora;
	}

	public String getIdprocesso() {
		return idprocesso;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public void setAutenticacao(String autenticacao) {
		this.autenticacao = autenticacao;
	}

	public void setUsuarioservico(String usuarioservico) {
		this.usuarioservico = usuarioservico;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}

	public void setSistemaorigem(String sistemaorigem) {
		this.sistemaorigem = sistemaorigem;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public void setIdentificadororigem(String identificadororigem) {
		this.identificadororigem = identificadororigem;
	}

	public void setDatahora(String datahora) {
		this.datahora = datahora;
	}

	public void setIdprocesso(String idprocesso) {
		this.idprocesso = idprocesso;
	}
	
}
