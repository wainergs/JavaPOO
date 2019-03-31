package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorV2;

public class ProgramCalcCircleV3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		
		double b = CalculatorV2.circumference(radius);
		double c = CalculatorV2.volume(radius);
		
		System.out.println("Cincurferencia: "+String.format("%.2f", b));
		System.out.println("Cincurferencia: "+String.format("%.2f", c));

	}

}
