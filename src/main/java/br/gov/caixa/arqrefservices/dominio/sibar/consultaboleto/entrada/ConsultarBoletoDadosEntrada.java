package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.entrada;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"consultasolicitacaogrupopagador","consultasolicitacaopreimpresso","consultasolicitacoesgrupopagador","consultasolicitacoespreimpresso","imprimeboleto","consultarBoleto"})
public class ConsultarBoletoDadosEntrada implements Serializable {
	
	private static final long serialVersionUID = -1926042016042795011L;
	
	private ConsultaSolicitacaoGrupoPagador consultasolicitacaogrupopagador;
     
	private ConsultaSolicitacaoPreImpresso consultasolicitacaopreimpresso;
    
	private ConsultaSolicitacoesGrupoPagador consultasolicitacoesgrupopagador;
    
	private ConsultaSolicitacoesPreImpresso consultasolicitacoespreimpresso;
    
	private ImprimeBoleto imprimeboleto;
	    
	private ConsultarBoletoDados consultarBoleto;

	
	@XmlElement(name="CONSULTA_BOLETO")
	public ConsultarBoletoDados getConsultarBoleto() {
		return consultarBoleto;
	}
	
	@XmlElement(name = "CONSULTA_SOLICITACAO_GRUPO_PAGADOR")
	public ConsultaSolicitacaoGrupoPagador getConsultasolicitacaogrupopagador() {
		return consultasolicitacaogrupopagador;
	}
	
	@XmlElement(name = "CONSULTA_SOLICITACAO_PRE_IMPRESSO")
	public ConsultaSolicitacaoPreImpresso getConsultasolicitacaopreimpresso() {
		return consultasolicitacaopreimpresso;
	}
	
	@XmlElement(name = "CONSULTA_SOLICITACOES_GRUPO_PAGADOR")
	public ConsultaSolicitacoesGrupoPagador getConsultasolicitacoesgrupopagador() {
		return consultasolicitacoesgrupopagador;
	}

	@XmlElement(name = "CONSULTA_SOLICITACOES_PRE_IMPRESSO")
	public ConsultaSolicitacoesPreImpresso getConsultasolicitacoespreimpresso() {
		return consultasolicitacoespreimpresso;
	}

	@XmlElement(name = "IMPRIME_BOLETO")
	public ImprimeBoleto getImprimeboleto() {
		return imprimeboleto;
	}

	public void setConsultasolicitacaogrupopagador(ConsultaSolicitacaoGrupoPagador consultasolicitacaogrupopagador) {
		this.consultasolicitacaogrupopagador = consultasolicitacaogrupopagador;
	}

	public void setConsultasolicitacaopreimpresso(ConsultaSolicitacaoPreImpresso consultasolicitacaopreimpresso) {
		this.consultasolicitacaopreimpresso = consultasolicitacaopreimpresso;
	}

	public void setConsultasolicitacoesgrupopagador(ConsultaSolicitacoesGrupoPagador consultasolicitacoesgrupopagador) {
		this.consultasolicitacoesgrupopagador = consultasolicitacoesgrupopagador;
	}

	public void setConsultasolicitacoespreimpresso(ConsultaSolicitacoesPreImpresso consultasolicitacoespreimpresso) {
		this.consultasolicitacoespreimpresso = consultasolicitacoespreimpresso;
	}

	public void setImprimeboleto(ImprimeBoleto imprimeboleto) {
		this.imprimeboleto = imprimeboleto;
	}

	public void setConsultarBoleto(ConsultarBoletoDados consultarBoleto) {
		this.consultarBoleto = consultarBoleto;
	}	
}