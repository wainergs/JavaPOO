package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class ProgramVectPensionato {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Pensionato[] vect = new Pensionato[10];
		
		int quantityStudents = 99;
		while(quantityStudents < 0 || quantityStudents > 10) {
			System.out.print("Quantos estudantes vao alugar um quarto?(10 quartos disponiveis) ");
			quantityStudents = sc.nextInt();
		}
		
		for (int i = 0; i <quantityStudents; i++) {
			System.out.println("Dados do aluguel do "+(i+1)+"° cliente");
				System.out.print("Informe o numero do quarto(de 0 a 9): ");
				int numQuarto = sc.nextInt();
		
			sc.nextLine();
				System.out.printf("Informe o nome: ");
				String nome = sc.nextLine();
				
				System.out.printf("Informe o email: ");
				String email = sc.nextLine();
				System.out.println();
				
				vect[numQuarto] = new Pensionato(nome, email, numQuarto);
				
		}
		System.out.println("Busy rooms: ");
		for (Pensionato pensionato : vect) {
			if(pensionato != null) {
				System.out.println(pensionato);
			}
		}
		
		
		
		
		
		
		
	}

}
