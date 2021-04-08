package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Conta conta;

		System.out.print("Numero do Cliente: ");
		int numero = sc.nextInt();
		System.out.print("Nome do Cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deposit inicial: s/n: ");
		
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			
			System.out.print("Valor do deposito: R$");
			Double saldo = sc.nextDouble();
			conta = new Conta(numero, nome, saldo);

		} else {
			conta = new Conta(numero, nome);

		}
		System.out.println();
		System.out.println("dados da conta: ");
		System.out.println(conta);
		System.out.println();
		System.out.print("Valor do deposito: R$");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println(conta);
		System.out.println();
		System.out.print("Valor do saque: R$");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta);

		sc.close();
	}

}
