
public class testeClasseLinha {
	public static void main(String[] args) {
		
		Linha l1 = new Linha(2, 4, 6, 8);
		Linha l2 = new Linha(30, 55, 57,9);

		System.out.println(l1.eIgual(l1, l2));
		System.out.println(l1.eMaior(l1, l2));
		System.out.println(l1.eMenor(l1, l2));

	}
	
}
