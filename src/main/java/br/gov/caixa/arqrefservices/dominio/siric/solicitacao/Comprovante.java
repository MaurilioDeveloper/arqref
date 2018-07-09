package br.gov.caixa.arqrefservices.dominio.siric.solicitacao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.caixa.arqrefcore.cobol.conversor.anotacao.Tamanho;

@XmlRootElement(name="COMPROVANTE")
@XmlType(propOrder={"tipoDocumento", "dataReferencia"})
public class Comprovante implements Serializable {
	
	private static final long serialVersionUID = 6281434657079137989L;
	
	@Tamanho(tamanho = 12)
	private String tipoDocumento;
	
	@Tamanho(tamanho = 8)
	private String dataReferencia;
	
	
	@XmlElement(name="TP_DOCUMENTO")
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	@XmlElement(name="DT_REFERENCIA")
	public String getDataReferencia() {
		return dataReferencia;
	}
	public void setDataReferencia(String dataReferencia) {
		this.dataReferencia = dataReferencia;
	}

}
