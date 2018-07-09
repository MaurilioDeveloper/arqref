package br.gov.caixa.arqrefservices.dominio.sicli.alteracao;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="CAMPOS")
@XmlSeeAlso({ MeioComunicacao.class, EnderecoNacional.class, RendaCliente.class })
@XmlType(propOrder={"identidade","carteiraTrabalho", "meioComunicacao", "enderecoNacional","passaporte","cnh", "rendaCliente","campoExclusaoRendaSicli"})

public class CamposSicli implements Serializable {

	private static final long serialVersionUID = -8016342648985461368L;
	
	private Identidade identidade;
	
	private CarteiraTrabalho carteiraTrabalho;
	
	private List<MeioComunicacao> meioComunicacao;
	
	private EnderecoNacional enderecoNacional;
	
	private List<RendaCliente> rendaCliente;
	
	private Passaporte passaporte;
	
	private CNH cnh;
	
	private List<CampoExclusaoRendaSicli> campoExclusaoRendaSicli;
	
	
	@XmlElement(name="IDENTIDADE")
	public Identidade getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Identidade identidade) {
		this.identidade = identidade;
	}
	
	@XmlElement(name="CARTEIRA_TRABALHO")
	public CarteiraTrabalho getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(CarteiraTrabalho carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@XmlElement(name="MEIO_COMUNICACAO")
	public List<MeioComunicacao> getMeioComunicacao() {
		return meioComunicacao;
	}
	
	@XmlElement(name="ENDERECO_NACIONAL")	
	public EnderecoNacional getEnderecoNacional() {
		return enderecoNacional;
	}
	
	@XmlElement(name="PASSAPORTE")	
	public Passaporte getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(Passaporte passaporte) {
		this.passaporte = passaporte;
	}

	@XmlElement(name="RENDA")	
	public List<RendaCliente> getRendaCliente() {
		return rendaCliente;
	}

	
	@XmlElement(name="CNH")	
	public CNH getCnh() {
		return cnh;
	}

	public void setCnh(CNH cnh) {
		this.cnh = cnh;
	}

	public void setEnderecoNacional(EnderecoNacional enderecoNacional) {
		this.enderecoNacional = enderecoNacional;
	}

	public void setRendaCliente(List<RendaCliente> rendaCliente) {
		this.rendaCliente = rendaCliente;
	}

	public void setMeioComunicacao(List<MeioComunicacao> meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}
	
	@XmlElement(name="EXCLUSAO_RENDA")	
	public List<CampoExclusaoRendaSicli> getCampoExclusaoRendaSicli() {
		return campoExclusaoRendaSicli;
	}

	public void setCampoExclusaoRendaSicli(
			List<CampoExclusaoRendaSicli> campoExclusaoRendaSicli) {
		this.campoExclusaoRendaSicli = campoExclusaoRendaSicli;
	}
}
