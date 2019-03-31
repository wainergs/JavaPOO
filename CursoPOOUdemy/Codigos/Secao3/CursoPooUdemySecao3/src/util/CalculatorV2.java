package util;

public class CalculatorV2 {
	public static final double pi = Math.PI ;
	
	
	
	//Metodos estaticos podem ser chamados direto pela classe
	// sem precisar instanciar antes
	public static double volume(double raio) {
		return 4 * pi * Math.pow(raio, 3) /3;
	}

	public static double circumference(double radius) {
		return 2 * pi * radius;
	}


}
