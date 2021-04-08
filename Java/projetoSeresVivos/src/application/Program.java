package application;

import entities.Arvores;
import entities.Pessoas;
import entities.SeresVivos;

public class Program {

	public static void main(String[] args) {

		// cria objetos de subclasse
		Pessoas pessoaUm = new Pessoas("jota", 0, 1981) {
		};
		Arvores arvoreUm = new Arvores("Carvalho", 0, 1983, 0) {
		};

		// cria um array
		SeresVivos seres[] = new SeresVivos[2];
		// inicializa o array
		seres[0] = pessoaUm;
		seres[1] = arvoreUm;

		System.out.println("\n Seres Vivos processados utilizando POLIMORFISMO \n");
		// processa genericamente cada elemento/objeto
		for (SeresVivos serCorrente : seres) {
			serCorrente.gerarIdade(2021);
			System.out.println(serCorrente); // invoca toString
		}

	}
}
