
public class testeExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Exercicio3 pessoa1 = new Exercicio3("Joao", "Medeiros");
	String nomeCompleto = pessoa1.getNomeCompleto();
	System.out.println(nomeCompleto);
	
	System.out.println();
	
	Funcionario pessoa2 = new Funcionario();
	pessoa2.setNome("Leonardo"); // Metodo da classe Pessoa(Classe Exercicio3)
	pessoa2.setSobrenome("Messias"); // Metodo da classe Pessoa(Classe Exercicio3)
	pessoa2.setSalario(1000);
	pessoa2.setMatricula(100);
	String nomeCompletoPessoa2 = pessoa2.getNomeCompleto();
	System.out.println(nomeCompletoPessoa2);
	int matriculaPessoa2 = pessoa2.getMatricula();
	System.out.println("Matricula: "+ matriculaPessoa2);
	System.out.println("Primeira Parcela: "+pessoa2.getSalarioPrimeiraParcela());
	System.out.println("Segunda Parcela: "+pessoa2.getSalarioSegundaParcela());
	
	System.out.println();
	
	Professor pessoa3 = new  Professor();
	pessoa3.setNome("Antonio");
	pessoa3.setSobrenome("Silva");
	pessoa3.setSalario(1500);
	pessoa3.setMatricula(200);
	int matriculaPessoa3 = pessoa3.getMatricula();
	String nomeCompletoProfessor = pessoa3.getNomeCompleto();
	System.out.println(nomeCompletoProfessor);
	System.out.println("Matricula: "+matriculaPessoa3);
	System.out.println("Primeira Parcela Professor: "+pessoa3.getSalarioPrimeiraParcela());
	System.out.println("Segunda Parcela Professor: "+pessoa3.getSalarioSegundaParcela());
	
	}
	
	
}
