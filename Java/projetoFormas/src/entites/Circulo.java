package entites;

public class Circulo extends Formas {

	private double raio;

	public Circulo(double raio) {

		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double area() {

		return Math.PI * Math.pow(raio, 2);
	}

}
