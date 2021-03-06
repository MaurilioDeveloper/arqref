package br.gov.caixa.arqrefservices.dominio.serpro.renovarContratoCPFV1;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="urn:renovarContratoCPFV1")
@XmlType(
		propOrder={
				"cdCia", "cdEmpresa", "cdOrgao", "cdMatricula", "orgMatInst",
				"nrCPFA", "vlLiquidoA", "vlOperacaoA", "cdConsigA", 
				"cdSenhaConsig", "cdUsuario", "cdIdServ", "cdOrigemTrans", 
				"cdSenhaServidor", "cdConvenioA", "qtPrazoA", "dtOperacaoA",
				"dtAnoMesA", "nrContrato","dsLivre","qtRenovaA","nrContratos"								
			})
public class RenovarContratoCPFV1DadosREQ implements Serializable {

	private static final long serialVersionUID = -3694150633496701565L;
	
	/**
	 * Codigo da companhia, obrigatorio, alfa(3), fixo='MP'.
	 */
	@NotNull(message="Código da companhia é obrigatório")
	private String cdCia; 
	
	/**
	 * Codigo da empresa, opcional, alfa (3), fixo='MP'.
	 */
	@NotNull(message="Código da empresa é obrigatório")
	private String cdEmpresa; 
	
	/**
	 * Codigo do orgao, opcional, alfa(10).
	 */
	@NotNull(message="Código do orgão é obrigatório")
	private String cdOrgao;
	
	/**
	 * Matricula do servidor, alfa(13).
	 */
	@NotNull(message="Matrícula do servidor é obrigatório")
	private String cdMatricula;
	
	/**
	 * Dados do instituidor, alfa(12), obrigatorio para pensionistas.
	 */
	private String orgMatInst;
	
	/**
	 * Numero CPF do servidor, obrigatorio, numerico(14).
	 */
	@NotNull(message="CPF do servidor é obrigatório")
	private String nrCPFA;
	
	/**
	 * Valor a ser creditado, numerico(13,2), opcional
	 */
	private String vlLiquidoA;
	
	/**
	 * Valor a ser consignado mensalmente, numerico(13,2), obrigatorio.
	 */
	@NotNull(message="Valor a ser consignado mensalmente é obrigatório")
	private String vlOperacaoA;

	/**
	 * Codigo da consignataria, obrigatorio, numerico(6), fixo='104'.
	 */
	@NotNull(message="Código da consignatária é obrigatório")
	private String cdConsigA;
	
	/**
	 * Senha da consignataria, obrigatorio, alfa(12).
	 * A senha da consignatária e fornecida quando ocorre a abertura do 
	 * ambiente para testes / homologação / produção.
	 */
	@NotNull(message="Senha da consignatária é obrigatório")
	private String cdSenhaConsig;
	
	/**
	 * Usuário da consignatária, alfa(8), obrigatorio.
	 * Resposta: Consulta MPOG
	 * Normalmente é utilizado um único usuário destinado somente a serviços Webservice por consignatária. 
	 * Neste caso teria que ser designada uma pessoa responsável da consignatária para a 
	 * qual seria feito este cadastro.
	 */
	@NotNull(message="Usuário da consignatária é obrigatório")
	private String cdUsuario;
	
	/**
	 * Codigo identificador do servidor (CIS), numerico(2).
	 * 01 - Servidor identificado no momento da operação pela consignatária
	 * 02 - Servidor não identificado no momento da operação, necessário enviar a senha do servidor para consistência
	 */
	@NotNull(message="Código identificador do servidor (CIS) é obrigatório")
	private String cdIdServ;
	
	/**
	 * Código de origem de Transação (COT), obrigatorio, numerio(2).
	 * 
	 * CIS=01
	 * 		01 - 0800 - URA Eltronica
	 * 		02 - Internet Bank
	 * 		03 - Caixa 24hs
	 * 		04 - Transacao de Caixa
	 * 		05 - Balcao de Agencia
	 * 		06 - Portabilidade STR39
	 * CIS=02
	 * 		01 - 0800 com atendentes
	 * 		02 - Balcao de agencia
	 * 		03 - Correspondentes bancarios
	 * 		99 - Outros
	 */
	@NotNull(message="Código de origem de transação (COT) é obrigatório")
	private String cdOrigemTrans;

	/**
	 * Senha do servidor, numerico(8).
	 * CD_ID_SERV=01: String Vazia
	 * CD_ID_SERV=02: String diferente de vazia
	 */
	private String cdSenhaServidor;

	/**
	 * Codigo do convenio, numerico(6), obrigatorio.
	 */
	@NotNull(message="Código do convênio é obrigatório")
	private String cdConvenioA;
	
	/**
	 * Prazo da operacao, obrigatorio, numerico(3).
	 */
	@NotNull(message="Prazo da operação é obrigatório")
	private String qtPrazoA;
	
	/**
	 * Data de operacao do contrato, numerico(8) (AAAAMMDD), obrigatorio.
	 */
	@NotNull(message="Data de Operação do contrato (AAAAMMDD) é obrigatório")
	private String dtOperacaoA;
	
	/**
	 * Ano/mes 1o desconto, numerico(6) (AAAAMM), obrigatorio.
	 */
	@NotNull(message="Ano/mês do 1º desconto (AAAAMM) é obrigatório")
	private String dtAnoMesA;
	
	/**
	 * Novo número do Contrato, Alfanumérico(20), opcional. 
	 */
	private String nrContrato;
	
	/**
	 * Livre uso da Consignatária, alfa(20), opcional.
	 */
	private String dsLivre;
	
	/**
	 * Qtd contratos a serem renovados, obrigatorio, Numérico(02)
	 */
	@NotNull(message=" Qtd contratos a serem renovados é obrigatório")
	private String qtRenovaA;
	
	/**
	 * Número do contrato, obrigatorio, Alfanumérico(20).
	 */
	@NotNull(message=" Número do contrato é obrigatório")
	private List<String> nrContratos;
	
	
	@XmlElement(name="CD_CIA")
	public String getCdCia() {
		return cdCia;
	}

	@XmlElement(name="CD_EMPRESA")
	public String getCdEmpresa() {
		return cdEmpresa;
	}

	@XmlElement(name="CD_ORGAO")
	public String getCdOrgao() {
		return cdOrgao;
	}

	@XmlElement(name="NR_CPF_A")
	public String getNrCPFA() {
		return nrCPFA;
	}

	@XmlElement(name="CD_CONSIG_A")
	public String getCdConsigA() {
		return cdConsigA;
	}

	@XmlElement(name="CD_SENHA_CONSIG")
	public String getCdSenhaConsig() {
		return cdSenhaConsig;
	}

	@XmlElement(name="CD_ID_SERV")
	public String getCdIdServ() {
		return cdIdServ;
	}

	@XmlElement(name="CD_ORIGEM_TRANS")
	public String getCdOrigemTrans() {
		return cdOrigemTrans;
	}

	@XmlElement(name="CD_SENHA_SERVIDOR")
	public String getCdSenhaServidor() {
		return cdSenhaServidor;
	}

	@XmlElement(name="CD_MATRICULA")
	public String getCdMatricula() {
		return cdMatricula;
	}

	@XmlElement(name="ORG_MAT_INST")
	public String getOrgMatInst() {
		return orgMatInst;
	}

	@XmlElement(name="VL_LIQUIDO_A")
	public String getVlLiquidoA() {
		return vlLiquidoA;
	}

	@XmlElement(name="VL_OPERACAO_A")
	public String getVlOperacaoA() {
		return vlOperacaoA;
	}

	@XmlElement(name="CD_USUARIO")
	public String getCdUsuario() {
		return cdUsuario;
	}

	@XmlElement(name="CD_CONVENIO_A")
	public String getCdConvenioA() {
		return cdConvenioA;
	}

	@XmlElement(name="QT_PRAZO_A")
	public String getQtPrazoA() {
		return qtPrazoA;
	}

	@XmlElement(name="DT_OPERACAO_A")
	public String getDtOperacaoA() {
		return dtOperacaoA;
	}

	@XmlElement(name="DT_ANO_MES_A")
	public String getDtAnoMesA() {
		return dtAnoMesA;
	}

	@XmlElement(name="NR_CONTRATO")
	public String getNrContrato() {
		return nrContrato;
	}

	@XmlElement(name="DS_LIVRE")
	public String getDsLivre() {
		return dsLivre;
	}

	@XmlElement(name="QT_RENOVA_A")
	public String getQtRenovaA() {
		return qtRenovaA;
	}

	@XmlElement(name="NR_CONTRATO_ARRAY")
	public List<String> getNrContratos() {
		return nrContratos;
	}

	public void setCdCia(String cdCia) {
		this.cdCia = cdCia;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public void setCdOrgao(String cdOrgao) {
		this.cdOrgao = cdOrgao;
	}

	public void setNrCPFA(String nrCPFA) {
		this.nrCPFA = nrCPFA;
	}

	public void setCdConsigA(String cdConsigA) {
		this.cdConsigA = cdConsigA;
	}

	public void setCdSenhaConsig(String cdSenhaConsig) {
		this.cdSenhaConsig = cdSenhaConsig;
	}

	public void setCdIdServ(String cdIdServ) {
		this.cdIdServ = cdIdServ;
	}

	public void setCdOrigemTrans(String cdOrigemTrans) {
		this.cdOrigemTrans = cdOrigemTrans;
	}

	public void setCdSenhaServidor(String cdSenhaServidor) {
		this.cdSenhaServidor = cdSenhaServidor;
	}

	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	public void setOrgMatInst(String orgMatInst) {
		this.orgMatInst = orgMatInst;
	}

	public void setVlLiquidoA(String vlLiquidoA) {
		this.vlLiquidoA = vlLiquidoA;
	}

	public void setVlOperacaoA(String vlOperacaoA) {
		this.vlOperacaoA = vlOperacaoA;
	}

	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public void setCdConvenioA(String cdConvenioA) {
		this.cdConvenioA = cdConvenioA;
	}

	public void setQtPrazoA(String qtPrazoA) {
		this.qtPrazoA = qtPrazoA;
	}

	public void setDtOperacaoA(String dtOperacaoA) {
		this.dtOperacaoA = dtOperacaoA;
	}

	public void setDtAnoMesA(String dtAnoMesA) {
		this.dtAnoMesA = dtAnoMesA;
	}

	public void setNrContrato(String nrContrato) {
		this.nrContrato = nrContrato;
	}

	public void setDsLivre(String dsLivre) {
		this.dsLivre = dsLivre;
	}

	public void setQtRenovaA(String qtRenovaA) {
		this.qtRenovaA = qtRenovaA;
	}

	public void setNrContratos(List<String> nrContratos) {
		this.nrContratos = nrContratos;
	}

	
	
}