package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("product data: ");

		System.out.println(" ");
		System.out.print("  enter product name: ");
		String nome = sc.nextLine();

		System.out.println(" ");
		System.out.print("  enter product price: ");
		double price = sc.nextDouble();

		System.out.println(" ");
		
		
		Product product = new Product(nome, price);
	

		System.out.println(" ");
		System.out.println("product data: " + product);

		System.out.println(" ");
		System.out.print("  Digite a qtd a ser adicionada ao estoque: ");
		 int qtd = sc.nextInt();
		product.addProducts(qtd);

		System.out.println("product data: " + product);

		System.out.println(" ");
		System.out.print("  Digite a qtd a ser removida do estoque: ");
		qtd = sc.nextInt();
		
		
		
		product.removeProducts(qtd);

		System.out.println(" ");
		System.out.println("product data: " + product);

		sc.close();

	}

}
