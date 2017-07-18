package br.alura.refatoracao.cap1;

/**
 * 
 * @author wevertonreis
 *
 */
public class EnviadorDeEmail {

	/**
	 * 
	 * @param notaFiscal
	 */
	public void enviar(NotaFiscal notaFiscal) {
		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "É com prazer que lhe avisamos que sua nota fiscal foi " + "gerada no valor de "
				+ notaFiscal.getValorLiquido() + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e faça o download.<br/><br/>";
		msgDoEmail += "Obrigado!";

		System.out.println(msgDoEmail);
	}

}
