package application;

import java.util.Scanner;

import entities.Aluno;

import entities.AlunoFormado;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(" digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("");

		System.out.print("aluno formado? s/n: ");
		char resp = sc.next().charAt(0);

		if (resp == 's') {

			System.out.print(" digite o numero do RA: ");
			sc.nextLine();
			String numero = sc.nextLine();

			AlunoFormado aluno = new AlunoFormado(nome, 7, 8, 8, numero);
			System.out.println("\ndata: ");
			System.out.println(aluno);

		} else {
			System.out.println("");
			System.out.print(" digite a nota1: ");
			double Nota1 = sc.nextDouble();
			System.out.print(" digite a nota2: ");
			double setNota2 = sc.nextDouble();
			System.out.print(" digite a nota3: ");
			double Nota3 = sc.nextDouble();

			Aluno aluno = new Aluno(nome, Nota1, setNota2, Nota3);

			System.out.println(" ");
			System.out.println("**Notas**" + "\n Nota 1:" + aluno.getNota1() 
			        + "\n Nota 2:" + aluno.getNota2()
					+ "\n Nota 3:" + aluno.getNota3());
			System.out.println(" ");
			if (aluno.media() < 5) {
				System.out.println("**Reprovado**" + aluno);

			} else {
				System.out.println("**Aprovado**" + aluno);

			}

			sc.close();
		}
	}
}
