package application;

import java.util.Scanner;

import entities.Conta;
import entities.ContaFuncionario;
import entities.ContaPatrao;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Patrão ou funcionario?: P/F");
		char resp = sc.next().charAt(0);

		if (resp == 'F') {
			System.out.println("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("numero: ");
			int numero = sc.nextInt();
			
			System.out.println("Limite do funcionario: ");
			Double limiteFuncionario = sc.nextDouble();
			
			ContaFuncionario funcionario = new ContaFuncionario(nome, numero, limiteFuncionario) {};

		} else {
			
			System.out.println("nome: ");
			String nome = sc.nextLine();
			
			System.out.println("numero: ");
			int numero = sc.nextInt();
			
			System.out.println("Limite do Patrao: ");
			Double limitePatrao = sc.nextDouble(); 
			
			ContaPatrao patrao = new ContaPatrao(nome, numero, limitePatrao) {};

		}
		Conta contas[] = new Conta[2];
		contas[0] = funcionario;
		contas[1] = patrao;

		System.out.println("\n Dados da conta \n");

		for (Conta contaCorrente : contas) {
			contaCorrente.gerarLimite(2021);
			System.out.println(contaCorrente);
		}

		sc.close();
	}

}
