package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.printf("Digite o nome do aluno: ");
		s1.nome = sc.nextLine();
		
		System.out.printf("Digite a nota do primeiro bimestre: ");
		s1.n1 = sc.nextDouble();
		
		System.out.printf("Digite a nota do segundo bimestre: ");
		s1.n2 = sc.nextDouble();
		
		System.out.printf("Digite a nota do terceiro bimestre: ");
		s1.n3 = sc.nextDouble();
		
		s1.verifyNotes();
	}

}
