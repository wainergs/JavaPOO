package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalcCircleV1 {
	
	public static final double pi = Math.PI ;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n ",c);
		System.out.printf("Volume: %.2f%n ",v);
		System.out.printf("PI: %.2f%n ",pi);
			
	}
	
	public static double circumference(double raio) {
		return 2 * pi * raio;
	}
	
	public static double volume(double raio) {
		return 4 * pi * Math.pow(raio, 3) /3;
	}

}
