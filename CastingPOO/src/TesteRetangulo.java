import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retangulo r1 = new Retangulo();
		
		System.out.println("Digite a altura do primeiro retangulo");
		int r1Altura = sc.nextInt();
		r1.setAltura(r1Altura);
		
		System.out.println("Digite a base do primeiro retangulo");
		int r1Base = sc.nextInt();
		r1.setBase(r1Base);
		
		Retangulo r2 = new Retangulo();
		
		System.out.println("Digite a altura do segundo Retangulo");
		int r2Altura = sc.nextInt();
		r2.setAltura(r2Altura);
		
		System.out.println("Digite a base do segundo retangulo");
		int r2Base = sc.nextInt();
		r2.setBase(r2Base);
		
Retangulo r3 = new Retangulo();
		
		System.out.println("Digite a altura do terceiro Retangulo");
		int r3Altura = sc.nextInt();
		r3.setAltura(r3Altura);
		
		System.out.println("Digite a base do terceiro retangulo");
		int r3Base = sc.nextInt();
		r3.setBase(r3Base);
		
	

		if (r1.eMaior(r1, r2)) {
			if (r1.eMaior(r1, r3)) {
				System.out.println("Base e altura do maior retangulo");
				System.out.println(r1.base);
				System.out.println(r1.altura);
			}

		} else if (r2.eMaior(r2, r3)) {
			System.out.println("Base e altura do maior retangulo");

			System.out.println(r2.base);
			System.out.println(r2.altura);

		} else {
			System.out.println("Base e altura do maior retangulo");

			System.out.println(r3.base);
			System.out.println(r3.altura);
		}

	}
}
