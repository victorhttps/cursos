package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entites.Circulo;
import entites.Formas;
import entites.Retangulo;
import entites.Triangulo;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Formas> list = new ArrayList<>();

		System.out.print("Digite um numero de figuras: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("\nForma #" + i + " dados: ");
			System.out.print("Retangulo, circulo ou triangulo? r/c/t: ");
			char resp = sc.next().charAt(0);

			if (resp == 'c') {
				System.out.print("\ndigite o raio do circulo: ");
				sc.nextLine();
				double raio = sc.nextDouble();
				list.add(new Circulo(raio));

			} else if (resp == 'r') {
				System.out.print("\ndigite as medidas do Retangulo, \nAltura: ");
				sc.nextLine();
				Double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				list.add(new Retangulo(largura, altura));

			} else {
				System.out.print("\ndigite as medidas do triangulo, \nLado A: ");
				sc.nextLine();
				Double a = sc.nextDouble();
				System.out.print("Lado B:");
				Double b = sc.nextDouble();
				System.out.print("Lado C: ");
				Double c = sc.nextDouble();
				list.add(new Triangulo(a, b, c));
			}

		}
		System.out.println("");
		System.out.println("***Areas das Formas***");
		
		for (Formas formas : list)
			System.out.printf("%.2f%n", formas.area());

		sc.close();
	}

}
