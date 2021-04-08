package entities;

public abstract class Pessoas extends SeresVivos {

	private int anoNascimento;

	public Pessoas(String nome, int idade, int anoNascimento) {
		super(nome, idade);
		this.anoNascimento = anoNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String toString() {
		return "Pessoas [anoNascimento=" + anoNascimento + "]" + super.toString();
	}

	public void gerarIdade(int anoAtual) {
		setIdade(anoAtual - getAnoNascimento());

	}

}
