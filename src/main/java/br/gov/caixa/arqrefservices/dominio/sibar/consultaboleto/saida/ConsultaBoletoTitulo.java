
package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = {
	"numerodocumento",
	"datavencimento",
	"valor",
	"tipoespecie",
	"flagaceite",
	"dataemissao",
	"jurosmora",
	"valorabatimento",
	"posvencimento",
	"codigomoeda",
	"pagador",
	"sacadoravalista",
	"multa",
	"descontos",
	"valoriof",
	"identificacaoempresa",
	"fichacompensacao",
	"recibopagador",
	"pagamento",
	"codigobarras",
	"linhadigitavel",
	"url"
})
public class ConsultaBoletoTitulo  implements Serializable {
    
	private static final long serialVersionUID = 7132094266517537551L;
	
	private ConsultaBoletoJurosMora jurosmora;
        
    private ConsultaBoletoPosVencimento posvencimento;
    
    private ConsultaBoletoPagador pagador;
        
    private ConsultaBoletoSacadorAvalista sacadoravalista;
        
    private ConsultaBoletoMulta multa;
        
    private ConsultaBoletoDescontos descontos;
        
    private ConsultaBoletoFichaCompensacao fichacompensacao;
        
    private ConsultaBoletoReciboPagador recibopagador;
        
    private ConsultaBoletoPagamento pagamento;  	
    
    private String numerodocumento;
       
    private Date datavencimento;
    
    private BigDecimal valor;
        
    private int tipoespecie;
        
    private String flagaceite;
        
    private Date dataemissao;
        
    private BigDecimal valorabatimento;
            
    private int codigomoeda;
        
    private BigDecimal valoriof;
        
    private String identificacaoempresa;
        
    private String codigobarras;
        
    private String linhadigitavel;
        
    private String url;

    @XmlElement(name = "NUMERO_DOCUMENTO", required = true)
	public String getNumerodocumento() {
		return numerodocumento;
	}

    @XmlElement(name = "DATA_VENCIMENTO")
    @XmlSchemaType(name = "date")
	public Date getDatavencimento() {
		return datavencimento;
	}

    @XmlElement(name = "VALOR", required = true)
	public BigDecimal getValor() {
		return valor;
	}

    @XmlElement(name = "TIPO_ESPECIE")
	public int getTipoespecie() {
		return tipoespecie;
	}

    @XmlElement(name = "FLAG_ACEITE", required = true)
	public String getFlagaceite() {
		return flagaceite;
	}

    @XmlElement(name = "DATA_EMISSAO")
    @XmlSchemaType(name = "date")
	public Date getDataemissao() {
		return dataemissao;
	}

    @XmlElement(name = "VALOR_ABATIMENTO", required = true)
	public BigDecimal getValorabatimento() {
		return valorabatimento;
	}

    @XmlElement(name = "CODIGO_MOEDA")
	public int getCodigomoeda() {
		return codigomoeda;
	}

    @XmlElement(name = "VALOR_IOF")
	public BigDecimal getValoriof() {
		return valoriof;
	}

    @XmlElement(name = "IDENTIFICACAO_EMPRESA")
	public String getIdentificacaoempresa() {
		return identificacaoempresa;
	}

    @XmlElement(name = "CODIGO_BARRAS", required = true)
	public String getCodigobarras() {
		return codigobarras;
	}

    @XmlElement(name = "LINHA_DIGITAVEL", required = true)
	public String getLinhadigitavel() {
		return linhadigitavel;
	}

    @XmlElement(name = "URL")
	public String getUrl() {
		return url;
	}
    
    @XmlElement(name = "JUROS_MORA", required = true)
	public ConsultaBoletoJurosMora getJurosmora() {
		return jurosmora;
	}
    
    @XmlElement(name = "POS_VENCIMENTO", required = true)
	public ConsultaBoletoPosVencimento getPosvencimento() {
		return posvencimento;
	}
    
    @XmlElement(name = "PAGADOR", required = true)
	public ConsultaBoletoPagador getPagador() {
		return pagador;
	}

    @XmlElement(name = "SACADOR_AVALISTA")
	public ConsultaBoletoSacadorAvalista getSacadoravalista() {
		return sacadoravalista;
	}

    @XmlElement(name = "MULTA")
	public ConsultaBoletoMulta getMulta() {
		return multa;
	}

    @XmlElement(name = "DESCONTOS")
	public ConsultaBoletoDescontos getDescontos() {
		return descontos;
	}

    @XmlElement(name = "FICHA_COMPENSACAO")
	public ConsultaBoletoFichaCompensacao getFichacompensacao() {
		return fichacompensacao;
	}

    @XmlElement(name = "RECIBO_PAGADOR")
	public ConsultaBoletoReciboPagador getRecibopagador() {
		return recibopagador;
	}

    @XmlElement(name = "PAGAMENTO")
	public ConsultaBoletoPagamento getPagamento() {
		return pagamento;
	}

	public void setPagador(ConsultaBoletoPagador pagador) {
		this.pagador = pagador;
	}

	public void setSacadoravalista(ConsultaBoletoSacadorAvalista sacadoravalista) {
		this.sacadoravalista = sacadoravalista;
	}

	public void setMulta(ConsultaBoletoMulta multa) {
		this.multa = multa;
	}

	public void setDescontos(ConsultaBoletoDescontos descontos) {
		this.descontos = descontos;
	}

	public void setFichacompensacao(ConsultaBoletoFichaCompensacao fichacompensacao) {
		this.fichacompensacao = fichacompensacao;
	}

	public void setRecibopagador(ConsultaBoletoReciboPagador recibopagador) {
		this.recibopagador = recibopagador;
	}

	public void setPagamento(ConsultaBoletoPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public void setPosvencimento(ConsultaBoletoPosVencimento posvencimento) {
		this.posvencimento = posvencimento;
	}

	public void setJurosmora(ConsultaBoletoJurosMora jurosmora) {
		this.jurosmora = jurosmora;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setTipoespecie(int tipoespecie) {
		this.tipoespecie = tipoespecie;
	}

	public void setFlagaceite(String flagaceite) {
		this.flagaceite = flagaceite;
	}

	public void setDataemissao(Date dataemissao) {
		this.dataemissao = dataemissao;
	}

	public void setValorabatimento(BigDecimal valorabatimento) {
		this.valorabatimento = valorabatimento;
	}

	public void setCodigomoeda(int codigomoeda) {
		this.codigomoeda = codigomoeda;
	}

	public void setValoriof(BigDecimal valoriof) {
		this.valoriof = valoriof;
	}

	public void setIdentificacaoempresa(String identificacaoempresa) {
		this.identificacaoempresa = identificacaoempresa;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public void setLinhadigitavel(String linhadigitavel) {
		this.linhadigitavel = linhadigitavel;
	}

	public void setUrl(String url) {
		this.url = url;
	}


    
    
    
}
