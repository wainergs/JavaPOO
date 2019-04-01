package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> dadosFunc = new ArrayList<>();
		
		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #"+(i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			dadosFunc.add(i,new Employee(id, nome, salary));
		}
		sc.nextLine();
		
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idFunc = sc.nextInt();
		
		
		Employee employee = dadosFunc.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		if(employee == null) {
			System.out.println("ID nao encontrado");
		}else {
			System.out.print("Enter the percentage: ");
           double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
		}
		
		   System.out.println("List of Employees: ");
		   for (Employee employeeList : dadosFunc) {
			System.out.println(employeeList);
		}
		
	}

}
