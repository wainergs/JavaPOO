package empresa;

public class Gerente extends Funcionario {

	public Gerente(String nome, String matricula, double salario_base) {
		super(nome, matricula, salario_base);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculaSalario() {
	if(this.getSalario_base() > 0){
			double salario = this.getSalario_base() *2 ;
			System.out.println("Cargo: Gerente");
			System.out.println("Nome:"+this.getNome());
			System.out.println("Matricula: "+this.getMatricula());
			System.out.println("Salario: "+salario);
			System.out.println();
		}else{
			System.out.println("Salario Invalido");
			System.out.println();
		}
	}

}
