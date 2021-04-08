package entities;

public abstract class Empregado {
	private String nome;

	public Empregado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Empregado nome=" + nome + "";
	}

	public abstract double salarios();

}
