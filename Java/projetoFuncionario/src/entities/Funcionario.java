package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;

	public double salarioReal() {

		return salario - imposto;

	}

	public void aumentaSalario(double porcentagem) {

		salario += salario * porcentagem / 100;

	}

	public String toString() {

		return nome + ", R$" + String.format("%.2f", salarioReal());
	}

}
