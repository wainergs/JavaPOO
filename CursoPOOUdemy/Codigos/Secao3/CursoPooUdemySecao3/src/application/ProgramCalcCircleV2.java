package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramCalcCircleV2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc1 = new Calculator();
		
		System.out.println(calc1.circumference(3));
		System.out.println(calc1.volume(3));
	
	}
	
	
}
