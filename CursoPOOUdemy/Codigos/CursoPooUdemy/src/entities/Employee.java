package entities;

public class Employee {
	public String nome;
	public double GrossSalary,tax;
	@Override
	public String toString() {
		return "Employee [nome = " + nome + ", GrossSalary = " + String.format("%.2f", netSalary()) +  "]";
	}
	
	public double  netSalary() {
		return GrossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double acrescimo = GrossSalary * percentage/100;
		System.out.println("Updated Data: "+nome+" , $"+String.format("%.2f", (GrossSalary + acrescimo)-tax));
	}
	
	
	
	
	

}
