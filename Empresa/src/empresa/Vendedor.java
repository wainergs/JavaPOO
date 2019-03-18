package empresa;

public class Vendedor extends Funcionario {
	
	private double comissao;
	
	public Vendedor(String nome, String matricula, double salario_base, double comissao) {
		super(nome, matricula, salario_base);
		this.comissao=comissao;
	}

	@Override
	void calculaSalario() {
		if(this.getSalario_base() > 0){
			double salario = this.getSalario_base() + this.comissao ;
			System.out.println("Cargo: Vendedor");
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
