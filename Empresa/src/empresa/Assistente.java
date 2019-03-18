package empresa;

public  class Assistente extends Funcionario {

	public Assistente(String nome, String matricula, double salario_base) {
		super(nome, matricula, salario_base);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculaSalario() {
		if(this.getSalario_base() > 0){
			double salario = getSalario_base() ;
			System.out.println("Cargo: Assistente");
			System.out.println("Nome:"+getNome());
			System.out.println("Matricula: "+getMatricula());
			System.out.println("Salario: "+salario);
			System.out.println();
		}else{
			System.out.println("Salario Invalido");
			System.out.println();
		}		
	}

}
