package entities;

public class Salario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioReal() {
		
		return salarioBruto - imposto;
		
		
	}
	
	public void aumentaSalario(double porcentagem) {
		
		salarioBruto = salarioBruto * (porcentagem / 100);
		
		
	}
	public String toString() {
		
		return (" nome: ") + nome + ("\n salario bruto: ") + salarioReal + ("\n imposto: ") + imposto;
		
	}
	

}
