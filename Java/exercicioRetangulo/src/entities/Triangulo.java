package entities;

public class Triangulo {
	public double larg;
	public double alt;
	
	
	public double area() {
		return larg * alt;
		
	}
	
	public double perimetro(){
		return (alt*2) + (larg*2);
			
	}
	
	public double diagonal() {
		double h = (alt* alt) + (larg*larg);
		
		return Math.sqrt(h);
		
	}
	public String toString() {
		
		return "\nArea: " + area() + String.format("\nPerimeter: ") + perimetro() + String.format("\nDiagonal: ") + diagonal();
	
		
	}

}
