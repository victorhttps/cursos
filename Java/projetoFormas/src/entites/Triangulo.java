package entites;

public class Triangulo extends Formas {

	private double a;
	private double b;
	private double c;

	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}

}
