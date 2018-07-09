package br.gov.caixa.arqrefservices.negocio.mq;

import br.gov.caixa.arqrefcore.barramento.AbstractDAOBarramento;
import br.gov.caixa.arqrefservices.dominio.barramento.enumerador.EFilasMQ;

/**
 * Classe responsavel pelo retorno de
 * qual fabrica a conexao esta utilizaco
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class ConexaoSICLIMQ extends AbstractDAOBarramento {

	/**
	 * Metodo que retorna uma string 
	 * da enumercao @see EFilasMQ especifica
	 * 
	 * @return string (EFilasMQ)
	 */
	@Override
	protected String factory() {
		return EFilasMQ.FACTORY_SICLI.toString();
	}

}
