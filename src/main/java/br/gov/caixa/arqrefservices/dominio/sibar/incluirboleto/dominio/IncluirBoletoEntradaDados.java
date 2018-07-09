
package br.gov.caixa.arqrefservices.dominio.sibar.incluirboleto.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DADOS_ENTRADA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DADOS_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="INCLUI_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="ALTERA_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}ALTERA_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="EXCLUI_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}EXCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="INCLUI_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="ALTERA_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="EXCLUI_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}EXCLUI_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="INCLUI_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_BOLETO_ENTRADA_TYPE"/>
 *           &lt;element name="ALTERA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}ALTERA_BOLETO_ENTRADA_TYPE"/>
 *           &lt;element name="BAIXA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}BAIXA_BOLETO_ENTRADA_TYPE"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADOS_ENTRADA_TYPE", propOrder = {
    "incluiSolicitacaoPreImpresso",
    "alterasolicitacaopreimpresso",
    "excluisolicitacaopreimpresso",
    "incluisolicitacaogrupopagador",
    "alterasolicitacaogrupopagador",
    "excluisolicitacaogrupopagador",
    "incluiboleto",
    "alteraboleto",
    "baixaboleto"
})
public class IncluirBoletoEntradaDados {

    @XmlElement(name = "INCLUI_SOLICITACAO_PRE_IMPRESSO")
    protected IncluiSolicitacaoPreImpresso incluiSolicitacaoPreImpresso;
    
    @XmlElement(name = "ALTERA_SOLICITACAO_PRE_IMPRESSO")
    protected ALTERASOLICITACAOPREIMPRESSOTYPE alterasolicitacaopreimpresso;
    
    @XmlElement(name = "EXCLUI_SOLICITACAO_PRE_IMPRESSO")
    protected EXCLUISOLICITACAOPREIMPRESSOTYPE excluisolicitacaopreimpresso;
    
    @XmlElement(name = "INCLUI_SOLICITACAO_GRUPO_PAGADOR")
    protected INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE incluisolicitacaogrupopagador;
    
    @XmlElement(name = "ALTERA_SOLICITACAO_GRUPO_PAGADOR")
    protected INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE alterasolicitacaogrupopagador;
    
    @XmlElement(name = "EXCLUI_SOLICITACAO_GRUPO_PAGADOR")
    protected EXCLUISOLICITACAOGRUPOPAGADORTYPE excluisolicitacaogrupopagador;
    
    @XmlElement(name = "INCLUI_BOLETO")
    protected IncluiBoletoEntrada incluiboleto;
    
    @XmlElement(name = "ALTERA_BOLETO")
    protected ALTERABOLETOENTRADA alteraboleto;
    
    @XmlElement(name = "BAIXA_BOLETO")
    protected BAIXABOLETOENTRADA baixaboleto;
     
	public IncluiSolicitacaoPreImpresso getIncluisolicitacaopreimpresso() {
		return incluiSolicitacaoPreImpresso;
	}

	public ALTERASOLICITACAOPREIMPRESSOTYPE getAlterasolicitacaopreimpresso() {
		return alterasolicitacaopreimpresso;
	}

	public EXCLUISOLICITACAOPREIMPRESSOTYPE getExcluisolicitacaopreimpresso() {
		return excluisolicitacaopreimpresso;
	}

	public INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE getIncluisolicitacaogrupopagador() {
		return incluisolicitacaogrupopagador;
	}

	public INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE getAlterasolicitacaogrupopagador() {
		return alterasolicitacaogrupopagador;
	}

	public EXCLUISOLICITACAOGRUPOPAGADORTYPE getExcluisolicitacaogrupopagador() {
		return excluisolicitacaogrupopagador;
	}

	public IncluiBoletoEntrada getIncluiboleto() {
		return incluiboleto;
	}

	public ALTERABOLETOENTRADA getAlteraboleto() {
		return alteraboleto;
	}

	public BAIXABOLETOENTRADA getBaixaboleto() {
		return baixaboleto;
	}

	public void setIncluisolicitacaopreimpresso(IncluiSolicitacaoPreImpresso incluiSolicitacaoPreImpresso) {
		this.incluiSolicitacaoPreImpresso = incluiSolicitacaoPreImpresso;
	}

	public void setAlterasolicitacaopreimpresso(ALTERASOLICITACAOPREIMPRESSOTYPE alterasolicitacaopreimpresso) {
		this.alterasolicitacaopreimpresso = alterasolicitacaopreimpresso;
	}

	public void setExcluisolicitacaopreimpresso(EXCLUISOLICITACAOPREIMPRESSOTYPE excluisolicitacaopreimpresso) {
		this.excluisolicitacaopreimpresso = excluisolicitacaopreimpresso;
	}

	public void setIncluisolicitacaogrupopagador(INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE incluisolicitacaogrupopagador) {
		this.incluisolicitacaogrupopagador = incluisolicitacaogrupopagador;
	}

	public void setAlterasolicitacaogrupopagador(INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE alterasolicitacaogrupopagador) {
		this.alterasolicitacaogrupopagador = alterasolicitacaogrupopagador;
	}

	public void setExcluisolicitacaogrupopagador(EXCLUISOLICITACAOGRUPOPAGADORTYPE excluisolicitacaogrupopagador) {
		this.excluisolicitacaogrupopagador = excluisolicitacaogrupopagador;
	}

	public void setIncluiboleto(IncluiBoletoEntrada incluiboleto) {
		this.incluiboleto = incluiboleto;
	}

	public void setAlteraboleto(ALTERABOLETOENTRADA alteraboleto) {
		this.alteraboleto = alteraboleto;
	}

	public void setBaixaboleto(BAIXABOLETOENTRADA baixaboleto) {
		this.baixaboleto = baixaboleto;
	}
    
}
