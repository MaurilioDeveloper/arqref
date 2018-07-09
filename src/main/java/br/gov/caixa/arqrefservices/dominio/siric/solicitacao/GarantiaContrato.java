package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Decimal;
import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="GARANTIA")
public class GarantiaContrato implements Serializable {

	private static final long serialVersionUID = 8465838576057257121L;
	
	@Tamanho(tamanho = 4)
	private Integer codigo;
		
	@Tamanho(tamanho = 150)
	private String descricao;
	
	@Decimal(mantissaTamanho = 16, decimalTamanho = 2)
	private BigDecimal valorGarantia;
	
	private String prioridade;
	
	private String sequencia;
	
	private String valor;
	
	@XmlElement(name="CODIGO")
	public Integer getCodigo() {
		return this.codigo;
	}
	
	@XmlElement(name="DESCRICAO")
	public String getDescricao() {
		return this.descricao;
	}
	
	@XmlElement(name="PRIORIDADE")
	public String getPrioridade() {
		return this.prioridade;
	}
	
	@XmlElement(name="SEQUENCIA")
	public String getSequencia() {
		return this.sequencia;
	}
	
	@XmlElement(name="VALOR")
	public String getValor() {
		return this.valor;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public BigDecimal getValorGarantia() {
		return valorGarantia;
	}

	public void setValorGarantia(BigDecimal valorGarantia) {
		this.valorGarantia = valorGarantia;
	}

}
