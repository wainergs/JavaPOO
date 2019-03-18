package empresa;

public class testeFuncionario {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Carlos", "2018-abcd", -10);
		Gerente g2 = new Gerente("Joao", "2018-abcde", 3000);
		
		Vendedor v1 = new Vendedor("Maria","2016-drws", 998, 500);
		
		Assistente a1 = new Assistente("leonardo", "2017-987", 430);
		
		g1.calculaSalario();
		g2.calculaSalario();
		
		v1.calculaSalario();
		a1.calculaSalario();
		
	}

}
