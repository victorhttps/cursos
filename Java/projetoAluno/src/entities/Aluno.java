package entities;

import java.util.Scanner;

public class Aluno {

	private String nome;
	protected double nota1;
	protected double nota2;
	protected double nota3;

	Scanner sc = new Scanner(System.in);

	public Aluno(String nome, double nota1, double nota2, double nota3) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		while (nota1 < 0 || nota1 > 10) {
			System.out.print("nota invalida, digite novamente");
			System.out.print(": ");
			nota1 = sc.nextDouble();
		}
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		while (nota2 < 0 || nota2 > 10) {
			System.out.print("nota invalida, digite novamente"); 
			System.out.print(": ");
			nota2 = sc.nextDouble();
		}
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		while (nota3 < 0 || nota3 > 10) {
			System.out.print("nota invalida, digite novamente");
			System.out.print(": ");
			nota3 = sc.nextDouble();
		}
		this.nota3 = nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double media() {
		return (nota1 + nota2 + nota3) / 3;
	}

	public double pontos() {
		if (media() < 6) {
			return 7 - media();
		} else {
			return 0;
		}
	}

	public String toString() {
		return  "\n nome: " + nome 
				+ "\n nota1: " + nota1 
				+ "\n nota 2: " + nota2 
				+ "\n nota 3: " + nota3
				+ String.format("\n pontos que faltaram para passar: %.1f", pontos()) + "\n media: "
				+ String.format("%.1f", media());

	}

}
