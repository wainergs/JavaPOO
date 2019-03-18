package empresa;

public abstract class Funcionario {
	private String nome, matricula;
	private double salario_base;
	
	public Funcionario(String nome, String matricula, double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}

	protected String getNome() {
		return nome;
	}
	
	private void setNome(String nome){
		this.nome = nome;
	}


	 protected  String getMatricula() {
		return matricula;
	}


	protected double getSalario_base() {
		return salario_base;
	}
	
	abstract void calculaSalario();
	
}
