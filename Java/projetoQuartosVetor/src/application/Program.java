package application;


import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];
		System.out.print("Quantos quartos vão ser alugados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Hospede #" + i + ":");
			System.out.print("digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("digite o email: ");
			String email = sc.nextLine();
			System.out.print("escolha o quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Rent(nome, email);

		}
		System.out.println("");
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}

		sc.close();
	}

}
