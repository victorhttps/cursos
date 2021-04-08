package entities;

public class AlunoFormado extends Aluno {

	String numero;
	String nome;

	
	public AlunoFormado(String nome, double nota1, double nota2, double nota3, String numero) {
		super(nome, nota1, nota2, nota3);
		this.nome = nome;
		this.numero = numero;
	}

	public String toString() {
		
		return "\n nome: " + nome 
			+ "\n nota1: " + nota1 
			+ "\n nota 2: " + nota2 
			+ "\n nota 3: " + nota3
			+ String.format("\n pontos que faltaram para passar: %.1f", pontos()) + "\n media: "
			+ String.format("%.1f", media()) 
			+ "\n RA: " + numero;

	}

}
