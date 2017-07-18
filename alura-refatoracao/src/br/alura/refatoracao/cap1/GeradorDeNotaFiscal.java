package br.alura.refatoracao.cap1;

/**
 * 
 * @author wevertonreis
 *
 */
public class GeradorDeNotaFiscal {

	/**
	 * 
	 * @param fatura
	 * @return
	 */
	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal notaFiscal = gerarNotaFiscal(fatura);

		// envia email
		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "É com prazer que lhe avisamos que sua nota fiscal foi "
				+ "gerada no valor de " + notaFiscal.getValorLiquido() + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e faça o download.<br/><br/>";
		msgDoEmail += "Obrigado!";
		
		System.out.println(msgDoEmail);
		
		NotaFiscalDao notaFiscalDao = new NotaFiscalDao();
		notaFiscalDao.salvar(notaFiscal);
		
		return notaFiscal;
	}

	/**
	 * 
	 * @param fatura
	 * @return
	 */
	private NotaFiscal gerarNotaFiscal(Fatura fatura) {
		
		double valor = fatura.getValorMensal();
		double imposto = 0;
		if(valor < 200) {
			imposto = valor * 0.03;
		}
		else if(valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		}
		else {
			imposto = valor * 0.07;
		}
		
		NotaFiscal notaFiscal = new NotaFiscal(valor, imposto);
		return notaFiscal;
	}
}