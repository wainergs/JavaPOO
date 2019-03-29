package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.printf("Nome do funcionario: ");
		emp.nome = sc.nextLine();
		
		System.out.printf("Salario Bruto: ");
		emp.GrossSalary = sc.nextDouble();
		
		System.out.printf("Taxa: ");
		emp.tax = sc.nextDouble();
		
		
		System.out.println(emp);
		
		System.out.printf("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		
	}

}
