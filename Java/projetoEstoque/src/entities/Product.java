package entities;

public class Product {
	
	private String nome;
	private double price;
	private int qtd;
	
	public Product() {
		
	}
	
	public Product(String nome, double price, int qtd) {
		
		this.nome = nome;
		this.price = price;
		this.qtd = qtd;
	}
	public Product(String nome, double price) {
		
		this.nome = nome;
		this.price = price;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double valorTotalEstoque() {
		
		return price * qtd;
		
		
	}
	
	public void addProducts(int qtd) {
		
		this.qtd += qtd;
	}

	public void removeProducts(int qtd) {
		
		this.qtd -= qtd;
		
	}
	
	public String toString() {
		
		return nome + ", \n$ " + String.format("%.2f", price) + ", \n" + qtd + " unidades, " + "Total: " + String.format("%.2f", valorTotalEstoque());
		
		
		
	}
	
}
