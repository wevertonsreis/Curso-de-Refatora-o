package br.alura.refatoracao.cap6;

public enum Moeda {
	EURO(3.0),
	DOLAR(2.7);
	
	private double taxa;
	
	Moeda(double taxa) {
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}
	
}
