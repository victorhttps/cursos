package entities;

public abstract class Horista extends Empregado {

	private double qtdHoras;
	private double valorHora;

	public Horista(String nome) {
		super(nome);
	}

	public Horista(String nome, double qtdHoras, double valorHora) {
		super(nome);
		this.qtdHoras = qtdHoras;
		this.valorHora = valorHora;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String toString() {
		return "Horista qtdHoras=" + qtdHoras + ",\nvalorHora=" + valorHora + "\n" + super.toString();
	}

	public double salarios() {
		return getQtdHoras() * getValorHora();

	}
}
