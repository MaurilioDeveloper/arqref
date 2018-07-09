package br.gov.caixa.arqrefservices.negocio;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefservices.dominio.Empregado;

public class UserProfile implements Serializable{
	
	private static final String FEC000000010 = "FEC000000010";

	private static final String FEC000000009 = "FEC000000009";

	private static final String FEC000000008 = "FEC000000008";

	private static final long serialVersionUID = 4918191586041571727L;
	
	@Inject
	private Logger LOGGER;
	
	private Empregado empregado;
	
	private List<String> grupoUsuarioList;
	
	public UserProfile(){
		if(LOGGER == null){
			LOGGER = Logger.getLogger(getClass().getName());
		}
	}

	public Empregado getEmpregado() {
		return this.empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public List<String> getGrupoUsuarioList() {
		if(this.grupoUsuarioList == null){
			this.grupoUsuarioList = new ArrayList<String>();
		}
		return this.grupoUsuarioList;
	}

	public void setGrupoUsuarioList(List<String> grupoUsuarioList) {
		this.grupoUsuarioList = grupoUsuarioList;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getNumeroIP() throws SystemException{
		InetAddress inet = null;
		try {
			inet = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			LOGGER.severe(e.getMessage());
		
		}
		return inet.getHostAddress();
	}
	
	
	/**
	 * 
	 * @param empregado
	 * @return
	 * @throws Exception
	 */
	public Empregado getPerfilNav(Empregado empregado, List<String> perfis) {
		if(empregado == null){
			throw new SystemException("Empregado esta nulo! Favor realizar a consulta novamente");
		}

		/*
		 * Regra de Negocio:
		 * 
		 * Método getPerfilNav deve ser alterado para receber como parâmetro a lista de perfis do usuários:
		 * Caso o usuário tenha perfil FEC000000008, FEC000000009 ou FEC000000010 deve ser setado como valor para no perfilNav o valor 20
		 * Os demais casos deve ser setado o valor 10
		 */
		boolean perfNav20 = perfis.indexOf(FEC000000008) > -1
				|| perfis.indexOf(FEC000000009) > -1
				|| perfis.indexOf(FEC000000010) > -1;
		if (perfNav20) {
			empregado.setNumeroPerfilNav(20);
		} else {
			empregado.setNumeroPerfilNav(10);
		}
		
		return empregado;
	}
}
