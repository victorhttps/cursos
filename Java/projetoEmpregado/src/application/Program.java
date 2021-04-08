package application;

import entities.Comissionado;
import entities.Empregado;
import entities.Horista;

public class Program {

	public static void main(String[] args) {

		Comissionado empregadoUm = new Comissionado("Pedro", 5000, 0.1) {};
		Horista empregadoDois = new Horista("Marta", 160, 5) {};

		System.out.println(empregadoUm + "salario: " + empregadoUm.salarios());
		System.out.println("");
		System.out.println(empregadoDois + "Salario: " + empregadoDois.salarios());

		Empregado empregados[] = new Empregado[2];

		empregados[0] = empregadoUm;
		empregados[1] = empregadoDois;

		System.out.println("");
		System.out.println("\n ***Empregados processados utilizando POLIMORFISMO*** ");

		for (Empregado empregadoCorrente : empregados) {
			System.out.println(empregadoCorrente);

			System.out.printf("salario $%,.2f\n\n", empregadoCorrente.salarios());

		}

	}
}
