package br.gov.caixa.arqrefservices.dao.barramento;

import br.gov.caixa.arqrefcore.barramento.AbstractDAOBarramento;
//import br.gov.caixa.emprestimo.enums.FilasMQ;

/**
 * Classe responsavel pelo retorno de
 * qual fabrica a conexao esta utilizaco
 * 
 * @author c110503
 * @version 1.0.0.1
 *
 */
public class ConexaoSIRICMQ extends AbstractDAOBarramento {

	/**
	 * Metodo que retorna uma string 
	 * da enumercao @see EFilasMQ especifica
	 * 
	 * @return string (EFilasMQ)
	 */
	@Override
	protected String factory() {
		return FilasMQ.FACTORY_SIRIC.toString();
	}

}

