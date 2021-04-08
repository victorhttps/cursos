package entities;

public abstract class Comissionado extends Empregado {

	private double vendasBrutas;
	private double comissao;

	public Comissionado(String nome) {
		super(nome);
	}

	public Comissionado(String nome, double vendasBrutas, double comissao) {
		super(nome);
		this.vendasBrutas = vendasBrutas;
		this.comissao = comissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String toString() {
		return "\nComissionado vendasBrutas=" + vendasBrutas + ",\ncomissao=" + comissao + "\n" + super.toString();
	}

	public double salarios() {
		return getVendasBrutas() * getComissao();

	}

}
