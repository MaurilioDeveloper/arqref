package br.gov.caixa.arqrefservices.dominio.barramento.enumerador;

/**
 * Enumerador que contem todas as fabricas de conexao configuradas no servidor
 * e todas as filas do MQ
 * @author c110503
 * @version 1.0.0.1
 *
 */
public enum EFilasMQ {
	
	FACTORY_SIEMP("java:/jms/SiempConnectionFactory"), 
	FACTORY_SIRIC("java:/jms/SiricConnectionFactory"),
	FACTORY_TEMP("java:/jms/TempConnectionFactory"),
	FACTORY_SICLI("java:/jms/SicliConnectionFactory"), 
	FACTORY_SIFEC("java:/jms/SiapxConnectionFactory"),
	
	SICLI_REQ_MANUTENCAO_CLIENTE("java:/jms/SIBAR.REQ.MANUTENCAO_CLIENTE"),
	SICLI_RSP_MANUTENCAO_CLIENTE("java:/jms/SIBAR.RSP.MANUTENCAO_CLIENTE"),
		
	SIFEC_REQ_RECUPERA_DADOS_MINUTA("java:/jms/SIFEC.REQ.RECUPERAR_DADOS_MINUTA"),
	SIFEC_RSP_RECUPERA_DADOS_MINUTA("java:/jms/SIFEC.RSP.RECUPERAR_DADOS_MINUTA"),
	
	SICLI_REQ_CONSULTA_CLIENTE("java:/jms/SIBAR.REQ.CONSULTA_CLIENTE"),
	SICLI_RSP_CONSULTA_CLIENTE("java:/jms/SIBAR.RSP.CONSULTA_CLIENTE"),
	
	SIRIC_SOLICITA_AVALIACAO_RISCO("java:/jms/SIBAR.REQ.AVALIACAO_RISCO_CREDITO"), 
	SIRIC_CONSULTA_PROTOCOLO_AVALIACAO_RISCO("java:/jms/SIBAR.RSP.AVALIACAO_RISCO_PROTOCOLO"),
	SIRIC_SIEMP_CONSULTA_DADOS_AVALIACAO_RISCO("java:/jms/SIEMP.RSP.AVALIACAO_RISCO_CREDITO"),
	SIRIC_SIAPX_CONSULTA_DADOS_AVALIACAO_RISCO("java:/jms/SIAPX.RSP.AVALIACAO_RISCO_CREDITO"),
	SIRIC_SICCR_AVALIACAO_RISCO_CREDITO("java:/jms/SICCR.RSP.AVALIACAO_RISCO_CREDITO"),
	
	SIRIC_CONSULTA_AVALIACAO_RISCO("java:/jms/SIBAR.REQ.CONSULTA_AVALIACAO_RISCO"),
	SIRIC_RECEBE_CONSULTA_AVALIACAO_RISCO("java:/jms/SIBAR.RSP.CONSULTA_AVALIACAO_RISCO"),
	
	SIRIC_SOLICITA_CANCELAMENTO_AVALIACAO_RISCO("java:/jms/SIBAR.REQ.CANCELAMENTO_AVALIACAO_RISCO"),
	SIRIC_CONSULTA_RESP_CANCELAMENTO_AVALIACAO_RISCO("java:/jms/SIBAR.RSP.CANCELAMENTO_AVALIACAO_RISCO"),
	
	SIFEC_REQ_PORTAL("java:/jms/SIFEC.REQ.PORTAL"), 
	SIFEC_RSP_PORTAL("java:/jms/SIFEC.RSP.PORTAL"),
	
	SIRIC_REQ_DESBLOQUEIO_ALCADA("java:/jms/SIBAR.REQ.DESBLOQUEIO_ALCADA"),
	SIRIC_RSP_DESBLOQUEIO_ALCADA("java:/jms/SIBAR.RSP.DESBLOQUEIO_ALCADA");

	private String name;

	private EFilasMQ(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}

	public EFilasMQ get(String filas) {
		return EFilasMQ.valueOf(filas);
	}

}
