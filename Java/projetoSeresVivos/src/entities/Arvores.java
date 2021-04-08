package entities;

public abstract class Arvores extends SeresVivos {

	private int anoPlantio;
	private int aneis;

	public Arvores(String nome, int idade, int anoPlantio, int aneis) {
		super(nome, idade);
		this.anoPlantio = anoPlantio;
		this.aneis = aneis;
	}

	public int getAnoPlantio() {
		return anoPlantio;
	}

	public void setAnoPlantio(int anoPlantio) {
		this.anoPlantio = anoPlantio;
	}

	public int getAneis() {
		return aneis;
	}

	public void setAneis(int aneis) {
		this.aneis = aneis;
	}

	public String toString() {
		return "Arvores [anoPlantio=" + anoPlantio + ", aneis=" + aneis + "]" + super.toString();
	}

	public void gerarIdade(int anoAtual) {
		setAneis(anoAtual - getAnoPlantio());
		setIdade(aneis);
	}

}
