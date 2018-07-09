package br.gov.caixa.arqrefservices.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.enumerador.ECategoriaErro;
import br.gov.caixa.arqrefcore.excecao.enumerador.ESeveridadeErro;
import br.gov.caixa.arqrefcore.excecao.mensagem.UtilMensagem;
import br.gov.caixa.arqrefcore.ldap.ConexaoLDAP;
import br.gov.caixa.arqrefcore.ldap.enumerador.ETipoChaveLDAP;
import br.gov.caixa.arqrefservices.dao.empregado.EmpregadoDAO;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.dominio.enumerador.EMensagensArqrefServiceErro;
import br.gov.caixa.arqrefservices.util.MensagemArqrefService;

/**
 * Session Bean implementation class EmpregadoSession
 */
@Stateless
@LocalBean
public class EmpregadoBean implements EmpregadoService {

	@Inject
	private EmpregadoDAO empDAO;
	
	@Inject 
	private ConexaoLDAP conexaoLDAP;
	
	@Inject
	private Logger log;
	
	public EmpregadoBean(){
		if(log == null){
			log = Logger.getLogger(getClass().getName());
		}
	}
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public Empregado getEmpregadoPorMatricula(String nuMatricula) throws PersistenceException {
		log.info("getEmpregadoPorMatricula");
		 Empregado empregado = empDAO.getEmpregadoPorMatricula(nuMatricula);

		 return empregado;
	}

	public Empregado getEmpregado(String login) throws BusinessException {
		log.info("getEmpregado");		
		if(login != null){
			if(login.contains("@")){
				HashMap<String, String> mapAtributos =  conexaoLDAP.getAtributosUsuarioPorLogin(login);
				Empregado empregado = new Empregado();
				if(mapAtributos != null &&  !mapAtributos.isEmpty()){
					//Serie de teste para verificar se existe a Chave
					//Se existir seta o valor para o empregao.
					if(mapAtributos.containsKey(ETipoChaveLDAP.NOME_COMPLETO.getValor())){
						empregado.setNomePessoa(mapAtributos.get(ETipoChaveLDAP.NOME_COMPLETO.getValor()));
					}
					if(mapAtributos.containsKey(ETipoChaveLDAP.NIS.getValor())){
						empregado.setNis(mapAtributos.get(ETipoChaveLDAP.NIS.getValor()));
					}
					if(mapAtributos.containsKey(ETipoChaveLDAP.CNPJ.getValor())){
						empregado.setCnpj(mapAtributos.get(ETipoChaveLDAP.CNPJ.getValor()));
					}
					if(mapAtributos.containsKey(ETipoChaveLDAP.DATA_NASCIMENTO.getValor())){
						empregado.setDataNascimento(mapAtributos.get(ETipoChaveLDAP.DATA_NASCIMENTO.getValor()));
					}
					if(mapAtributos.containsKey(ETipoChaveLDAP.CN.getValor())){
						empregado.setEmail(mapAtributos.get(ETipoChaveLDAP.CN.getValor()));
					}
					if(mapAtributos.containsKey(ETipoChaveLDAP.NOME_MAE.getValor())){
						empregado.setNomeMae(mapAtributos.get(ETipoChaveLDAP.NOME_MAE.getValor()));
					}
					if(mapAtributos.containsKey(ETipoChaveLDAP.CPF.getValor())){
						empregado.setCpf(mapAtributos.get(ETipoChaveLDAP.CPF.getValor()));
					}
					empregado.setMatriculaUsuario(login);
					return empregado;
				}else{
					//Lanca excecao por nao ter achado os atributos do usuario logado
					MensagemArqrefService msgArqrefService = new MensagemArqrefService();
					msgArqrefService.setCategoriaErro(Integer.toString(ECategoriaErro.ERRO_LDAP.getValor()));
					msgArqrefService.setCodigoErro("");
					msgArqrefService.setInformacoesAdicionais("");
					msgArqrefService.setMensagemErro(new ArrayList<String>());
					//Lista de Mensagens negocial
					List<String> listaMensagemNegocial = new ArrayList<String>();
					listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_001.getDescricao());
					msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
					msgArqrefService.setOrigemErro(EmpregadoBean.class.getName());
					msgArqrefService.setParagrafoErro("");
					msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
					msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
					msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
					log.info(msgArqrefService.toString());
					throw new BusinessException(msgArqrefService);
				}
			}else if(login.toUpperCase().startsWith("C")){
				Empregado empregado = this.getEmpregadoPorMatricula(login);
				empregado.setMatriculaUsuario(login);
				return empregado;
			}else{
				//Lanca excecao por padrao nao ter sido encontrado
				// C - para usuarios CAIXA
				// Com @ - para usuarios externo que logam via SICDU
				MensagemArqrefService msgArqrefService = new MensagemArqrefService();
				msgArqrefService.setCategoriaErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
				msgArqrefService.setCodigoErro("");
				msgArqrefService.setInformacoesAdicionais("");
				msgArqrefService.setMensagemErro(new ArrayList<String>());
				//Lista de Mensagens negocial
				List<String> listaMensagemNegocial = new ArrayList<String>();
				listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_002.getDescricao());
				msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
				msgArqrefService.setOrigemErro(EmpregadoBean.class.getName());
				msgArqrefService.setParagrafoErro("");
				msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
				msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
				msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());
				log.info(msgArqrefService.toString());
				throw new BusinessException(msgArqrefService);
			}
		}else{
			//Lanca excecao pela string esta com algum problema
			MensagemArqrefService msgArqrefService = new MensagemArqrefService();
			msgArqrefService.setCategoriaErro(Integer.toString(ECategoriaErro.ERRO_NEGOCIAL.getValor()));
			msgArqrefService.setCodigoErro("");
			msgArqrefService.setInformacoesAdicionais("");
			msgArqrefService.setMensagemErro(new ArrayList<String>());
			//Lista de Mensagens negocial
			List<String> listaMensagemNegocial = new ArrayList<String>();
			listaMensagemNegocial.add(EMensagensArqrefServiceErro.MN_003.getDescricao());
			msgArqrefService.setMensagemNegocial(listaMensagemNegocial);
			msgArqrefService.setOrigemErro(EmpregadoBean.class.getName());
			msgArqrefService.setParagrafoErro("");
			msgArqrefService.setSeveridade(ESeveridadeErro.SEVERIDADE_AVISO.getValor());
			msgArqrefService.setSeveridadeDescricao(ESeveridadeErro.SEVERIDADE_AVISO.getDescricao());
			msgArqrefService.setParagrafoErro(UtilMensagem.getMetodoNome());	
			log.info(msgArqrefService.toString());
			throw new BusinessException(msgArqrefService);			
		}
	}
	
	
}
