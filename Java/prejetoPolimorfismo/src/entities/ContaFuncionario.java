package entities;

public abstract class ContaFuncionario extends Conta {
	private double limiteFuncionario;

	public ContaFuncionario(String nome, int numero, double limiteFuncionario) {
		super(nome, numero);
		this.limiteFuncionario = limiteFuncionario;

	}

	public double getLimiteFuncionario() {
		return limiteFuncionario;
	}

	public void setLimiteFuncionario(double limiteFuncionario) {
		this.limiteFuncionario = limiteFuncionario;
	}

	public String toString() {
		return "ContaFuncionario [limiteFuncionario=" + limiteFuncionario + "]";
	}

	public void gerarLimite(double limite) {

		setLimiteFuncionario(getLimiteFuncionario() + limite);

	}
}
