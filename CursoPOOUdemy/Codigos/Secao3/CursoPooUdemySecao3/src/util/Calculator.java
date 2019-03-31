package util;

public class Calculator {
	public final double pi = Math.PI ;
	public  double circumference(double raio) {
		return 2 * pi * raio;
	}
	
	public double volume(double raio) {
		return 4 * pi * Math.pow(raio, 3) /3;
	}


}
