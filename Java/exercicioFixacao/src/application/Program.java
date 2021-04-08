package application;

import java.util.Scanner;
import util.Converter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("valor dolar: ");
		double valorDolar = sc.nextDouble();
		
		System.out.print("valor a ser comprado: ");
		double dolarComprado = sc.nextDouble();
		
		System.out.print("total: " + Converter.total(valorDolar, dolarComprado));
		
		
		
		sc.close();
		
	}

}
