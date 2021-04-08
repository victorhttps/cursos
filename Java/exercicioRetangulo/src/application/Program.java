package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Digite a altura: ");
		
		triangulo.alt = sc.nextDouble();
		
		System.out.print("Digite a largura: ");
		
		triangulo.larg = sc.nextDouble();
		
		System.out.println(triangulo);
		
		
		sc.close();
	}

}
