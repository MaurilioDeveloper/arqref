package br.gov.caixa.arqrefservices.soap;

public enum MensagemErros {

	ERR_01("Variável de ambiente WS_SOAP_HOST não informada"),
	ERR_02("Variável de ambiente WS_SOAP_PORTA não informada"),
	ERR_03("Variável de ambiente WS_SOAP_URL_BASE não informada"),
	ERR_04("Variável de ambiente WS_SOAP_PROTOCOLO não informada"),
	
	ERT_01("Variável de ambiente TRUST_STORE_PASS não informada"),
	ERT_02("Variável de ambiente KEY_STORE_PASS não informada"),
	ERT_03("Variável de ambiente TRUST_STORE não informada");
	
	private String mensagem;
	
	private MensagemErros(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
}
