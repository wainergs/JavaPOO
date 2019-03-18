
public class Exercicio3 {
	private String nome, sobrenome;

	public Exercicio3() {
		super();
	}
	
	
	public Exercicio3(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	String getNomeCompleto(){
		return nome + " "+ sobrenome;
	}
	

}

class Funcionario extends Exercicio3{
	private int matricula;
	private double salario;
	
	void setSalario(int valor){
		if(valor > 0){
			this.salario = valor;
		}else{
			this.salario = salario;
		}
	}
	
	int getMatricula(){
		return this.matricula;
	}
	
	void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	double getSalario(){
		return salario;
	}
	
	double getSalarioPrimeiraParcela(){
		return getSalario() * 0.60;
	}
	
	double getSalarioSegundaParcela(){
		return getSalario() * 0.40;
	}
	
	
}
 class Professor extends Funcionario{
	 double getSalarioPrimeiraParcela(){
		 return this.getSalario();
	 }
	 
	 double getSalarioSegundaParcela(){
		 return 0;
	 }
	 
	 
 }