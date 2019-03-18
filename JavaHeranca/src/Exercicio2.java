
public class Exercicio2 {
	private String nome;
	private char sexo;
	private int idade;
	public Exercicio2(String nome, char sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

class Amigo extends Exercicio2{
	private String diaDoAniversario;

	public Amigo(String nome, char sexo, int idade, String diaDoAniversario) {
		super(nome, sexo, idade);
		this.diaDoAniversario = diaDoAniversario;
	}

	public String getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(String diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}

	
	
}
