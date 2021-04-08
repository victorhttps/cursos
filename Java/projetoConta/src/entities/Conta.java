package entities;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public double deposito(double valor) {
		return saldo += valor;
	}
	public double saque(double valor) {
		return saldo -= valor + 5;
	}
	
	public String toString() {
		return "Conta [Conta=" + numero + ", titular=" + titular + ", saldo: R$" + saldo + "]";
	}
	
}
