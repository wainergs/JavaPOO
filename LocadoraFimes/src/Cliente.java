import java.util.List;;
import java.util.ArrayList;
import java.util.Collections;


public class Cliente {
	private String nome;
	private String cpf;
	private List<Filme> emprestados; 
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		emprestados = new ArrayList<Filme>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf(){
		return cpf;
	}

	public List<Filme> getEmprestados() {
		return Collections.unmodifiableList(emprestados);
	}

	public void setEmprestado(ArrayList<Filme> emprestados) {
		this.emprestados = emprestados;
	}
	

	public void devolver(Filme filme){
		boolean confirma = emprestados.remove(filme);
		if(confirma){
			System.out.println("Filme develvido com sucesso");
			F
		}else{
			System.out.println("Filme não encontrado!");
		}
			
	}
	
	public void emprestar(Filme filme){
		emprestados.add(filme);
	}		
	
}
