package br.alura.refatoracao.cap1;

/**
 * 
 * @author wevertonreis
 *
 */
public class NotaFiscalDao {

	/**
	 * Salvando nota fiscal
	 * 
	 * @param notaFiscal
	 */
	public void salvar(NotaFiscal notaFiscal) {
		String sql = "insert into notafiscal (cliente, valor)" + "values (?," + notaFiscal.getValorLiquido() + ")";

		System.out.println("Salvando no banco " + sql);
	}

}