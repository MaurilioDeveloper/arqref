package br.gov.caixa.arqrefservices.dominio;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada pela consulta dados SICLI
 * @author c110503
 * @version 1.0.0.1
 *
 */
@XmlRootElement(name = "ClientePessoaFisica")
public class ClientePessoaFisica extends Cliente {

	private String nome;

	private String dataNascimento;

	private String nomePai;

	private String nomeMae;

	private Sexo sexo;

	private CPF cpf;

	private List<Identidade> listaIdentidade;

	private UF naturalidadeUF;

	private Municipio naturalidadeMunicipio;

	private GrauInstrucao grauInstrucao;

	private Profissao profissao;

	private Residencia residencia;
	
	private Identidade identidade;
	
	private Passaporte passaporte;
	
	private CarteiraTrabalho carteiraTrabalho;
	
	private CarteiraHabilitacao carteiraHabilitacao;

	
	//Classe Interna
	private NomeCliente nomeCliente = new NomeCliente();
	
	private NomeCliente nomeClientePai = new NomeCliente();
	
	private NomeCliente nomeClienteMae = new NomeCliente();
	
	//Classe Interna
	private DataNascimento dtNascimento = new DataNascimento();
	

	@XmlElement(name = "NOME_CLIENTE")
	private NomeCliente getNomeCliente() {
		return nomeCliente;
	}
	private void setNomeCliente(NomeCliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@XmlElement(name = "DT_NASCIMENTO")
	private DataNascimento getDtNascimento() {
		return dtNascimento;
	}
	
	private void setDtNascimento(DataNascimento dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	@XmlElement(name = "NOME_PAI")
	private NomeCliente getNomeClientePai() {
		return nomeClientePai;
	}
	
	private void setNomeClientePai(NomeCliente nomeClientePai) {
		this.nomeClientePai = nomeClientePai;
	}
	
	@XmlElement(name = "NOME_MAE")
	private NomeCliente getNomeClienteMae() {
		return nomeClienteMae;
	}
	
	private void setNomeClienteMae(NomeCliente nomeClienteMae) {
		this.nomeClienteMae = nomeClienteMae;
	}
	

//	@XmlElement(name="NOME")
	public String getNome() {
		this.nome = this.nomeCliente.getNome();
		return this.nome;
	}

	public void setNome(String nome) {
		this.nomeCliente.setNome(nome);
	}

	public String getDataNascimento() {
		this.dataNascimento = this.dtNascimento.getDataNascimento();
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dtNascimento.setDataNascimento(dataNascimento);
	}

	public String getNomePai() {
		this.nomePai = this.nomeClientePai.getNome();
		return nomePai;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeClientePai.setNome(nome);		
	}
	
	public String getNomeMae() {
		this.nomeMae = this.nomeClienteMae.getNome();
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomeClientePai.setNome(nome);		
	}
	
	@XmlElement(name = "SEXO")
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@XmlElement(name = "CPF")
	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public List<Identidade> getListaIdentidade() {
		return listaIdentidade;
	}

	public void setListaIdentidade(List<Identidade> listaIdentidade) {
		this.listaIdentidade = listaIdentidade;
	}

	public UF getNaturalidadeUF() {
		return naturalidadeUF;
	}

	public void setNaturalidadeUF(UF naturalidadeUF) {
		this.naturalidadeUF = naturalidadeUF;
	}

	public Municipio getNaturalidadeMunicipio() {
		return naturalidadeMunicipio;
	}

	public void setNaturalidadeMunicipio(Municipio naturalidadeMunicipio) {
		this.naturalidadeMunicipio = naturalidadeMunicipio;
	}

	public GrauInstrucao getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(GrauInstrucao grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Residencia getResidencia() {
		return residencia;
	}

	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	
	@XmlElement(name = "IDENTIDADE")
	public Identidade getIdentidade() {
		return identidade;
	}	
	public void setIdentidade(Identidade identidade) {
		this.identidade = identidade;
	}
	
	@XmlElement(name = "PASSAPORTE")
	public Passaporte getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(Passaporte passaporte) {
		this.passaporte = passaporte;
	}
	
	@XmlElement(name = "CARTEIRA_TRABALHO")
	public CarteiraTrabalho getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void setCarteiraTrabalho(CarteiraTrabalho carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	@XmlElement(name = "CNH")
	public CarteiraHabilitacao getCarteiraHabilitacao() {
		return carteiraHabilitacao;
	}
	public void setCarteiraHabilitacao(CarteiraHabilitacao carteiraHabilitacao) {
		this.carteiraHabilitacao = carteiraHabilitacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientePessoaFisica other = (ClientePessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientePessoaFisica [nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", cpf="
				+ cpf + "]";
	}

	/**
	 * Classe Interna para resolver o problema 
	 * <NOME_CLIENTE> 
	 * 		<NOME>ASCQ ZXCV</NOME>
	 * </NOME_CLIENTE>
	 */
	@XmlRootElement(name = "NOME_CLIENTE")
	private static class NomeCliente {

		private String nome;

		@XmlElement(name = "NOME")
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	/**
	 * Classe Interna para resolver o problema 
	 * <NOME_CLIENTE> 
	 * 		<NOME>ASCQ ZXCV</NOME>
	 * </NOME_CLIENTE>
	 */
	@XmlRootElement(name = "DT_NASCIMENTO")
	private static class DataNascimento {

		private String dataNascimento;

		@XmlElement(name = "DATA")
		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
	}

}
