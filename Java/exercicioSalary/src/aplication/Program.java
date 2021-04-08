package aplication;

import java.util.Scanner;

import entities.Salario;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Salario salario = new Salario();
		
		System.out.print("Nome: ");
		salario.nome = sc.nextLine();
		System.out.print("\nSalario: ");
		salario.salarioBruto = sc.nextDouble();
		System.out.print("\nImposto: ");
		salario.imposto = sc.nextDouble();
		
		
		System.out.println(" ");
		System.out.println("dados funcionario: \n" + salario );
		
		
		System.out.println(" ");
		System.out.print("digite o aumento de salario: ");
		double porcentagem = sc.nextDouble();
		salario.aumentaSalario(porcentagem);
		
		
		System.out.println(" ");
		System.out.println("salario novo: \n" + salario );
		


	}

}
