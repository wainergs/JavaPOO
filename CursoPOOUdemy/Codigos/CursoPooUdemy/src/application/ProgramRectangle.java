package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.printf("Digite a altura do retangulo: ");
		rect.height = sc.nextDouble();
		
		System.out.printf("Digite o comprimento do retangulo: ");
		rect.width = sc.nextDouble();
		
		System.out.println(rect);
		System.out.println("Area = "+rect.area());
		System.out.println("Perimetro = "+rect.Perimeter());
		System.out.println("Diagonal = "+rect.Diagonal());
	}

}
