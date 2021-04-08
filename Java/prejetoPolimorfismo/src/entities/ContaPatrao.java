package entities;

public abstract class ContaPatrao extends Conta {
	private double limitePatrao;

	public ContaPatrao(String nome, int numero, double limitePatrao) {
		super(nome, numero);
		this.limitePatrao = limitePatrao;

	}

	public double getLimitePatrao() {
		return limitePatrao;
	}

	public void setLimitePatrao(double limitePatrao) {
		this.limitePatrao = limitePatrao;
	}

	public String toString() {
		return "ContaPatrao [limitePatrao=" + limitePatrao + "]";
	}

	public void gerarLimite(Double limite) {

		setLimitePatrao(getLimitePatrao() + limite);

	}
}
