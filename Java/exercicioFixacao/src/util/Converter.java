package util;

public class Converter {
	
	public static final double IOF = 0.06;
	
	public static double total(double dolarComprado, double vReal){
		
		return dolarComprado * vReal * (1 + IOF);
		
	}
	
}
