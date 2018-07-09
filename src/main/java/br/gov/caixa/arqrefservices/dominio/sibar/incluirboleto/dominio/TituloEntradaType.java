
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de titulo_entrada_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="titulo_entrada_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOSSO_NUMERO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DOCUMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type"/>
 *         &lt;element name="TIPO_ESPECIE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_ACEITE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_EMISSAO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="JUROS_MORA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}juros_mora_Type"/>
 *         &lt;element name="VALOR_ABATIMENTO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type" minOccurs="0"/>
 *         &lt;element name="POS_VENCIMENTO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}pos_vencimento_Type"/>
 *         &lt;element name="CODIGO_MOEDA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}pagador_Type"/>
 *         &lt;element name="SACADOR_AVALISTA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}sacador_avalista_Type" minOccurs="0"/>
 *         &lt;element name="MULTA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}multa_Type" minOccurs="0"/>
 *         &lt;element name="DESCONTOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}descontos_Type" minOccurs="0"/>
 *         &lt;element name="VALOR_IOF" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}valor_Type" minOccurs="0"/>
 *         &lt;element name="IDENTIFICACAO_EMPRESA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FICHA_COMPENSACAO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}ficha_compensacao_Type" minOccurs="0"/>
 *         &lt;element name="RECIBO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}recibo_pagador_Type" minOccurs="0"/>
 *         &lt;element name="PAGAMENTO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}pagamento_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titulo_entrada_Type", propOrder = {
    "nossonumero",
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
    "pagamento"
})
public class TituloEntradaType {

    @XmlElement(name = "NOSSO_NUMERO")
    protected String nossonumero;
    
    @XmlElement(name = "NUMERO_DOCUMENTO", required = true)
    protected String numerodocumento;
    
    @XmlElement(name = "DATA_VENCIMENTO", required = true)
//    @XmlSchemaType(name = "date")
//    protected Date datavencimento;
    protected String datavencimento;
    
    @XmlElement(name = "VALOR", required = true)
    protected String valor;
    
    @XmlElement(name = "TIPO_ESPECIE")
    protected String tipoespecie;
    
    @XmlElement(name = "FLAG_ACEITE", required = true)
    protected String flagaceite;
    
    @XmlElement(name = "DATA_EMISSAO")
//    @XmlSchemaType(name = "date")
//    protected Date dataemissao;
    protected String dataemissao;
    
    @XmlElement(name = "JUROS_MORA", required = true)
    protected JurosMoraType jurosmora;
    
    @XmlElement(name = "VALOR_ABATIMENTO")
    protected BigDecimal valorabatimento;
    
    @XmlElement(name = "POS_VENCIMENTO", required = true)
    protected PosVencimentoType posvencimento;
    
    @XmlElement(name = "CODIGO_MOEDA")
    protected Integer codigomoeda;
    
    @XmlElement(name = "PAGADOR", required = true)
    protected PagadorType pagador;
    
    @XmlElement(name = "SACADOR_AVALISTA")
    protected SacadorAvalistaType sacadoravalista;
    
    @XmlElement(name = "MULTA")
    protected MultaType multa;
    
    @XmlElement(name = "DESCONTOS")
    protected DescontosType descontos;
    
    @XmlElement(name = "VALOR_IOF")
    protected BigDecimal valoriof;
    
    @XmlElement(name = "IDENTIFICACAO_EMPRESA")
    protected String identificacaoempresa;
    
    @XmlElement(name = "FICHA_COMPENSACAO")
    protected FichaCompensacaoType fichacompensacao;
    
    @XmlElement(name = "RECIBO_PAGADOR")
    protected ReciboPagadorType recibopagador;
    
    @XmlElement(name = "PAGAMENTO")
    protected PagamentoType pagamento;

	public String getNossonumero() {
		return nossonumero;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public String getValor() {
		return valor;
	}

	public String getTipoespecie() {
		return tipoespecie;
	}

	public String getFlagaceite() {
		return flagaceite;
	}



	public JurosMoraType getJurosmora() {
		return jurosmora;
	}

	public BigDecimal getValorabatimento() {
		return valorabatimento;
	}

	public PosVencimentoType getPosvencimento() {
		return posvencimento;
	}

	public Integer getCodigomoeda() {
		return codigomoeda;
	}

	public PagadorType getPagador() {
		return pagador;
	}

	public SacadorAvalistaType getSacadoravalista() {
		return sacadoravalista;
	}

	public MultaType getMulta() {
		return multa;
	}

	public DescontosType getDescontos() {
		return descontos;
	}

	public BigDecimal getValoriof() {
		return valoriof;
	}

	public String getIdentificacaoempresa() {
		return identificacaoempresa;
	}

	public FichaCompensacaoType getFichacompensacao() {
		return fichacompensacao;
	}

	public ReciboPagadorType getRecibopagador() {
		return recibopagador;
	}

	public PagamentoType getPagamento() {
		return pagamento;
	}

	public void setNossonumero(String nossonumero) {
		this.nossonumero = nossonumero;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setTipoespecie(String tipoespecie) {
		this.tipoespecie = tipoespecie;
	}

	public void setFlagaceite(String flagaceite) {
		this.flagaceite = flagaceite;
	}

	public void setJurosmora(JurosMoraType jurosmora) {
		this.jurosmora = jurosmora;
	}

	public void setValorabatimento(BigDecimal valorabatimento) {
		this.valorabatimento = valorabatimento;
	}

	public void setPosvencimento(PosVencimentoType posvencimento) {
		this.posvencimento = posvencimento;
	}

	public void setCodigomoeda(Integer codigomoeda) {
		this.codigomoeda = codigomoeda;
	}

	public void setPagador(PagadorType pagador) {
		this.pagador = pagador;
	}

	public void setSacadoravalista(SacadorAvalistaType sacadoravalista) {
		this.sacadoravalista = sacadoravalista;
	}

	public void setMulta(MultaType multa) {
		this.multa = multa;
	}

	public void setDescontos(DescontosType descontos) {
		this.descontos = descontos;
	}

	public void setValoriof(BigDecimal valoriof) {
		this.valoriof = valoriof;
	}

	public void setIdentificacaoempresa(String identificacaoempresa) {
		this.identificacaoempresa = identificacaoempresa;
	}

	public void setFichacompensacao(FichaCompensacaoType fichacompensacao) {
		this.fichacompensacao = fichacompensacao;
	}

	public void setRecibopagador(ReciboPagadorType recibopagador) {
		this.recibopagador = recibopagador;
	}

	public void setPagamento(PagamentoType pagamento) {
		this.pagamento = pagamento;
	}

	public String getDatavencimento() {
		return datavencimento;
	}

	public void setDatavencimento(String datavencimento) {
		this.datavencimento = datavencimento;
	}

	public String getDataemissao() {
		return dataemissao;
	}

	public void setDataemissao(String dataemissao) {
		this.dataemissao = dataemissao;
	}

	
	
}
