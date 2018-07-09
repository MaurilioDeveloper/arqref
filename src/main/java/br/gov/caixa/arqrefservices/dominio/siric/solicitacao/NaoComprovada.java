package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="NAO_COMPROVADA")
@XmlSeeAlso({Comprovante.class})
@XmlType(propOrder={"numeroCodigoOcupacao", "dataInicio","valorRendaLiquida", 
		"flagComprovacao", "comprovante"})
public class NaoComprovada  implements Serializable {
	
	private static final long serialVersionUID = 5217662071158415493L;
	
	
	@Tamanho(tamanho = 14)
	private String numeroCPF;
	
	@Tamanho(tamanho = 4)
	private String numeroCodigoOcupacao;
	
	@Tamanho(tamanho = 8)
	private String dataInicio;
	
	@Tamanho(tamanho = 11)
	private String valorRendaLiquida;
	
	@Tamanho(tamanho = 1)
	private String flagComprovacao;
	
	private Comprovante comprovante;
	
	@XmlElement(name="COD_OCUPACAO")
	public String getNumeroCodigoOcupacao() {
		return numeroCodigoOcupacao;
	}
	public void setNumeroCodigoOcupacao(String numeroCodigoOcupacao) {
		this.numeroCodigoOcupacao = numeroCodigoOcupacao;
	}
	@XmlElement(name="DT_INICIO")
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	@XmlElement(name="VR_LIQUIDA")
	public String getValorRendaLiquida() {
		return valorRendaLiquida;
	}
	public void setValorRendaLiquida(String valorRendaLiquida) {
		this.valorRendaLiquida = valorRendaLiquida;
	}
	@XmlElement(name="COMPROVANTE")
	public Comprovante getComprovante() {
		return comprovante;
	}
	public void setComprovante(Comprovante comprovante) {
		this.comprovante = comprovante;
	}
	@XmlElement(name="FLAG_COMPROVACAO")	
	public String getFlagComprovacao() {
		return flagComprovacao;
	}
	public void setFlagComprovacao(String flagComprovacao) {
		this.flagComprovacao = flagComprovacao;
	}
//	@XmlElement(name="CPF_CLIENTE")	
//	public String getNumeroCPF() {
//		return numeroCPF;
//	}
//	public void setNumeroCPF(String numeroCPF) {
//		this.numeroCPF = numeroCPF;
//	}
	
}
