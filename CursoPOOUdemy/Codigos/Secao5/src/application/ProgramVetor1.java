package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor1 {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	int n = sc.nextInt();
	
	double[] vect = new double[3];
	
	for(int i=0;i<n;i++) {
		vect[i]=sc.nextDouble();
	}
	
	double soma = 0;
	
	for(int i=0;i<n;i++) {
		soma +=vect[i];
	}
	
	double media = soma /n;
	
	System.out.printf("Average Height: %.2f%n", media);
	
	
	
	sc.close();
	}
}
