package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class ProgramContaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//Instanciacao		
		ContaBanco c1;

		
		System.out.printf("Enter account number: ");
		int number = 0;
		try {
			number = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Insira somente numeros");
			System.exit(0);
		}

		sc.nextLine();

		System.out.printf("Enter account holder: ");
		String holder = sc.nextLine();

		
		
		//verificacao deposito inicial
		String depInicial = "";

		while (!depInicial.equalsIgnoreCase("y") && !depInicial.equalsIgnoreCase("n")) {
			System.out.printf("Is there na initial deposit(y/n): ");
			depInicial = sc.next();
		}
		if (depInicial.equalsIgnoreCase("y")) {
			System.out.printf("Enter initial deposit value: ");
			double valueInitialDeposit = 0;
			try {
				valueInitialDeposit = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Valores invalidos");
				System.exit(0);
			}
			c1 = new ContaBanco(number, holder, valueInitialDeposit);
		} else {
			c1 = new ContaBanco(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(c1);

		
		//deposito
		System.out.printf("Enter deposit value: ");
		double deposit = 0;
		try {
			deposit = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Valores invalidos");
			System.exit(0);
		}

		c1.depositar(deposit);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(c1);
		
		//Saque 
		System.out.printf("Enter a withdraw value: ");
		double withdraw = 0;
		try {
			withdraw = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Valores invalidos");
			System.exit(0);
		}
		c1.sacar(withdraw);
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(c1);
		sc.close();
	}

}
