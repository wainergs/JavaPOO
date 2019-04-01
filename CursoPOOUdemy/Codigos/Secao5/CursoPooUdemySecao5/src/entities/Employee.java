package entities;

import java.util.ArrayList;

import application.List;

public class Employee {
	private int id;
	private String nome;
	private double salario;
	
	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalario() {
		return salario;
	}

	   public void increaseSalary(double percente){
	        double earning = getSalario() * (1 + (percente / 100));
	        this.setSalario(earning);  
	    }
	

	public void setSalario(double salario) {
		this.salario = salario;
	}




	@Override
	public String toString() {
		return id + 
				", "+
				nome + 
				", " + 
				"R$ "	 +
				String.format("%.2f",salario) ;
	}
	
	
	
	

}
