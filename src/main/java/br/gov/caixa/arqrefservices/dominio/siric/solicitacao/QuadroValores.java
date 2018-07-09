package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="QUADRO_VALORES")
@XmlSeeAlso({ QuadroValores.class })
@XmlType(propOrder={"codigoQuadroValores", "linha1", "linha2", "linha3", "linha4"})
public class QuadroValores implements Serializable {

	private static final long serialVersionUID = -8016342648985461377L;
	
	@Tamanho(tamanho = 10)
	private String codigoQuadroValores;
	
	@Tamanho(tamanho = 11)
	private String linha1;
	
	@Tamanho(tamanho = 11)
	private String linha2;
	
	@Tamanho(tamanho = 11)
	private String linha3;
	
	@Tamanho(tamanho = 11)
	private String linha4;
	
	
	@XmlElement(name="LINHA_1")
	public String getLinha1() {
		return linha1;
	}

	public void setLinha1(String linha1) {
		this.linha1 = linha1;
	}

	@XmlElement(name="LINHA_2")
	public String getLinha2() {
		return linha2;
	}

	public void setLinha2(String linha2) {
		this.linha2 = linha2;
	}

	@XmlElement(name="LINHA_3")
	public String getLinha3() {
		return linha3;
	}

	public void setLinha3(String linha3) {
		this.linha3 = linha3;
	}

	@XmlElement(name="LINHA_4")
	public String getLinha4() {
		return linha4;
	}

	public void setLinha4(String linha4) {
		this.linha4 = linha4;
	}

	@XmlElement(name="COD_QUADRO_VALOR")
	public String getCodigoQuadroValores() {
		return codigoQuadroValores;
	}

	public void setCodigoQuadroValores(String codigoQuadroValores) {
		this.codigoQuadroValores = codigoQuadroValores;
	}
}
