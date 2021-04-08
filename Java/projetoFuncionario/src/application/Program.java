package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();

		System.out.print("\nSalario: ");
		funcionario.salario = sc.nextDouble();

		System.out.print("\nImposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.print("\nDados: " + funcionario);

		System.out.print("\ndigite o aumento %: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentaSalario(porcentagem);

		System.out.print("\nDados: " + funcionario);

		sc.close();

	}

}
