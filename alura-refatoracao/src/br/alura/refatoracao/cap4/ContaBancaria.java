package br.alura.refatoracao.cap4;

public abstract class ContaBancaria {

	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public void saca(double valor) {
		saldo -= valor + 0.2;
	}
	
	public void deposita(double valor) {
		saldo += valor - 0.2;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
