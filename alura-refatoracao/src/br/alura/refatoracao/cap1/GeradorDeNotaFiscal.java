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

		new EnviadorDeEmail().enviar(notaFiscal);
		
		new NotaFiscalDao().salvar(notaFiscal);
		
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