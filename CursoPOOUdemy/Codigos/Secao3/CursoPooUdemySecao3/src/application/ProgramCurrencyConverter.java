package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCurrencyConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double dolar = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double convertToDolar = sc.nextDouble();
		
		System.out.println("Para comprar: $"+convertToDolar+" precisa de "+"R$"+String.format("%.2f",CurrencyConverter.converterToDolar(dolar, convertToDolar)));;

	}

}
