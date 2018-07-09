package br.gov.caixa.arqrefservices.dominio;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class Cliente {
	
	
	
	private Cocli cocli;

	private List<MeioComunicacao> listaMeioComunicacao;
	
	private List<EnderecoNacional> listaEnderecoNacional;
	
	private List<EnderecoNacionalComplemento> listaEnderecoNacionalComplemento;
	
	private List<Produto> listaProduto;
	
	private List<Renda> listaRenda;
	
	private TipoCliente tipoCliente;
	
	private CarteiraGRC carteiraGRC;
	
	private Pais pais;		
	
	@XmlElement(name="COCLI_ATIVO")
	public Cocli getCocli() {
		return cocli;
	}
	
	public void setCocli(Cocli cocli) {
		this.cocli = cocli;
	}

	@XmlElement(name="MEIO_COMUNICACAO")
	public List<MeioComunicacao> getListaMeioComunicacao() {
		return listaMeioComunicacao;
	}

	public void setListaMeioComunicacao(List<MeioComunicacao> listaMeioComunicacao) {
		this.listaMeioComunicacao = listaMeioComunicacao;
	}

	@XmlElement(name="ENDERECO_NACIONAL")
	public List<EnderecoNacional> getListaEnderecoNacional() {
		return listaEnderecoNacional;
	}

	public void setListaEnderecoNacional(
			List<EnderecoNacional> listaEnderecoNacional) {
		this.listaEnderecoNacional = listaEnderecoNacional;
	}

	@XmlElement(name="ENDERECO_NACIONAL_COMP")
	public List<EnderecoNacionalComplemento> getListaEnderecoNacionalComplemento() {
		return listaEnderecoNacionalComplemento;
	}

	public void setListaEnderecoNacionalComplemento(
			List<EnderecoNacionalComplemento> listaEnderecoNacionalComplemento) {
		this.listaEnderecoNacionalComplemento = listaEnderecoNacionalComplemento;
	}
	
	@XmlElement(name="PRODUTO_CAIXA")
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public CarteiraGRC getCarteiraGRC() {
		return carteiraGRC;
	}

	public void setCarteiraGRC(CarteiraGRC carteiraGRC) {
		this.carteiraGRC = carteiraGRC;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	@XmlElement(name="RENDA")
	public List<Renda> getListaRenda() {
		return listaRenda;
	}
	
	public void setListaRenda(List<Renda> listaRenda) {
		this.listaRenda = listaRenda;
	}		
	
	
	
	
	
}
