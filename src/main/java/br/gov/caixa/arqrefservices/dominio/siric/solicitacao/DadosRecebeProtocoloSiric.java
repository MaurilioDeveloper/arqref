package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.gov.caixa.arqrefservices.dominio.barramento.MensagemBarramento;


@XmlRootElement(name="DADOS")
@XmlSeeAlso({ ProtocoloAvaliacao.class, Avaliacao.class, ErrosValidacaoAvaliacao.class })
public class DadosRecebeProtocoloSiric extends MensagemBarramento{
	
	private static final long serialVersionUID = 625506560236951992L;

	private ProtocoloAvaliacao protocoloAvaliacao;
	
	private Avaliacao avaliacao;
	
    private List<ErrosValidacaoAvaliacao> listaErrosValidacao;
    
    private String excecao;
    
    @XmlElement(name="EXCECAO")
	public String getExcecao() {
		return this.excecao;
	}

	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}

	@XmlElement(name="PROTOCOLO")
	public ProtocoloAvaliacao getProtocoloAvaliacao() {
		return protocoloAvaliacao;
	}

	@XmlElement(name="AVALIACAO")
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setProtocoloAvaliacao(ProtocoloAvaliacao protocoloAvaliacao) {
		this.protocoloAvaliacao = protocoloAvaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	@XmlElement(name="ERROS_VALIDACAO")
	public List<ErrosValidacaoAvaliacao> getListaErrosValidacao() {
		return listaErrosValidacao;
	}

	public void setListaErrosValidacao(
			List<ErrosValidacaoAvaliacao> listaErrosValidacao) {
		this.listaErrosValidacao = listaErrosValidacao;
	}

	

}
