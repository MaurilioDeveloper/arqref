package br.gov.caixa.arqrefservices.dominio.sibar.consultaboleto.saida;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
	"controleNegocial",
    "consultasolicitacaogrupopagador",
	"consultasolicitacaopreimpresso",
	"consultasolicitacoesgrupopagador",
	"consultasolicitacoespreimpresso",
	"imprimeboleto",
	"consultaBoletoSaida",
	"excecao"
})
public class ConsultaCobrancaBancariaDados implements Serializable {
	
	private static final long serialVersionUID = -5133278577669512636L;

	private ConsultaSolicitacaoGrupoPagador consultasolicitacaogrupopagador;
 
    private ConsultaSolicitacaoPreImpresso consultasolicitacaopreimpresso;
        
    private ConsultaSolicitacoesGrupoPagador consultasolicitacoesgrupopagador;
        
    private ConsultaSolicitacoesPreImpresso consultasolicitacoespreimpresso;
        
    private ImprimeBoletoSaida imprimeboleto;
        
    private ConsultaBoletoSaida consultaBoletoSaida;

    private ControleNegocial controleNegocial; 
    
    private String excecao;
    
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
   	public ImprimeBoletoSaida getImprimeboleto() {
   		return imprimeboleto;
   	}

    @XmlElement(name = "CONSULTA_BOLETO")
   	public ConsultaBoletoSaida getConsultaBoletoSaida() {
   		return consultaBoletoSaida;
   	}
    
    @XmlElement(name = "CONTROLE_NEGOCIAL")
   	public ControleNegocial getControleNegocial() {
		return controleNegocial;
	}

    @XmlElement(name = "EXCECAO")   
	public String getExcecao() {
		return excecao;
	}

	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}

	public void setControleNegocial(ControleNegocial controleNegocial) {
		this.controleNegocial = controleNegocial;
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

   	public void setImprimeboleto(ImprimeBoletoSaida imprimeboleto) {
   		this.imprimeboleto = imprimeboleto;
   	}

   	public void setConsultaBoletoSaida(ConsultaBoletoSaida consultaboleto) {
   		this.consultaBoletoSaida = consultaboleto;
   	}

   	@XmlTransient
	public String getUrl() {
		if (getConsultaBoletoSaida() != null) {
			return getConsultaBoletoSaida().getUrl();			
		}
		return "";
		
	}
   	
	
	
	
}
