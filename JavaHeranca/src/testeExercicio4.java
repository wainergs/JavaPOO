
public class testeExercicio4 {

	public static void main(String[] args) {

		ContaEx4 c1 = new ContaEx4();
		c1.setSaldo(10000);
		c1.sacar(15000);
		
		Poupanca c2 = new Poupanca();
		c2.setSaldo(15000);
		c2.sacar(20000);
		
		System.out.println("Saldo conta: "+c1.getSaldo());
		System.out.println("Saldo Poupanca"+c2.getSaldo());
		
		
	}

}
