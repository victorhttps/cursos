package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		
		sc.close();
	}
	
	
	public static double circunferencia(double raio) {
		return
		
		
		
		
	}

}
