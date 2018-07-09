package br.gov.caixa.arqrefservices.dominio.consignet;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="webservice")
@XmlSeeAlso({AtributoConsignet.class,ParcelaConsignet.class,FuncionariosConsignet.class})
@XmlType(propOrder={"acao","operacao","versao","atributos","parcelas","funcionarios","xmlEntrada"})
public class WebServiceConsignet implements Serializable {

	private static final long serialVersionUID = -8869292641164741996L;

	private String acao = "REQUISICAO";
	
	private String operacao;
	
	private String versao = "1.0";
	
	private XmlEntrada xmlEntrada;
	
	private List<AtributoConsignet> atributos;
	
	private List<ParcelaConsignet> parcelas;
	
	private List<FuncionariosConsignet> funcionarios;
	
	@XmlElement(name="acao")
	public String getAcao() {
		return acao;
	}

	@XmlElement(name="operacao")
	public String getOperacao() {
		return operacao;
	}

	@XmlElement(name="versao")
	public String getVersao() {
		return versao;
	}
	
	@XmlElement(name="xmlEntrada")
	public XmlEntrada getXmlEntrada() {
		return xmlEntrada;
	}

	@XmlElementWrapper(name="atributos")
	@XmlElement(name="atributo")
	public List<AtributoConsignet> getAtributos() {
		return atributos;
	}

	@XmlElementWrapper(name="parcelas")
	@XmlElement(name="parcela")
	public List<ParcelaConsignet> getParcelas() {
		return parcelas;
	}

	public void setAtributos(List<AtributoConsignet> atributos) {
		this.atributos = atributos;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public void setXmlEntrada(XmlEntrada xmlEntrada) {
		this.xmlEntrada = xmlEntrada;
	}

	public void setParcelas(List<ParcelaConsignet> parcelas) {
		this.parcelas = parcelas;
	}

	@XmlElementWrapper(name="funcionarios")
	@XmlElement(name="funcionarios")
	public List<FuncionariosConsignet> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionariosConsignet> funcionarios) {
		this.funcionarios = funcionarios;
	}

	
}
